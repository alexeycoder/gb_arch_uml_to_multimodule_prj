package edu.alexey.designer3d.modelstore;

import java.util.ArrayList;
import java.util.List;

import edu.alexey.designer3d.model.Camera;
import edu.alexey.designer3d.model.Flash;
import edu.alexey.designer3d.model.PolygonalModel;
import edu.alexey.designer3d.model.Scene;
import edu.alexey.designer3d.modelstore.abstractions.ModelChangeObserver;

public class ModelStore {

	private List<Scene> scenes;

	private final List<PolygonalModel> models;
	private final List<Camera> cameras;
	private final List<Flash> flashes;

	private final List<ModelChangeObserver> changeObservers;

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

}
