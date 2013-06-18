package delta.manager.dao;

import java.util.List;

public interface ReadOnlyDAO<T> {

	public abstract List<T> list();

	public abstract T read(T t);

}