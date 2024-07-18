package com.demo.lego_creational_pattern.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.lego_creational_pattern.models.interfaces.ConnectionItem;
import com.demo.lego_creational_pattern.services.LegoService;

@RestController
public class LegoController {

	@Autowired
	private LegoService legoService;

	@GetMapping("/getLegoByName")
	public String getLegoByName(String name) {

		ConnectionItem connectionItem = getLegoService().getConnectionItemByName(name, null);

		return connectionItem.toString();

	}

	@GetMapping("/getLegoByName/{color}")
	public String getLegoByNameAndColor(String name, @PathVariable String color) {

		ConnectionItem connectionItem = getLegoService().getConnectionItemByName(name, color);

		return connectionItem.toString();

	}

	public LegoService getLegoService() {
		return legoService;
	}

	public void setLegoService(LegoService legoService) {
		this.legoService = legoService;
	}

}
