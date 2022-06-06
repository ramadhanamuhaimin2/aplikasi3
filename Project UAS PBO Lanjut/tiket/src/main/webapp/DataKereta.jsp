<!-- TI D - M3119085 - Tri Wulandari -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*"%>
    <%@ page import="id.ac.uns.vokasi.d3ti.jdbc.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- gagal muncul -->
<%
KeretaData m=new KeretaData();
ArrayList<KeretaModel> mTampil=new ArrayList<>();
mTampil.addAll(m.getData());
for(int i=0;i<mTampil.size();i++){
	out.print(mTampil.get(i).getid_KA()+" "+mTampil.get(i).getnama_KA());
	out.print("<br>");
} 
%>
</body>
</html>