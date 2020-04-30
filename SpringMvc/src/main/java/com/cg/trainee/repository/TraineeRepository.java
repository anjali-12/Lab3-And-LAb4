package com.cg.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trainee.entity.Trainee;
import com.demo.model.Employee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long> {

}
