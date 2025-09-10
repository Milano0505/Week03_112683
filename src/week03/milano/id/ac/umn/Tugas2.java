package week03.milano.id.ac.umn;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();

        int pilihan;
        do {
            System.out.println("\nString anda : " + nama);
            System.out.println("1. charAt");
            System.out.println("2. length");
            System.out.println("3. substring(n)");
            System.out.println("4. substring(m,n)");
            System.out.println("5. contains");
            System.out.println("6. concat");
            System.out.println("7. replace");
            System.out.println("8. split");
            System.out.println("9. lowerCase");
            System.out.println("10. upperCase");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----charAt-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx >= 0 && idx < nama.length()) {
                        System.out.println("Hasil : " + nama.charAt(idx));
                    } else {
                        System.out.println("Index di luar jangkauan!");
                    }
                    break;

                case 2:
                    System.out.println("-----length-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Input : " + nama.length());
                    break;

                case 3:
                    System.out.println("-----substring(n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    int start = sc.nextInt();
                    sc.nextLine();
                    if (start >= 0 && start < nama.length()) {
                        System.out.println("Hasil : " + nama.substring(start));
                    } else {
                        System.out.println("Index tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("-----substring(m,n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input mulai : ");
                    int m = sc.nextInt();
                    System.out.print("Input akhir : ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    if (m >= 0 && n <= nama.length() && m < n) {
                        System.out.println("Hasil : " + nama.substring(m, n));
                    } else {
                        System.out.println("Index tidak valid!");
                    }
                    break;

                case 5:
                    System.out.println("-----contains-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String sub = sc.nextLine();
                    System.out.println("Hasil : " + nama.contains(sub));
                    break;

                case 6:
                    System.out.println("-----concat-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String tambahan = sc.nextLine();
                    System.out.println("Hasil : " + nama.concat(tambahan));
                    break;

                case 7:
                    System.out.println("-----replace-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input kata yang diganti : ");
                    String oldWord = sc.nextLine();
                    System.out.print("Input kata pengganti : ");
                    String newWord = sc.nextLine();
                    System.out.println("Hasil : " + nama.replace(oldWord, newWord));
                    break;

                case 8:
                    System.out.println("-----split-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input : ");
                    String pemisah = sc.nextLine();
                    String[] hasil = nama.split(pemisah);
                    for (String h : hasil) {
                        System.out.println("Hasil : " + h);
                    }
                    break;

                case 9:
                    System.out.println("-----lowerCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toLowerCase());
                    break;

                case 10:
                    System.out.println("-----upperCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toUpperCase());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
}