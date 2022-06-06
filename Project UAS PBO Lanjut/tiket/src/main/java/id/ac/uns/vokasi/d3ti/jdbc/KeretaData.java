package id.ac.uns.vokasi.d3ti.jdbc;

import java.lang.reflect.Array;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class KeretaData {
	Connection con;
	Statement st;
	ResultSet rs;
	ArrayList<KeretaModel> dataKereta;
	public KeretaData() {
		dataKereta = new ArrayList<KeretaModel>();
		try {
			String server = "jdbc:mysql://127.0.0.1/tiket?user=root&password=";;
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(server);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<KeretaModel> getData(){
		try {
			st=(Statement) con.createStatement();
			String query = "SELECT * FROM data_ka";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()) {
				KeretaModel mm=new KeretaModel();
				mm.setid_KA(rs.getString(1));
				mm.setnama_KA(rs.getString(2));
				mm.setkelas(rs.getString(3));
				mm.setstatus(rs.getString(4));
				mm.setjumlahkursi(rs.getString(5));
				dataKereta.add(mm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataKereta;
	}
	
}
