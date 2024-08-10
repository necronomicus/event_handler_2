package service;

import Repository.UserRepository;
import entity.User;

public class UserService {

    private UserRepository userRepository;

    public User createUser(Long id, String name, String lastName){
        User user = new User(id, name, lastName, null);
        user = userRepository.save(user);
        return user;
    }

    //public User updateUser()
}
