<?xml version="1.0" encoding="UTF-8"?>

<%@ page contentType="text/xml" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="include_ajax.jsp" %>

<dataset>
	<results>1</results>
	<row>
		<tenantID><c:out value="${model.tenantID}"/></tenantID>
		<fromEmail><c:out value="${model.fromEmail}"/></fromEmail>
		<toEmail><c:out value="${model.toEmail}"/></toEmail>
		<enableNewAccountNotification><c:out value="${model.enableNewAccountNotification}"/></enableNewAccountNotification>
	</row>
</dataset>