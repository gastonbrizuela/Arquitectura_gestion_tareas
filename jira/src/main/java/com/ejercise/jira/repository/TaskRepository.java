package com.ejercise.jira.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercise.jira.models.TaskModel;
import com.ejercise.jira.models.enums.StatusEnum;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, UUID> {

    List<TaskModel> findByOwnerId(UUID ownerId);

    List<TaskModel> findByOwnerIdAndStatus(UUID ownerId, StatusEnum status);
}
