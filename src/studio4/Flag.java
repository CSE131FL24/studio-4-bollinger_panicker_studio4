package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		
		StdDraw.setPenColor(254, 209, 0);
		StdDraw.filledRectangle(0.5, 0.5,0.4,0.2);
		
		StdDraw.setPenColor(Color.BLACK);
		double[] x = {0.1, 0.41, 0.1};
		double[] y = {0.35, 0.5, 0.65};
		StdDraw.filledPolygon(x, y);
		
		double[] x2 = {0.9, 0.59, 0.9};
		StdDraw.filledPolygon(x2,y);

		StdDraw.setPenColor(0, 155, 58);
		double[] x3 = {0.15, 0.5, 0.85};
		double[] y3 = {0.7, 0.54, 0.7};
		StdDraw.filledPolygon(x3, y3);
		
		double[] y4 = {0.3, 0.46, 0.3};
		StdDraw.filledPolygon(x3, y4);
		
		
		//draw border
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5,0.5,0.4,0.2);
		
		
	}
}