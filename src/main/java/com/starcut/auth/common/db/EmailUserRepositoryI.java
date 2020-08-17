package com.starcut.auth.common.db;

import java.util.Optional;

public interface EmailUserRepositoryI<T extends UserI> {
	
	Optional<T> findByEmail(String email);
}
