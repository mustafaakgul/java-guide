package org.example.codes.g53_ui;

import java.awt.*;

public class Fontlar2 {
		public static void main(String[] args) {
			GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
					String[] fontnames = e.getAvailableFontFamilyNames();
					for (int i = 0; i < fontnames.length; i++)
					  System.out.println(fontnames[i]);

		}

	}
