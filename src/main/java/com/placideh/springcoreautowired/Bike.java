package com.placideh.springcoreautowired;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("the Bike it is running ");
	}
}
