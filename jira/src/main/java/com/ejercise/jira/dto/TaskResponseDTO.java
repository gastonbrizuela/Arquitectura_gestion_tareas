package com.ejercise.jira.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ejercise.jira.models.enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private StatusEnum status;
    private UUID ownerId;
    private String ownerName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
