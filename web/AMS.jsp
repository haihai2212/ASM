<%-- 
    Document   : AMS
    Created on : Jan 14, 2015, 10:54:06 PM
    Author     : haipt
--%>
<%@page import="com.AsmEvenListener.serverlistener"%>
<%@page import="com.AsmEvenListener.serverLiveEvents"%>
<%@page import="com.AsmEvenListener.AsmGetQueueMemember"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    AsmGetQueueMemember asmGetQueueMemember = new AsmGetQueueMemember("192.168.1.200", "admin", "phanhai2212");
    out.print(asmGetQueueMemember.GetQueueName());
%>

