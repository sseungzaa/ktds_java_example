package com.ktdsuniversity.edu.bbs.management;

import com.ktdsuniversity.edu.member.management.Member;

public class Article {
	
	Member author;
	String title;
	
	public static void main(String[] args) {
		Article notice = new Article();
		notice.author = new Member("system","관리자");
		notice.title = "커뮤니티 이용 안내";
		
		System.out.println("게시글 제목: " + notice.title);
		System.out.println("작성자: " + notice.author.name);
	}
	
	/* [ ] 이렇게 안 하기 위해서 import ~를 해줌
	[com.ktdsuniversity.edu.member.management.]Member author;
	String title;
	
	public static void main(String[] args) {
		Article notice = new Article();
		notice.author = new [com.ktdsuniversity.edu.member.management.]Member("system","관리자");
		notice.title = "커뮤니티 이용 안내";
		
		System.out.println("게시글 제목: " + notice.title);
		System.out.println("작성자: " + notice.author.name);
	}
	*/
}
