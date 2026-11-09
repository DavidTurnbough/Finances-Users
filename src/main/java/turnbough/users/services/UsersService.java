package turnbough.users.services;

import org.springframework.stereotype.Service;
import turnbough.users.models.User;
import turnbough.users.repositories.UsersRepository;

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
}
