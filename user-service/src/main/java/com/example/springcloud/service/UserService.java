package com.example.springcloud.service;

import com.example.springcloud.model.UmsMember;

public interface UserService {
    UmsMember getUser(Long id);
}
