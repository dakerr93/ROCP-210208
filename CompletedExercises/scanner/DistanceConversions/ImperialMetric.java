import java.util.Scanner;

public class ImperialMetric {
	private static Scanner sc = new Scanner(System.in);

	// Ex 3. User Inputs - convert Distances
	public static void main(String args[]) {
		ImperialMetricHelper helper = new ImperialMetricHelper();
		helper.convert(sc);
	}

}