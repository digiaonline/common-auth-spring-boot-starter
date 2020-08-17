package com.starcut.auth.common;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class CustomUserToken<T extends AuthenticatedUserI> extends UsernamePasswordAuthenticationToken
{
    private static final long serialVersionUID = 1L;

    public CustomUserToken(T principal)
    {
    	this(principal, Collections.<GrantedAuthority> emptySet());
    }
    
    public CustomUserToken(T principal, Collection<? extends GrantedAuthority> authorities)
    {
        this(principal, "N/A", authorities);
    }

    public CustomUserToken(T principal, Object aCredentials, Collection<? extends GrantedAuthority> authorities)
    {
        super(principal, aCredentials, authorities);
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities()
    {
        return super.getAuthorities();
    }

    @Override
    public Object getCredentials()
    {
        return super.getCredentials();
    }

    @Override
    public Object getDetails()
    {
        return super.getDetails();
    }

    @SuppressWarnings("unchecked")
	@Override
    public String getName()
    {
        return ((T) getPrincipal()).getName();
    }

    @Override
    public Object getPrincipal()
    {
        return super.getPrincipal();
    }

}
