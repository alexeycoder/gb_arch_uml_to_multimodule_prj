package edu.alexey.designer3d.model;

import edu.alexey.designer3d.model.abstractions.PositionableObject;

public class Flash extends PositionableObject {

	private Color color;
	private float power;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

}
