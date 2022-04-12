package com.vaibhav.momscakestudio.service;

import com.vaibhav.momscakestudio.model.CustomUserDetail;
import com.vaibhav.momscakestudio.model.User;
import com.vaibhav.momscakestudio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(email);
        user.orElseThrow(()-> new UsernameNotFoundException("User not found with email: "+email));
        return user.map(CustomUserDetail::new).get();
    }
}
