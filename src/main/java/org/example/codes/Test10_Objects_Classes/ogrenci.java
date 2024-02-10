package org.example.Test10_Objects_Classes;

public class ogrenci {
	
		private static int no;
		private static int kredi;
		private static int ders;

		public  int getNo() {
			return no;
		}

		public  void setNo(int no) {
			this.no = no;
		}

		public  int getKredi() {
			return kredi;
		}

		public  void setKredi(int kredi) {
			this.kredi = kredi;
		}

		public  int getDers() {
			return ders;
		}

		public  void setDers(int ders) {
			this.ders = ders;
		}

		public  void print() {
			System.out.println("ogrenci no: " + no + "\nkredisi: "
					+ kredi + "\nders: " + ders);
		}

		public static void main(String[] args) {
			ogrenci input = new ogrenci();
			input.setNo(87569);
			input.setKredi(25);
			input.setDers(8);
			input.print();
		}
	}


