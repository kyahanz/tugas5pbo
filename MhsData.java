public class MhsData {
    String NPM;
    String Nama;
    float N_kehadiran;
    float N_tugas;
    float N_UTS;
    float N_UAS;

    public MhsData(String npm, String nama, float n_k, float n_t, float n_uts, float n_uas){
        NPM = npm;
        this.Nama = nama;
        N_kehadiran = n_k;
        N_tugas = n_t;
        N_UTS = n_uts;
        N_UAS = n_uas;
    }

    public void print(){
        System.out.println("NPM \t\t:" + NPM);
        System.out.println("Nama \t\t:" + Nama);
        System.out.println("Nilai Rata-rata :" + getAverage());
        System.out.println("Grade \t\t:" + getGrade());
        System.out.println("Keterangan \t:" + getKeterangan());
    }

    public float getAverage(){
        return (N_kehadiran + N_tugas + N_UTS + N_UAS) / 4;
    }
    public float getFinalVal(){
        return 10/100f * N_kehadiran + (20/100) * N_tugas + (30/100) * N_UTS + (40/100) * N_UAS;
    }
    public char getGrade(){
        float val = getFinalVal();
        if (val <46) return 'E';
        else if (val > 45 && val < 56) return 'D';
        else if (val > 55 && val < 66) return 'C';
        else if (val > 65 && val < 76) return 'B';
        else return 'A';
    }
    public String getKeterangan(){
        String retVal = "Undefined";
        switch (getGrade()){
            case 'A':
                retVal = "ISTIMEWA";
                break;
            case 'B':
                retVal = "BAIK";
                break;
            case 'C':
                retVal = "CUKUP";
                break;
            case 'D':
                retVal = "KURANG";
                break;
            case 'E':
                retVal = "KURANG SEKALI";
                break;
        }
        return retVal;
    }
}
