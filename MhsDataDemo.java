import java.util.Scanner;

public class MhsDataDemo {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM \t\t: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        float n_k = input.nextFloat();
        System.out.print("Nilai Tugas : ");
        float n_t = input.nextFloat();
        System.out.print("Nilai UTS : ");
        float n_uts = input.nextFloat();
        System.out.print("Nilai UAS : ");
        float n_uas = input.nextFloat();

        MhsData data = new MhsData(npm, nama, n_k, n_t, n_uts, n_uas);
        System.out.println("\n\nOutput\n");
        data.print();
    }
}