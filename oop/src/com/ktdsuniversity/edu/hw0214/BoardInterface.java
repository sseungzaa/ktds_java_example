package com.ktdsuniversity.edu.hw0214;

import java.util.List;

/*
게시판은 다음 기능을 제공합니다.
	게시글 목록 조회 // BrowsePostList
	게시글 내용 조회 // ViewPost
	게시글 등록 // (Add)Post
	게시글 수정 // EditPost
	게시글 삭제 //DeletePost
	댓글 등록 // (Add)Comment
	댓글 조회 // BrowseComment
	댓글 삭제 // DeleteComment
*/

public interface BoardInterface {
	void browsePostList(); // 게시글 목록 조회
	
	void viewPost(int postIdx); // 게시글 내용 조회
	
	void addPost(String postHeadline, String postAuthor, String postBody); // 게시글 등록
	
	void editPost(int postIdx, String newPostHeadline, String newPostBody); // 게시글 수정
	
	void deletePost(int postIdx); // 게시글 삭제
	
	void addComment(int postIdx, String commentAuthor, String commentBody); // 댓글 등록
	
	void browseComment(int postIdx); // 댓글 조회
	
	void deleteComment(int postIdx, int commentIdx); // 댓글 삭제
}
