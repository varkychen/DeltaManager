package delta.manager.mvc;

import delta.manager.mvc.command.Command;
import delta.manager.mvc.view.ViewEventListener;

public interface Controller extends ViewEventListener {
	public void executeCommand(ActionType actionType);
	public void addCommand(ActionType actionType, Command command);
}
