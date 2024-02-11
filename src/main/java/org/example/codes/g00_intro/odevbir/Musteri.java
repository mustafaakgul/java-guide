package org.example.Test00_Introduction.odevbir;

import java.util.Scanner;

public class Musteri {
	Scanner input=new Scanner(System.in);
	
	private int id;
	private int sifre;
	private double paraMiktar;
	private String isim;
	private String adres;
	private String telefon;
	
	public Musteri(){
		this.id=0;
		this.sifre=0;
		this.paraMiktar=0;
		this.isim=null;
		this.adres=null;
		this.telefon=null;
		
	}
	public Musteri(int id){
		this.id=id;
	}
	public Musteri(int id,int sifre){
		this.id=id;
		this.sifre=sifre;		
	}
	public Musteri(int id,int sifre,double paraMiktar){
		this.id=id;
		this.sifre=sifre;
		this.paraMiktar=paraMiktar;
	}
	public Musteri(int id,int sifre,double paraMiktar,String isim){
	    this.id=id;
		this.sifre=sifre;
		this.paraMiktar=paraMiktar;
		this.isim=isim;
	}
	public Musteri(int id,int sifre,double paraMiktar,String isim,String adres){
		this.id=id;
		this.sifre=sifre;
		this.paraMiktar=paraMiktar;
		this.isim=isim;
		this.adres=adres;
	}
	public Musteri(int id,int sifre,double paraMiktar,String isim,String adres,String telefon){
		this.id=id;
		this.sifre=sifre;
		this.paraMiktar=paraMiktar;
		this.isim=isim;
		this.adres=adres;
		this.telefon=telefon;
	}
	public void setId(int x){
		this.id=x;
	}
	public void setSifre(int x){
		this.sifre=x;
	}
	public void setParaMiktar(double x){
		this.paraMiktar=x;
	}
	public void setIsim(String x){
		this.isim=x;
	}
	public void setAdres(String x){
		this.adres=x;
	}
	public void setTelefon(String x){
		this.telefon=x;
	}
	public void setMusteri(int x,int y,double z,String a,String b,String c){
		this.id=x;
		this.sifre=y;
		this.paraMiktar=z;
		this.isim=a;
		this.adres=b;
		this.telefon=c;
	}
	public int getId(){
		return id;
	}
	public int getSifre(){
		return sifre;
	}
	public double getParaMiktar(){
		return paraMiktar;
	}
	public String getIsim(){
		return isim;
	}
	public String getAdres(){
		return adres;
	}
	public String getTelefon(){
		return telefon;
	}
	public void sifreDegistir(){				
		System.out.print("Yeni sifre: ");
		int n=input.nextInt();
		System.out.print("Yeniden giriniz: ");
		int m=input.nextInt();
		    if(n!=m){
		    	System.out.print("Eslesmiyor! Tekrar giriniz: ");
		    	int m2=input.nextInt();
		    	if(n==m2){
		    		setSifre(m2);
		    		System.out.println("Sifreniz basarili bir sekilde degistirildi.");
		    		
		    	}
		    }
		    else{
		    	System.out.println("Sifreniz basarili bir sekilde degistirildi.");
		    	setSifre(n);
		    }
		
	}
	public void paraYatirma(){				
		System.out.print("Miktar: ");
		int y=input.nextInt();
		setParaMiktar(getParaMiktar()+y);
		System.out.println("Islem basarili bir sekilde gerceklestirildi.");
		
	}
	public void paraCek(){				
		System.out.print("Cekmek istediginiz miktar: ");
		int c=input.nextInt();
		System.out.println("Islem basarili bir sekilde gerceklestirildi.");
		setParaMiktar(getParaMiktar()-c);
	}
	public void yaz(){
		System.out.println("Adiniz"+getIsim()+"Adres"+getAdres()+"Telefonunuz"+getTelefon()+"Hesapnumaraniz"+getId()+"Para Miktari"
				+getParaMiktar());
	}
		
