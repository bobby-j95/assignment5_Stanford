import java.io.*;

/*
 * Created By: Robert Johns Jr.
 */
public class MidtermScores {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\MeritAmerica\\Java\\Assignment5_Stanford\\src\\MidTermScores.txt");
			FileInputStream fileStream = new FileInputStream(f);
			InputStreamReader input = new InputStreamReader(fileStream);
			BufferedReader rd = new BufferedReader(input);
			String line = rd.readLine();
			int ones = 0;
			int tens = 0;
			int twenties = 0;
			int thrities = 0;
			int fourties = 0;
			int fifties = 0;
			int sixties = 0;
			int seventies = 0;
			int eighties = 0;
			int ninties = 0;
			int hundred = 0;
			while (true) {
				if (line == null) break;
				int temp = Integer.parseInt(line);
				if ((temp >= 0) && (temp < 10)) {
					ones++;
				} else if ((temp >= 10) && (temp < 20)) {
					tens++;
				} else if ((temp >= 20) && (temp < 30)) {
					twenties++;
				} else if ((temp >= 30) && (temp < 40)) {
					thrities++;
				} else if ((temp >= 40) && (temp < 50)) {
					fourties++;
				} else if ((temp >= 50) && (temp < 60)) {
					fifties++;
				} else if ((temp >= 60) && (temp < 70)) {
					sixties++;
				} else if ((temp >= 70) && (temp < 80)) {
					seventies++;
				} else if ((temp >= 80) && (temp < 90)) {
					eighties++;
				} else if ((temp >= 90) && (temp < 100)) {
					ninties++;
				} else {
					hundred++;
				}
				line = rd.readLine();
			}
			rd.close();
			System.out.print("0-9: ");
			for (int x = 0; x < ones; x++) {
				System.out.print("* ");
			}

			System.out.print("\n10-19: ");
			for (int x = 0; x < tens; x++) {
				System.out.print("* ");
			}

			System.out.print("\n20-29: ");
			for (int x = 0; x < twenties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n30-39: ");
			for (int x = 0; x < thrities; x++) {
				System.out.print("* ");
			}

			System.out.print("\n40-49: ");
			for (int x = 0; x < fourties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n50-59: ");
			for (int x = 0; x < fifties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n60-69: ");
			for (int x = 0; x < sixties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n70-79: ");
			for (int x = 0; x < seventies; x++) {
				System.out.print("* ");
			}

			System.out.print("\n80-89: ");
			for (int x = 0; x < eighties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n90-99: ");
			for (int x = 0; x < ninties; x++) {
				System.out.print("* ");
			}

			System.out.print("\n100: ");
			for (int x = 0; x < hundred; x++) {
				System.out.print("* ");
			}
		} catch (IOException ex) {
			System.out.println("bad file read");
		}
	}
}
