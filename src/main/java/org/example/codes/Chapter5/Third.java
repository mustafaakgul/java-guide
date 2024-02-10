package org.guide.Chapter5;
//nested loops it takes 277hours
public class Third {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) {
				for (int j2 = 0; j2 < 10000; j2++) {
					System.out.println("hula");
				}
			}
		}
	}

}
