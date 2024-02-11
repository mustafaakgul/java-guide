package org.example.codes.g53_ui;

import javax.swing.*;
	import java.awt.*;

	public class AnlatımPaneli extends JPanel {

	  private JLabel etkBaslik = new JLabel();  /** image icon ve text gösteren etiket*/

	  private JTextArea txtAreaMetin = new JTextArea();

	  public AnlatımPaneli() {
	    // ikon ve texti merkeze al ve texti ikonun altına al.
	    etkBaslik.setHorizontalAlignment(JLabel.CENTER);
	    etkBaslik.setHorizontalTextPosition(JLabel.CENTER);
	    etkBaslik.setVerticalTextPosition(JLabel.BOTTOM);

	    // Etiket ve text alanının fontlarını değiştir
	    etkBaslik.setFont(new Font("SansSerif", Font.BOLD, 16));
	   
	    txtAreaMetin.setFont(new Font("Serif", Font.PLAIN, 14));

	    // Metin satırlar halinde ve kelimelerden ayrılıyor
	    txtAreaMetin.setLineWrap(true);
	    txtAreaMetin.setWrapStyleWord(true);
	    txtAreaMetin.setEditable(false);

	    // Metni tutan bir kaydırma çubuğu
	    JScrollPane scrollPane = new JScrollPane(txtAreaMetin);

	    // panel BorderLayout olsun. scrollpane ve etiket eklensin 
	    setLayout(new BorderLayout(5, 5));
	    add(scrollPane, BorderLayout.CENTER);
	    add(etkBaslik, BorderLayout.WEST);
	  }

	  public void setTitle(String title) {
	    etkBaslik.setText(title);
	  }

	  public void setImageIcon(ImageIcon icon) {
	    etkBaslik.setIcon(icon);
	  }

	  public void setDescription(String text) {
	    txtAreaMetin.setText(text);
	  }
	}
