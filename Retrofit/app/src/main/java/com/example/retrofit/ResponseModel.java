package com.example.retrofit;

import java.io.Serializable;

public class ResponseModel implements Serializable {
	private DataModel data;
	private SupportModel support;

	public DataModel getData(){
		return data;
	}

	public SupportModel getSupport(){
		return support;
	}
}