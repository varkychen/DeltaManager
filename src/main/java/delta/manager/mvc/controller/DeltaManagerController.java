package delta.manager.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import delta.manager.mvc.ActionType;
import delta.manager.mvc.Controller;
import delta.manager.mvc.command.Command;
import delta.manager.mvc.view.ViewEvent;

public class DeltaManagerController implements Controller {

	private Map<ActionType,Command> actionCommandMap = new HashMap<ActionType,Command>();
	
	@Override
	public void executeCommand(ActionType actionType) {
		actionCommandMap.get(actionType).execute();
	}

	@Override
	public void addCommand(ActionType actionType, Command command) {
		actionCommandMap.put(actionType,command);
	}

	@Override
	public void processEvent(ViewEvent viewEvent) {
		executeCommand(viewEvent.getActionType());
	}
}