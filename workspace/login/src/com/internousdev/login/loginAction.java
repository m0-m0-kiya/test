package com.internousdev.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import.com.internousdev.dao.loginDAO;
import com.internousdev.dto.loginDTO;
import com.opensymphony.xwork2.Actionsupport;

public class LoginAction extends ActionSupport implements sessionAware{
	private String name;
	private String password;
	private Map<String,Object>session;

	public String execute() throws SQLException{
		String ret = ERROR;
		LoginDAO dao = new LoginDAD();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(name,password);
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;
			}
		}
		session.put("name",dto,getName());
		return ret;
	}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public String setpassword(String password){
	this.password=password;
}
public Map<String,Object>getSession(){
	return session;
}
public void setSession(Map<String,Object>session{
	this.session=session;
}

}