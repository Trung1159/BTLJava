/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.repository;

import com.ndt.pojos.User;
import java.util.List;

/**
 *
 * @author TUN
 */
public interface UserRepository {
//    User getUserByUsername(String username);
    boolean addUser(User user);
    List<User> getUsers(String username);

    List<User> getUsers();

    User updateRoleUser(String role, int id);

}
