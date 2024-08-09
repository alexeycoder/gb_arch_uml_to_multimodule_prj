package edu.alexey.designer3d.model.abstractions;

import edu.alexey.designer3d.model.Angle3D;
import edu.alexey.designer3d.model.Point3D;

public abstract class PositionableObject implements Movable, Rotatable {

	private Point3D location;
	private Angle3D angle;

	public Point3D getLocation() {
		return location;
	}

	public void setLocation(Point3D location) {
		this.location = location;
	}

	public Angle3D getAngle() {
		return angle;
	}

	public void setAngle(Angle3D angle) {
		this.angle = angle;
	}

	@Override
	public void move(Point3D offset) {
		location = new Point3D(
				location.x() + offset.x(),
				location.y() + offset.y(),
				location.z() + offset.z());
	}

	@Override
	public void rotate(Angle3D rotation) {
		angle = new Angle3D(
				angle.x() + rotation.x(),
				angle.y() + rotation.y(),
				location.z() + rotation.z());
	}
}
