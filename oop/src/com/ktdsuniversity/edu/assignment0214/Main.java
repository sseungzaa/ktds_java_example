package com.ktdsuniversity.edu.assignment0214;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
		Board board = new Board(); // '게시판' 객체 생성

		// 무한 루프를 통해 사용자로부터 입력을 받음
		while (true) {
			// 기능 메뉴 출력
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

			int choice = sc.nextInt(); // 사용자로부터 기능 번호 입력
			sc.nextLine();

			// 선택한 기능에 따라 switch문을 사용
			switch (choice) {
			case 0: // 종료
				System.out.println("게시판 애플리케이션을 종료합니다.");
				sc.close(); // Scanner 객체 종료
				return; // 프로그램 종료

			case 1: // 게시글 목록 조회
				board.browsePostList(); // 게시글 목록을 조회하는 메소드 호출
				break;

			case 2: // 게시글 내용 조회
				System.out.print("조회할 게시글 번호를 입력하세요: ");
				int viewPostIdx = sc.nextInt(); // 조회할 게시글 번호 입력
				board.viewPost(viewPostIdx); // 해당 게시글을 조회하는 메소드 호출
				break;

			case 3: // 게시글 등록
				System.out.print("제목을 입력하세요: ");
				String postHeadline = sc.nextLine(); // 제목 입력
				System.out.print("작성자를 입력하세요: ");
				String postAuthor = sc.nextLine(); // 작성자 입력
				System.out.print("내용을 입력하세요: ");
				String postBody = sc.nextLine(); // 내용 입력
				board.addPost(postHeadline, postAuthor, postBody); // 게시글을 등록하는 메소드 호출
				break;

			case 4: // 게시글 수정
				System.out.print("수정할 게시글 번호를 입력하세요: ");
				int editPostIdx = sc.nextInt(); // 수정할 게시글 번호 입력
				sc.nextLine();
				System.out.print("새로운 제목을 입력하세요: ");
				String newPostHeadline = sc.nextLine(); // 새로운 제목 입력
				System.out.print("새로운 내용을 입력하세요: ");
				String newPostBody = sc.nextLine(); // 새로운 내용 입력
				board.editPost(editPostIdx, newPostHeadline, newPostBody); // 게시글을 수정하는 메소드 호출
				break;

			case 5: // 게시글 삭제
				System.out.print("삭제할 게시글 번호를 입력하세요: ");
				int deletePostIdx = sc.nextInt(); // 삭제할 게시글 번호 입력
				board.deletePost(deletePostIdx); // 게시글을 삭제하는 메소드 호출
				break;

			case 6: // 댓글 등록
				System.out.print("댓글을 등록할 게시글 번호를 입력하세요: ");
				int addCommentPostIdx = sc.nextInt(); // 댓글을 달 게시글 번호 입력
				sc.nextLine();
				System.out.print("댓글 작성자를 입력하세요: ");
				String commentAuthor = sc.nextLine(); // 댓글 작성자 입력
				System.out.print("댓글 내용을 입력하세요: ");
				String commentBody = sc.nextLine(); // 댓글 내용 입력
				board.addComment(addCommentPostIdx, commentAuthor, commentBody); // 댓글을 등록하는 메소드 호출
				break;

			case 7: // 댓글 조회
				System.out.print("조회할 댓글이 있는 게시글 번호를 입력하세요: ");
				int browseCommentPostIdx = sc.nextInt(); // 댓글을 조회할 게시글 번호 입력
				board.browseComment(browseCommentPostIdx); // 댓글을 조회하는 메소드 호출
				break;

			case 8: // 댓글 삭제
				System.out.print("삭제할 댓글이 있는 게시글 번호를 입력하세요: ");
				int deleteCommentPostIdx = sc.nextInt(); // 댓글을 삭제할 게시글 번호 입력
				System.out.print("삭제할 댓글 번호를 입력하세요: ");
				int deleteCommentIdx = sc.nextInt(); // 삭제할 댓글 번호 입력
				board.deleteComment(deleteCommentPostIdx, deleteCommentIdx); // 댓글을 삭제하는 메소드 호출
				break;

			default: // 잘못된 입력 처리
				System.out.println("잘못된 기능입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}

/*
메인 메뉴 출력: 사용자가 선택할 수 있는 기능들이 출력됩니다.
사용자 입력: 사용자로부터 기능 번호를 입력받고, 그에 맞는 기능을 실행합니다.
각 기능별 처리: 게시글 및 댓글을 등록, 수정, 삭제하는 작업을 각 기능에 맞는 메소드를 통해 실행합니다.
종료 처리: 사용자가 0을 입력하면 프로그램이 종료됩니다.
입력 처리: sc.nextLine()을 사용하여 nextInt()나 다른 입력 메소드에서 발생할 수 있는 개행 문자 문제를 해결합니다.
*/
