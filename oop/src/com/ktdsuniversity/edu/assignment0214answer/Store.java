package com.ktdsuniversity.edu.assignment0214answer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Store {

	private static final String DIRECTORY_PATH = "C:\\Users\\211-11\\Desktop\\FileIOExam";
	private static final String POST_FILENAME = "posts.txt";
	private static final String COMMENTS_FILE_NAME = "comments_%d.txt";
	
	public static void storePost(List<Post> posts) {
		File postFile = new File(Store.DIRECTORY_PATH, Store.POST_FILENAME);
		
		if (!postFile.getParentFile().exists()) {
			postFile.getParentFile().mkdirs();
		}
		
		List<String> stringData = new ArrayList<>();
		for (Post eachPost : posts) {
			stringData.add(eachPost.toFileFormat());
		}
		try {
			Files.write(postFile.toPath(), stringData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void storeAllComments(Post post) {
		File commentFile = new File(Store.DIRECTORY_PATH, Store.COMMENTS_FILE_NAME.formatted(post.getId()));
		
		if (!commentFile.getParentFile().exists()) {
			commentFile.getParentFile().mkdirs();
		}
		
		List<String> stringData = new ArrayList<>();
		for (Comment eachComment : post.getComments()) {
			stringData.add(eachComment.toFileFormat());
		}
		try {
			Files.write(commentFile.toPath(), stringData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void removeAllComments(int postId) {
		File commentFile = new File(Store.DIRECTORY_PATH, Store.COMMENTS_FILE_NAME.formatted(postId));
		commentFile.delete();
	}
	
	public static List<Post> loadAllPosts() {
		File postFile = new File(Store.DIRECTORY_PATH, Store.POST_FILENAME);
		if (!postFile.exists()) {
			return new ArrayList<>();
		}
		
		List<Post> posts = new ArrayList<>();
		try {
			List<String> postData = Files.readAllLines(postFile.toPath());
			for (String post : postData) {
				posts.add(new Post(post.split("\\|")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return posts;
	}
	
	public static void loadAllComment(Post post) {
		File commentFile = new File(Store.DIRECTORY_PATH, Store.COMMENTS_FILE_NAME.formatted(post.getId()));
		if (!commentFile.exists()) {
			post.setComments(new ArrayList<>());
			return;
		}
		
		List<Comment> comments = new ArrayList<>();
		try {
			List<String> commentData = Files.readAllLines(commentFile.toPath());
			for (String comment : commentData) {
				comments.add(new Comment(comment.split("\\|")));
			}
			post.setComments(comments);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
