package com.hand.action;

import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport{
	public String add() throws Exception {
		System.out.println("进入了Useradd");
		return "Userssuccess";
	}
	public String delete() throws Exception {
		System.out.println("进入了Userdelete");
		return "Userssuccess";
	}
	public String show() throws Exception {
		System.out.println("进入了Usershow");
		return "Userssuccess";
	}
	public String update() throws Exception {
		System.out.println("进入了Userupdate");
		return "Userssuccess";
	}
	
}
