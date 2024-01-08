class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan, double inputIPK, int inputUmur){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        IPK = inputIPK;
        umur = inputUmur;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        System.out.println(IPK);
        System.out.println(umur);
    }
}

public class oop{
    public static void main(String[] args) {
      
      Mahasiswa Mahasiswa1 = new Mahasiswa("Rayhan Muhammad Adha", "G1A023051", "TEKNIK INFORMATIKA", 4.0, 18);
      
      
        // Mahasiswa Mahasiswa1 = new Mahasiswa();
        // Mahasiswa1.nama = "ucup";
        // Mahasiswa1.NIM = "8349343";
        // Mahasiswa1.jurusan = "Teknik Informatika";
        // Mahasiswa1.IPK = 4.0;
        // Mahasiswa1.umur = 18;
        // System.out.println(Mahasiswa1.nama);
        // System.out.println(Mahasiswa1.NIM);
        // System.out.println(Mahasiswa1.jurusan);
        // System.out.println(Mahasiswa1.IPK);
        // System.out.println(Mahasiswa1.umur);
       
        // Mahasiswa Mahasiswa2 = new Mahasiswa();
        // Mahasiswa2.nama = "megatiwa";
        // Mahasiswa2.NIM = "843465";
        // Mahasiswa2.jurusan = "Teknik Informatika";
        // Mahasiswa2.IPK = 3.5;
        // Mahasiswa2.umur = 18;
        // System.out.println(Mahasiswa2.nama);
        // System.out.println(Mahasiswa2.NIM);
        // System.out.println(Mahasiswa2.jurusan);
        // System.out.println(Mahasiswa2.IPK);
        // System.out.println(Mahasiswa2.umur);
    }
}