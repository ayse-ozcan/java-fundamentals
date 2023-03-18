package com.ayseozcan;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		/*		
		add() / offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.)
	  	offer exception atmaz ekleyemezse add atar.
	    clear() metodu --------> Kuyruğu Temizler.
	    contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
	    peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
	    poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
	    size()------> Kuyruğun içindeki eleman sayısını döner.	    
	    
	    
	    Integer lerde en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
    	Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte, 
    	en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.
		 */
		
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(102);
		
		System.out.println(queue.peek());
		System.out.println(queue.contains(200));
		
		//ONEMLI!!
		//queue icinde for each ile dolasirsaniz yanlis siralama gorebilirsiniz.
		
//		for (Integer integer : queue) {
//			System.out.println(integer);
//		}
		while(!queue.isEmpty()) {
			System.out.println("eleman cikariliyor: " + queue.poll());
		}
		
		//Icinde kendi siniflarimizi tutabilen priority queue lar yazmak
		
		Queue<Ogrenci> queue2 = new PriorityQueue<>();
		queue2.offer(new Ogrenci("veli", 30));
		queue2.offer(new Ogrenci("asda", 60));
		queue2.offer(new Ogrenci("asdas", 50));
		
		
		System.out.println("\n---------------------\n");
		System.out.println(queue2.peek());
		
		while(!queue2.isEmpty()) {
			System.out.println("eleman cikariliyor : " + queue2.poll());
		}
		
	}

}
