package cs101;

public class Loops {

	// Please read the instructions for each problem below,
	// and complete the full lab.

	public static void loop_a() {

		// A. convert this while loop to a FOR loop
		int a = 0;
		while (a < 5) {
			System.out.println("a: " + a);
			a++;
		}
	}

	public static void loop_b() {

		// B. convert this while loop to a FOR loop
		int b = 13;
		while (b >= 10) {
			System.out.println("b: " + b);
			b--;
		}
	}

	public static void loop_c() {

		// C. convert this for loop to a WHILE loop
		for (int c = 0; c <= 4; c++) {
			System.out.println("c: " + c);
		}
	}

	public static void loop_d() {

		// D. convert this for loop to a WHILE loop
		for (int d = 3; d < 13; d += 2) {
			System.out.println("d: " + d);
		}
	}

	public static void loop_e() {

		// E. rewrite this while loop so that it DOES NOT
		// need an if statement or a break statement
		// It should still be a while loop.
		int e = 2;
		while (e < 10) {
			if (e >= 5) {
				break;
			}
			System.out.println("e: " + e);
			e = e + 1;
		}
	}

	public static void loop_f() {

		// F. rewrite this while loop so that it DOES NOT
		// need an if statement or a break statement
		// It should still be a while loop.
		int f = 10;
		while (f >= 3) {
			if (f < 5) {
				break;
			}
			System.out.println("f: " + f);
			f--;
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
		int h1 = 0;
		while (h1 < 4) {
			System.out.println("h1: " + h1);

			int h2 = 1;
			while (h2 < 3) {
				System.out.println("h2: " + h2);

				h2++;
			}

			h1++;
		}
	}

	public static void loop_i() {

		// I. Convert both the inner and outer while loops
		// into FOR LOOPS
		int i1 = 0;
		while (i1 < 2) {
			System.out.println("i1: " + i1);

			int i2 = 5;
			while (i2 > 0) {
				System.out.println("i2: " + i2);

				i2--;
			}

			i1++;
		}
	}

	public static void loop_j() {

		// J. Convert both the inner and outer for loops
		// into WHILE LOOPS
		for (int j1 = 0; j1 < 5; j1++) {
			System.out.println("j1: " + j1);

			for (int j2 = 0; j2 < 2; j2++) {
				System.out.println("j1: " + j1);
			}
		}
	}

	public static void loop_k() {

		// K. Convert both the inner and outer for loops
		// into WHILE LOOPS
		for (int k1 = 10; k1 >= 5; k1--) {
			System.out.println("k1: " + k1);

			for (int k2 = 0; k2 < 16; k2 += 4) {
				System.out.println("k2: " + k2);
			}
		}
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

	}

}
