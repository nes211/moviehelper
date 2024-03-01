package pl.tdelektro.carhelper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tdelektro.carhelper.pojo.UserDTO;
import pl.tdelektro.carhelper.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String getMessage(UserDTO user) {
        userRepository.save(user);


        String message = "";

        return message;
    }
}
