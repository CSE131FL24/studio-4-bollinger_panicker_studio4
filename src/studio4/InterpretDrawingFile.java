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

		String shape = in.next();
		int redComp = in.nextInt();
		int greenComp = in.nextInt();
		int blueComp = in.nextInt();
		boolean filled = in.nextBoolean();
		double doubleX = in.nextDouble();
		double doubleY = in.nextDouble(); 
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();


		StdDraw.setPenColor(redComp, greenComp, blueComp);

		if (shape.equals("rectangle")) {
			if (filled) {
				StdDraw.filledRectangle(doubleX,doubleY,halfWidth,halfHeight);
			}
			else {
				StdDraw.rectangle(doubleX,doubleY,halfWidth,halfHeight);

			}

		} 

	}
}
