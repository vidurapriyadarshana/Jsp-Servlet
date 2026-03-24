<%@ page contentType="text/html;charset=UTF-8" %>
    <html>

    <head>
        <title>Add Employee</title>
    </head>

    <body>

        <h2>Add Employee</h2>

        <form action="employee" method="post">
            <label>Employee ID:</label>
            <input type="text" name="emp_id" required><br><br>

            <label>Employee Name:</label>
            <input type="text" name="emp_name" required><br><br>

            <label>Department ID:</label>
            <input type="text" name="dept_id" required><br><br>

            <label>Salary:</label>
            <input type="text" name="salary" required><br><br>

            <input type="submit" value="Save Employee">
        </form>

    </body>

    </html>