package ims.Services;

import java.util.List;

public interface Dao<T> {
	
	List<T> readAll();
	
	T create(T t);
	
	T update(T t);
	
	void delete(Long customerID);
}
