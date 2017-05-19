package com.game.threading;

import java.util.Scanner;

public class HackerEarth2 {
	public double findHalfAreaPoint(Curve curve, double p) {
		return p;
		// YOUR CODE HERE

	}
	
	

    // DO NOT MODIFY CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			Curve c = null;
			switch (tokens[0]) {
			case "LINE":
				c = new Line(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
				break;
			case "EXP":
				c = new Exp();
				break;
			case "POWER":
				c = new Power(Double.parseDouble(tokens[1]));
				break;
			}

			if (c == null) {
				break;
			}
			HackerEarth2 t=new HackerEarth2();
			double p = 10.0d;
			double h = t.findHalfAreaPoint(c, p);
			System.out.println(Math.round(h*1000d));
		}

		scanner.close();
	}
}

	interface Curve {
		double areaUnderCurve(double x);
	}

	class Line implements Curve {
		private double m;
		private double c;

		public Line(double m, double c) {
			this.m = m;
			this.c = c;
		}

		@Override
		public double areaUnderCurve(double x) {
			return m * x + c;
		}
	}

	class Exp implements Curve {
		@Override
		public double areaUnderCurve(double x) {
			return Math.exp(x);
		}
	}

	class Power implements Curve {
		private double power;

		public Power(double power) {
			this.power = power;
		}

		@Override
		public double areaUnderCurve(double x) {
			return Math.pow(x, power);
		}
	}