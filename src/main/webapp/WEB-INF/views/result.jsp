<%@ page contentType="text/html;charset=UTF-8" %>
    <html>

    <head>
        <title>Result</title>
    </head>

    <body>

        <h2>Result</h2>

        <% String message=(String) request.getAttribute("message"); if (message !=null) { %>
            <h3>
                <%= message %>
            </h3>
            <% } else { %>
                <h3>No response from server</h3>
                <% } %>

                    <br>
                    <a href="employee.jsp">Add Another Employee</a>

    </body>

    </html>