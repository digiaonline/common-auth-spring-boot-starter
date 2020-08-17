package com.starcut.auth.common.db;

import java.util.Optional;

public class DummyUserRepository implements UserRepositoryI<UserI>, EmailUserRepositoryI<UserI> {

	public Optional<UserI> findByPrincipal(String principal) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UserI> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
