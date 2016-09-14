package org.hqu.production_ms.dao;

import java.util.List;

import org.hqu.production_ms.domain.SysPermission;

/**
 * created on 2016年9月6日 
 *
 * @author  megagao
 * @version  0.0.1
 */
public interface SysPermissionDao extends BaseDao<SysPermission>{
	
	/**
	 * 根据用户id查询权限范围的菜单
	 *
	 * @param  userid
	 * @return  权限范围的菜单
	 */
	public List<SysPermission> findMenuListByUserId(String userid) throws Exception;
	
	/**
	 * 根据用户id查询权限范围的url
	 *
	 * @param  userid
	 * @return  权限范围的url
	 */
	public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
