<%--
  Created by IntelliJ IDEA.
  User: suruchi
  Date: 2/8/15
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>student admission form for engineering course</h1>

<h2>${initialMsg}</h2>
<h2>${commanMsg}</h2>
<table>
    <tr>
        <td>student name:</td>
        <td>${st.StudentName}</td>
    </tr>
    <tr>
        <td>student hobby:</td>
        <td>${st.StudentHobby}</td>
    </tr>
    <tr>
        <td>student DOB:</td>
        <td>${st.StudenDOB}</td>
    </tr>
    <tr>
        <td>student skills:</td>
        <td>${st.StudentSkills}</td>
    </tr>
</table>
</body>
</html>