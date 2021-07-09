package com.kopo.memoprogram;

public class Memo {
	int idx;
	String title;
	String content;
	String created;
	String updated;
	int userIdx=0;
	
	Memo() {
		
	}
	
	Memo(String new_title, String new_content, String first_created, int userIdx) {
		this.title = new_title;
		this.content = new_content;
		this.created = first_created;
		this.userIdx = userIdx;
	}
	
	Memo(int idx, String new_title, String new_content, String first_created, String now, int userIdx) {
		this.idx = idx;
		this.title = new_title;
		this.content = new_content;
		this.created = first_created;
		this.updated = now;
		this.userIdx = userIdx;
	}
}
