package com.demo.lego_creational_pattern.models;

import com.demo.lego_creational_pattern.models.bases.BaseLego;
import com.demo.lego_creational_pattern.utils.LegoUtils;

public class LegoGeneric extends BaseLego {

	@Override
	public String name() {
		return LegoUtils.NAME_LEGO_GENERIC;
	}
	
	@Override
	public int numberOfConnections() {
		return 1;
	}

	@Override
	public int height() {
		return 20;
	}

	@Override
	public int lenght() {
		return 46;
	}
	
	public LegoGeneric(String color) {
		super(color);
	}
	
	public LegoGeneric() {
		super();
	}

	@Override
	protected String getDefaultColor() {
		return "yellow";
	}

	

}
