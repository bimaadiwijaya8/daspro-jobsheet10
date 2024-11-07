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

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();

                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak valid. Silakan masukkan nomor baris antara 1-4 dan kolom antara 1-2.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi yang dipilih sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
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

