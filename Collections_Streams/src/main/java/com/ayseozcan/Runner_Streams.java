package com.ayseozcan;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner_Streams {
    public static void main(String[] args) {
        /**
         *  = islemi bir degiskeni(nesne) diger bir degiskene atamaz. referansi atar.
         */
        Stream<String> bos_stream = Stream.empty(); //count = 0;
        long icerik = bos_stream.count();
        System.out.println("bos stream count = " + icerik);
        bos_stream = Stream.of("ayse", "deniz");
        icerik = bos_stream.count()+1;
        System.out.println("bos stream count = " + icerik);
        List<String> ogrenciIsimListesi = List.of("Ece","Cem");
        Stream<String> streamOgrenci = ogrenciIsimListesi.stream();
        streamOgrenci.forEach(System.out::println);

        /**
         * Sonsuz Stream kullanimi
         */
        Stream<Double> rastgeleSayilar = Stream.generate(Math::random);
       //System.out.println("random sayi ver..." + rastgeleSayilar.findFirst().get());
        rastgeleSayilar.limit(5).forEach(System.out::println);
        Stream<Integer> sonsuzTamsayi = Stream.iterate(7, n -> n+1);
        //sonsuzTamsayi.limit(20).forEach(System.out::println);
        sonsuzTamsayi = Stream.iterate(10, n -> n < 40 , n -> n + 4);
        // has next ise devam ediyor
        sonsuzTamsayi.forEach(System.out::println);

        /**
         * Methodlar
         * -> count
         * -> min,max
         * -> forEach
         * -> findFirst, findAny
         */

        Stream<String> meyveler = Stream.of("karpuz", "kiraz");
        Optional<String> min = meyveler.min((s1,s2) -> s1.length() - s2.length());
        System.out.println("min=" + min.get()); // hata verebilir.
        min.ifPresent(System.out::println); // hatasiz calisir, eger deger varsa yazdirir.

        var meyveAdi = new String[] {"e", "l", "m", "a"};
        var ad = "";
        for (String s : meyveAdi) ad += s;
        System.out.println("ad = " + ad);
        Stream<String> meyveAdi2 = Stream.of("e", "l", "m", "a");
        String ad2 = meyveAdi2.reduce("", (s,c) -> s + c);
        System.out.println("ad2 = " + ad2);

        System.out.println(Stream.of("a", "r", "m").reduce("",(s,c) -> s + c ));

        Stream<Integer> sayilar = Stream.of(4,5,6);
        /**
         * step1 1*4
         * step2 4*5
         * step3 20*6
         */
        Integer sonuc =  sayilar.reduce(1, (a,b) -> a*b);
        System.out.println(sonuc);
        System.out.println("------------------------------");

        BinaryOperator<Integer> binaryOperator = ((x,y) -> x*y);
        Stream<Integer> bosSayilar = Stream.empty(); // icinde deger yok.
        Stream<Integer> tekSayilar = Stream.of(9);
        Stream<Integer> ciftSayilar = Stream.of(4,6,8);
        bosSayilar.reduce(binaryOperator).ifPresent(System.out::println); // cikti vermeyecek
        tekSayilar.reduce(binaryOperator).ifPresent(System.out::println); // 9
        ciftSayilar.reduce(binaryOperator).ifPresent(System.out::println); // 192

        System.out.println("------------------------------");
        /**
         * Bu kisimdan itibaren cok onemli!!!!
         * arada collections ve stream e calis
         */
        Stream<String> hayvanIsmi = Stream.of("k","a","p","l","u","m","b","a","g","a");
        TreeSet<String> setTreeHayvan = hayvanIsmi.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println("setTreeHayvan" + setTreeHayvan);
        setTreeHayvan.descendingSet().forEach(System.out::println);

        Stream<String> isimListesi = Stream.of("ece","cem","ada","deniz","mert","ege","ayse","sura","berrin");
        System.out.println("-----------isim listesi-----------");
        //isimListesi.filter(isim -> isim.startsWith("b")).forEach(System.out::println);
        //isimListesi.filter(x -> x.contains("u")).forEach(System.out::println);
        isimListesi.filter(x -> x.length()> 5).forEach(System.out::println);
        //musteriListesi.filter(x -> x.getYas() > 50);

        Stream<String> satisListesi = Stream.of("elma","armut","muz","elma","muz","karpuz","armut");
        satisListesi.distinct().forEach(System.out::println);

        /**
         * public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
         * {
         * Map<Object, Boolean> map = new ConcurrentHashMap<>();
         * return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
         * }
         */

        satisListesi = Stream.of("elma","armut","muz");
        satisListesi.map(String::length).forEach(System.out::println);

        /**
         * K,V -> Map<Integer, List<String>> => 4, [Elma] <> 5, [Armut,Kiraz]
         */
        System.out.println("-----isimleri siralama-----");
        Stream<String> isimListesi2 = Stream.of("ece","cem","ada","deniz","mert","ege","ayse","sura","berrin");
        //isimListesi2.sorted().forEach(System.out::println);
        isimListesi2.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("==============");
        List<String> isimler = new ArrayList<>();
        isimler.add("sda");
        isimler.add("eee");
        isimler.add("tttt");
        isimler.stream().sorted().forEach(System.out::println);

        /**
         * tur donusumlerini collections lar arasinda yapalim
         */
        System.out.println("=======TUR DONUSUMLERI=======");
        Stream<String> listIsim = Stream.of("canan","veli","taner");
        Stream<String> listIsim2 = Stream.of("canan","veli","taner");
        Map<String,Integer> mapIsim = listIsim.collect(Collectors.toMap(isim -> isim, isim -> isim.length()));
        Map<String,Integer> mapIsim2 = listIsim2.collect(Collectors.toMap(String::toUpperCase, String::length));
        System.out.println("mapIsim" + mapIsim);
        System.out.println("mapIsim2" + mapIsim2);

        /**
         * K,V -> Integer, List<String> -> 3,[ece,cem,ada,ege]
         */
        listIsim = Stream.of("ece","cem","ada","deniz","mert","ege","ayse","sura","berrin");
        Map<Integer,List<String>> mapListLength = listIsim.collect(Collectors.groupingBy(String::length));
        System.out.println(mapListLength);
        /**
         *
         */
        listIsim = Stream.of("ece","cem","ada","deniz","mert","ege","ayse","sura","berrin");
        TreeMap<Integer,List<String>> treeMapList = listIsim.
                collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toList()));
        System.out.println(treeMapList);


    }
}
