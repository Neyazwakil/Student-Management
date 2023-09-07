package com.example.EmployeeManagementSystem.Service;


import com.example.EmployeeManagementSystem.Model.Attendance;
import com.example.EmployeeManagementSystem.Model.Employee;
import com.example.EmployeeManagementSystem.Repository.IAttendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    private final IAttendance attendanceRepository;

    @Autowired
    public AttendanceService(IAttendance attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }


    public Attendance recordAttendance(Attendance attendance) {

        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendanceByEmployee(Optional<Employee> employee) {

        return attendanceRepository.findByEmployee(employee);
    }


}