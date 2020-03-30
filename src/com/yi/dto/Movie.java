package com.yi.dto;

public class Movie {
	private int no;
	private String name;
	private String content;
	private String file;
	private String schedule;
	public Movie() {
		
	}
	
	public Movie(int no) {
		this.no = no;
	}
	
	public Movie(String name, String content, String file, String schedule) {
		this.name = name;
		this.content = content;
		this.file = file;
		this.schedule = schedule;
	}

	public Movie(int no, String name, String content, String file, String schedule) {
		this.no = no;
		this.name = name;
		this.content = content;
		this.file = file;
		this.schedule = schedule;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
