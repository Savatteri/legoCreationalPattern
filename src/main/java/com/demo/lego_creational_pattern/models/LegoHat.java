package com.demo.lego_creational_pattern.models;

import com.demo.lego_creational_pattern.models.bases.BaseLego;
import com.demo.lego_creational_pattern.utils.LegoUtils;

public class LegoHat extends BaseLego {

	String name;
	int numberOfConnections;
	int height;
	int lenght;	
	String color;
	
	public LegoHat(String name, int numberOfConnections, int height, int lenght, String color) {
		this.color = color;
		this.name = name;
		this.numberOfConnections = numberOfConnections;
		this.height = height;
		this.lenght = lenght;
	}
	
	@Override
	public String name() {
		return LegoUtils.NAME_LEGO_HAT;
	}

	@Override
	public int numberOfConnections() {
		return 1;
	}

	@Override
	public int height() {
		return 43;
	}

	@Override
	public int lenght() {
		return 46;
	}

	public LegoHat(String color) {
		super();
		this.color = color;
	}
	
	public LegoHat() {
		super();
	}
	
    @Override
    protected String getDefaultColor() {
        return "red";
    }
    
    @Override
	public String toString() {
		return "Lego: " + this.name + "\ncolor: " + this.color + "\nNumber of connections: " + this.numberOfConnections;
	}
    
}

