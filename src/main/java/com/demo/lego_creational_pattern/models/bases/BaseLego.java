package com.demo.lego_creational_pattern.models.bases;

import com.demo.lego_creational_pattern.models.interfaces.ConnectionItem;

public abstract class BaseLego implements ConnectionItem {
	
	@Override
	public String toString() {
		return "Lego: " + name() + "\ncolor: " + this.color + "\nNumber of connections: " + numberOfConnections();
	}

	protected abstract String getDefaultColor();

	public String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
    public BaseLego(String color) {
        this.color = color;
    }
    
    public BaseLego() {
        this.color = getDefaultColor();
    }
    
}
