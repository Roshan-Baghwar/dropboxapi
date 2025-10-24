package com.cloudeagle.dropboxapi;

import com.cloudeagle.dropboxapi.service.DropboxService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DropboxapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DropboxapiApplication.class, args);
    }

    @Bean
    CommandLineRunner run(DropboxService dropboxService) {
        return args -> {
            System.out.println("Fetching team members from Dropbox...");
            String result = dropboxService.getTeamMembers();
            System.out.println("Response from Dropbox API:\n" + result);
        };
    }
}