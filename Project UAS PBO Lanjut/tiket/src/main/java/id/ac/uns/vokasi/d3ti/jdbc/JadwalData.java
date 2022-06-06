package id.ac.uns.vokasi.d3ti.jdbc;

import java.lang.reflect.Array;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class JadwalData {
	Connection con;
	Statement st;
	ResultSet rs;
	ArrayList<JadwalModel> dataJadwal;
	public JadwalData() {
		dataJadwal = new ArrayList<JadwalModel>();
		try {
			String server = "jdbc:mysql://127.0.0.1/tiket?user=root&password=";;
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(server);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<JadwalModel> getData(){
		try {
			st=(Statement) con.createStatement();
			String query = "SELECT * FROM jadwal";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()) {
				JadwalModel mm=new JadwalModel();
				mm.setid_jadwal(rs.getString(1));
				mm.setnama_ka(rs.getString(2));
				mm.setasal(rs.getString(3));
				mm.settujuan(rs.getString(4));
				mm.setjamberangkat(rs.getString(5));
				mm.setjamdatang(rs.getString(5));
				dataJadwal.add(mm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataJadwal;}
	
}
