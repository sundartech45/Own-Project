package com.exampleproject.ExampleProject.Service;

import com.exampleproject.ExampleProject.Dto.UserDto;
import com.exampleproject.ExampleProject.Model.User;

public interface UserService {
	
	User save(UserDto userDto);
	
}
