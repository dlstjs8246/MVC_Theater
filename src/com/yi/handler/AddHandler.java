package com.yi.handler;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yi.dao.MovieDao;
import com.yi.dto.Movie;
import com.yi.mvc.CommandHandler;

public class AddHandler implements CommandHandler {
	private MovieDao dao = MovieDao.getInstance();
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/insertMovie.jsp";
		}
		else if(req.getMethod().equalsIgnoreCase("post")) {
			String uploadPath = req.getRealPath("upload");
			File dir = new File(uploadPath);
			if(!dir.exists()) {
				dir.mkdir();
			}
			int size = 10*1024*1024;
			MultipartRequest multi = new MultipartRequest(req,uploadPath,size,"UTF-8",new DefaultFileRenamePolicy());
			String file = multi.getFilesystemName("file");
			String name = multi.getParameter("name");
			String content = multi.getParameter("content");
			String schedule = multi.getParameter("schedule");
			Movie movie = new Movie(name,content,file,schedule);
			dao.insertMovie(movie);
			res.sendRedirect("list.do");
		}
		return null;
	}

}
