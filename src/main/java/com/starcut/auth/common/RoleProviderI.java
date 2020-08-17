package com.starcut.auth.common;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.starcut.auth.common.db.UserI;

public interface RoleProviderI<T extends UserI> {
	
	public Collection<GrantedAuthority> getGrantedAuthoritiesFor(T user);
}
