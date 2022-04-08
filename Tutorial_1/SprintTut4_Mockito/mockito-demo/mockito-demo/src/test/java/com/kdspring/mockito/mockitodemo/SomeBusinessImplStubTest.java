package com.kdspring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void test_findGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServicestub());
		int result = businessImpl.findGreatestFromAllData();
		
		assertEquals(240,result);
	}

}


class DataServicestub implements DataService{

	@Override
	public int[] rtrieveAllData() {
		// TODO Auto-generated method stub
		return (new int[] {24,6,8,10});
	}
	
}
