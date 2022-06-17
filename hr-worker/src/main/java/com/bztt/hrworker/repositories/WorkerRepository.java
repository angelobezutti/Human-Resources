package com.bztt.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bztt.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
