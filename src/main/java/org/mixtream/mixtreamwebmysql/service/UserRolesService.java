package org.mixtream.mixtreamwebmysql.service;

import org.mixtream.mixtreamwebmysql.model.UserRoles;
import org.mixtream.mixtreamwebmysql.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 11/04/2021
*/
@Component
public class UserRolesService {

	private UserRolesRepository userRolesRepository;

	@Autowired
	public UserRolesService(UserRolesRepository userRolesRepository) {
		this.userRolesRepository = userRolesRepository;
	}

}
