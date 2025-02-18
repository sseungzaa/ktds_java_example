package com.ktdsuniversity.edu.assignment0214answer;

import com.ktdsuniversity.edu.assignment0214answer.exceptions.PostException;
import java.util.List;

public class PostApp implements PostInterface {

	private List<Post> posts;
	
	public PostApp() {
		this.posts = Store.loadAllPosts();
	}
	
	public Post getAt(int postIndex) {
		return this.posts.get(postIndex);
	}
	
	@Override
	public void printAllPosts() {
		if (this.posts.isEmpty()) {
			throw new PostException(Messages.NO_POST);
		}
		
		Post eachPost = null;
		for (int i = 0; i < this.posts.size(); i++) {
			eachPost = this.posts.get(i);
			System.out.println("Index: " + i + eachPost);
		}
	}

	@Override
	public void printPost(int postIndex) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		Post post = this.posts.get(postIndex);
		if (post == null) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		Store.loadAllComment(post);
		
		System.out.println(post.getDetails(postIndex));
	}

	@Override
	public void addNewPost(Post post) {
		if (post == null) {
			throw new PostException(Messages.ADD_NULL_POST);
		}
		
		post.setId(this.posts.size() + (int) (Math.random() * 1_000_000));
		this.posts.add(post);
		Store.storePost(this.posts);
		System.out.println(Messages.ADD_DONE_POST);
	}

	@Override
	public void updateOnePost(int postIndex, Post updatedPost) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		Post post = this.posts.get(postIndex);
		if (post == null) {
			throw new PostException(Messages.UPDATE_NULL_POST);
		}
		
		post.resetDateTime();
		post.setDescription(updatedPost.getDescription());
		post.setTitle(updatedPost.getTitle());
		//this.posts.set(postIndex, post);
		
		Store.storePost(this.posts);
		System.out.println(Messages.UPDATE_DONE_POST);
	}

	@Override
	public void deleteOnePost(int postIndex) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		this.posts.remove(postIndex);
		Store.storePost(this.posts);
		Store.removeAllComments(postIndex);
		System.out.println(Messages.DELETE_DONE);
	}

	@Override
	public void addNewComment(int postIndex, Comment comment) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		Post post = this.posts.get(postIndex);
		if (post == null) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		List<Comment> comments = post.getComments();
		comments.add(comment);
		Store.storeAllComments(post);
	}

	@Override
	public void printAllComments(int postIndex) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		Post post = this.posts.get(postIndex);
		if (post == null) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		if (post.getComments() == null) {
			Store.loadAllComment(post);
		}
		
		List<Comment> comments = post.getComments();
		if (comments.isEmpty()) {
			System.out.println(Messages.NO_COMMENTS);
			return;
		}
		
		for (Comment eachComment : comments) {
			System.out.println(eachComment);
		}
	}

	@Override
	public void deleteOneComment(int postIndex, int commentIndex) {
		if (postIndex < 0 || postIndex >= this.posts.size()) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		Post post = this.posts.get(postIndex);
		if (post == null) {
			throw new PostException(Messages.WRONG_INDEX);
		}
		
		if (commentIndex < 0 || commentIndex >= post.getComments().size()) {
			throw new PostException(Messages.WRONG_COMMENT_INDEX);
		}
		
		Comment comment = post.getComments().get(commentIndex);
		if (comment == null) {
			throw new PostException(Messages.WRONG_COMMENT_INDEX);
		}
		
		post.getComments().remove(commentIndex);
		Store.storeAllComments(post);
		System.out.println(Messages.DELETE_DONE);
	}

}
