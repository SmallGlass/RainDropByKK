package com.kk.Dao;


import java.util.LinkedList;

import org.springframework.stereotype.Repository;

import com.kk.hibernateHandle.hibernateHandle;
import com.kk.model.AuthUser;

@Repository("authLoginDao")
public class AuthLoginDao extends hibernateHandle implements IAuthLoginDao {
	@Override
	public void add(AuthUser user) {
		// TODO Auto-generated method stub
		super.add(user);
	}

	@Override
	public void update(AuthUser user) {
		// TODO Auto-generated method stub
		super.update(user);
	}

	@Override
	public void delete(AuthUser user) {
		// TODO Auto-generated method stub
		super.delete(user);
	}

	@Override
	public LinkedList<AuthUser> search() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
