package delta.manager.mvc.view;

import delta.manager.mvc.ActionType;

public class ViewEvent {
	ActionType actionType;

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}
}
