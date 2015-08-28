package com.hand.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor {
	private String someThing;
	public void destroy() {
		System.out.println("拦截器被销毁了！");

	}
	//初始化拦截器
	public void init() {
		System.out.println(someThing+"拦截器启动了！");

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		//arg0.invoke();让拦截器的请求继续前进，访问需要访问的资源，就是把它放过去的意思。
		System.out.println("进入First拦截器！");
		String returnName = arg0.invoke();
		return returnName;

	}
	public String getSomeThing() {
		return someThing;
	}
	public void setSomeThing(String someThing) {
		this.someThing = someThing;
	}

}
