package tournament.service.impl;


import org.springframework.stereotype.Service;
import tournament.model.User;
import tournament.repository.UserRepository;
import tournament.service.UserService;


import javax.persistence.OneToMany;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Set<User> findByLogin(String Login) {
        return userRepository.findByLogin(Login);
    }

    @Override
    public Set<User> findOneById(Long id) {
        return userRepository.findOneById(id);
    }
    @Override
    public void create(String login, String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public User logIn(User user) {
        return user;
    }
}
