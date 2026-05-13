package com.ejercise.jira.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDTO {
    private UUID userId;
    private String username;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserResponseDTO toDTO(){
        return UserResponseDTO.builder()
                .userId(this.getUserId())
                .name(this.getName())
                .username(this.getUsername())
                .build();
    }
}
