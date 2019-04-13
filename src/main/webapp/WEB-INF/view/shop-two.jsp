<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>


<p align="center"> Hello, ${shopName.name} or ${shopName} </p>

<p align="center"> We are in Spring MVC Controller</p>


<form:form action="confirm" modelAttribute="shop">
First Name: <form:input path="name"/>
<br><br>
Last Name: <form:input path="address"/>
<br><br>
<input type="submit" value="Submit"/>


</form:form>

</body>

</html>