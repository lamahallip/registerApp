package fr.uhuru.api;

import fr.uhuru.dto.UserDTO;
import fr.uhuru.exception.UserException;
import fr.uhuru.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userAuth")
@CrossOrigin
public class Authentication {
    @Autowired
    private UserService userServie;

    @PostMapping(value="/register")
    public ResponseEntity<String> registration(@RequestBody UserDTO userdto) throws UserException {
        String message = userServie.postUserData(userdto);
        return new ResponseEntity<String>("message", HttpStatus.OK);
    }

}