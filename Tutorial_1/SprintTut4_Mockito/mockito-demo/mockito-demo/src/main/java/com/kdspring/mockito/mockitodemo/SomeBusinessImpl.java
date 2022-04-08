package com.kdspring.mockito.mockitodemo;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	int findGreatestFromAllData() {
		int [] data = dataService.rtrieveAllData();
		
		int greatest = Integer.MIN_VALUE;
		for(int val : data){
			if(val>greatest)
				greatest = val;
		}
		return greatest;
	}
	
}

