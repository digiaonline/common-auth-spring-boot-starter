package com.starcut.auth.common.jwt;

import java.io.Serializable;
import java.util.Map;

import com.starcut.auth.common.AuthenticatedUserI;
import com.starcut.auth.common.db.UserI;

public class JwtAuthenticatedUser<T extends UserI> implements Serializable, AuthenticatedUserI
{
    private static final long serialVersionUID = 645837081487789431L;
    
    private String principal;
    private Long userId;
    private String token;
    private Map<String, String> claims;

    public JwtAuthenticatedUser(String principal, Long userId, String token)
    {
        this.principal = principal;
        this.userId = userId;
        this.token = token;
    }
    
    public JwtAuthenticatedUser(String principal, Long userId, String token, Map<String, String> claims)
    {
    	this.claims = claims;
    	this.principal = principal;
        this.userId = userId;
        this.token = token;
    }

    public String getPrincipal()
    {
        return principal;
    }

    public Long getUserId()
    {
        return userId;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getName() {
		return principal;
	}

	public Map<String, String> getClaims() {
		return claims;
	}

	public void setClaims(Map<String, String> claims) {
		this.claims = claims;
	}
}
