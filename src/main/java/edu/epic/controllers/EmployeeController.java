package edu.epic.controllers;

import edu.epic.dto.EmployeeDTO;
import edu.epic.service.EmployeeService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeController extends HttpServlet {

    private EmployeeService service = new EmployeeService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            int empId = Integer.parseInt(req.getParameter("emp_id"));
            String empName = req.getParameter("emp_name");
            int deptId = Integer.parseInt(req.getParameter("dept_id"));
            double salary = Double.parseDouble(req.getParameter("salary"));

            EmployeeDTO emp = new EmployeeDTO(empId, empName, deptId, salary);

            boolean isSaved = service.addEmployee(emp);

            if (isSaved) {
                req.setAttribute("message", "Employee added successfully!");
            } else {
                req.setAttribute("message", "Failed to add employee!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("message", "Invalid input or server error!");
        }

        req.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req, resp);
    }
}