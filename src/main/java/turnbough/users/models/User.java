package turnbough.users.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User
{
	/*
	* Variables
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	String name;
	String email;
	String password;
	String role;


}
