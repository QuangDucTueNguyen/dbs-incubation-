package com.incubator.dbs.guestservice.controller;

import com.incubator.dbs.guestservice.model.dto.GuestInfoResponse;
import com.incubator.dbs.guestservice.model.dto.LoginRequestDto;
import com.incubator.dbs.guestservice.model.dto.LoginResponseDto;
import com.incubator.dbs.guestservice.model.dto.SignUpRequestDto;
import com.incubator.dbs.guestservice.model.dto.SignupResponseDto;
import com.incubator.dbs.guestservice.service.UserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserOperation {

  @Autowired
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @Override
  public LoginResponseDto login(@RequestBody LoginRequestDto request) {
    return userService.login(request);
  }

  @Override
  @ResponseStatus(HttpStatus.CREATED)
  public SignupResponseDto signUp(@Valid @RequestBody SignUpRequestDto request) {
    return userService.signUp(request);
  }

  @Override
  public GuestInfoResponse get(String id) {
    return userService.get(id);
  }

  @Override
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(String id) {
    userService.delete(id);
  }
}
