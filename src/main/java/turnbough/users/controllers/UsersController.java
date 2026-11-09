package turnbough.users.controllers;

import org.springframework.web.bind.annotation.RestController;
import turnbough.users.models.User;
import turnbough.users.services.UsersService;

@RestController
public class UsersController
{
	/*
	* Variables
	 */
	UsersService usersService;

	/*
	* Constructors
	 */
	public UsersController(UsersService usersService)
	{
		this.usersService = usersService;
	}

	public User getUser(String username)
	{
		return usersService.getUser(username);
	}


}
