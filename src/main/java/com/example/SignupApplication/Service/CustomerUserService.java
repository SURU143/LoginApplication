package com.example.demo.Service;

import com.example.demo.repo.UserDetailesRepository;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserService implements UserDetailsService {

    @Autowired
    UserDetailesRepository userDetailesRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= userDetailesRepository.findByUserName(username);

        if(null==user){
            throw new UsernameNotFoundException("User Not Found With UserName"+ username);
        }
        return user;
    }
}
