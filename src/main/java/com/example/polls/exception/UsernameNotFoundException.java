package com.example.polls.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String username){
        super(username);
    }
}
