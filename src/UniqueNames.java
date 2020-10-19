import java.util.*;

/*This program lets the user input names into a list.
 * If the list already has that name then it isn't added to the list.
 * After all of that, it outputs all names.
 * Created By: Robert Johns Jr.
 */
public class UniqueNames {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		// System.out.print("Input name: ");
		// names.add(s.next());
		while (true) {
			System.out.print("Input name: ");
			String n = s.nextLine();
			if (n.equals("")) {
				break;
			} else {
				if (!names.contains(n)) {
					names.add(n);
				}
			}
		}
		System.out.println("Names in the ArrayList: ");
		for (String z : names) {
			System.out.println(z);
		}
	}

}
