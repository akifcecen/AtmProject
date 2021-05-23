package tr.com.zugurtbank.Main;

import tr.com.zugurtbank.Islemler.Islemler;
import tr.com.zugurtbank.Musteriler.BireyselMusteri;
import tr.com.zugurtbank.Musteriler.KurumsalMusteri;
import tr.com.zugurtbank.Musteriler.Musteri;

import java.util.*;

public class AtmMain {


    public static void main(String[] args) {

        //Müşteri tanımlamaları yapıldı
        //Kurumsal Müşteri için müşteri türü:1 Bireysel için: 0
        BireyselMusteri musteri1 = new BireyselMusteri();
        BireyselMusteri musteri2 = new BireyselMusteri();
        KurumsalMusteri musteri3 = new KurumsalMusteri();
        KurumsalMusteri musteri4 = new KurumsalMusteri();
        BireyselMusteri musteri5 = new BireyselMusteri();

        musteri1.setTcNo(10203040);
        musteri1.setMusteriNo("1");
        musteri1.setAdSoyad("Mahmut Tuncer");
        musteri1.setEvAdresi("sdfksjdfklf");
        musteri1.setHesapBakiyesi(21332.0d);
        musteri1.setMusteriTuru("Bireysel");

        musteri2.setTcNo(45323334);
        musteri2.setMusteriNo("2");
        musteri2.setAdSoyad("Mehmet Akşahin");
        musteri2.setEvAdresi("Adamın Dibi");
        musteri2.setHesapBakiyesi(2133.0d);
        musteri2.setMusteriTuru("Bireysel");

        musteri3.setTcNo(45324234);
        musteri3.setMusteriNo("3");
        musteri3.setAdSoyad("Mustafa Sandal");
        musteri3.setSirketAd("Tesafsadf");
        musteri3.setHesapBakiyesi(22.0d);
        musteri3.setMusteriTuru("Kurumsal");

        musteri4.setTcNo(453342434);
        musteri4.setMusteriNo("4");
        musteri4.setAdSoyad("Akif asdad");
        musteri4.setSirketAd("Tasdadf");
        musteri4.setHesapBakiyesi(212.0d);
        musteri4.setMusteriTuru("Kurumsal");

        musteri5.setTcNo(102123040);
        musteri5.setMusteriNo("5");
        musteri5.setAdSoyad("Mahmut tirawn");
        musteri5.setEvAdresi("sdsjdfklf");
        musteri5.setHesapBakiyesi(2.0d);
        musteri5.setMusteriTuru("Bireysel");


        //Collection tipi HasMap olarak Kullanıldı ve eklendi
        Map<String,Musteri> musteri =new LinkedHashMap<>();
        musteri.put(musteri1.getMusteriNo(),musteri1);
        musteri.put(musteri2.getMusteriNo(),musteri2);
        musteri.put(musteri3.getMusteriNo(),musteri3);
        musteri.put(musteri4.getMusteriNo(),musteri4);
        musteri.put(musteri5.getMusteriNo(),musteri5);

        Islemler islem = new Islemler();

        for (Map.Entry<String,Musteri> musteriler : musteri.entrySet())
        {
            islem.EkranaYazdir(musteriler.getValue());

        }

        Scanner giris = new Scanner(System.in);
        System.out.println("Müşteri No giriniz : ");
        String musteriNo= giris.nextLine();

        System.out.println("Para Çekme----------1 ");
        System.out.println("Para Yatırma--------2 ");
        System.out.println("Yapmak istediğiniz işlemi tuşlayınız : ");
        int tercih = giris.nextInt();
        if (tercih==1){
            islem.ParaCek(musteri.get(musteriNo));
        }
        else if (tercih==2)
        {
            islem.ParaYatir(musteri.get(musteriNo));
        }
        else
            System.out.println("Yanlış Tuşlama yaptınız..");


    }

}



