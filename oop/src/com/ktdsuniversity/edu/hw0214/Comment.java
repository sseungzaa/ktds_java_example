package com.ktdsuniversity.edu.hw0214;

import java.time.LocalDateTime;

/*
하나의 댓글은 다음 정보를 포함합니다.
	댓글 인덱스 번호 // CommentIdx
	댓글 작성자 이름 // CommentAuthor
	댓글 내용 // CommentBody
	댓글 작성 날짜(연월일시분초) // CommentDateTime
*/

public class Comment {
	private int commentIdx; // 댓글 인덱스 번호
	private String commentAuthor; // 댓글 작성자 이름
	private String commentBody; // 댓글 내용
	private LocalDateTime commentDateTime; // 댓글 작성일시
	
	public Comment(int commentIdx, String commentAuthor, String commentBody) {
		this.commentIdx = commentIdx;
		this.commentAuthor = commentAuthor;
		this.commentBody = commentBody;
		this.commentDateTime = LocalDateTime.now();
	}
	
	// Getter
	public int getCommentIdx() {
		return commentIdx;
	}
	
	public String getCommentAuthor() {
		return commentAuthor;
	}
	
	public String getCommentBody() {
		return commentBody;
	}
	
	public LocalDateTime getCommentDateTime() {
		return commentDateTime;
	}
	
	// 출력 메소드
	public void printComment() {
		System.out.println(" - " + commentAuthor + " | " + commentBody + " | " + commentDateTime);
	}
}
