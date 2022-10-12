package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		String redComponent = in.next();
		String greenComponent = in.next();
		String blueComponent = in.next();
		String isFilled = in.next();
		String x = in.next();
		String y = in.next();
		String semiMajorAxis = in.next();
		String semiMinorAxis = in.next();
//		String x3 = in.next();
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
