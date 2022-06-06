package id.ac.uns.vokasi.d3ti.jdbc;

public class Jadwal {
	public static void main(String[] arr) {
	JadwalData jadwalData = new JadwalData();
	System.out.println("Daftar Jadwal Kereta Api : ");
	for(int i=0;i<7;i++) {
	System.out.print(jadwalData.getData().get(i).getnama_ka()+"\t");
    System.out.print(" | ");
    System.out.print(jadwalData.getData().get(i).getasal());
    System.out.print(" | ");
    System.out.print(jadwalData.getData().get(i).gettujuan());
    System.out.print(" | ");
    System.out.println(jadwalData.getData().get(i).getjamberangkat());
    System.out.print(" | ");
    System.out.println(jadwalData.getData().get(i).getjamdatang());
	}
	}
}
