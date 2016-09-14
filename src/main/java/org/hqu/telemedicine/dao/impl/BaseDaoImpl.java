package org.hqu.telemedicine.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.hqu.telemedicine.dao.BaseDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created on 2016年9月6日 
 *
 * dao接口，抽取的公共方法
 *
 * @author  megagao
 * @version  0.0.1
 */
public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	
	@Autowired
	//mybatis-spring 1.0无需此方法；mybatis-spring1.2必须注入。
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 命名空间
	 */
	private String ns;		
	
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}

	public List<T> find(T entiy) {
		List<T> oList = this.getSqlSession().selectList(ns + "find", entiy);
		return oList;
	}
	public T get(Serializable id) {
		return this.getSqlSession().selectOne(ns + "get", id);
	}

	public void insert(T entity) {
		this.getSqlSession().insert(ns + "insert", entity);
	}

	public void update(T entity) {
		this.getSqlSession().update(ns + "update", entity);
	}

	public void delete(Serializable id) {
		this.getSqlSession().delete(ns + "delete", id);
	}

	public void delete(Serializable[] ids) {
		this.getSqlSession().delete(ns + "deleteBatch", ids);
	}
}
