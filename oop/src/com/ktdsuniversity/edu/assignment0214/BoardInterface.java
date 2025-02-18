package com.ktdsuniversity.edu.assignment0214;

import java.util.List;

public interface BoardInterface {
	
	// 게시글 목록 조회
	void browsePostList();
	
	// 특정 게시글 내용 조회
	// postIdx: 게시글의 고유 인덱스
	void viewPost(int postIdx);
	
	// 새 게시글 등록
	// postHeadline: 게시글 제목
	// postAuthor: 게시글 작성자
	// postBody: 게시글 본문 내용
	void addPost(String postHeadline, String postAuthor, String postBody);
	
	// 기존 게시글 수정
	// postIdx: 수정할 게시글의 고유 인덱스
	// newPostHeadline: 새 게시글 제목
	// newPostBody: 새 게시글 본문 내용
	void editPost(int postIdx, String newPostHeadline, String newPostBody);
	
	// 특정 게시글 삭제
	// postIdx: 삭제할 게시글의 고유 인덱스
	void deletePost(int postIdx);
	
	// 게시글에 댓글 등록
	// postIdx: 댓글을 달 게시글의 고유 인덱스
	// commentAuthor: 댓글 작성자
	// commentBody: 댓글 내용
	void addComment(int postIdx, String commentAuthor, String commentBody);
	
	// 게시글에 달린 댓글 조회
	// postIdx: 댓글을 조회할 게시글의 고유 인덱스
	void browseComment(int postIdx);
	
	// 게시글에 달린 특정 댓글 삭제
	// postIdx: 댓글이 달린 게시글의 고유 인덱스
	// commentIdx: 삭제할 댓글의 고유 인덱스
	void deleteComment(int postIdx, int commentIdx);
}
