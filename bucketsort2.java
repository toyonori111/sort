import java.util.Scanner;

public class bucketsort {

	public static void Bucketsort(String[] src) {
		String[] dst = new String[src.length];

		String[] aaa = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
				"x", "y", "z" };
		int k = 0;
		for (int i = 0; i < aaa.length; i++) {

			for (int j = 0; j < src.length; j++) {
				String top = src[j].substring(0, 1);

				if (aaa[i].equals(top)) {
					dst[k] = src[j];
					k++;
				}
			}
		}

		for (int i = 0; i < dst.length; i++) {
			System.out.println(dst[i]);
		}
	}

	public static void main(String[] args) {
		// {"am","is","are","this","it"};
		Scanner scan = new Scanner(System.in);
		String Ssrc = scan.next();
		String[] src = Ssrc.split(",");
		
		Bucketsort(src);

	}

}
