package com.github.rodsaraiva.estatisticas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	public LoginRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String psn) throws UsernameNotFoundException {
		
		return repository.findByPsn(psn);
	}
	
}