import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin1 = scan.next().charAt(0);
        String jenisKelamin2 = (jenisKelamin1 == 'L' || jenisKelamin1 == 'l') ? "Laki-Laki" : "Perempuan";

        System.out.print("Masukkan Tanggal Lahir (Tahun-Bulan-Tanggal): ");
        String tanggalLahir1 = scan.next();
        LocalDate tanggalLahir2 = LocalDate.parse(tanggalLahir1, DateTimeFormatter.ISO_DATE);

        LocalDate tanggalSkrg = LocalDate.now();
        Period selishUmur = Period.between(tanggalLahir2, tanggalSkrg);
        int umur = selishUmur.getYears();

        System.out.println("Data Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin2);
        System.out.println("Tanggal Lahir: " + tanggalLahir2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Umur: " + umur + " Tahun");

        scan.close();

    }
}













