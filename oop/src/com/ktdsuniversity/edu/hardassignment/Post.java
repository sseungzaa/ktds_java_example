package com.ktdsuniversity.edu.hardassignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private int postIdx;
	private String postHeadline;
	private String postUser;
	private String postBody;
	private LocalDateTime postDateTime;
	private List<Comment> commentList;
	
	public Post(String postHeadline, String postUser, String postBody) {
		int postIdxCount = 0;
		this.postIdx = postIdxCount++;
		this.postHeadline = postHeadline;
		this.postUser = postUser;
		this.postBody = postBody;
		this.postDateTime = LocalDateTime.now();
		this.commentList = new ArrayList<>();
	}
	
}
