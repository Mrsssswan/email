package edu.hnit.service;

import java.util.List;

import edu.hnit.domain.Person;

/**
 * 管理person的服务类接口  需要实现对person增删改查
 * @author liwanfang
 *
 */
public interface CRUDService<T> {
	public void add(T t);
	public void delete(int id);
	public void update(T t);
	public T getByUsername(String username);
    public List<T> getAll();
}
