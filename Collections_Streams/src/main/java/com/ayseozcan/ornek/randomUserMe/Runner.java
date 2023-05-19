package com.ayseozcan.ornek.randomUserMe;

import com.ayseozcan.ornek.randomUserMe.model.UserList;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Scanner scannerSite = null;
        try {
            scannerSite = new Scanner(
                    new URL("https://randomuser.me/api/?results=500").openStream(), "UTF-8"
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        Long end = System.currentTimeMillis();
        System.out.println("Web den datalarin cekilme suresi...: " + (end - start));
        boolean flag = false;
        StringBuilder liste = new StringBuilder();
        while (scannerSite.hasNext()) {
            liste.append(scannerSite.nextLine());
        }
        Long end2 = System.currentTimeMillis();
        System.out.println("Datalarin String Builder a aktarilma suresi...: " + (end2 - end));

        Gson gson = new Gson();
        UserList userList = gson.fromJson(liste.toString(), UserList.class);
        Long end3 = System.currentTimeMillis();
        System.out.println("Datalarin Gson ile Listeye aktarilma suresi...: " + (end3 - end2));

        userList.getResults().stream()
                .filter(x -> x.getName().getFirst().contains("ali"))
                .forEach(x -> System.out.println(x.getName().getFirst()));
        Long end4 = System.currentTimeMillis();
        System.out.println("Datalarin Filtrelenme Suresi...: " + (end4 - end3));
    }
}
