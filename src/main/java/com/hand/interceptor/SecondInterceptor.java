package com.hand.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecondInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("进入Secnd拦截器！");
		String returnName = arg0.invoke();
		return returnName;
	}

}
