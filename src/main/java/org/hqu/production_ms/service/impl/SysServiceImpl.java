package org.hqu.production_ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hqu.production_ms.dao.SysPermissionDao;
import org.hqu.production_ms.dao.SysUserDao;
import org.hqu.production_ms.domain.SysPermission;
import org.hqu.production_ms.domain.SysUser;
import org.hqu.production_ms.service.SysService;

/**
 * created on 2016年9月6日 
 *
 * 认证和授权的服务接口
 *
 * @author  megagao
 * @version  0.0.1
 */
@Service
public class SysServiceImpl implements SysService {
	
	@Autowired
	private SysUserDao sysUserDao;
	
	@Autowired
	private SysPermissionDao sysPermissionDao;

	public SysUser getSysUserByUserId(String userid)throws Exception{
		
		return this.sysUserDao.get(userid);
	}

	@Override
	public List<SysPermission> findMenuListByUserId(String userid)
			throws Exception {
		
		return this.sysPermissionDao.findMenuListByUserId(userid);
	}

	@Override
	public List<SysPermission> findPermissionListByUserId(String userid)
			throws Exception {
		
		return this.sysPermissionDao.findPermissionListByUserId(userid);
	}

	@Override
	public SysUser getSysUserByName(String username) throws Exception {
		
		return this.sysUserDao.getUserByName(username);
	}

}
