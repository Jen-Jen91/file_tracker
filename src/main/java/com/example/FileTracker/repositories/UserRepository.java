package com.example.FileTracker.repositories;

import com.example.FileTracker.models.User;
import com.example.FileTracker.projections.UserEmbedAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = UserEmbedAll.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
