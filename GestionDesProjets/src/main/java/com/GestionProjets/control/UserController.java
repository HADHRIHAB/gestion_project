package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionProjets.entities.User;
import com.GestionProjets.entitiesDto.UserDto;




@RestController
@RequestMapping

public class UserController {
@Autowired
 UserService userService;

 @SuppressWarnings("unchecked")
@GetMapping()
 public List<UserDto> getAllUsers(){
	 List<User> users = userService.getAllUsers();
	 List<UserDto> usersDto = users.stream().map(user -> userService.convertToDto(user)).collect(Collectors.toList());
	 return (List<UserDto>) ResponseEntity.ok(usersDto);
 }
 @PostMapping() 
 public ResponseEntity<UserDto> saveUser(@RequestBody User user) {
	 User savedUser = userService.create(user);
     UserDto userDto  = userService.convertToDto(savedUser);
     return (ResponseEntity.ok(userDto));
 }
 
 @GetMapping("/{email}/{password}")
 public ResponseEntity<UserDto> getUserByemailAndPassword(@PathVariable String email, String password) {
     Optional<User> user = userService.getEmployeeByEmailAndPassword(email, password);
     if (user.isPresent()) {
         UserDto userDto = userService.convertToDto( (user).get());
         return ResponseEntity.ok(userDto);
     } else {
         return ResponseEntity.notFound().build();
     }
 }
 @GetMapping("byid/{id}")  
 public Optional<User> getUserById(@PathVariable long id) {
     Optional<User> user = userService.getUserById(id);
     if (user.isPresent()) {
         UserDto userDto = userService.convertToDto(user.get());
         return Optional.empty();
     } else {
         return Optional.empty();
     }
 }
 @DeleteMapping("/{id}")
 public ResponseEntity<Void>  deleteUser(@PathVariable long id) {
 	userService.delete(id);
 	return ResponseEntity.noContent().build();
 }
}
