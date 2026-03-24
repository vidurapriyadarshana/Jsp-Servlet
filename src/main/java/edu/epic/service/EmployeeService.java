package edu.epic.service;

import edu.epic.dao.EmployeeDAO;
import edu.epic.dto.EmployeeDTO;

public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public boolean addEmployee(EmployeeDTO emp) {
        return employeeDAO.saveEmployee(emp);
    }
}