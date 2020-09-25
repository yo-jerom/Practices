package com.example.projectservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectservice.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
