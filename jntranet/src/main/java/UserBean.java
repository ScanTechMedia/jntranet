package main.java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class UserBean {
	public String username = "Max Mustermann";
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
}
