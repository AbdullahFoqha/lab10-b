package edu.miu.cs.cs425.webapp.eregistrar.service;

import edu.miu.cs.cs425.webapp.eregistrar.model.User;
import edu.miu.cs.cs425.webapp.eregistrar.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FairfieldLibraryUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public FairfieldLibraryUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username " + username + " not found"));
        return user;
    }
}
