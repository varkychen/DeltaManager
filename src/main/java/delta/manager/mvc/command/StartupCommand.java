package delta.manager.mvc.command;

import delta.manager.mvc.Model;
import delta.manager.mvc.view.View;

public class StartupCommand<T> implements Command {

	Model<T> model;
	View<T> view;
	
	public StartupCommand(Model<T> model, View<T> view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void execute() {
		model.initialize();
		view.setupView();
		view.renderData();
	}
}
