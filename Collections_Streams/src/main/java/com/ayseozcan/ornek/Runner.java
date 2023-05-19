package com.ayseozcan.ornek;

import java.util.*;
import java.util.stream.Collectors;

import static com.ayseozcan.ornek.DataImpl.*;

public class Runner {
    public static void main(String[] args) {
        /**
         *   mapIleArama(1000_000_000);
         *   treeMapIleArama(1000_000_000);
         *   hashMapIleArama(1000_000_000);
         *   listIleArama(100_000_000);
         */

        /**
         *      Map<Bolum,List<Calisan>> mapList = calisanList.stream().collect(Collectors.groupingBy(Calisan::getBolum));
         *         mapList.forEach((bolum,calisanlar) -> {System.out.println
         *                 ("departman adi: " + bolum.getAd());
         *             System.out.println(calisanlar.toString());
         *             System.out.println("-------------------------");
         *         });
         *     }
         */

        Map<String, Integer> departmanList = calisanList.stream().collect
                (Collectors.groupingBy(calisan -> calisan.getBolum().ad,
                        Collectors.summingInt(calisan -> 1)));
        System.out.println(departmanList);
    }

    public static void treeMapIleArama(int donguSayisi) {
        Long start = System.currentTimeMillis();
        TreeMap<String, List<Calisan>> listMap = calisanList.stream().collect(
                Collectors.groupingBy(Calisan::getAd, TreeMap::new, Collectors.toList())
        );
        Long donusum = System.currentTimeMillis();
        System.out.println("donusum suresi Treemap " + (donusum - start));
        final String aranan = "Muhammet";
        int bulunanAdet = 0;
        for (int i = 0; i < donguSayisi; i++) {
            if (listMap.containsKey(aranan)) {
                bulunanAdet++;
            }
        }
        System.out.println("bulunan adet: " + bulunanAdet);
        Long end = System.currentTimeMillis();
        System.out.println("gecen sure Treemap " + (end - start));
    }

    public static void hashMapIleArama(int donguSayisi) {
        Long start = System.currentTimeMillis();
        HashMap<String, List<Calisan>> listMap = calisanList.stream().collect(
                Collectors.groupingBy(Calisan::getAd, HashMap::new, Collectors.toList())
        );
        Long donusum = System.currentTimeMillis();
        System.out.println("donusum suresi hashmap " + (donusum - start));
        final String aranan = "Muhammet";
        int bulunanAdet = 0;
        for (int i = 0; i < donguSayisi; i++) {
            if (listMap.containsKey(aranan)) {
                bulunanAdet++;
            }
        }
        System.out.println("bulunan adet: " + bulunanAdet);
        Long end = System.currentTimeMillis();
        System.out.println("gecen sure hashMap " + (end - start));
    }

    public static void mapIleArama(int donguSayisi) {
        Long start = System.currentTimeMillis();
        Map<String, List<Calisan>> listMap = calisanList.stream().collect(
                Collectors.groupingBy(Calisan::getAd)
        );
        Long donusum = System.currentTimeMillis();
        System.out.println("donusum suresi map " + (donusum - start));
        final String aranan = "Muhammet";
        int bulunanAdet = 0;
        for (int i = 0; i < donguSayisi; i++) {
            if (listMap.containsKey(aranan)) {
                bulunanAdet++;
            }
        }
        System.out.println("bulunan adet: " + bulunanAdet);
        Long end = System.currentTimeMillis();
        System.out.println("gecen sure map " + (end - start));
    }

    public static void listIleArama(int donguSayisi) {
        Long start = System.currentTimeMillis();
        final String aranan = "Muhammet";
        int bulunanAdet = 0;
        for (int i = 0; i < donguSayisi; i++) {
            Optional<Calisan> bulunan = calisanList.stream().filter(calisan -> calisan.getAd().equals(aranan)).findFirst();
            if (bulunan.isPresent()) {
                bulunanAdet++;
            }
        }
        System.out.println("bulunan adet " + bulunanAdet);
        Long end = System.currentTimeMillis();
        System.out.println("gecen sure list " + (end - start));
    }
}