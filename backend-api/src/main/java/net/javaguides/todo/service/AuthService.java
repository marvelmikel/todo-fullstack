package net.javaguides.todo.service;

import net.javaguides.todo.dto.JwtAuthResponse;
import net.javaguides.todo.dto.RegisterDto;
import net.javaguides.todo.dto.LoginDto;

public interface AuthService {

    String register (RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}