	public static void yazgenel(){
	System.out.println(".......MENU.......");
	System.out.println();
	System.out.println("1)  Yeni Hesap");
	System.out.println();
	System.out.println("2)  Islemler");
	System.out.println();
	System.out.println("3)  Cikis");
	System.out.println();
	System.out.print("Secim :");
	}
	public static void main(String[] args){
		Scanner inputt=new Scanner(System.in);
		Musteri m = new Musteri();		
		String islem="Lutfen isleminizi seciniz\n* Degistir Sifre\n* Para Yatır\n* Para Cek\n* Yazdir\n* Cikis";
				yazgenel();		
	    int x =inputt.nextInt();	       	        	 
		      if(x==1){
		    	System.out.print("Adiniz :");
		  		String a =inputt.nextLine();
		  		System.out.print("Adres bilgileri :");
		  		String b =inputt.nextLine();
		  		System.out.print("Telefonunuz :");
		  		String c =inputt.nextLine();
		  		System.out.print("Baslangic miktari :");
		  		int d =inputt.nextInt();
		  		System.out.print("Sifreniz :");
		  		int s1 =inputt.nextInt();
		  		System.out.print("Tekrar Sifreniz :");
		  		int s2 =inputt.nextInt();
		  		if(s1==s2){
		  			System.out.println("Dogru sifre tekrari");
		  			m.setSifre(s1);	
		  		}		  					  		
		  		System.out.println("Isleminiz basarili bir sekilde gerceklesmistir. ");
		  		System.out.println();
		  		System.out.println("Adiniz: "+a);
		  		System.out.println("Adres Bilgileriniz: "+b);
		  		System.out.println("Telefonunuz: "+c);
		  		System.out.println("Baslangic Miktari: "+d);
		  		System.out.println("Sifreniz: "+s1);
		  		System.out.println();
		  		System.out.println("Lutfen bilgilerinizi unutmayiniz.");
		  		System.out.println();
			
			}
			if(x==2){				
				System.out.println("Hesap numaranız: ");
				int a1 =inputt.nextInt();
				m.setId(a1);
				System.out.println("Sifreniz: ");
				int b1 =inputt.nextInt();
				m.setSifre(b1);
				System.out.println(islem);	     
				int s0 = inputt.nextInt();
				if(s0==1){
					m.sifreDegistir();
							}
				if(s0==2){
					m.paraYatirma();
					System.out.println(m.getParaMiktar());
				}
                if(s0==3){
					m.paraCek();
					System.out.println(m.getParaMiktar());
				}
                if(s0==4){
					m.yaz();
				}
                if(s0==5){
					System.out.println("Güle güle");
				}
				System.out.println(islem);
				int s3=inputt.nextInt();
				if(s3==1){
					m.sifreDegistir();
							}
				if(s3==2){
					m.paraYatirma();
					System.out.println(m.getParaMiktar());
				}
				if(s3==3){
					m.paraCek();
					System.out.println(m.getParaMiktar());
				}
                if(s3==4){
					m.yaz();
				}
                if(s3==5){
					System.out.println("Güle güle");
				}
				System.out.println(islem);
				int s4=inputt.nextInt();
				if(s4==1){
					m.sifreDegistir();
							}

                if(s4==2){
					m.paraYatirma();
					System.out.println(m.getParaMiktar());
				}

				if(s4==3){
					m.paraCek();
					System.out.println(m.getParaMiktar());
				}
				if(s4==4){
					m.yaz();
				}
                if(s4==5){
					System.out.println("Güle güle");
				}
				System.out.println(islem);
				int s5=inputt.nextInt();
				if(s5==1){
					m.sifreDegistir();
							}

                if(s5==2){
					m.paraYatirma();
					System.out.println(m.getParaMiktar());
				}
                if(s5==3){
					m.paraCek();
					System.out.println(m.getParaMiktar());
				}

				if(s5==4){
					m.yaz();
				}
				if(s5==5){
					System.out.println("Güle güle");
				}
				System.out.println(islem);
				int s6=inputt.nextInt();
				if(s6==1){
					m.sifreDegistir();
							}

                if(s6==2){
					m.paraYatirma();
					System.out.println(m.getParaMiktar());
				}
                if(s6==3){
					m.paraCek();
					System.out.println(m.getParaMiktar());
				}
                if(s6==4){
					m.yaz();
				}

				if(s6==5){
					System.out.println("Güle güle");
				}												   
		}	        					      	      	      	   		
		if(x==3){
			System.out.println("Güle güle");
		}
		yazgenel();
		int y = inputt.nextInt();
		if(y==2){
			System.out.println("Hesap numaranız: ");
			int a1 =inputt.nextInt();
			m.setId(a1);
			System.out.println("Sifreniz: ");
			int b1 =inputt.nextInt();
			m.setSifre(b1);
			System.out.println(islem);	     
			int s0 = inputt.nextInt();
			if(s0==1){
				m.sifreDegistir();
						}
			if(s0==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s0==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s0==4){
				m.yaz();
			}
            if(s0==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s3=inputt.nextInt();
			if(s3==1){
				m.sifreDegistir();
						}
			if(s3==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
			if(s3==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s3==4){
				m.yaz();
			}
            if(s3==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s4=inputt.nextInt();
			if(s4==1){
				m.sifreDegistir();
						}

            if(s4==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}

			if(s4==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
			if(s4==4){
				m.yaz();
			}
            if(s4==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s5=inputt.nextInt();
			if(s5==1){
				m.sifreDegistir();
						}

            if(s5==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s5==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}

			if(s5==4){
				m.yaz();
			}
			if(s5==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s6=inputt.nextInt();
			if(s6==1){
				m.sifreDegistir();
						}

            if(s6==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s6==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s6==4){
				m.yaz();
			}

			if(s6==5){
				System.out.println("Güle güle");
			}			
		}
		if(y==3){
			System.out.println("Güle güle");
		}
		yazgenel();
		int z=inputt.nextInt();
		if(z==2){
			System.out.println("Hesap numaranız: ");
			int a1 =inputt.nextInt();
			m.setId(a1);
			System.out.println("Sifreniz: ");
			int b1 =inputt.nextInt();
			m.setSifre(b1);
			System.out.println(islem);	     
			int s0 = inputt.nextInt();
			if(s0==1){
				m.sifreDegistir();
						}
			if(s0==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s0==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s0==4){
				m.yaz();
			}
            if(s0==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s3=inputt.nextInt();
			if(s3==1){
				m.sifreDegistir();
						}
			if(s3==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
			if(s3==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s3==4){
				m.yaz();
			}
            if(s3==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s4=inputt.nextInt();
			if(s4==1){
				m.sifreDegistir();
						}

            if(s4==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}

			if(s4==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
			if(s4==4){
				m.yaz();
			}
            if(s4==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s5=inputt.nextInt();
			if(s5==1){
				m.sifreDegistir();
						}

            if(s5==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s5==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}

			if(s5==4){
				m.yaz();
			}
			if(s5==5){
				System.out.println("Güle güle");
			}
			System.out.println(islem);
			int s6=inputt.nextInt();
			if(s6==1){
				m.sifreDegistir();
						}

            if(s6==2){
				m.paraYatirma();
				System.out.println(m.getParaMiktar());
			}
            if(s6==3){
				m.paraCek();
				System.out.println(m.getParaMiktar());
			}
            if(s6==4){
				m.yaz();
			}

			if(s6==5){
				System.out.println("Güle güle");
			}			
		}
		if(z==3){
			System.out.println("Güle güle");
		}
    }
}