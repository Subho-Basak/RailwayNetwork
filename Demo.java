package com.rail.GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Northeast extends JFrame {

	
		static int width, height;

		int yfact;
		int xfact ; 

		int alilat = (int) (38 - 26.5), alilon = (int) (89.52 - 87);
		int ranglat = (int) (38 - 26.45), ranglon = (int) (91.6 - 87);
		float dellat = 38 - 29, dellon = 77 - 87;
		float kanlat = 38 - 8, kanlon = 78 - 87;
		float chenlat = 38 - 13, chenlon = 80 - 87;
		float guwalat = 38 - 26, guwalon = 92 - 87;

		float a = 120, b = 30;

		public Northeast() {

			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment()
					.getDefaultScreenDevice();
			int width = gd.getDisplayMode().getWidth();
			int height = gd.getDisplayMode().getHeight();

			System.out.println(width);
			System.out.println(height);

			Northeast.width = width;
			Northeast.height = height;
			
			int yfact= (int) height / 22;
			int xfact=(int) (width * 0.75 / 11);
			this.yfact=yfact;
			this.xfact=xfact;
			makeGUI();
		

			setExtendedState(JFrame.MAXIMIZED_BOTH);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(null);
			setVisible(true);

		}

		public void makeGUI() {

			JPanel panel = new JPanel() {
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					Graphics2D g2 = (Graphics2D) g;

					RenderingHints rh = new RenderingHints(
							RenderingHints.KEY_ANTIALIASING,
							RenderingHints.VALUE_ANTIALIAS_ON);
					g2.setRenderingHints(rh);
					g2.setStroke(new BasicStroke(1));

					g2.fillOval(alilon * xfact, alilat * yfact, 10, 10);

					//g2.drawLine(kollon * xfact + 5, kollat * yfact + 5, mumlon
						//	* xfact + 5, mumlat * yfact + 5);

					g2.fillOval(ranglon * xfact, ranglat * yfact, 10, 10);

				/*	g2.drawLine(kanlon * xfact + 5, kanlat * yfact + 5, dellon
							* xfact + 5, dellat * yfact + 5);

					g2.fillOval(dellon * xfact, dellat * yfact, 10, 10);

					g2.fillOval(mumlon * xfact, mumlat * yfact, 10, 10);

					g2.drawLine(mumlon * xfact + 5, mumlat * yfact + 5, kanlon
							* xfact + 5, kanlat * yfact + 5);
					
					g2.fillOval(chenlon * xfact, chenlat * yfact, 10, 10);

					g2.drawLine(dellon * xfact + 5, dellat * yfact + 5, chenlon
							* xfact + 5, chenlat * yfact + 5);
					
					g2.fillOval(guwalon * xfact, guwalat * yfact, 10, 10);

					g2.drawLine(kollon * xfact + 5, kollat * yfact + 5, guwalon
							* xfact + 5, guwalat * yfact + 5);
*/
				}
			};

			panel.setBounds(0, 0, (int) (width * 0.75), height);
			panel.setBackground(Color.white);
			panel.setLayout(null);
			add(panel);

/*			JLabel kol = new JLabel("Kolkata");
			kol.setBounds(kollon * xfact, kollat * yfact, a, b);
			panel.add(kol);

			JLabel del = new JLabel("Delhi");
			del.setBounds(dellon * xfact, dellat * yfact, a, b);
			panel.add(del);

			JLabel mum = new JLabel("Mumbai");
			mum.setBounds(mumlon * xfact, mumlat * yfact, a, b);
			panel.add(mum);

			JLabel kan = new JLabel("Kanyakumari");
			kan.setBounds(kanlon * xfact, kanlat * yfact, a, b);
			panel.add(kan);
			
			JLabel chen = new JLabel("Chennai");
			chen.setBounds(chenlon * xfact, chenlat * yfact, a, b);
			panel.add(chen);
			
			JLabel guwa = new JLabel("Guwahati");
			guwa.setBounds(guwalon * xfact, guwalat * yfact, a, b);
			panel.add(guwa);*/
		
	
		}

		public static void main(String[] args) {
	

			new Northeast();
		
		}



	}


