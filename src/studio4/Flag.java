package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
//		String y3 = in.next();
		//String halfWidth = in.next();
		//String halfHeight = in.next();
	
		
		
	
		//StdDraw.rectangle(Double.valueOf(x),Double.valueOf(y), Double.valueOf(halfWidth), Double.valueOf(halfHeight));
		
//		StdDraw.setPenColor(Integer.valueOf(redComponent), Integer.valueOf(greenComponent), Integer.valueOf(blueComponent));
//		StdDraw.filledRectangle(Double.valueOf(x),Double.valueOf(y), Double.valueOf(halfWidth), Double.valueOf(halfHeight));
		
		StdDraw.setPenColor(Integer.valueOf(redComponent), Integer.valueOf(greenComponent), Integer.valueOf(blueComponent));
		StdDraw.filledEllipse(Double.valueOf(x),Double.valueOf(y), Double.valueOf(semiMajorAxis), Double.valueOf(semiMinorAxis));
	}
}