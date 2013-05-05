package edu.uestc.attendance.proxy;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.opensymphony.xwork2.ActionContext;

import edu.uestc.attendance.dao.UserEntity;

public class LoginExecte implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		
		return null;
	}
	
	
	private void setSession(UserEntity entity){
		Map session = ActionContext.getContext().getSession();
		session.put("userentity", entity);
	}

}
