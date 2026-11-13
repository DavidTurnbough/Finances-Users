package turnbough.users.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import turnbough.users.models.User;
import turnbough.users.services.UsersService;

import java.util.List;

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

	/*
	* Get Mapping
	 */
	public User getUser(String username)
	{
		return usersService.getUser(username);
	}

	public List<User> getAllUsers()
	{
		return usersService.getAllUsers();
	}

	public ResponseEntity<User> addUser(User user)
	{
		return usersService.addUser(user);
	}

	public ResponseEntity<User> updateUser(User user)
	{
		return usersService.updateUser(user);
	}

	/*
	* Delete Mapping
	 */
	public ResponseEntity<User> deleteUserByName(String username)
	{
		return usersService.deleteUserByName(username);
	}



}
