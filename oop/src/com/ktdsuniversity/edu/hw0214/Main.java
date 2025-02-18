package com.ktdsuniversity.edu.hw0214;

import java.util.Scanner;

/* 빼먹은 기능들
애플리케이션에서 관리하는 게시글, 댓글은 애플리케이션을 종료한 후 다시 시작하더라도 내용이 유지되어야 합니다.
제목, 작성자를 입력하지 않고 엔터를 입력한 경우, 제목, 작성자를 입력할 때까지 계속 입력을 시도해야 합니다.
*/

/*
게시판 애플리케이션은 무한히 반복됩니다.
	애플리케이션이 시작되면 사용자에게 아래의 게시판 이용 메뉴를 보여줍니다.
	
		기능을 선택하세요.	
		1. 게시글 목록 조회
		2. 게시글 내용 조회
		3. 게시글 등록
		4. 게시글 수정
		5. 게시글 삭제
		6. 댓글 등록
		7. 댓글 조회
		8. 댓글 삭제
		0. 종료
		기능 번호를 입력하세요: _
		
	0을 입력한 경우 게시판 애플리케이션은 종료됩니다.
	제시된 번호가 아닌 다른 번호를 입력한 경우 `잘못된 기능입니다. 다시 입력해주세요.`를 출력하며 다시 기능을 선택받도록 합니다.
	1을 선택할 경우 게시글 목록 조회 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	2를 선택할 경우 게시글 내용 조회 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	3을 선택할 경우 게시글 등록 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	4를 선택할 경우 게시글 수정 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	5를 선택할 경우 게시글 삭제 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	6을 선택할 경우 댓글 등록 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	7을 선택할 경우 댓글 조회 기능이 실행된 후 다시 기능을 선택받도록 합니다.
	8을 선택할 경우 댓글 삭제 기능이 실행된 후 다시 기능을 선택받도록 합니다.
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board(); // '게시판'이라는 객체 생성
		
		while (true) {
			System.out.println("기능을 선택하세요.");
			System.out.println("1. 게시글 목록 조회");
			System.out.println("2. 게시글 내용 조회");
			System.out.println("3. 게시글 등록");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 댓글 등록");
			System.out.println("7. 댓글 조회");
			System.out.println("8. 댓글 삭제");
			System.out.println("0. 종료");
			System.out.print("기능 번호를 입력하세요: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 0: // 종료
				System.out.println("게시판 애플리케이션을 종료합니다.");
				sc.close();
				return;
				
			case 1: // 게시글 목록 조회
				board.browsePostList();
				break;
				
			case 2: // 게시글 내용 조회
				System.out.print("조회할 게시글 번호를 입력하세요: ");
				int viewPostIdx = sc.nextInt();
				board.viewPost(viewPostIdx);
				break;
				
			case 3: // 게시글 등록
				System.out.print("제목을 입력하세요: ");
				String postHeadline = sc.nextLine();
				System.out.print("작성자를 입력하세요: ");
				String postAuthor = sc.nextLine();
				System.out.print("내용을 입력하세요: ");
				String postBody = sc.nextLine();
				board.addPost(postHeadline, postAuthor, postBody);
				break;
				
			case 4: // 게시글 수정
				System.out.print("수정할 게시글 번호를 입력하세요: ");
				int editPostIdx = sc.nextInt();
				sc.nextLine();
				System.out.print("새로운 제목을 입력하세요: ");
				String newPostHeadline = sc.nextLine();
				System.out.print("새로운 내용을 입력하세요: ");
				String newPostBody = sc.nextLine();
				board.editPost(editPostIdx, newPostHeadline, newPostBody);
				break;
				
			case 5: // 게시글 삭제
				System.out.print("삭제할 게시글 번호를 입력하세요: ");
				int deletePostIdx = sc.nextInt();
				board.deletePost(deletePostIdx);
				break;
				
			case 6: // 댓글 등록
				System.out.print("댓글을 등록할 게시글 번호를 입력하세요: ");
				int addCommentPostIdx = sc.nextInt();
				sc.nextLine();
				System.out.print("댓글 작성자를 입력하세요: ");
				String commentAuthor = sc.nextLine();
				System.out.print("댓글 내용을 입력하세요: ");
				String commentBody = sc.nextLine();
				board.addComment(addCommentPostIdx, commentAuthor, commentBody);
				break;
				
			case 7: // 댓글 조회
				System.out.print("조회할 댓글이 있는 게시글 번호를 입력하세요: ");
				int browseCommentPostIdx = sc.nextInt();
				board.browseComment(browseCommentPostIdx);
				break;
				
			case 8: // 댓글 삭제
				System.out.print("삭제할 댓글이 있는 게시글 번호를 입력하세요: ");
				int deleteCommentPostIdx = sc.nextInt();
				System.out.print("삭제할 댓글 번호를 입력하세요: ");
				int deleteCommentIdx = sc.nextInt();
				board.deleteComment(deleteCommentPostIdx, deleteCommentIdx);
				break;
				
			default: // 다른 거 입력했을 때
				System.out.println("잘못된 기능입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
