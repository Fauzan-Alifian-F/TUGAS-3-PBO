import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getGrade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A (lulus)";
        } else if (nilai >= 70 && nilai < 80) {
            return "B (lulus)";
        } else if (nilai >= 60 && nilai < 70) {
            return "C (lulus)";
        } else if (nilai >= 50 && nilai < 60) {
            return "D (tidak lulus)";
        } else if (nilai < 50) {
            return "E (tidak lulus)";
        } else {
            return "Input nilai anda salah";
        }
    }

    public void displayData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + getGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai: ");
        int nilai = scanner.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, nilai);
        mahasiswa.displayData();

        scanner.close();
    }
}