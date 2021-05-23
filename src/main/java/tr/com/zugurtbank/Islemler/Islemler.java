package tr.com.zugurtbank.Islemler;

import tr.com.zugurtbank.Musteriler.BireyselMusteri;
import tr.com.zugurtbank.Musteriler.KurumsalMusteri;
import tr.com.zugurtbank.Musteriler.Musteri;

import java.util.Scanner;

public class Islemler {


    public void EkranaYazdir(Musteri musteri)
    {
       if (musteri.getMusteriTuru()=="Kurumsal"){
           System.out.println("--------KURUMSAL MÜSTERİ--------");
           System.out.println("Müşteri No : "+((KurumsalMusteri)musteri).getMusteriNo());
           System.out.println("Müşteri Tc No : "+((KurumsalMusteri)musteri).getTcNo());
           System.out.println("Musteri adı Soyadı :"+ ((KurumsalMusteri)musteri).getAdSoyad());
           System.out.println("Müşteri Şirket Adı : "+((KurumsalMusteri)musteri).getSirketAd());
           System.out.println("Musteri Hesap Bakiyesi :"+ ((KurumsalMusteri)musteri).getHesapBakiyesi());
           System.out.println("--------------------------------");

       }
       else{
           System.out.println("--------BİREYSEL MÜSTERİ--------");
           System.out.println("Müşteri No : "+((BireyselMusteri)musteri).getMusteriNo());
           System.out.println("Müşteri Tc No : "+((BireyselMusteri)musteri).getTcNo());
           System.out.println("Müşteri Ad Soyad : "+((BireyselMusteri)musteri).getAdSoyad());
           System.out.println("Müşteri Ev Adresi : "+((BireyselMusteri)musteri).getEvAdresi());
           System.out.println("Müşteri Hesap Bakiyesi : "+((BireyselMusteri)musteri).getHesapBakiyesi());
           System.out.println("--------------------------------");

       }

    }
    public void ParaYatir(Musteri musteri)
    {
        System.out.println("--------------------------------");
        double bakiye=musteri.getHesapBakiyesi();
        System.out.println("Mevcut Bakiyeniz : "+ musteri.getHesapBakiyesi());
        System.out.println("Yatırmak istediğiniz tutarı giriniz :");
        Scanner yatirma = new Scanner(System.in);
        double yenitutar = yatirma.nextDouble();
        musteri.setHesapBakiyesi((bakiye+yenitutar));
        System.out.println("--------------------------------");
        System.out.println("Güncel Bakiyeniz  "+ musteri.getHesapBakiyesi()+" olmuştur.");
        System.out.println("--------------------------------");

    }
    public void ParaCek(Musteri musteri)
    {
        System.out.println("--------------------------------");
        double bakiye=musteri.getHesapBakiyesi();
        System.out.println("Mevcut Bakiyeniz : "+ musteri.getHesapBakiyesi());
        System.out.println("Çekmek istediğiniz tutarı giriniz :");
        Scanner paraCekme = new Scanner(System.in);
        double cekme = paraCekme.nextDouble();
        musteri.setHesapBakiyesi((bakiye-cekme));
        System.out.println("--------------------------------");
        System.out.println("Güncel Bakiyeniz  "+ musteri.getHesapBakiyesi()+" olmuştur.");
        System.out.println("--------------------------------");

    }
}
