package delta.manager.dao;


public interface ReadWriteDAO<T> extends ReadOnlyDAO<T> {
	public void create(T t);
	public void update(T t);
	public void delete(T t);
}
