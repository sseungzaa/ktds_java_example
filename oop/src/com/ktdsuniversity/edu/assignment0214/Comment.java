package com.ktdsuniversity.edu.assignment0214;

import java.time.LocalDateTime;

public class Comment {

	private int commentIdx; // 댓글 인덱스 번호
	private String commentAuthor; // 댓글 작성자 이름
	private String commentBody; // 댓글 내용
	private LocalDateTime commentDateTime; // 댓글 작성일시

	// 생성자: 댓글의 인덱스, 작성자, 내용 받기
	// commentIdx: 댓글의 고유 인덱스
	// commentAuthor: 댓글 작성자
	// commentBody: 댓글 내용
	public Comment(int commentIdx, String commentAuthor, String commentBody) {
		this.commentIdx = commentIdx;
		this.commentAuthor = commentAuthor;
		this.commentBody = commentBody;
		this.commentDateTime = LocalDateTime.now(); // 댓글 작성일시는 현재 시간으로 설정
	}

	// Getter 메서드들

	// 댓글의 고유 인덱스를 반환
	public int getCommentIdx() {
		return commentIdx;
	}

	// 댓글 작성자를 반환
	public String getCommentAuthor() {
		return commentAuthor;
	}

	// 댓글 내용을 반환
	public String getCommentBody() {
		return commentBody;
	}

	// 댓글 작성일시를 반환
	public LocalDateTime getCommentDateTime() {
		return commentDateTime;
	}

	// 댓글 출력 메소드
	// 댓글 작성자, 내용, 작성일시를 출력
	public void printComment() {
		System.out.println(" - " + commentAuthor + " | " + commentBody + " | " + commentDateTime);
	}
}

/*
변수: 각 필드가 어떤 정보를 담고 있는지 설명했습니다.
생성자: 댓글 객체를 생성할 때 초기화되는 값들에 대해 설명했습니다. 특히, 댓글 작성일시는 객체 생성 시점의 LocalDateTime.now()로 설정된다는 점을 언급했어요.
Getter 메소드: 각 필드에 대한 getter 메소드가 무엇을 반환하는지 설명했습니다.
출력 메소드: 댓글을 출력하는 printComment() 메소드는 댓글 작성자, 내용, 작성일시를 출력하는 역할을 합니다.
*/
