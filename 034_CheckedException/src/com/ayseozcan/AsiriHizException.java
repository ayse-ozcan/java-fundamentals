package com.ayseozcan;

import java.io.IOException;

public class AsiriHizException extends IOException{

	public AsiriHizException(String message) {
		super(message);
	}

	@Override
	public void printStackTrace() {
		System.out.println("asiri hiz checked exception idir");
	}
	
	
	
}
