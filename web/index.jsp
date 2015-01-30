<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<h2>Add User Screen</h2>
<span style="float: right">
    <a href="DestroySession.jsp">Destroy this session</a>
</span>
<form id="myForm" name="myForm" method="post" action="AddUser.jsp">
    <h3>Enter Username to Add in List</h3>
    <input type="text" name="user" value="<%=  request.getParameter("fullname")%>">
    <input type="submit" value="Add User">
</form>
<%
    // Set refresh, autoload time as 2 seconds
    response.setIntHeader("Refresh", 2);
    // Get current time
    Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if (calendar.get(Calendar.AM_PM) == 0) {
        am_pm = "AM";
    } else {
        am_pm = "PM";
    }
    String CT = hour + ":" + minute + ":" + second + " " + am_pm;
    out.println("Crrent Time: " + CT + "\n");
    
%>
<%
    List<string> users = (List<string>) session.getAttribute("users");
    for (int i = 0; null != users && i < users.size(); i++) {
        out.println("<br>" + users.get(i));
    }
%>
<script>
    function submit() {
        document.getElementById("myForm").submit();
    }
</script>

</string></string>