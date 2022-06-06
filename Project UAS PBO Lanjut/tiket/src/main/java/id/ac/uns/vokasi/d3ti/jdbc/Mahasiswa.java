package id.ac.uns.vokasi.d3ti.jdbc;

public class Mahasiswa {
	public static void main(String[] arr) {
	MahasiswaData mahasiswaData = new MahasiswaData();
	System.out.println(mahasiswaData.getData().get(0).getNim());
	}
}
