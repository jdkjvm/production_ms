package org.hqu.telemedicine.dao.impl;

import org.hqu.telemedicine.dao.SysUserDao;
import org.hqu.telemedicine.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao{

	/**
	 * 设置命名空间
	 */
	public SysUserDaoImpl(){
		this.setNs("org.hqu.telemedicine.mapper.SysUserMapper.");
	}
	@Override
	public SysUser getUserByName(String username) {
		return this.getSqlSession().selectOne(this.getNs() + "getUserByName", username);
	}

}
