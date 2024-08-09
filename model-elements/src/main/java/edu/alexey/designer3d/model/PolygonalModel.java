package edu.alexey.designer3d.model;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {

	private List<Polygon> polygons;
	private List<Texture> textures;

	public PolygonalModel(List<Texture> textures) {

		this.textures = textures;

		this.polygons = new ArrayList<Polygon>(
				List.of(Polygon.createBlank()));
	}

	public PolygonalModel() {
		this(new ArrayList<Texture>());
	}

	public List<Texture> getTextures() {
		return textures;
	}

	public void setTextures(List<Texture> textures) {
		this.textures = textures;
	}

	public List<Polygon> getPolygons() {
		return polygons;
	}

}
