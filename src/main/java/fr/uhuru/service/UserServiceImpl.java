package fr.uhuru.service;

import java.util.Base64;

import fr.uhuru.dto.UserDTO;
import fr.uhuru.entity.User;
import fr.uhuru.exception.UserException;
import fr.uhuru.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserServiceImpl
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String postUserData(UserDTO userDto) throws UserException {
        
        User user = new User();

        user.setEmail(userDto.getEmail());
        user.setEmail(userDto.getName());
        user.setPhone(userDto.getPhone());
        user.setPassword(encryptPassword(userDto.getPassword()));

        userRepository.save(user);

        return "Success";
    }

    //Script to encrypt the password
    private static String encryptPassword(String pwd) {
        return Base64.getEncoder().encodeToString(pwd.getBytes());
    }

    //Script to decrypt the password
    private static String decryptPassword(String pwd) {
        return new String(Base64.getMimeDecoder().decode(pwd));
    }


    
}