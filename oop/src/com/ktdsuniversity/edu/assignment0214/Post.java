package com.ktdsuniversity.edu.assignment0214;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private int postIdx; // 게시글 인덱스 번호
	private String postHeadline; // 게시글 제목
	private String postAuthor; // 게시글 작성자 이름
	private String postBody; // 게시글 내용
	private LocalDateTime postDateTime; // 게시글 작성일시
	private List<Comment> commentList; // 댓글 목록(게시글 하나에는 여러 개의 댓글을 작성할 수 있음)

	// 생성자: 게시글의 인덱스, 제목, 작성자, 내용을 받아서 게시글을 생성
	public Post(int postIdx, String postHeadline, String postAuthor, String postBody) {
		this.postIdx = postIdx;
		this.postHeadline = postHeadline;
		this.postAuthor = postAuthor;
		this.postBody = postBody;
		this.postDateTime = LocalDateTime.now(); // 게시글 작성일시는 현재 시간으로 설정
		this.commentList = new ArrayList<>(); // 댓글 목록 초기화
	}

	// Getter & Setter

	// 게시글 인덱스를 반환
	public int getPostIdx() {
		return postIdx;
	}

	// 게시글 제목을 반환
	public String getPostHeadline() {
		return postHeadline;
	}

	// 게시글 제목을 설정하고, 작성일시도 수정
	public void setPostHeadline(String postHeadline) {
		this.postHeadline = postHeadline;
		this.postDateTime = LocalDateTime.now(); // 제목 수정 시 작성일시 갱신
	}

	// 게시글 작성자를 반환
	public String getPostAuthor() {
		return postAuthor;
	}

	// 게시글 내용을 반환
	public String getPostBody() {
		return postBody;
	}

	// 게시글 내용을 설정하고, 작성일시도 수정
	public void setPostBody(String postBody) {
		this.postBody = postBody;
		this.postDateTime = LocalDateTime.now(); // 내용 수정 시 작성일시 갱신
	}

	// 게시글 작성일시를 반환
	public LocalDateTime getPostDateTime() {
		return postDateTime;
	}

	// 게시글에 달린 댓글 목록을 반환
	public List<Comment> getCommentList() {
		return commentList;
	}

	// 댓글을 추가하는 메소드
	public void addComment(Comment comment) {
		commentList.add(comment); // 댓글 목록에 새로운 댓글을 추가
	}

	// 댓글을 삭제하는 메소드
	// commentIdx: 삭제할 댓글의 고유 인덱스
	public void deleteComment(int commentIdx) {
		// 댓글 목록에서 해당 인덱스를 가진 댓글을 제거
		commentList.removeIf(comment -> comment.getCommentIdx() == commentIdx);
	}

	// 게시글 정보를 출력하는 메소드
	public void printPost() {
		System.out.println("게시글 인덱스 번호: " + postIdx + " | 제목: " + postHeadline + " | 작성자: " + postAuthor + " | 작성일시: "
				+ postDateTime);
		System.out.println("내용: " + postBody);
		System.out.println("\n댓글 목록:");

		// 댓글이 없으면 메시지 출력
		if (commentList.isEmpty()) {
			System.out.println("댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.");
		} else {
			// 댓글 목록이 있으면 각 댓글을 출력
			for (Comment comment : commentList) {
				comment.printComment(); // 각 댓글의 출력 메소드를 호출
			}
		}
	}
}

/*
변수: 각 필드가 무엇을 의미하는지 설명했습니다.
생성자: 게시글을 생성할 때의 초기화 과정을 설명했습니다.
Getter & Setter: 각각의 필드를 반환하거나 설정하는 메소드에 대한 설명을 추가했습니다.
댓글 관련 메소드:
addComment: 댓글을 추가하는 메소드.
deleteComment: 특정 인덱스를 가진 댓글을 삭제하는 메소드.
출력 메소드: 게시글과 댓글을 출력하는 메소드입니다. 댓글이 없을 때와 있을 때의 출력을 다르게 처리하는 부분도 설명했습니다.
*/
