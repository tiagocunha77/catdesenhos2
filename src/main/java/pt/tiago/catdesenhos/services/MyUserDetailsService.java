package pt.tiago.catdesenhos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pt.tiago.catdesenhos.entities.Autor;
import pt.tiago.catdesenhos.entities.MyUserDetails;
import pt.tiago.catdesenhos.repos.AutorRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	AutorRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Autor> user = userRepository.findByUserName(userName);

		user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

		return user.map(MyUserDetails::new).get();
	}
}
