package id.ac.uns.vokasi.d3ti.jdbc;

public class MahasiswaModel {

	String nim,nama,jk,tmp_lahir,tgl_lahir,alamat;
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJk(String jk) {
		this.jk = jk;
	}
	public void setTmpLahir(String tmp_lahir) {
		this.tmp_lahir=tmp_lahir; 
	}
	public void setTglLahir(String tgl_lahir) {
		this.tgl_lahir= tgl_lahir;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public String getJk() {
		return jk;
	}
	public String getTmpLahir() {
		return tmp_lahir;
	}
	public String getTglLahir() {
		return tgl_lahir;
	}
	public String getAlamat() {
		return alamat;
	}
}
