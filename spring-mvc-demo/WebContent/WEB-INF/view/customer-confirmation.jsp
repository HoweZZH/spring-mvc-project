<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<title> Customer Confirmation Form</title>
	
	<style>
		.error {color:red}
	</style>
	
</head>
			
<body>
 The customer is confirmed: ${customer.firstName}  ${cutomer.lastName}
 
 <br><br>
 
 Free passes: ${customer.freePasses}
 
</body>

</html>

