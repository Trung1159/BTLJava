/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.service;

import com.ndt.pojos.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author TUN
 */
public interface UserService extends UserDetailsService{
//    User getUserByUsername(String username);
    boolean addUser(User user);
    List<User> getUsers(String username);
    // Viết nó giống mấy cái này này
    
}
