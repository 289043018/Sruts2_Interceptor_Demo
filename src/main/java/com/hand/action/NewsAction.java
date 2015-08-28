package com.hand.action;

import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport{
	public String add() throws Exception {
		System.out.println("进入了Newsadd");
		return "Newssuccess";
	}
	public String delete() throws Exception {
		System.out.println("进入了Newsdelete");
		return "Newssuccess";
	}
	public String show() throws Exception {
		System.out.println("进入了Newsshow");
		return "Newssuccess";
	}
	public String update() throws Exception {
		System.out.println("进入了Newsupdate");
		return "Newssuccess";
	}
}
