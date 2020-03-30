package com.yi.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.MovieDao;
import com.yi.dto.Movie;
import com.yi.mvc.CommandHandler;

public class ListHandler implements CommandHandler {
	private MovieDao dao;
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		dao = MovieDao.getInstance();
		List<Movie> list = dao.selectMovieByAll();
		req.setAttribute("list", list);
		req.setAttribute("size", list.size());
		return "/WEB-INF/view/movieNow.jsp";
	}

}
