package com.example.passweb.service.user;

import com.example.passweb.repository.user.UserGroupMappingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupMappingService {
    private final UserGroupMappingRepository userGroupMappingRepository;

    public UserGroupMappingService(UserGroupMappingRepository userGroupMappingRepository) {
        this.userGroupMappingRepository = userGroupMappingRepository;
    }

    public List<String> getAllUserGroupIds() {
        return userGroupMappingRepository.findDistinctUserGroupId();

    }
}