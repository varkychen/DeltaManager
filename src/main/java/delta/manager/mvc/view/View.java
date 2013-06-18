package delta.manager.mvc.view;

import delta.manager.mvc.Model;

public interface View<T> {
	public void setupView();
	public void renderData();
	public void processUserGesture();
	public void setModel(Model<T> model);
	public void addViewEventListener(ViewEventListener listener);
	public void removeViewEventListener(ViewEventListener listener);
}
