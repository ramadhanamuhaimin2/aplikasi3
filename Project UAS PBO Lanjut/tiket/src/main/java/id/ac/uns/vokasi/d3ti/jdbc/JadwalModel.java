package id.ac.uns.vokasi.d3ti.jdbc;

public class JadwalModel {

	String id_jadwal,nama_ka,asal,tujuan,jamberangkat,jamdatang;
	
	public void setid_jadwal(String id_jadwal) {
		this.id_jadwal = id_jadwal;
	}
	public void setnama_ka(String nama_ka) {
		this.nama_ka = nama_ka;
	}
	public void setasal(String asal) {
		this.asal = asal;
	}
	public void settujuan(String tujuan) {
		this.tujuan = tujuan;
	}
	public void setjamberangkat(String jamberangkat) {
		this.jamberangkat=jamberangkat; 
	}
	public void setjamdatang(String jamdatang) {
		this.jamdatang= jamdatang;
	}
	public String getid_jadwal() {
		return id_jadwal;
	}
	public String getnama_ka() {
		return nama_ka;
	}
	public String getasal() {
		return asal;
	}
	public String gettujuan() {
		return tujuan;
	}
	public String getjamberangkat() {
		return jamberangkat;
	}
	public String getjamdatang() {
		return jamdatang;
	}
}
