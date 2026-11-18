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

	/*
	* Post mapping
	 */
	public ResponseEntity<User> addUser(User user)
	{
		return usersService.addUser(user);
	}

	/*
	* Put Mapping
	 */
	public ResponseEntity<User> updateUser(User user)
	{
		return usersService.updateUser(user);
	}

	public ResponseEntity<User> updateName(User user)
	{
		return usersService.updateName(user);
	}

	public ResponseEntity<User> updatePassword(User user)
	{
		return usersService.updatePassword(user);
	}

	public ResponseEntity<User> updateEmail(User user)
	{
		return usersService.updateEmail(user);
	}

	public ResponseEntity<User> updateRole(User user)
	{
		return usersService.updateRole(user);
	}

	/*
	* Delete Mapping
	 */
	public ResponseEntity<User> deleteUserByName(String username)
	{
		return usersService.deleteUserByName(username);
	}



}
