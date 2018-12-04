package com.example.FileTracker.projections;

import com.example.FileTracker.models.Folder;
import com.example.FileTracker.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "userEmbedAll", types = User.class)
public interface UserEmbedAll {

    String getName();
    List<Folder> getFolders();

}
