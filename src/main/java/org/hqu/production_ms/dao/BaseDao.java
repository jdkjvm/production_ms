package org.hqu.production_ms.dao;

import java.io.Serializable;
import java.util.List;

/**
 * created on 2016年8月28日
 *
 * @description: 泛型类，基础的DAO接口
 *
 * @author: megagao
 * @version: 0.0.1
 */
public interface BaseDao<T> {
	
	/**
	 * @description: 查询所有记录
	 *
	 * @param: entity
	 * @return: 所有记录
	 */
	public List<T> find(T entity);

	/**
	 * @description: 根据id查询一条记录
	 *
	 * @param: id
	 * @return: 该记录
	 */
	public T get(Serializable id);
	
	/**
	 * @description: 新增
	 *
	 * @param: entity
	 */
	public void insert(T entity);
	
	/**
	 * 
	 * @description: 修改
	 *
	 * @param: entity
	 */
	public void update(T entity);
	
	/**
	 * @description: 删除
	 *
	 * @param: id
	 */
	public void delete(Serializable id);
	
	/**
	 * @description: 批量删除
	 *
	 * @param: ids
	 */
	public void delete(Serializable[] ids);
}
