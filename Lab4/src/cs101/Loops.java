package cs101;

public class Loops {

	// Please read the instructions for each problem below,
	// and complete the full lab.

	public static void loop_a() {

		// A. convert this while loop to a FOR loop
		for (int a = 0; a < 5; a++) {
			System.out.println("a: " + a);
		}
	}

	public static void loop_b() {

		// B. convert this while loop to a FOR loop
		for (int b = 13; b >= 10; b--) {
			System.out.println("b: " + b);

		}
	}

	public static void loop_c() {

		// C. convert this for loop to a WHILE loop
		int c = 0;
		while (c <= 4) { // need brackets, need to include 4

			System.out.println(c);
			c = c + 1; // goes at end of loop
		}

	}

	public static void loop_d() {

		// D. convert this for loop to a WHILE loop
		int d = 3;
		while (d < 13)

		{
			System.out.println(d);

			d = d + 2; // goes at end of loop
		}
	}

	public static void loop_e() {

		// E. rewrite this while loop so that it DOES NOT
		// need an if statement or a break statement
		// It should still be a while loop.
		int e = 2;
		while (e < 5) {

			System.out.println(e);
			e = e + 1; // plus 1, goes at end
		}

	}

	public static void loop_f() {

		// F. rewrite this while loop so that it DOES NOT
		// need an if statement or a break statement
		// It should still be a while loop.
		int f = 10;
		while (f >= 5) { // change condition

			{

				System.out.println("f: " + f); // goes inside while loop

				f = f - 1; // goes at end of while loop, still minus 1
			}

		}
	}

	public static void loop_g() {

		// G. rewrite this for loop so that it DOES NOT
		// need an if statement or a break statement
		// It should still be a for loop.
		for (int g = 0; g < 100; g += 1) {
			if (g > 6) {
				break;
			}
			System.out.println("g: " + g);
		}
	}

	public static void loop_h() {

		// H. Convert both the inner and outer while loops
		// into FOR LOOPS
		for (int h1 = 0; h1 < 4; h1++) { // need brackets
			System.out.println(h1);

			for (int h2 = 1; h2 < 3; h2++) {
				System.out.println(h2);

			}
		} // need to be nested

	}

	public static void loop_i() {

		// I. Convert both the inner and outer while loops
		// into FOR LOOPS
		for (int i1 = 0; i1 < 2; i1++) {
			System.out.println("i1: " + i1);

			for (int i2 = 5; i2 > 0; i2--) { // still i2--, as in original while loop
				System.out.println("i2: " + i2);

			}

		}
	}

	public static void loop_j() {

		// J. Convert both the inner and outer for loops
		// into WHILE LOOPS
		int j1 = 0;
		while (j1 < 5) {

			System.out.println(j1);

			int j2 = 0;
			while (j2 < 2) { // need brackets
				System.out.println(j2);
				j2 = j2 + 1;
			}

			j1++; // goes at end of while loop, and this increment doesn't change from the
					// original loop
		}
	}

	public static void loop_k() {

		// K. Convert both the inner and outer for loops
		// into WHILE LOOPS
		int k1 = 10;
		while (k1 >= 5) { // condition doesn't change

			System.out.println(k1);

			int k2 = 0;
			while (k2 < 16) { // need brackets

				System.out.println(k2);
				k2 = k2 + 4; // correct increment, goes at the end
			}

			k1 = k1 - 1; // goes at end, doesn't change
		}
	}

	public static void loop_l() {

		// L. Write a WHILE loop that prints out the numbers 0 to 10 (inclusive)
		// in ascending order (0,1,2,....,10)
		// Use a single print statement inside a loop
		// You do NOT need to label these with `l`
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a = a + 1;
			// don't need a break! This should fully run.
		}
		System.out.println(a);
	}

	public static void loop_m() {

		// M. Write a FOR loop that prints out the numbers 10 to 5 (inclusive)
		// in descending order (10,9,8,...,5)
		// Use a single print statement inside a loop
		// You do NOT need to label these with `m`
		int b = 10;
		while (b > 4) { // goes to 5
			System.out.println(b);
			b = b - 1; // goes down
		} // needs brackets

	}

	public static void main(String[] args) {

		// Feel free to comment out certain lines to make it easier
		// to debug your code here
		Loops.loop_a();
		Loops.loop_b();
		Loops.loop_c();
		Loops.loop_d();
		Loops.loop_e();
		Loops.loop_f();
		Loops.loop_g();
		Loops.loop_h();
		Loops.loop_i();
		Loops.loop_j();
		Loops.loop_k();
		Loops.loop_l();
		Loops.loop_m();

	}

}
