package com.kk.Service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kk.Dao.IAuthLoginDao;
import com.kk.model.AuthUser;

@Service("authUserService")
public class AuthUserService implements IAuthUserService {
	@Resource(name = "authLoginDao")
	public IAuthLoginDao authLoginDao;

	@Override
	public void add(AuthUser user)  {
		// TODO Auto-generated method stub
		authLoginDao.add(user);
	}
}
