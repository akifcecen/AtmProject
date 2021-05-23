package tr.com.zugurtbank.Musteriler;

public class Musteri {

    private Integer tcNo;
    private String adSoyad;
    private Double hesapBakiyesi;
    private String musteriNo;
    private String musteriTuru;

    public String getMusteriTuru() {
        return musteriTuru;
    }

    public void setMusteriTuru(String musteriTuru) {
        this.musteriTuru = musteriTuru;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public Musteri() {
    }

    public Integer getTcNo() {
        return tcNo;
    }

    public void setTcNo(Integer tcNo) {
        this.tcNo = tcNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }



    public Double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(Double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
