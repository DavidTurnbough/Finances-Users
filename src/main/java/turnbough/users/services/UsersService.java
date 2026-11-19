package turnbough.users.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import turnbough.users.models.User;
import turnbough.users.repositories.UsersRepository;

import java.util.List;

@Service
public class UsersService
{
	/*
	* Variables
	 */
	UsersRepository usersRepository;

	/*
	* Constructors
	 */
	public UsersService(UsersRepository usersRepository)
	{
		this.usersRepository = usersRepository;
	}

	/*
	* Getters
	 */
	public User getUser(String username)
	{
		return usersRepository.findByName(username);
	}

	public List<User> getAllUsers()
	{
		//TODO: Implement get all users
		return null;
	}

	public ResponseEntity<User> addUser(User user)
	{
		usersRepository.save(user);

		return  ResponseEntity.ok(user);
	}

	public ResponseEntity<User> updateUser(User user)
	{
		//TODO: Implement update user
		return null;
	}

	public ResponseEntity<User> deleteUserByName(String username)
	{
		//TODO: Implement delete user by name
		return null;
	}

	public ResponseEntity<User> updatePassword(User user)
	{
		//TODO: Implement update password
		return null;
	}

	public ResponseEntity<User> updateEmail(User user)
	{
		//TODO: Implement update email
		return null;
	}

	public ResponseEntity<User> updateRole(User user)
	{
		//TODO: Implement update role
		return null;
	}

	public ResponseEntity<User> updateName(User user)
	{
		//TODO: Implement update name.
		return null;
	}
}
