package com.yi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yi.dto.Movie;

public class MovieDao {
	private static final MovieDao instance = new MovieDao();
	private MovieDao() {}
	private String jdbcDriver = "jdbc:apache:commons:dbcp:pis_movie";
	public static MovieDao getInstance() {
		return instance;
	};
	public List<Movie> selectMovieByAll() throws SQLException {
		List<Movie> list = new ArrayList<>();
		String sql = "select * from movie";
		try(Connection con = DriverManager.getConnection(jdbcDriver);
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				list.add(getMovie(rs));
			}
		}
		return list;
	}
	private Movie getMovie(ResultSet rs) throws SQLException {
		int no = rs.getInt("no");
		String name = rs.getString("name");
		String content = rs.getString("content");
		String file = rs.getString("file");
		String schedule = rs.getString("schedule");
		return new Movie(no, name, content, file, schedule);
	}
	public Movie selectMovieByNo(Movie movie) throws SQLException {
		String sql = "select * from movie where no = ?";
		try(Connection con = DriverManager.getConnection(jdbcDriver);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, movie.getNo());
			try(ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					return getMovie(rs);
				}
			}
			return null;
		}
	}
	public int insertMovie(Movie movie) throws SQLException {
		int res = -1;
		String sql = "insert into movie values(?,?,?,?,?)";
		try(Connection con = DriverManager.getConnection(jdbcDriver);
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, movie.getNo());
			pstmt.setString(2, movie.getName());
			pstmt.setString(3, movie.getContent());
			pstmt.setString(4, movie.getFile());
			pstmt.setString(5, movie.getSchedule());
			res = pstmt.executeUpdate();
		}
		return res;
	}
}
