import java.io.*;
import java.util.*;

/*This program reads from a file and prints 3 values:
 * the number of words, number of characters, and lines in the file.
 * After that it prints those 3 values for the user.
 * Created By: Robert Johns Jr.
 */
public class WordCount {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\MeritAmerica\\Java\\Assignment5_Stanford\\src\\Shakespeare.txt");
			FileInputStream fileStream = new FileInputStream(f);
			InputStreamReader input = new InputStreamReader(fileStream);
			BufferedReader rd = new BufferedReader(input);
			String line = rd.readLine();
			int wordCount = 0;
			int characterCount = 0;
			int lineCount = 0;

			while (true) {
				if (line == null) break;
				lineCount++;
				characterCount += line.length();
				for (String x : line.split("( )|(')")) {
					wordCount++;
				}
				line = rd.readLine();
			}
			System.out.println(
					"Lines = " + lineCount + "\n" + "Words = " + wordCount + "\n" + "Characters = " + (characterCount+1));
			rd.close();
		} catch (IOException ex) {
			System.out.println("bad file read");
		}
	}
}
