package com.example.FileTracker;

import com.example.FileTracker.models.Folder;
import com.example.FileTracker.models.User;
import com.example.FileTracker.repositories.FolderRepository;
import com.example.FileTracker.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileTrackerApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolder() {
		User user = new User("Steve");
		userRepository.save(user);

		Folder folder = new Folder("HR", user);
		folderRepository.save(folder);
	}

}
