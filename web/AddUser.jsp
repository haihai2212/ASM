<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
    String username = request.getParameter("user");
    List<String> users = (List<String>)session.getAttribute("users");
 
    if(null == users) {
        users = new ArrayList<String>();
    }
    users.add(username);
    session.setAttribute("users", users);
    response.sendRedirect("index.jsp");
%>
</string></string></string>