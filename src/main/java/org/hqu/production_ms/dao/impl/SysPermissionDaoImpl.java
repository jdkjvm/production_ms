package org.hqu.production_ms.dao.impl;

import java.util.List;

import org.hqu.production_ms.dao.SysPermissionDao;
import org.hqu.production_ms.domain.SysPermission;
import org.springframework.stereotype.Repository;

/**
 * created on 2016年9月6日 
 *
 * @author  megagao
 * @version  0.0.1
 */
@Repository
public class SysPermissionDaoImpl extends BaseDaoImpl<SysPermission> implements SysPermissionDao{

	/**
	 * 设置命名空间
	 */
	public SysPermissionDaoImpl() {
		this.setNs("org.hqu.telemedicine.mapper.SysPermissionMapper.");			
	}
	
	@Override
	public List<SysPermission> findMenuListByUserId(String userid)
			throws Exception {
		return this.getSqlSession().selectList(this.getNs() + "findMenuListByUserId", userid);
	}

	@Override
	public List<SysPermission> findPermissionListByUserId(String userid)
			throws Exception {
		return this.getSqlSession().selectList(this.getNs() + "findPermissionListByUserId", userid);
	}

}
