package com.kdspring.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessImplMockTest {
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	void test_findGreatestFromAllData() {

		when(dataServiceMock.rtrieveAllData()).thenReturn(new int[] {24,5,14});
		assertEquals(24,businessImpl.findGreatestFromAllData());
	}

}

