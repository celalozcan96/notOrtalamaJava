package JavaOdev1;

import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat,fizik,tarih,turkce,kimya,muzik;
        
        System.out.print("Matematik Notunuzu Giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = inp.nextInt();
        
        int toplam = mat + fizik + tarih + turkce + kimya + muzik;
        System.out.println("Not Toplamanız:" +toplam);
        double sonuc = toplam/6;
        System.out.println("Not Ortalamanız:" +sonuc);
        boolean kosul = sonuc >=60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
       
        
    }
    
}
