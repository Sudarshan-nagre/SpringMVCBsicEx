<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h2>Student Information</h2>
      <form:form method = "POST" action = "login">
         <table>
            <tr>
               <td><form:label path = "userName">User Name</form:label></td>
               <td><form:input path = "userName" /></td>
            </tr>
            <tr>
               <td><form:label path = "pwd">Password</form:label></td>
               <td><form:input path = "pwd" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
</body>
</html>