package com.ktdsuniversity.edu.assignment0214answer;

import com.ktdsuniversity.edu.assignment0214answer.exceptions.PostException;
import java.util.Scanner;

public class Main {

	private Scanner sc;
	public Main() {
		this.sc = new Scanner(System.in);
	}
	
	public void run() {
		PostApp app = new PostApp();
		
		while (true) {
			Menu.printMenu();
			int menuNum = Menu.selectMenu(this.sc);
			while (menuNum == -1) {
				System.out.println(Messages.WRONG_MENU);
				menuNum = Menu.selectMenu(this.sc);
			}
			
			if (menuNum == 1) {
				this.printAllPosts(app);
			}
			else if (menuNum == 2) {
				this.printOnePost(app);
			}
			else if (menuNum == 3) {
				this.addNewPost(app);
			}
			else if (menuNum == 4) {
				this.updateOnePost(app);
			}
			else if (menuNum == 5) {
				this.deleteOnePost(app);
			}
			else if (menuNum == 6) {
				this.addNewComment(app);
			}
			else if (menuNum == 7) {
				this.printAllComments(app);
			}
			else if (menuNum == 8) {
				this.deleteOneComment(app);
			}
			else if (menuNum == 0) {
				break;
			}
		}
		
		this.sc.close();
	}
	
	private void printAllPosts(PostApp app) {
		try {
			app.printAllPosts();
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void printOnePost(PostApp app) {
		System.out.println(Messages.SELECT_POST_INDEX);
		int number = Menu.nextInt(this.sc);
		
		try {
			app.printPost(number);
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void addNewPost(PostApp app) {
		String title = Menu.nextLine(this.sc, "제목을 입력하세요:", true);
		String author = Menu.nextLine(this.sc, "작성자를 입력하세요:", true);
		String description = Menu.nextLine(this.sc, "내용을 입력하세요:", false);
		
		Post newPost = new Post(title, author, description);
		try {
			app.addNewPost(newPost);
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void updateOnePost(PostApp app) {
		System.out.println("수정하려는 게시글 번호를 입력하세요.");
		int postIndex = Menu.nextInt(this.sc);
		try {
			String title = Menu.nextLine(this.sc, "제목을 입력하세요:", true);
			String description = Menu.nextLine(this.sc, "내용을 입력하세요:", false);
			app.updateOnePost(postIndex, new Post(title, null, description));
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void deleteOnePost(PostApp app) {
		System.out.println("삭제하려는 게시글 번호를 입력하세요.");
		int postIndex = Menu.nextInt(this.sc);
		try {
			String yn = Menu.nextLine(this.sc, 
							Messages.DELETE_POST_QUESTION.formatted(postIndex), 
							false);
			if (yn.equalsIgnoreCase("n")) {
				System.out.println(Messages.DELETE_CANCEL);
			}
			else {
				app.deleteOnePost(postIndex);
			}
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void addNewComment(PostApp app) {
		System.out.println("댓글을 등록하려는 게시글 번호를 입력하세요.");
		int postIndex = Menu.nextInt(this.sc);
		
		System.out.println(Messages.ADD_COMMENT.formatted(postIndex, app.getAt(postIndex).getComments().size()));
		String title = Menu.nextLine(this.sc, 
							"댓글 내용을 입력하세요:", 
							true);
		String author = Menu.nextLine(this.sc, 
							"댓글 작성자를 입력하세요:", 
							true);
		
		Comment newComment = new Comment(title, author);
		try {
			app.addNewComment(postIndex, newComment);
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void printAllComments(PostApp app) {
		System.out.println("댓글을 조회하려는 게시글 번호를 입력하세요.");
		int postIndex = Menu.nextInt(this.sc);
		
		try {
			app.printAllComments(postIndex);
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	private void deleteOneComment(PostApp app) {
		System.out.println("댓글을 삭제하려는 게시글 번호를 입력하세요.");
		int postIndex = Menu.nextInt(this.sc);
		
		System.out.println("삭제하려는 댓글 번호를 입력하세요.");
		int commentIndex = Menu.nextInt(this.sc);
		
		try {
			app.deleteOneComment(postIndex, commentIndex);
		}
		catch(PostException pe) {
			System.out.println(pe.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
