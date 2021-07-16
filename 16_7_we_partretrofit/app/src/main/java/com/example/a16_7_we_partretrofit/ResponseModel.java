package com.example.a16_7_we_partretrofit;

import java.io.Serializable;

public class ResponseModel implements Serializable {
	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;

	public int getPostId(){
		return postId;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getEmail(){
		return email;
	}

	public String getBody(){
		return body;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"postId = '" + postId + '\'' + 
			",id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			",body = '" + body + '\'' + 
			"}";
		}
}