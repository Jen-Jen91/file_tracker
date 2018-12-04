package com.example.FileTracker.projections;

import com.example.FileTracker.models.File;
import com.example.FileTracker.models.Folder;
import com.example.FileTracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "folderEmbedAll", types = Folder.class)
public interface FolderEmbedAll {

    String getTitle();
    User getUser();
    List<File> getFiles();

}
