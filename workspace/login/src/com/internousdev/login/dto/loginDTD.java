package com.internousdev.dto;
public class LoginDTO{
	private int id;
	private String name;
	private String password;

	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getpassword(){
		return password;
	}
	public void setpassword(String password){
		this.password=password;
	}

}