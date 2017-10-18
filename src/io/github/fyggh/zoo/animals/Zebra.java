package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

public class Zebra {
    double x, y;
    public Zebra(int xParam, int yParam) {
        x = (double) xParam;
        y = (double) yParam;
    }
    //Key points
    double matWidth = 800;
    double matHeight = 600;
    double length = 120;
    double shoulderX = x + matWidth/4;
    double shoulderY = y + matHeight/2;
    double rearX = shoulderX + length;
    double rearY = y + matHeight/2;
    double neckAngle = 2*Math.PI/3;
    //Basic utility functions here
    private double pointSlope(double pointX, double pointY, double slope, double x) {
    	return slope*(x-pointX) + pointY;
    }
    private double between(double a1, double a2, double dist) {
    	return a2*dist + a1*(1-dist);
    }
    private double smallestGreater(double min, double[] arr1) {
        double lowest = 1000000000;                                    //This is really dumb. It will give you bugs later on.
        if (Double.isNaN(min)) {
            min = 0;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < lowest && arr1[i] > min) {
                lowest = arr1[i];
            }
        }
        return lowest;
    }
    private double[] shorten(double[] arr1) {
        int zeros = 0;
        //int skips = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1000000000) {
                zeros++;
            }
        }
        double[] returnArr = new double[arr1.length - zeros];
        for (int i = 0; i < returnArr.length; i++) {
            if (arr1[i] != 1000000000) {
                returnArr[i] = arr1[i];
            }
        }
        return returnArr;
    }
    private double[] append(double[] arr1, double value) {
        double[] arr2 = new double[arr1.length+1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = value;
        return arr2;
    }
    /*private double[] integrate(double[] addY, double[] subtractY) {
        double[] finalY = new double[addY.length+subtractY.length];        //All of the ones in finaly flip. They are inverting points.
        for (int i = 0; i < finalY.length; i++) {
            double s = smallestGreater(finalY[finalY.length-1], subtractY);
            if (i%2>0 || (smallestGreater(s, subtractY) == 0 && smallestGreater(s, addY) == 0) ) {
                double a = smallestGreater(finalY[finalY.length-1], addY);
                if (a>s) {
                    finalY = append(finalY, a);
                }
                else {
                    finalY = append(finalY, s);
                }
            }
            else {
                finalY = append(finalY, s);
            }
        }
        return finalY;
    }
    private double[] integrate(double[] addY, double[] subtractY) {
        double[] finalY = new double[2];        //All of the ones in finaly flip. They are inverting points.
        for (int i = 0; ; i++) {
            double s = smallestGreater(finalY[finalY.length-1], subtractY);
            if (i%2>0 || (smallestGreater(s, subtractY) == 0 && smallestGreater(s, addY) == 0) ) {
                double a = smallestGreater(finalY[finalY.length-1], addY);
                if (a>s) {
                    finalY = append(finalY, a);
                }
                else {
                    finalY = append(finalY, s);
                }
            }
            else {
                finalY = append(finalY, s);
            }
            if (smallestGreater(s, subtractY) == 0 && smallestGreater(s, addY) == 0) {
                break;
            }
        }
        return finalY;
    }*/
    private double[] integrate(double[] addY, double[] subtractY) {
        double[] finalY = new double[addY.length + subtractY.length];        //All of the ones in finaly flip. They are inverting points.
        if ( smallestGreater(0, addY) < smallestGreater(0, subtractY) ) {
            finalY[0] = smallestGreater(0, addY);
        }
        else {
            finalY[0] = smallestGreater(0, subtractY);
        }
        for (int i = 1; i < finalY.length; i++) {
            double s = smallestGreater(finalY[i-1], subtractY);
            if (i%2>0 || (smallestGreater(s, subtractY) == 0 && smallestGreater(s, addY) == 0) || i == 0) {
                double a = smallestGreater(finalY[i-1], addY);
                if (a<s) {
                    finalY[i] = a;
                }
                else {
                    finalY[i] = s;
                }
            }
            else {
                finalY[i] = s;
            }
        }
        return shorten(finalY);
    }
    private double[] combine(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        return arr3;
    }
    //Level one functions here
    private double foot1(double x, boolean inverse) {
    	return belly(shoulderX, false) + length/2;
    }
    private double foot2(double x, boolean inverse) {
    	return belly(rearX, false) + length/2;
    }
    private boolean foot1Req(double x, boolean inverse) {
    	return Math.abs(x - shoulderX) < 5;
    }
    private boolean foot2Req(double x, boolean inverse) {
    	return Math.abs(x - rearX) < 5;
    }
    
    private double head(double x, boolean inverse) {
    	double neckLength = length*2/3;
    	double headRadius = length/3;
    	double headX = shoulderX + Math.cos(neckAngle)*neckLength;
    	double headY = shoulderY - Math.sin(neckAngle)*neckLength;
    	double headAngle = Math.acos((x - headX)/headRadius);
    	System.out.println(headY - Math.sin(headAngle)*headRadius);
    	return headY - Math.sin(headAngle)*headRadius;
    }
    private double chin(double x, boolean inverse) {
    	double neckLength = length*2/3;
    	double headX = shoulderX + Math.cos(neckAngle)*neckLength;
    	double headY = shoulderY - Math.sin(neckAngle)*neckLength;
    	System.out.println(headY);
    	return pointSlope(headX, headY, -0.3, x);
    }
    
    private double back(double x, boolean inverse) {
        return shoulderY-length/3.5;
    }
    /*private double belly(double x, boolean inverse) {
        return shoulderY+length/3.5;
    }*/
    private double belly(double x, boolean inverse) {
    	double changeX = between(shoulderX, rearX, 0.7);
    	if ( x < changeX ) {
    		return pointSlope(shoulderX, shoulderY+length/3.5, -0.3, x);
    	}
    	else {
    		double changeY = pointSlope(shoulderX, shoulderY+length/3.5, -0.3, changeX);
    		return pointSlope(changeX, changeY, 1, x);
    	}
    }
    private boolean bodyReq(double x, boolean inverse)
    {
        if ( (x > shoulderX && x < rearX)||(x < shoulderX && x > rearX) ) {
            return true;
        }
        else {
            return false;
        }
    }
    //Level two functions here
    private double[] foot2(double x) {
    	double[] addY = {belly(x, false), foot2(x, false)};
        double[] subtractY = new double[0];
        if (foot2Req(x, false) == true) {
            return integrate(addY, subtractY);
        }
        else {
            return new double[0];
        }
    }
    private double[] foot1(double x) {
    	double[] addY = {belly(x, false), foot1(x, false)};
        double[] subtractY = new double[0];
        if (foot1Req(x, false) == true) {
            return integrate(addY, subtractY);
        }
        else {
            return new double[0];
        }
    }
    private double[] head(double x) {
        double[] subtractY = {head(x, false), chin(x, false)};
    	double[] addY = new double[0];
    	return integrate(addY, subtractY);
    }
    private double[] body(double x) {
        double[] addY      = {back(x, false), belly(x, false)};
        double[] subtractY = new double[0];
        if (bodyReq(x, false) == true) {
            return integrate(addY, subtractY);
        }
        else {
            return new double[0];
        }
    }
    //Big important level three function (and associated utility functions)
    private void level3foot2(Graphics2D g2) {
    	double stripeWidth = 2;
    	for (double drawX = x; drawX < x + matWidth; drawX += stripeWidth*2) {
    		stripePainter(drawX, foot2(drawX), stripeWidth, g2);
    	}
    }
    private void level3foot1(Graphics2D g2) {
    	double stripeWidth = 2;
    	for (double drawX = x; drawX < x + matWidth; drawX += stripeWidth*2) {
    		stripePainter(drawX, foot1(drawX), stripeWidth, g2);
    	}
    }
    private void level3Head(Graphics2D g2) {
    	double stripeWidth = 2;
    	for (double drawX = x; drawX < x + matWidth; drawX += stripeWidth*2) {
    		stripePainter(drawX, head(drawX), stripeWidth, g2);
    	}
    }
    private void stripePainter(double drawX, double[] yValues, double stripeWidth, Graphics2D g2) {
        Rectangle stripe;
        for (int i = 0; i < yValues.length - 1; i+=2) {
            stripe = new Rectangle((int) drawX, (int) yValues[i], (int) stripeWidth, (int) (yValues[i+1] - yValues[i]));
            g2.draw(stripe);
            g2.fill(stripe);
        }
    }
    private void level3Body(Graphics2D g2) {
    	double stripeWidth = 3;
        for (double drawX = x; drawX < x + matWidth; drawX += stripeWidth*2) {
            stripePainter(drawX, body(drawX), stripeWidth, g2);
        }
    }
    //MAIN DRAW FUNCTION
    public void draw(Graphics2D g2) {
    	g2.setColor(Color.black);
    	level3foot2(g2);
    	level3foot1(g2);
    	level3Body(g2);
    	level3Head(g2);
    	double[] a = new double[] {9, 8, 7, 1000000000, 1000000000};
    	System.out.println( shorten(a).length );
    }
}
