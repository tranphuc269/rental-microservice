package com.eshop.authservice.controllers;


import com.eshop.authservice.dto.UserDto;
import com.eshop.authservice.service.AuthService;
import com.eshop.authservice.service.AuthServiceImpl;
import com.eshop.authservice.vo.RequestRegister;
import com.eshop.authservice.vo.ResponseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth-service")
public class AuthController {
    @Autowired
    private AuthServiceImpl authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RequestRegister user){
        UserDto userDto = authService.registerUser(UserDto.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .nickname(user.getNickname())
                .phoneNumber(user.getPhoneNumber())
                .build());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ResponseUser.builder()
                        .email(userDto.getEmail())
                        .nickname(userDto.getNickname())
                        .phoneNumber(userDto.getPhoneNumber())
                        .userId(userDto.getUserId())
                        .encryptedPwd(userDto.getEncryptedPwd())
                        .build());

    }
}