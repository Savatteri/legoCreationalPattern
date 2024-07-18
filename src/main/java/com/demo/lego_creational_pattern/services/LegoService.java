package com.demo.lego_creational_pattern.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.demo.lego_creational_pattern.models.LegoGeneric;
import com.demo.lego_creational_pattern.models.LegoHat;
import com.demo.lego_creational_pattern.models.LegoPillar;
import com.demo.lego_creational_pattern.models.builders.LegoBuilder;
import com.demo.lego_creational_pattern.models.interfaces.ConnectionItem;
import com.demo.lego_creational_pattern.utils.LegoUtils;

@Service
public class LegoService {

	public ConnectionItem getConnectionItemByName(String name, String color) {

		ConnectionItem connectionItem = null;

		if (StringUtils.equalsIgnoreCase(name, LegoUtils.NAME_LEGO_GENERIC)) {
			if (color == null)
				connectionItem = new LegoGeneric();
			else
				connectionItem = new LegoGeneric(color);
		}
		else if (StringUtils.equalsIgnoreCase(name, LegoUtils.NAME_LEGO_PILLAR)) {
			if (color == null)
				connectionItem = new LegoPillar();
			else
				connectionItem = new LegoPillar(color);
		}
		else if (StringUtils.equalsIgnoreCase(name, LegoUtils.NAME_LEGO_HAT)) {
			if (color == null)
				connectionItem = LegoBuilder.newBuilder()
				.name(LegoUtils.NAME_LEGO_HAT)
				.color("red")
				.numberOfConnections(1)
				.height(43)
				.lenght(46)
				.build();
			else
				connectionItem = LegoBuilder.newBuilder()
				.name(LegoUtils.NAME_LEGO_HAT)
				.color(color)
				.numberOfConnections(1)
				.height(43)
				.lenght(46)
				.build();
		} 

		return connectionItem;
	}
}
