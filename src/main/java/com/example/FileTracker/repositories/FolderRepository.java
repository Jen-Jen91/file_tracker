package com.example.FileTracker.repositories;

import com.example.FileTracker.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
