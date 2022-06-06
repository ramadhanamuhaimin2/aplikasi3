package id.ac.uns.vokasi.d3ti.jdbc;

public class Kereta {
	public static void main(String[] arr) {
	KeretaData keretaData = new KeretaData();
	System.out.println("Daftar Kereta Api : ");
	for(int i=0;i<7;i++) {
	System.out.print(keretaData.getData().get(i).getnama_KA()+"\t");
    System.out.print(" | ");
    System.out.print(keretaData.getData().get(i).getstatus());
    System.out.print(" | ");
    System.out.print(keretaData.getData().get(i).getkelas());
    System.out.print(" | ");
    System.out.println(keretaData.getData().get(i).getjumlahkursi());
	}
	}
}
