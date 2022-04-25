package com.example.nacosuserservice.service;

import com.example.springcloud.model.UmsMember;

public interface UserService {
    UmsMember getUser(Long id);
}
