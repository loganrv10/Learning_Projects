package com.example.myapplicationevaluation;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
	private int date;
	private int states;
	private int positive;
	private int negative;
	private int pending;
	private int hospitalizedCurrently;
	private int hospitalizedCumulative;
	private int inIcuCurrently;
	private int inIcuCumulative;
	private int onVentilatorCurrently;
	private int onVentilatorCumulative;
	private String dateChecked;
	private int death;
	private int hospitalized;
	private int totalTestResults;
	private String lastModified;
	private Object recovered;
	private int total;
	private int posNeg;
	private int deathIncrease;
	private int hospitalizedIncrease;
	private int negativeIncrease;
	private int positiveIncrease;
	private int totalTestResultsIncrease;
	private String hash;

	public int getDate(){
		return date;
	}

	public int getStates(){
		return states;
	}

	public int getPositive(){
		return positive;
	}

	public int getNegative(){
		return negative;
	}

	public int getPending(){
		return pending;
	}

	public int getHospitalizedCurrently(){
		return hospitalizedCurrently;
	}

	public int getHospitalizedCumulative(){
		return hospitalizedCumulative;
	}

	public int getInIcuCurrently(){
		return inIcuCurrently;
	}

	public int getInIcuCumulative(){
		return inIcuCumulative;
	}

	public int getOnVentilatorCurrently(){
		return onVentilatorCurrently;
	}

	public int getOnVentilatorCumulative(){
		return onVentilatorCumulative;
	}

	public String getDateChecked(){
		return dateChecked;
	}

	public int getDeath(){
		return death;
	}

	public int getHospitalized(){
		return hospitalized;
	}

	public int getTotalTestResults(){
		return totalTestResults;
	}

	public String getLastModified(){
		return lastModified;
	}

	public Object getRecovered(){
		return recovered;
	}

	public int getTotal(){
		return total;
	}

	public int getPosNeg(){
		return posNeg;
	}

	public int getDeathIncrease(){
		return deathIncrease;
	}

	public int getHospitalizedIncrease(){
		return hospitalizedIncrease;
	}

	public int getNegativeIncrease(){
		return negativeIncrease;
	}

	public int getPositiveIncrease(){
		return positiveIncrease;
	}

	public int getTotalTestResultsIncrease(){
		return totalTestResultsIncrease;
	}

	public String getHash(){
		return hash;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"date = '" + date + '\'' + 
			",states = '" + states + '\'' + 
			",positive = '" + positive + '\'' + 
			",negative = '" + negative + '\'' + 
			",pending = '" + pending + '\'' + 
			",hospitalizedCurrently = '" + hospitalizedCurrently + '\'' + 
			",hospitalizedCumulative = '" + hospitalizedCumulative + '\'' + 
			",inIcuCurrently = '" + inIcuCurrently + '\'' + 
			",inIcuCumulative = '" + inIcuCumulative + '\'' + 
			",onVentilatorCurrently = '" + onVentilatorCurrently + '\'' + 
			",onVentilatorCumulative = '" + onVentilatorCumulative + '\'' + 
			",dateChecked = '" + dateChecked + '\'' + 
			",death = '" + death + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",totalTestResults = '" + totalTestResults + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",recovered = '" + recovered + '\'' + 
			",total = '" + total + '\'' + 
			",posNeg = '" + posNeg + '\'' + 
			",deathIncrease = '" + deathIncrease + '\'' + 
			",hospitalizedIncrease = '" + hospitalizedIncrease + '\'' + 
			",negativeIncrease = '" + negativeIncrease + '\'' + 
			",positiveIncrease = '" + positiveIncrease + '\'' + 
			",totalTestResultsIncrease = '" + totalTestResultsIncrease + '\'' + 
			",hash = '" + hash + '\'' + 
			"}";
		}
}