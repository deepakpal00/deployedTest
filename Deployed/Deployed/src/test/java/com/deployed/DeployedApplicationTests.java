package com.deployed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.deployed.service.CalculateCostService;

@SpringBootTest
class DeployedApplicationTests {
	
	@Autowired
	private CalculateCostService calculateCostService;

	@Test
	void test1() {
		int array[] =  {4,6,8,12};
		System.out.println(Arrays.toString(array));
	int result = calculateCostService.calculateMinCost(array);
		assertEquals(58,result);
	}

	@Test
	void test2() {
		int array[] =  {20,4,8,2};
		System.out.println(Arrays.toString(array));
	int result = calculateCostService.calculateMinCost(array);
		assertEquals(54,result);
	}
	
	@Test
	void test3() {
		int array[] =  {};
		System.out.println(Arrays.toString(array));
	int result = calculateCostService.calculateMinCost(array);
		assertEquals(0,result);
	}
	
	@Test
	void test4() {
		int array[] =  {20};
		System.out.println(Arrays.toString(array));
	int result = calculateCostService.calculateMinCost(array);
		assertEquals(20,result);
	}
	
}
