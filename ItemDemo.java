import java.util.Scanner;


public class ItemDemo {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        double total = input.nextDouble();
        Item item1 = new Item(total);
        System.out.println("Besarnya Potongan Rp. " + item1.getPotongan());
        System.out.println("Jumlah yang harus dibayar Rp. " + item1.getFinalTotal());


        System.out.println();

    }
}
