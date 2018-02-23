package io.github.fyggh.pixlab.picturelab;

//import java.util.function.Function;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	
	//static Picture laa = new Picture("Laa-Laa.png");
	
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("Laa-Laa.png");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testZeroGreen() {
		Picture laalaa = new Picture("Laa-Laa.png");
		laalaa.explore();
		laalaa.zeroGreen();
		laalaa.explore();
	}

	public static void testNegate() {
		Picture laalaa = new Picture("Laa-Laa.png");
		laalaa.negate();
		laalaa.explore();
	}

	public static void testGrayscale() {
		Picture laalaa = new Picture("Laa-Laa.png");
		laalaa.grayscale();
		laalaa.explore();

	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("Laa-Laa.png");
		//caterpillar.mirrorVertical();
		caterpillar.mirrorVerticalLeftToRight();
		caterpillar.setTitle("testMirrorVertical");
		caterpillar.explore();
	}
	
	/** Method to test mirrorVerticalRightToLeft */
	public static void testMirrorVerticalRightToLeft() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.mirrorVerticalRightToLeft();
		laa.explore();
	}

	private static void testMirrorHorizontalBottomToTop() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.mirrorHorizontalBottomToTop();
		laa.setTitle("testMirrorHorizontalBottomToTop");
		laa.explore();
	}

	private static void testMirrorHorizontalTopToBottom() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.mirrorHorizontalTopToBottom();
		laa.setTitle("testMirrorHorizontalTopToBottom");
		laa.explore();
	}
	
	private static void testMirrorDiagonalBottomToTop() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.mirrorDiagonalBottomToTop();
		laa.setTitle("testMirrorDiagonalBottomToTop");
		laa.explore();
	}

	private static void testShuffle() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.shuffle(20);
		laa.setTitle("testShuffle");
		laa.explore();
		
	}

	private static void testPuzzle() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.puzzle(5, 3);
		laa.setTitle("testPuzzle");
		laa.explore();
		
	}

	private static void testPuzzleNoRep() {
		Picture laa = new Picture("Laa-Laa.png");
		laa.puzzleNoRepetition(5, 3);
		laa.setTitle("testPuzzleNoRep");
		laa.explore();
		
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("Laa-Laa.png");
		swan.edgeDetection(20);
		swan.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroGreen();
		// testNegate();
		// testGrayscale();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizontalTopToBottom();
		// testMirrorHorizontalBottomToTop();
		//testMirrorDiagonalBottomToTop();
		//testShuffle();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		//testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
		testPuzzle();
		testPuzzleNoRep();
	}
}