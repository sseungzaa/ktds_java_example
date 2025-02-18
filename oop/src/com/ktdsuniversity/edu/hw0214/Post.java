package com.ktdsuniversity.edu.hw0214;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
하나의 게시글은 다음 정보를 포함합니다.
	게시글 인덱스 번호 // PostIdx
	게시글 제목 // PostHeadline
	게시글 작성 날짜(연월일시분초) // PostDateTime
	게시글 작성자 이름 // PostAuthor
	게시글 내용 // PostBody
	댓글 목록(게시글 하나에는 여러 개의 댓글을 작성할 수 있습니다.) // CommentList
*/

public class Post {
	private int postIdx; // 게시글 인덱스 번호
	private String postHeadline; // 게시글 제목
	private String postAuthor; // 게시글 작성자 이름
	private String postBody; // 게시글 내용
	private LocalDateTime postDateTime; // 게시글 작성일시
	private List<Comment> commentList; // 댓글 목록(게시글 하나에는 여러 개의 댓글을 작성할 수 있습니다.)
	
	public Post(int postIdx, String postHeadline, String postAuthor, String postBody) {
    	this.postIdx = postIdx;
    	this.postHeadline = postHeadline;
    	this.postAuthor = postAuthor;
    	this.postBody = postBody;
    	this.postDateTime = LocalDateTime.now();
    	this.commentList = new ArrayList<>();
	}
	
	// Getter & Setter
	public int getPostIdx() {
		return postIdx;
	}
	
	public String getPostHeadline() {
		return postHeadline;
	}
	
	// 게시글 제목을 설정하고, 작성일시도 수정
	public void setPostHeadline(String postHeadline) {
		this.postHeadline = postHeadline;
		this.postDateTime = LocalDateTime.now(); // 수정하면 작성일시도 수정
	}
	
	public String getPostAuthor() {
		return postAuthor;
	}
	
	public String getPostBody() {
		return postBody;
	}
	
	// 게시글 내용을 설정하고, 작성일시도 수정
	public void setPostBody(String postBody) {
		this.postBody = postBody;
		this.postDateTime = LocalDateTime.now(); // 수정하면 작성일시도 수정
	}
	
	public LocalDateTime getPostDateTime() {
		return postDateTime;
	}
	
	public List<Comment> getCommentList() {
		return commentList;
	}
	
	//댓글 추가 삭제 메소드
	
	public void addComment(Comment comment) {
		commentList.add(comment);
	}
	
	public void deleteComment(int commentIdx) {
		commentList.removeIf(comment -> comment.getCommentIdx() == commentIdx);
	}
	
	// 게시글 정보 출력 메소드
	public void printPost() {
		System.out.println("게시글 인덱스 번호: " + postIdx + " | 제목: " + postHeadline +
							" | 작성자: " + postAuthor + " | 작성일시: " + postDateTime);
		System.out.println("내용: " + postBody);
		System.out.println("\n댓글 목록:");
		if (commentList.isEmpty()) {
			System.out.println("댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.");
		}
		else {
			for (Comment comment : commentList) {
				comment.printComment();
			}
		}
	}
}
