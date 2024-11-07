import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();

                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();

                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    
                    if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                    } else {
                        System.out.println("Baris atau kolom tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "-";
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, namaPenonton);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        }
    }
}
