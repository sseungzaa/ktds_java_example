package com.ktdsuniversity.edu.assignment0214answer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private int id;
	private String title;
	private LocalDate createDate;
	private LocalTime createTime;
	private String author;
	private String description;
	private List<Comment> comments;
	
	public Post(String[] data) {
		this.id = Integer.parseInt(data[0].trim());
		this.title = data[1].trim();
		this.author = data[2].trim();
		this.createDate = LocalDate.parse(data[3].trim());
		this.createTime = LocalTime.parse(data[4].trim());
		this.description = data[5].trim();
	}
	
	public Post(String title, String author, String description) {
		this.title = title;
		this.createDate = LocalDate.now();
		this.createTime = LocalTime.now();
		this.author = author;
		this.description = description;
		this.comments = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	
	public void resetDateTime() {
		this.createDate = LocalDate.now();
		this.createTime = LocalTime.now();
	}
	
	public String getDetails(int postIndex) {
		String detail = "Index: %d | 제목 : %s | 작성자 : %s | 작성일시: %s %s | 내용: %s\n"
					.formatted(postIndex, this.title, this.author, 
							this.createDate, this.createTime, 
							this.description);
		
		StringBuffer detailBuffer = new StringBuffer();
		detailBuffer.append(detail);
		detailBuffer.append("댓글 목록\n");
		
		if (this.comments == null) {
			Store.loadAllComment(this);
		}
		
		if (this.comments.isEmpty()) {
			detailBuffer.append("댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.");
		}
		else {
			for (Comment eachComment : this.comments) {
				detailBuffer.append(eachComment);
			}			
		}
		return detailBuffer.toString();
	}
	
	public String toFileFormat() {
		return "%d|%s|%s|%s|%s|%s".formatted(this.id, this.title, this.author, this.createDate, this.createTime, this.description);
	}
	
	@Override
	public String toString() {
		return " | 제목: %s | 작성자: %s | 작성일시: %s %s".formatted(this.title, this.author, this.createDate, this.createTime);
	}
}
