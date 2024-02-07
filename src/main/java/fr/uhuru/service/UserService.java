package fr.uhuru.service;

import fr.uhuru.dto.UserDTO;
import fr.uhuru.exception.UserException;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {
    public String postUserData(UserDTO user) throws UserException;
    
}