package id.ac.uns.vokasi.d3ti.jdbc;

import java.lang.reflect.Array;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class MahasiswaData {
	Connection con;
	Statement st;
	ResultSet rs;
	ArrayList<MahasiswaModel> dataMahasiswa;
	public MahasiswaData() {
		dataMahasiswa = new ArrayList<MahasiswaModel>();
		try {
			String server = "jdbc:mysql://127.0.0.1/universitas?user=root&password=";;
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(server);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<MahasiswaModel> getData(){
		try {
			st=(Statement) con.createStatement();
			String query = "SELECT * FROM mahasiswa";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()) {
				MahasiswaModel mm=new MahasiswaModel();
				mm.setNim(rs.getString(1));
				mm.setNama(rs.getString(2));
				mm.setJk(rs.getString(3));
				mm.setTmpLahir(rs.getString(4));
				mm.setTglLahir(rs.getString(5));
				mm.setAlamat(rs.getString(6));
				dataMahasiswa.add(mm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataMahasiswa;
	}
	public ArrayList<MahasiswaModel> getRowNimData(String nim){
		try {
			st=(Statement) con.createStatement();
			String query = "SELECT * FROM mahasiswa WHERE nim='"+nim+"'";
			rs = (ResultSet) st.executeQuery(query);
			
			while(rs.next()) {
				MahasiswaModel mm=new MahasiswaModel();
				mm.setNim(rs.getString(1));
				mm.setNama(rs.getString(2));
				mm.setJk(rs.getString(3));
				mm.setTmpLahir(rs.getString(4));
				mm.setTglLahir(rs.getString(5));
				mm.setAlamat(rs.getString(6));
				dataMahasiswa.add(mm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataMahasiswa;
	}
	public void insertMahasiswa(String nim,String nama, String jk, String tmp_lahir,String tgl_lahir,String alamat) {
		try {
			st=(Statement) con.createStatement();
			String query = "INSERT INTO mahasiswa(nim,nama,jk,tmp_lahir,tgl_lahir,alamat)VALUES('"+nim+"','"+nama+"','"+jk+"','"+tmp_lahir+"','"+tgl_lahir+"','"+alamat+"')";
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateMahasiswa(String nim,String nama, String jk, String tmp_lahir,String tgl_lahir,String alamat) {
		try {
			st=(Statement) con.createStatement();
			String query = "UPDATE mahasiswa set nama='"+nama+"',jk='"+jk+"',tmp_lahir='"+tmp_lahir+"',tgl_lahir='"+tgl_lahir+"',alamat='"+alamat+"' WHERE nim='"+nim+"'";
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteMahasiswaByNim(String nim) {
		try {
			st=(Statement) con.createStatement();
			String query = "DELETE FROM mahasiswa WHERE nim='"+nim+"'";
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
