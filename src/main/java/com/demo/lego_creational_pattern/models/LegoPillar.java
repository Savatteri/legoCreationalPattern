package com.demo.lego_creational_pattern.models;

import com.demo.lego_creational_pattern.models.bases.BaseLego;
import com.demo.lego_creational_pattern.utils.LegoUtils;

public class LegoPillar extends BaseLego{

	@Override
	public String name() {
		return LegoUtils.NAME_LEGO_PILLAR;
	}
	
	@Override
	public int numberOfConnections() {
		return 6;
	}

	@Override
	public int height() {
		return 80;
	}

	@Override
	public int lenght() {
		return 11;
	}
	
	public LegoPillar(String color) {
		super(color);	}
	
	public LegoPillar() {
		super();
	}

	@Override
	protected String getDefaultColor() {
		return "white";
	}

}
