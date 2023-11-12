public class Item {
    private double Potongan;
    private double FinalTotal;
    int t;
    protected Item(double TotalPembelian){
        if(TotalPembelian < 50000){
            Potongan = TotalPembelian * 5 / 100;
        }else{
            Potongan = TotalPembelian * 20 / 100;
        }
        FinalTotal = TotalPembelian - Potongan;
    }

    public double getPotongan () {
        return Potongan;
    }

    public double getFinalTotal () {
        return FinalTotal;
    }
}
