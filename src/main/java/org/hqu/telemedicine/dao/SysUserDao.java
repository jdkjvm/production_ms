package org.hqu.telemedicine.dao;

import org.hqu.telemedicine.domain.SysUser;

/**
 * created on 2016年9月6日 
 *
 * @author  megagao
 * @version  0.0.1
 */
public interface SysUserDao extends BaseDao<SysUser>{
	
	public SysUser getUserByName(String username);
}
