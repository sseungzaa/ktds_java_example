package com.ktdsuniversity.edu.hw0214;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
다음은 게시판 기능 설명입니다.
	1. 게시글 목록 조회
	모든 게시글을 아래 형태로 출력합니다.
		Index: 인덱스 번호 | 제목: 게시글 제목 | 작성자: 게시글 작성자 이름 | 작성일시: 게시글 작성 날짜 게시글 작성 시간
		
	2. 게시글 내용 조회
	게시글의 인덱스 번호를 파라미터로 전달하면 해당 인덱스 번호의 게시글을 아래 형태로 출력합니다.
	만약, 존재하지 않는 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	댓글이 있을 경우 댓글 목록도 함께 출력합니다.
		Index: 인덱스 번호 | 제목 : 게시글 제목 | 작성자 : 게시글 작성자 이름 | 작성일시: 게시글 작성 날짜 게시글 작성 시간
		내용: 게시글 내용
		댓글 목록 (댓글이 있을 경우 해당 게시글의 모든 댓글을 출력)
		댓글 내용 | 댓글 작성자 이름 | 댓글 작성 날짜 댓글 작성 시간
	댓글 목록 (댓글이 없을 경우 `댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.`를 출력)
	
	3. 게시글 등록
	Scanner를 이용해 게시글을 등록합니다. 아래 형태로 등록합니다.
		제목을 입력하세요: _ (Note. 제목은 필수 입력이며 제목을 입력하지 않고 엔터를 입력한 경우, 제목을 입력할 때까지 계속 입력을 시도해야 합니다.)
		작성자를 입력하세요: _ (Note. 작성자 이름은 필수 입력이며 작성자를 입력하지 않고 엔터를 입력한 경우, 작성자를 입력할 때까지 계속 입력을 시도해야 합니다.)
		내용을 입력하세요: _ (Note. 내용은 필수 입력이 아니며, 입력하지 않을 수 있습니다.)
	작성 날짜와 시간은 현재 시간으로 등록해야 합니다.
	입력이 완료되면 게시글을 등록하고, `게시글 등록이 완료되었습니다.`를 출력합니다.
	
	4. 게시글 수정
	수정하고 싶은 게시글의 인덱스 번호로 게시글의 정보를 수정합니다.
	만약, 존재하지 않는 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	Scanner를 이용해 게시글을 수정할 수 있으며 제목과 내용만 수정 가능합니다.
	게시글 수정이 완료되면, 해당 게시글의 작성 날짜와 작성 시간이 현재 날짜 시간으로 갱신되어야 합니다.
	아래 형태로 수정합니다.
		수정하려는 게시글 번호를 입력하세요.
		제목을 입력하세요: _ (Note. 제목은 필수 입력이며 제목을 입력하지 않고 엔터를 입력한 경우, 제목을 입력할 때까지 계속 입력을 시도해야 합니다.)
		내용을 입력하세요: _ (Note. 내용은 필수 입력값이 아니며, 입력하지 않을 수 있습니다.)
	수정이 완료되면 `게시글 수정이 완료되었습니다.`를 출력합니다.
	
	5. 게시글 삭제
	삭제하고 싶은 게시글의 인덱스 번호로 게시글을 삭제합니다.
	만약, 존재하지 않는 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	삭제하기 전 사용자에게 `n번 게시글을 삭제합니다. 계속 진행할까요? (y/n)`를 물어보고 y를 입력했을 때만 삭제하며, 삭제 후 `삭제가 완료되었습니다.`를 출력합니다.
	만약 n을 입력했다면 `삭제가 취소되었습니다.`를 출력하며 게시글은 삭제되지 않아야 합니다.
	
	6. 댓글 등록
	댓글을 등록하고 싶은 게시글의 인덱스 번호로 댓글을 등록합니다.
	만약, 존재하지 않는 게시글의 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	아래 형태로 댓글을 등록합니다.
		`n번 게시글의 n번째 댓글을 등록합니다.`
		댓글 내용을 입력하세요: _ (Note. 내용은 필수 입력이며 내용을 입력하지 않고 엔터를 입력한 경우, 내용을 입력할 때까지 계속 입력을 시도해야 합니다.)
		댓글 작성자를 입력하세요: _ (Note. 작성자는 필수 입력이며 작성자를 입력하지 않고 엔터를 입력한 경우, 작성자를 입력할 때까지 계속 입력을 시도해야 합니다.)
	댓글 작성 날짜와 시간은 현재 시간으로 등록되어야 합니다.
	
	7. 댓글 조회
	댓글을 조회하고 싶은 게시글의 인덱스 번호로 댓글을 조회합니다.
	만약, 존재하지 않는 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	해당 게시글에 댓글이 존재할 경우 아래 형태로 해당 게시글의 모든 댓글을 출력합니다.
		댓글 내용 | 댓글 작성자 이름 | 댓글 작성 날짜 댓글 작성 시간
	해당 게시글에 댓글이 없을 경우 `댓글이 없습니다. 첫 댓글의 주인공이 되어보세요.`를 출력합니다.
	
	8. 댓글 삭제
	댓글을 삭제하고 싶은 게시글의 인덱스 번호와 댓글의 번호로 댓글을 삭제합니다.
	만약, 존재하지 않는 인덱스 번호를 전달했을 경우 `해당 게시글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	또한, 존재하지 않는 댓글 번호를 전달했을 경우 `해당 댓글은 존재하지 않습니다.`를 출력하고 아무런 일도 하지 않습니다.
	삭제하기 전 사용자에게 `n번 게시글의 n번째 댓글을 삭제합니다. 계속 진행할까요? (y/n)`를 물어보고 y를 입력했을 때만 삭제하며, 삭제 후 `삭제가 완료되었습니다.`를 출력합니다.
	만약 n을 입력했다면 `삭제가 취소되었습니다.`를 출력하며 댓글은 삭제되지 않아야 합니다.
*/

public class Board implements BoardInterface {
	private List<Post> postList; // 게시글 목록
	private int postIndexCounter; // 게시글 인덱스 번호 (증가)
	private int commentIndexCounter; // 댓글 인덱스 번호 (증가)
	private Scanner sc;
	
	public Board() {
		this.postList = new ArrayList<>();
		this.postIndexCounter = 1;
		this.commentIndexCounter = 1;
		this.sc = new Scanner(System.in);
	}
	
	// 인덱스 번호로 게시글을 찾아주는 메소드
	public Post findPostIdx(int postIdx) {
		for (Post post : postList) { // 게시글 목록을 돌면서 찾음
			if (post.getPostIdx() == postIdx) {
				return post;
			}
		}
		return null; // 없으면 null
	}
	
	@Override // 게시글 목록 조회
	public void browsePostList() {
		if (postList.isEmpty()) {
			System.out.println("현재 게시글이 없습니다.");
			return;
		}
		for (Post post : postList) {
			System.out.println("게시글 인덱스 번호: " + post.getPostIdx() + " | 제목: " + post.getPostHeadline()
								+ " | 작성자: " + post.getPostAuthor() + " | 작성일시: " + post.getPostDateTime());
		}
	}
	
	@Override // 게시글 내용 조회
	public void viewPost(int postIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}
		post.printPost(); // 게시글 및 댓글 목록 출력
	}
	
	@Override // 게시글 등록
	public void addPost(String postHeadline, String postAuthor, String postBody) {
		if (postHeadline.isEmpty() || postAuthor.isEmpty()) {
			System.out.println("제목과 작성자는 필수 입력 사항입니다.");
			return;
		}
		
		int postIdx = postIndexCounter; // 현재 인덱스를 게시글에 할당
		postIndexCounter++; // 게시글 인덱스 증가
		
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
		System.out.println(postIdx + "번 게시글을 삭제합니다. 계속 진행할까요? (y/n)"); // y나 Y나 둘 다 되게
		String confirm = sc.nextLine();
		if (confirm.equalsIgnoreCase("y")) {
			postList.remove(post);
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
		post.printPost(); // 댓글도 함께 출력
	}
	
	@Override // 댓글 삭제
	public void deleteComment(int postIdx, int commentIdx) {
		Post post = findPostIdx(postIdx);
		if (post == null) {
			System.out.println("해당 게시글은 존재하지 않습니다.");
			return;
		}
		System.out.println(postIdx + "번 게시글의 " + commentIdx + "번 댓글을 삭제합니다. 계속 진행할까요? (y/n)");
		String confirm = sc.nextLine();
		if (confirm.equalsIgnoreCase("y")) { // y나 Y나 둘 다 되게
			post.deleteComment(commentIdx);
			System.out.println("댓글이 삭제되었습니다.");
		} else {
			System.out.println("삭제가 취소되었습니다.");
		}
	}
}
