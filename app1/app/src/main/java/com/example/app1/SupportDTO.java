package com.example.app1;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class SupportDTO implements Serializable {

	@SerializedName("url")
	private String url;

	@SerializedName("text")
	private String text;

	public String getUrl(){
		return url;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"SupportDTO{" + 
			"url = '" + url + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}