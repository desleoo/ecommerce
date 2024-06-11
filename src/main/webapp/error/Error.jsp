<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERRORE</title>
</head>
<body>

		
		
		
<h3>Eccezione</h3>  
	    <p>Si è verificata un'eccezione: <s:property value="exception" />
	    </p>
	    <p>Dettagli: <s:property value="exceptionStack" />
	    </p>
	    </body>
</html>