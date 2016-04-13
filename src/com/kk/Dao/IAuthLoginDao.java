package com.kk.Dao;

import java.util.LinkedList;

import com.kk.model.AuthUser;

public interface IAuthLoginDao {
	public void add(AuthUser user);
	public void update(AuthUser user);
	public void delete(AuthUser user);
	public LinkedList<AuthUser> search();
}
