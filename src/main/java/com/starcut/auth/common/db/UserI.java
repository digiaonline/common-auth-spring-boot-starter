package com.starcut.auth.common.db;

import java.beans.Transient;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface UserI {

	public Long getId();
	
	public String getPrincipal();
}
