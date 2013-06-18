package delta.manager.mvc;

public interface Model<T> {
	public void initialize();
	public void saveData(T t);
	public T fetchCurrentData();
	public void deleteData(T t);
}
