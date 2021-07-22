<%@ page import="model.information" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="util.DBUtil" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    private List<information> getInfoList() throws ServletException {
        List<information> informationList = new ArrayList<>();
        try (Connection c = DBUtil.connection()) {
            String sql = "SELECT name, gender, hobby, edu, suggestion FROM information ORDER BY id";
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        information info = new information();
                        info.name = rs.getString("name");
                        info.gender = rs.getInt("gender") == 0 ? "女" : "男";
                        String[] hobbies = rs.getString("hobby").split(":");
                        info.hobbyList.addAll(Arrays.asList(hobbies));
                        info.edu = rs.getString("edu");
                        info.suggestion = rs.getString("suggestion");

                        informationList.add(info);
                    }
                }
            }
        } catch (SQLException exc) {
            throw new ServletException(exc);
        }

        return informationList;
    }
%>
<%
    List<information> informationList = getInfoList();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>建议表</title>
</head>
<body>
    <table>
        <tbody>
        <% for (information info : informationList) { %>
        <tr>
            <td><%= info.name %></td>

            <td><%= info.gender %></td>

            <td><%= info.suggestion %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</body>
</html>
