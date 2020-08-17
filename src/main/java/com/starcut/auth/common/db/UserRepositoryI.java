package com.starcut.auth.common.db;

import java.util.Optional;

public interface UserRepositoryI<T extends UserI> {
	
	Optional<T> findByPrincipal(String principal);
}
