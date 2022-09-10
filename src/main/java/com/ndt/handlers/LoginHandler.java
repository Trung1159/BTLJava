/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.handlers;

import com.ndt.pojos.User;
import com.ndt.service.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author TUN
 */
@Component
public class LoginHandler implements AuthenticationSuccessHandler {
    @Autowired
    private UserService userDetailService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication a) throws IOException, ServletException {
        User u = (User) this.userDetailService.getUsers(a.getName()).get(0);
        request.getSession().setAttribute("currentUser", u);
        
        response.sendRedirect("/QlkltnBTL/");
    }
    
}
