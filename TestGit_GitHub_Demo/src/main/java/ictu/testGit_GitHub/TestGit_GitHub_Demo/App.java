package ictu.testGit_GitHub.TestGit_GitHub_Demo;

/**
 * Hello world!
 *
 */
public class App {
	private int x;
	private int y;
	public int z;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int x = 10;
		int y = 20;
		int z=90;
		System.out.println("Ket qua " + x + " + " + y + " = " + cong(x, y,z));
	}

	public static int cong(int x, int y, int z) {
		return x + y+z;
	}
	
	public static int tru(int x, int y, int z) {
		return x - y-z;
	}
	
	public static int nhan(int x, int y, int z) {
		return x*y*z;
	}
}
