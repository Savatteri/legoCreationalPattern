package com.demo.lego_creational_pattern.models.builders;

import com.demo.lego_creational_pattern.models.LegoHat;
import com.demo.lego_creational_pattern.models.bases.BaseLego;

public final class LegoBuilder {

	public String name;
	public int numberOfConnections;
	public int height;
	public int lenght;
	public String color;
	

	 public static LegoBuilder newBuilder() {
	 return new LegoBuilder();
	 }
	
		public LegoBuilder name(String name) {
			this.name = name;
			return this;
		}
		
	 public LegoBuilder numberOfConnections(int numberOfConnections) {
		 this.numberOfConnections = numberOfConnections;
		 return this;
		 }

	 public LegoBuilder height(int height) {
		 this.height = height;
		 return this;
		 }
	 
	 public LegoBuilder lenght(int lenght) {
		 this.lenght = lenght;
		 return this;
		 }
	 
	 public LegoBuilder color(String color) {
		 this.color = color;
		 return this;
		 }
	 
	 public LegoHat build() {
		 return new LegoHat(name, numberOfConnections, height, lenght,color);
		 }


}
