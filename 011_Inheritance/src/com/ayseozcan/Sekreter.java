package com.ayseozcan;

public class Sekreter extends Personel {
	

	private long tel1SeriNo;
	private long tel2SeriNo;
	
	public Sekreter() { // yazmasak da calisir cunku kendi olusturur gorunmese de
		
		super();
	}
	
	
	public Sekreter(long tel1SeriNo) {
		super("test stringi" , 7);
		this.tel1SeriNo = tel1SeriNo;
		
		System.out.println("public sekreter (LONG TEL1SERINO)cagirildi");
		
	}
	
	public long getTel1SeriNo() {
		return tel1SeriNo;
	}
	

	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}

	
	public long getTel2SeriNo() {
		return tel2SeriNo;
	}
	
	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}
	
	

}
