package com.example.FileTracker.repositories;

import com.example.FileTracker.models.File;
import com.example.FileTracker.projections.FileEmbedAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = FileEmbedAll.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
