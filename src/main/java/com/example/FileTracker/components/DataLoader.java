package com.example.FileTracker.components;

import com.example.FileTracker.models.File;
import com.example.FileTracker.models.Folder;
import com.example.FileTracker.models.User;
import com.example.FileTracker.repositories.FileRepository;
import com.example.FileTracker.repositories.FolderRepository;
import com.example.FileTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User harry = new User("Harry");
        userRepository.save(harry);

        User ron = new User("Ron");
        userRepository.save(ron);

        Folder hr = new Folder("HR", harry);
        folderRepository.save(hr);

        Folder admin = new Folder("Admin", ron);
        folderRepository.save(admin);

        File staffDetails = new File("Staff Details", "doc", 110, hr);
        fileRepository.save(staffDetails);

        File maintenance = new File("Maintenance", "pdf", 150, admin);
        fileRepository.save(maintenance);


        hr.addFile(staffDetails);
        folderRepository.save(hr);

        admin.addFile(maintenance);
        folderRepository.save(admin);

        harry.addFolder(hr);
        userRepository.save(harry);

        ron.addFolder(admin);
        userRepository.save(ron);

    }


}
