package com.example.myapplicationretrofitassogn;

import java.io.Serializable;

public class DataModel implements Serializable {
	private int id;
	private String name;
	private int year;
	private String color;
	private String pantoneValue;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}

	public String getColor(){
		return color;
	}

	public String getPantoneValue(){
		return pantoneValue;
	}

	@Override
 	public String toString(){
		return 
			"DataModel{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",year = '" + year + '\'' + 
			",color = '" + color + '\'' + 
			",pantone_value = '" + pantoneValue + '\'' + 
			"}";
		}
}