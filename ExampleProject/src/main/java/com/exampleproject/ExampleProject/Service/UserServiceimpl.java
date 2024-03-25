package com.exampleproject.ExampleProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.exampleproject.ExampleProject.Dto.UserDto;
import com.exampleproject.ExampleProject.Model.User;
import com.exampleproject.ExampleProject.Repository.UserRepository;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(UserDto userDto) {
		User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getFullname());
		return userRepository.save(user);
	}
		 
}
