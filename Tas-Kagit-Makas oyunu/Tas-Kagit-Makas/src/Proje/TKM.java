package Proje;

import java.util.Iterator;
import java.util.Scanner;

public class TKM {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int pcSkor = 0;
	int oyuncuSkor=0;
	
	for (int i = 0; i < 3; i++) {		
		System.out.println("1.Taş\n"+"2.Kağıt\n"+"3.Makas");
		System.out.print("Bir seçim yapın:");
		if(scan.hasNextInt()){}
		else {
			System.out.println("Lütfen sadece sayısal değer giriniz!");
			return;
		}
		
		int secim=scan.nextInt();
		if (secim<1 || secim>3) {
			System.out.println("Lütfen belirtilen aralıklarda bir değer giriniz");
			return;
		}
				
		int pc=(int) (Math.random()*3+1);				
		
		if(secim==1 &&pc==1) {System.out.println("Oyuncu ve PC taşı seçti--Berabere!");};
		if(secim==1 &&pc==2) {System.out.println("Oyuncu:Taş --- PC:Kağıt--PC kazandı"); pcSkor++;};
		if(secim==1 &&pc==3) {System.out.println("Oyuncu:Taş --- PC:Makas--Oyuncu kazandı"); oyuncuSkor++;};

		if(secim==2 && pc==1) {System.out.println("Oyuncu:Kağıt --- PC:Taş---Kazandın!");oyuncuSkor++;}
		if(secim==2 && pc==2) {System.out.println("Oyuncu ve PC kağıdı seçti---Berabere!");}
		if(secim==2 && pc==3) {System.out.println("Oyuncu:Kağıt ---- PC:Makas---Pc kazandı!");pcSkor++;}

		if(secim==3 && pc==1) {System.out.println("Oyuncu:Makas --- PC:Taş---Kaybettin!");pcSkor++;}
		if(secim==3 && pc==2) {System.out.println("Oyuncu:Makas ---PC:Kağıt---Kazandın!");oyuncuSkor++;}
		if(secim==3 && pc==3) {System.out.println("Oyuncu ve PC makası seçti---Berabere!");}
	
		System.out.println("------------------------------------------------");
	}
		
	if (oyuncuSkor>pcSkor) {
		System.out.println("Tebrikler! Bilgisayarı yendin!");
	} 
	
	else if (oyuncuSkor==pcSkor) {
		System.out.println("Oyun berabere bitti");
	}
	else {
			System.out.println("Bilgisayar kazandı, pes etme tekrar dene...");
	}
	
	System.out.println("Sen:"+oyuncuSkor+" PC:"+pcSkor);
	}

}
