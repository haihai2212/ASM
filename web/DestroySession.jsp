<%-- 
    Document   : DestroySession
    Created on : Jan 30, 2015, 10:01:32 AM
    Author     : haipt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
%>
<h2>Session Destroyed successfully.. </h2>
<a href="javascript:history.back()">Click here to go Back</a>
