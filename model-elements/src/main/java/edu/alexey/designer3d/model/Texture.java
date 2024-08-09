package edu.alexey.designer3d.model;

import java.util.UUID;

public class Texture {

	private UUID uuid;

	private String name;

	public Texture(String name) {

		this.name = name;
		this.uuid = UUID.randomUUID();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return uuid;
	}

}
