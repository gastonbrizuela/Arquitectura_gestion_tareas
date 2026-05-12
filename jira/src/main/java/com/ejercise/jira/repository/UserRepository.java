package com.ejercise.jira.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercise.jira.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
