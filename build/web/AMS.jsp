<%-- 
    Document   : AMS
    Created on : Jan 14, 2015, 10:54:06 PM
    Author     : haipt
--%>
<%@page import="org.asteriskjava.live.AsteriskQueueEntry"%>
<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="org.asteriskjava.live.AsteriskQueue"%>
<%@page import="com.AsmEvenListener.serverlistener"%>
<%@page import="com.AsmEvenListener.serverLiveEvents"%>
<%@page import="com.AsmEvenListener.AsmGetQueueMemember"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    AsmGetQueueMemember asmGetQueueMemember = new AsmGetQueueMemember("192.168.1.200", "admin", "phanhai2212");
    Collection<AsteriskQueue> queues = asmGetQueueMemember.GetAllQueues();
    for (AsteriskQueue name : queues) {
        List<AsteriskQueueEntry> queueEntry = name.getEntries();
        if(!queueEntry.isEmpty()) out.println(queueEntry.get(0).toString());
        String queue = "\n Queue: " + name.getName();
        //out.println(queue);
    }
%>

