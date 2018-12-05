package com.example.FileTracker.projections;

import com.example.FileTracker.models.File;
import com.example.FileTracker.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fileEmbedAll", types = File.class)
public interface FileEmbedAll {
    public String getName();
    public String getExtension();
    public int getSize();
    public Folder getFolder();
}
