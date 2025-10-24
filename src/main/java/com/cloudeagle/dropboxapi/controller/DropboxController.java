package com.cloudeagle.dropboxapi.controller;

import com.cloudeagle.dropboxapi.service.DropboxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dropbox")
public class DropboxController {

    private final DropboxService dropboxService;

    public DropboxController(DropboxService dropboxService) {
        this.dropboxService = dropboxService;
    }

    @GetMapping("/team-members")
    public String getTeamMembers() {
        return dropboxService.getTeamMembers();
    }
}