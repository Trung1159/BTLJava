package com.ndt.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ndt.pojos.User;
import com.ndt.service.UserService;

@RestController
public class ApiUserController {
    @Autowired
    private UserService userDetailsService;

    @GetMapping(path = "/api/users", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(this.userDetailsService.getUsers(), HttpStatus.OK);
    }

    @PutMapping(path = "/api/update-userrole", produces = {
        MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<User> updateRoleUser(@RequestBody Map<String, String> params) {
        try {
            String role = params.get("role");
            int id = Integer.parseInt(params.get("id"));

            User user = this.userDetailsService.updateRoleUser(role, id);

            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }
        
    }
}
