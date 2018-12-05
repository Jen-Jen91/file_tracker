package com.example.FileTracker.repositories;

import com.example.FileTracker.models.Folder;
import com.example.FileTracker.projections.FolderEmbedAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = FolderEmbedAll.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
