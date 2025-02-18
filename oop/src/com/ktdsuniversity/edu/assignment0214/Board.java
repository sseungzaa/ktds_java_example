package com.ktdsuniversity.edu.assignment0214;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board implements BoardInterface {

	private List<Post> postList; // 게시글 목록
	private int postIndexCounter; // 게시글 인덱스 번호 (증가)
	private int commentIndexCounter; // 댓글 인덱스 번호 (증가)
	private Scanner sc; // 사용자 입력을 위한 Scanner 객체

	// 생성자: 게시글 목록 초기화, 인덱스 카운터 초기화, Scanner 객체 생성
	public Board() {
		this.postList = new ArrayList<>(); // 게시글 목록 초기화
		this.postIndexCounter = 1; // 게시글 인덱스 초기화
		this.commentIndexCounter = 1; // 댓글 인덱스 초기화
		this.sc = new Scanner(System.in); // 사용자 입력을 받을 Scanner 객체 초기화
	}

	// 게시글 인덱스를 기반으로 게시글을 찾는 메소드
	public Post findPostIdx(int postIdx) {
		for (Post post : postList) { // 게시글 목록을 돌면서 해당 인덱스를 찾음
			if (post.getPostIdx() == postIdx) {
				return post;
			}
		}
		return null; // 해당 게시글이 없으면 null 반환
	}

	@Override // 게시글 목록 조회
	public void browsePostList() {
		if (postList.isEmpty()) {
			System.out.println("현재 게시글이 없습니다.");
			return;
		}
		for (Post post : postList) {
			// 게시글 인덱스, 제목, 작성자, 작성일시 출력
			System.out.println("게시글 인덱스 번호: " + post.getPostIdx() + " | 제목: " + post.getPostHeadline() + " | 작성자: "
					+ post.getPostAuthor() + " | 작성일시: " + post.getPostDateTime());
		}
	}

	@Override // 게시글 내용 조회
	public void viewPost(int postIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}
		post.printPost(); // 게시글 및 댓글 출력
	}

	@Override // 게시글 등록
	public void addPost(String postHeadline, String postAuthor, String postBody) {
		if (postHeadline.isEmpty() || postAuthor.isEmpty()) {
			System.out.println("제목과 작성자는 필수 입력 사항입니다.");
			return;
		}

		int postIdx = postIndexCounter; // 현재 인덱스를 게시글에 할당
		postIndexCounter++; // 게시글 인덱스 증가

		// 새 게시글 생성 후 목록에 추가
		Post addPost = new Post(postIdx, postHeadline, postAuthor, postBody);
		postList.add(addPost);

		System.out.println("게시글 등록이 완료되었습니다.");
	}

	@Override // 게시글 수정
	public void editPost(int postIdx, String newPostHeadline, String newPostBody) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}

		// 제목과 본문이 비어있지 않으면 수정
		if (!newPostHeadline.isEmpty()) {
			post.setPostHeadline(newPostHeadline);
		}
		if (!newPostBody.isEmpty()) {
			post.setPostBody(newPostBody);
		}

		System.out.println("게시글 수정이 완료되었습니다.");
	}

	@Override // 게시글 삭제
	public void deletePost(int postIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}

		// 삭제 확인 메시지 출력
		System.out.println(postIdx + "번 게시글을 삭제합니다. 계속 진행할까요? (y/n)");
		String confirm = sc.nextLine();
		if (confirm.equalsIgnoreCase("y")) {
			postList.remove(post); // 게시글 목록에서 해당 게시글 삭제
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("삭제가 취소되었습니다.");
		}
	}

	@Override // 댓글 등록
	public void addComment(int postIdx, String commentAuthor, String commentBody) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}

		if (commentAuthor.isEmpty() || commentBody.isEmpty()) {
			System.out.println("댓글 내용과 작성자는 필수 입력 사항입니다.");
			return;
		}

		int commentIdx = commentIndexCounter; // 댓글 인덱스 할당
		commentIndexCounter++; // 댓글 인덱스 증가

		// 새 댓글 생성 후 게시글에 추가
		Comment addComment = new Comment(commentIdx, commentAuthor, commentBody);
		post.addComment(addComment);

		System.out.println("댓글이 등록되었습니다.");
	}

	@Override // 댓글 조회
	public void browseComment(int postIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}

		post.printPost(); // 게시글 및 댓글 목록 출력
	}

	@Override // 댓글 삭제
	public void deleteComment(int postIdx, int commentIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}

		// 삭제 확인 메시지 출력
		System.out.println(postIdx + "번 게시글의 " + commentIdx + "번 댓글을 삭제합니다. 계속 진행할까요? (y/n)");
		String confirm = sc.nextLine();
		if (confirm.equalsIgnoreCase("y")) {
			post.deleteComment(commentIdx); // 댓글 삭제
			System.out.println("댓글이 삭제되었습니다.");
		} else {
			System.out.println("삭제가 취소되었습니다.");
		}
	}
}

/*
생성자: 게시글 목록, 인덱스 카운터, Scanner 객체 초기화 작업을 설명했습니다.
findPostIdx: 게시글 목록에서 특정 인덱스를 가진 게시글을 찾아 반환하는 메서드입니다.
메소드들:
browsePostList: 게시글 목록을 조회하여 출력합니다.
viewPost: 게시글 내용을 조회하고 댓글도 출력합니다.
addPost: 새 게시글을 등록하고, 인덱스를 자동으로 증가시킵니다.
editPost: 게시글의 제목과 본문을 수정합니다.
deletePost: 게시글을 삭제할 때, 사용자에게 확인을 받는 절차를 거칩니다.
addComment: 게시글에 댓글을 추가합니다.
browseComment: 게시글에 달린 댓글을 조회합니다.
deleteComment: 댓글을 삭제할 때도 사용자에게 확인을 요청합니다.
*/
