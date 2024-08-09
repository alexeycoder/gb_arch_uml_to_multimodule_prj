package edu.alexey.designer3d.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Scene {

	private static final AtomicInteger nextId = new AtomicInteger();

	private int id;
	private List<PolygonalModel> models;
	private List<Flash> flashes;
	private List<Camera> cameras;

	public Scene(List<PolygonalModel> models, List<Camera> cameras, List<Flash> flashes) {

		if (models == null || models.isEmpty()) {
			throw new IllegalArgumentException("models must not be null or empty");
		}
		if (cameras == null || cameras.isEmpty()) {
			throw new IllegalArgumentException("cameras must not be null or empty");
		}
		this.models = models;
		this.cameras = cameras;

		if (flashes == null) {
			flashes = new ArrayList<Flash>();
		}
		this.flashes = flashes;

		this.id = nextId.getAndIncrement();
	}

	public void addModel(PolygonalModel model) {
		models.add(Objects.requireNonNull(model));
	}

	public void removeModel(PolygonalModel model) {
		if (models.size() == 1 && models.contains(model)) {
			throw new IllegalStateException("Cannot remove last polygonal model");
		}
		models.remove(model);
	}

	public void addCamera(Camera camera) {
		cameras.add(Objects.requireNonNull(camera));
	}

	public void removeCamera(Camera camera) {
		if (cameras.size() == 1 && cameras.contains(camera)) {
			throw new IllegalStateException("Cannot remove last camera");
		}
		cameras.remove(camera);
	}

	public void addFlash(Flash flash) {
		flashes.add(Objects.requireNonNull(flash));
	}

	public void removeFlash(Flash flash) {

		flashes.remove(flash);
	}
}
