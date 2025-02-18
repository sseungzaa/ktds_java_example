package com.ktdsuniversity.edu.assignment0214answer;

import java.time.LocalDate;
import java.time.LocalTime;

public class Comment {

	private String description;
	private String author;
	private LocalDate createDate;
	private LocalTime createTime;
	
	public Comment(String[] data) {
		this.author = data[0].trim();
		this.createDate = LocalDate.parse(data[1].trim());
		this.createTime = LocalTime.parse(data[2].trim());
		this.description = data[3].trim();
	}
	
	public Comment(String description, String author) {
		this.description = description;
		this.author = author;
		this.createDate = LocalDate.now();
		this.createTime = LocalTime.now();
	}
	
	public String toFileFormat() {
		return "%s|%s|%s|%s".formatted(this.author, this.createDate, this.createTime, this.description);
	}
	
	@Override
	public String toString() {
		return "%s | %s | %s %s".formatted(this.description, this.author, this.createDate, this.createTime);
	}
	
}
