package com.yi.dao;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.yi.dto.Movie;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovieDaoTest {
	private MovieDao dao;
	@Before
	public void setUp() throws Exception {
		dao = MovieDao.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}
	
	@Test
	public void test01InsertMovie() {
		Movie movie = new Movie(1, "테스트", "테스트입니다", "그런거 없음", "있을리가 있나");
		try {
			int res = dao.insertMovie(movie);
			Assert.assertEquals(1, res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test02SelectMovieByAll() {
		try {
			List<Movie> list = dao.selectMovieByAll();
			Assert.assertNotEquals(0, list.size());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void test03SelectMovieByNo() {
		try {
			Movie movie = dao.selectMovieByNo(new Movie(1));
			Assert.assertNull(movie);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
