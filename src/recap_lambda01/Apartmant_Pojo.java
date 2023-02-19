package recap_lambda01;

public class Apartmant_Pojo {
    private String cephe;
    private int kira;
    private int katSayısı;

    public Apartmant_Pojo() {
    }

    public Apartmant_Pojo(String cephe, int kira, int katSayısı) {
        this.cephe = cephe;
        this.kira = kira;
        this.katSayısı = katSayısı;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    public int getKatSayısı() {
        return katSayısı;
    }

    public void setKatSayısı(int katSayısı) {
        this.katSayısı = katSayısı;
    }

    @Override
    public String toString() {
        return "Apartmant_Pojo{" +
                "cephe='" + cephe + '\'' +
                ", kira=" + kira +
                ", katSayısı=" + katSayısı +
                '}';
    }
}
