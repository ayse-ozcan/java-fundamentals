package com.ayseozcan;

public class CheckedExceptionsMain {

	// Checked exceptions direkt exception sinifindan turerler
	// bunlar program compile edilirken yakalanmasi ve handle edilmesi zorunlu
	// exceptionlardir
	// bu tarz exceptionlar mutlaka kod run edilmeden once try catch bloklari icinde
	// handle edilmelidir
	// aksi taktirde compile hatasi alirsiniz run edemezsiniz

	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println(2);
	}

}
