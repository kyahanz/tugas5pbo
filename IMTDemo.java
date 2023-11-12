import java.util.Scanner;
public class IMTDemo {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Berat Badan(kg) \t:");
        float berat = input.nextFloat();
        System.out.print("Masukan Tinggi Badan(m) \t:");
        float tinggi = input.nextFloat();

        IMT data = new IMT(berat, tinggi);
        System.out.println("\nOutput\n");
        System.out.println("Nilai IMT \t: " + data.doCalc() + " kg/m^2");
        System.out.println("Kriteria \t: " + data.getKriteria());
    }
}
