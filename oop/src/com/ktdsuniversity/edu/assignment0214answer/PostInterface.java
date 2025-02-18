package com.ktdsuniversity.edu.assignment0214answer;

public interface PostInterface {

	public void printAllPosts();
	public void printPost(int postIndex);
	public void addNewPost(Post post);
	public void updateOnePost(int postIndex, Post updatedPost);
	public void deleteOnePost(int postIndex);
	public void addNewComment(int postIndex, Comment comment);
	public void printAllComments(int postIndex);
	public void deleteOneComment(int postIndex, int commentIndex);
	
}
