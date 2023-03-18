package com.ayseozcan;

//unchecked Exception siniflarindan birinden turetiyoruz
public class AsiriHizException extends ArithmeticException {

	public AsiriHizException(String message) {
		super(message);
		
	}

	@Override
	public void printStackTrace() {
		System.out.println("Bu bir asiri hiz unchecked exceptioni. yuksek hiz tespit edildi!");
	}
	
}
