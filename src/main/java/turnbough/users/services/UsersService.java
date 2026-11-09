package turnbough.users.services;

import org.springframework.stereotype.Service;
import turnbough.users.models.User;
import turnbough.users.repositories.UsersRepository;

@Service
public class UsersService
{
	UsersRepository usersRepository;

	public User getUser(String username)
	{
		//TODO: Query database for username.
		return null;
	}
}
