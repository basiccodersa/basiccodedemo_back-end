package co.za.basiccodeapi.basiccodeapi.subscribe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeRepository extends CrudRepository<User,String> {
	public User findUserByEmail(String email);
}
