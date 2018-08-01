package tournament.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tournament.model.User;

import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Set<User> findAll();
    Set<User> findByLogin(String Login);
    void createNewUser(User user);
    User logIn(User user);

}
