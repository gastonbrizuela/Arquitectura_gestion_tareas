package com.ejercise.jira.services;

import org.springframework.stereotype.Service;

import com.ejercise.jira.dto.UserRequestsDTO;
import com.ejercise.jira.dto.UserResponseDTO;
import com.ejercise.jira.exception.ConflictException;
import com.ejercise.jira.models.UserModel;
import com.ejercise.jira.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private UserResponseDTO ToResponse (UserModel user){
        return UserResponseDTO.builder()
        .userId(user.getId())
        .name(user.getName())
        .username(user.getUsername())
        .createdAt(user.getCreatedAt())
        .updatedAt(user.getUpdatedAt())
        .build();
    } 
    
    public UserResponseDTO crearUsuario(UserRequestsDTO user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new ConflictException("El username ya existe");
        }
        UserModel userEntity = user.toEntity();
        UserModel userModel = userRepository.save(userEntity);
        UserResponseDTO userResponse = ToResponse(userModel);
        return userResponse;
    }


}
