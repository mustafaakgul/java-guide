package org.example.Test10_Objects_Classes;

public class lamba {
	
        private static int guc;
		private static String renk;
		private static boolean konum;

		public  int getGuc() {
			return guc;
		}

		public  void setGuc(int guc) {
			this.guc = guc;
		}

		public  String getRenk() {
			return renk;
		}

		public  void setRenk(String renk) {
			this.renk = renk;
		}

		public  boolean getKonum() {
			return konum;
		}

		public  void setKonum(boolean konum) {
			this.konum = konum;
		}

		public  String onOff(boolean konum) {
			if (konum == true)
				return "acik";
			else
				return "kapali";

		}

		public  void print() {
			System.out.println("lambann gucu: " + guc
					+ "\nrengi: " + renk + "\ndurumu: "
					+ onOff(konum));
		}

		

		public static void main(String[] args) {
			lamba l1 = new lamba();
			lamba l2 = new lamba();
			lamba l3 = new lamba();

			l1.setGuc(60);
			l1.setRenk("beyaz");
			l1.onOff(true);
			l1.print();

			l2.setGuc(80);
			l2.setRenk("krmz");
			l2.onOff(true);
			l2.print();

			l3.setGuc(100);
			l3.setRenk("sari");
			l3.onOff(true);
			l3.print();

		}
	}



