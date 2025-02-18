package com.ktdsuniversity.edu.hardassignment;

import java.time.LocalDateTime;

public class Comment {
	
	private int commentIdx;
	private String commentUser;
	private String commentBody;
	private LocalDateTime commentDateTime;
	
	public Comment(String commentUser, String commentBody) {
		int commentIdxCount = 0;
		this.commentUser = commentUser;
		this.commentBody = commentBody;
		this.commentDateTime = LocalDateTime.now();
		
	}
	
}
