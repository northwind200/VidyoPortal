<?xml version="1.0" encoding="UTF-8"?>

<%@ page contentType="text/xml" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="include_ajax.jsp" %>

<dataset>
 <results>1</results>
	<row>
		<locationID><c:out value="${model.location.locationID}"/></locationID>
		<locationTag><c:out value="${model.location.locationTag}"/></locationTag>
	</row>
</dataset>