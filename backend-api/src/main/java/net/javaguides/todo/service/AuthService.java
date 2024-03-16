package net.javaguides.todo.service;

import net.javaguides.todo.dto.RegisterDto;
import net.javaguides.todo.dto.LoginDto;

public interface AuthService {

    String register (RegisterDto registerDto);

    String login(LoginDto loginDto);
}
