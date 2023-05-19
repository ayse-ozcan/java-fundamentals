package com.ayseozcan;

import com.ayseozcan.entity.Ogrenci;
import com.ayseozcan.entity.OgrenciNotu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    private static List<OgrenciNotu> notlar = List.of(
            OgrenciNotu.builder().ders("JAVA").not_no(1L).not(60).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(2L).not(50).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(3L).not(20).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(4L).not(80).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(5L).not(65).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(6L).not(78).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(7L).not(91).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(8L).not(48).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(9L).not(54).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(10L).not(20).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(11L).not(19).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(12L).not(87).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(13L).not(62).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(14L).not(77).build(),
            OgrenciNotu.builder().ders("JAVA").not_no(15L).not(83).build()

    );
    private static List<Ogrenci> ogrenciler = List.of(
            Ogrenci.builder().okulno("okl001").ad("Ali").sinif("1-A").notlar(notlar.subList(0, 3)).build(),
            Ogrenci.builder().okulno("okl002").ad("Bahar").sinif("2-B").notlar(notlar.subList(3, 6)).build(),
            Ogrenci.builder().okulno("okl003").ad("Deniz").sinif("4-A").notlar(notlar.subList(12, 15)).build(),
            Ogrenci.builder().okulno("okl004").ad("Tuğba").sinif("5-C").notlar(Arrays.asList(notlar.get(10), notlar.get(14), notlar.get(5))).build()

    );


    public static void main(String[] args) {
        /**
         * ogrenci listesi oldugunu varsayalim. 10 kisilik bir sinif.
         * bu sinifin icinde JAVA dersinin notlari girilmis ve ogrenci icin
         * n adet not girilsin. Buna gore elinizde bulunan bu liste uzerinde
         * 1- ogrencilerin javadan aldigi notlarin ve ortalamasinin Map<OkulNo,List<Notlar>>
         * seklinde tutulmasi
         * 2- ortalamasi 50 den buyuk olan ogrenci listesi
         * 3- her bir ogrenci, aldigi notun rakamlar olarak tam tersini almis olsa idi
         * not listesi nasil olurdu? orn: Ali, [83,90,23] -> [38,9,32] gibi
         */

        Map<String, List<OgrenciNotu>> ogrNot = ogrenciler.stream()
                .collect(Collectors.toMap(ogr -> ogr.getOkulno(), ogr -> ogr.getNotlar()));
        System.out.println(ogrNot);
        Map<String, List<OgrenciNotu>> ogrNot2 = ogrenciler.stream()
                .collect(Collectors.toMap(Ogrenci::getOkulno, Ogrenci::getNotlar));
        System.out.println("*****************************************************");
        System.out.println(ogrNot2);

        System.out.println("*****************************************************");

        ogrenciler.get(0).getNotlar().stream().mapToInt(OgrenciNotu::getNot).average().ifPresent(System.out::println);

        List<Ogrenci> gecenOgrenciListesi = ogrenciler.stream()
                .filter(ogr -> ogr.getNotlar().stream().mapToInt(OgrenciNotu::getNot).average().getAsDouble() > 50)
                .collect(Collectors.toList());

        System.out.println("*****************************************************");
        System.out.println(gecenOgrenciListesi);

        System.out.println("*****************************************************");

        ogrenciler.forEach(ogr -> {
            ogr.getNotlar().forEach(not -> {
                not.setNot(reverseNumber(not.getNot()));
            });
            System.out.println(ogrenciler);
        });

    }

    private static Integer reverseNumber(Integer number) {
        String numberStr = number.toString();
        String reverseNumberStr = new StringBuilder(numberStr).reverse().toString();
        return Integer.parseInt(reverseNumberStr);
    }
}

