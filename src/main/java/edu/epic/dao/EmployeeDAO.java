package edu.epic.dao;

import edu.epic.config.DBConfig;
import edu.epic.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {

    public boolean saveEmployee(EmployeeDTO emp) {

        String sql = "INSERT INTO employees (emp_id, emp_name, dept_id, salary) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());
            ps.setInt(3, emp.getDeptId());
            ps.setDouble(4, emp.getSalary());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}