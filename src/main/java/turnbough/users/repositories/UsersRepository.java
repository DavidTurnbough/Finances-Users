package turnbough.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import turnbough.users.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long>
{

	User findByName(String username);
}
