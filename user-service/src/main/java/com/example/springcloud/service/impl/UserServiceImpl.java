package com.example.springcloud.service.impl;

import com.example.springcloud.mapper.UmsMemberMapper;
import com.example.springcloud.model.UmsMember;
import com.example.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public UmsMember getUser(Long id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }
}
