package fr.uhuru.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import fr.uhuru.entity.User;

/**
 * Connexion to database
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}