package edu.alexey.designer3d.modelstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import edu.alexey.designer3d.model.Camera;
import edu.alexey.designer3d.model.Flash;
import edu.alexey.designer3d.model.PolygonalModel;
import edu.alexey.designer3d.model.Scene;
import edu.alexey.designer3d.modelstore.abstractions.ModelChangeObserver;
import edu.alexey.designer3d.modelstore.abstractions.ModelChanger;

public class ModelStore implements ModelChanger {

	private List<Scene> scenes;

	private final List<PolygonalModel> models;
	private final List<Camera> cameras;
	private final List<Flash> flashes;

	private final List<ModelChangeObserver> changeObservers;

	public ModelStore() {

		changeObservers = new ArrayList<ModelChangeObserver>();

		models = new ArrayList<PolygonalModel>();
		cameras = new ArrayList<Camera>();
		flashes = new ArrayList<Flash>();
		scenes = new ArrayList<Scene>();

		populateModels();
		populateCameras();
		populateFlashes();
		populateScenes();
	}

	private void populateModels() {

		// TODO: реализация наполнения моделями
	}

	private void populateCameras() {

		// TODO: реализация наполнения камерами
	}

	private void populateFlashes() {

		// TODO: реализация наполнения источниками света
	}

	private void populateScenes() {

		// TODO: реализация наполнения сценами
	}

	public Scene getScene(int sceneId) {
		return scenes.stream().filter(s -> s.getId() == sceneId).findAny().orElse(null);
	}

	public List<Scene> getScenes() {
		return scenes;
	}

	public List<PolygonalModel> getModels() {
		return models;
	}

	public List<Flash> getFlashes() {
		return flashes;
	}

	public List<Camera> getCameras() {
		return cameras;
	}

	@Override
	public void notifyChange(ModelChanger sender) {

		for (var observer : changeObservers) {
			observer.applyUpdateModel();
		}

	}

	public void subscribeModelChanged(ModelChangeObserver observer) {
		Objects.requireNonNull(observer);

		if (!changeObservers.contains(observer)) {
			this.changeObservers.add(observer);
		}
	}

	public void unsubscribeModelChanged(ModelChangeObserver observer) {

		changeObservers.remove(Objects.requireNonNull(observer));
	}

	public void addModel(PolygonalModel model) {
		models.add(Objects.requireNonNull(model));
	}

	public void removeModel(PolygonalModel model) {
		Objects.requireNonNull(model);
		if (models.size() == 1 && models.contains(model)) {
			throw new IllegalStateException("Cannot remove last polygonal model");
		}
		models.remove(model);
	}

	public void addCamera(Camera camera) {
		cameras.add(Objects.requireNonNull(camera));
	}

	public void removeCamera(Camera camera) {
		Objects.requireNonNull(camera);
		if (cameras.size() == 1 && cameras.contains(camera)) {
			throw new IllegalStateException("Cannot remove last camera");
		}
		cameras.remove(camera);
	}

	public void addFlash(Flash flash) {
		flashes.add(Objects.requireNonNull(flash));
	}

	public void removeFlash(Flash flash) {
		Objects.requireNonNull(flash);
		if (flashes.size() == 1 && flashes.contains(flash)) {
			throw new IllegalStateException("Cannot remove last flash");
		}
		flashes.remove(flash);
	}

	public void addScene(Scene scene) {
		scenes.add(Objects.requireNonNull(scene));
	}

	public void removeScene(Scene scene) {
		Objects.requireNonNull(scene);
		if (scenes.size() == 1 && scenes.contains(scene)) {
			throw new IllegalStateException("Cannot remove last flash");
		}
		scenes.remove(scene);
	}
}
