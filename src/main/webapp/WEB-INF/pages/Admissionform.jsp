<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: suruchi
  Date: 2/8/15
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.

 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
               --%>
<html>
<body>
<h1>${"commanMsg"}</h1>
<h1>student admission form for engineering course</h1>
   <form  action ="${pageContext.request.contextPath}submitAdmissionForm.html" method="POST">
         <table>
             <tr>
             <td>Student's Name :</td><td><label>
                 <input type="text" name="StudentName"/>
             </label></td>
             </tr>
             <tr>
                 <td>Student's Hobby : </td><td><label>
                 <input type="text" name="StudentHobby"/>
             </label></td>
             </tr>
             <tr>
                 <td>Student's Mobile : </td><td><label>
                 <input type="text" name="StudentMobile"/>
             </label></td>
             </tr>
             <tr>
                 <td>Student's DOB : </td><td><label>
                 <input type="text" name="StudentDOB"/>
             </label></td>
             </tr>
             <tr>
                 <td>Student's skill's : </td><td><label>
                 <select>name="StudentSkills" multiple>
                     <option value="java Core">java Core</option>
                     <option value="spring Core">spring Core</option>
                     <option value="spring MVC">spring MVC</option>
                 </select>

             </label></td>
    <tr><td> <input type="Submit" value="submit the form"/></td></tr>
        </table>
      </form>
    </body>
</html>