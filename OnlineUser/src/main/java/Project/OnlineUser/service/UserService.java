package Project.OnlineUser.service;
import Project.OnlineUser.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User getUserById(Integer id);

    User updateUser(User user);

    void deleteUserById(Integer id);

}

