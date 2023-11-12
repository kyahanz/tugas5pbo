public class IMT {
    float berat;
    float tinggi;
    public IMT(float berat, float tinggi){
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public float doCalc(){
        return berat / (tinggi*tinggi);
    }
    public String getKriteria(){
        float val = doCalc();
        if(val <= 18.4) return "Berat Badan Kurang";
        else if(val > 18.4 && val <= 24.9) return "Berat Badan Ideal";
        else if(val >= 25 && val <= 29.9) return "Berat Badan Lebih";
        else if(val >= 30 && val <=39.9) return "Gemuk";
        else return "Sangat Gemuk";
    }
}
