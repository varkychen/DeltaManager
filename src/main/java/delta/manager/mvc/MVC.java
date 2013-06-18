package delta.manager.mvc;

import delta.manager.mvc.command.Command;
import delta.manager.mvc.command.StartupCommand;
import delta.manager.mvc.view.View;


public class MVC<T> {
	Model<T> model;
	View<T> view;
	Controller controller;
	
	public MVC(Model<T> model, View<T> view, Controller controller) {
		this.model = model;
		this.view = view;
		this.controller = controller;
		setupDependencies();
		setupCommands();
	}

	public void startMVC() {
		controller.executeCommand(ActionType.STARTUP);
	}

	private void setupCommands() {
		Command command = new StartupCommand<T>(model,view);
		controller.addCommand(ActionType.STARTUP,command);
	}

	private void setupDependencies() {
		view.setModel(model);
		view.addViewEventListener(controller);
	}
}
