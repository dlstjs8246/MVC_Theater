package com.yi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.dao.MovieDao;
import com.yi.dto.Movie;
import com.yi.mvc.CommandHandler;

public class DetailHandler implements CommandHandler {
	private MovieDao dao = MovieDao.getInstance();
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int no = Integer.parseInt(req.getParameter("no"));
		Movie movie = dao.selectMovieByNo(new Movie(no));
		req.setAttribute("movie", movie);
		return "/WEB-INF/view/contentDetail.jsp";
	}
	
}
