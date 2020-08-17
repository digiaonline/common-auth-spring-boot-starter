package com.starcut.auth.common.db;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.starcut.auth.common.RoleProviderI;

public class DummyRoleProvider implements RoleProviderI<UserI> {

	public Collection<GrantedAuthority> getGrantedAuthoritiesFor(UserI user) {
		return null;
	}

}
