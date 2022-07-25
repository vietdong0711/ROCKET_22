package com.vti.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.UserDTO;
import com.vti.entity.User;
import com.vti.service.IUserService;

@RestController("AdminUserController")
@RequestMapping(value = "api/admin/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private IUserService userService;

	@GetMapping
	public ResponseEntity<?> getAllUser() {
		List<User> users = userService.findAll();
		List<UserDTO> userDTOs = new ArrayList<>();
		for (User user : users) {
			UserDTO userDTO = mapper.map(user, UserDTO.class);
			userDTOs.add(userDTO);
		}
		return new ResponseEntity<>(userDTOs, HttpStatus.OK);
	}
}
