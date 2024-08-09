package edu.alexey.designer3d.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polygon {

	private List<Point3D> points;

	public Polygon(List<Point3D> points) {

		this.points = Objects.requireNonNull(points);
	}

	public List<Point3D> getPoints() {
		return points;
	}

	public static Polygon createBlank() {
		return new Polygon(new ArrayList<Point3D>(
				List.of(new Point3D(0, 0, 0),
						new Point3D(1, 0, 0),
						new Point3D(1, 1, 0),
						new Point3D(0, 1, 0))));
	}
}
