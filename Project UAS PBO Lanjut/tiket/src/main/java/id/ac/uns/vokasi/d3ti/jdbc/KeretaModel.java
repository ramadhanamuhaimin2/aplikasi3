package id.ac.uns.vokasi.d3ti.jdbc;

public class KeretaModel {

	String id_KA,nama_KA,kelas,status,jumlahkursi;
	
	public void setid_KA(String id_KA) {
		this.id_KA = id_KA;
	}
	public void setnama_KA(String nama_KA) {
		this.nama_KA = nama_KA;
	}
	public void setkelas(String kelas) {
		this.kelas = kelas;
	}
	public void setstatus(String status) {
		this.status=status; 
	}
	public void setjumlahkursi(String jumlahkursi) {
		this.jumlahkursi= jumlahkursi;
	}
	public String getid_KA() {
		return id_KA;
	}
	public String getnama_KA() {
		return nama_KA;
	}
	public String getkelas() {
		return kelas;
	}
	public String getstatus() {
		return status;
	}
	public String getjumlahkursi() {
		return jumlahkursi;
	}
}
