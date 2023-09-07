package com.example.EmployeeManagementSystem.Repository;


import com.example.EmployeeManagementSystem.Model.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHR extends JpaRepository<HR, Long> {

    HR findByUsername(String username);
}
