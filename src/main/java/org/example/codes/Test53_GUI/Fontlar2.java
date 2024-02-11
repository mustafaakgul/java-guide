package org.example.codes.Test53_GUI;

import java.awt.*;
import javax.swing.*;
public class Fontlar2 {
		public static void main(String[] args) {
			GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
					String[] fontnames = e.getAvailableFontFamilyNames();
					for (int i = 0; i < fontnames.length; i++)
					  System.out.println(fontnames[i]);

		}

	}
