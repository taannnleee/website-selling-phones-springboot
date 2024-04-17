package org.example.websitesellingphonesbackend.repositories;

import org.example.websitesellingphonesbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
