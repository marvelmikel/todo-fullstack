package net.javaguides.todo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderlmpl {

    public static void main(String[] args){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        System.out.println(passwordEncoder.encode("marvel"));
        System.out.println(passwordEncoder.encode("admin"));

    }
}
