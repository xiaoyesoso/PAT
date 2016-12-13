package pat1005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strarr[] = { "zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine" };
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int NumSum = 0;
		for (int i = 0; i < str.length(); ++i) {
			NumSum += str.charAt(i) - '0';
		}
		String StrSum = String.valueOf(NumSum);
		for (int i = 0; i < StrSum.length(); ++i) {
			if (i == 0)
				System.out.print(strarr[StrSum.charAt(i) - '0']);
			else
				System.out.print(" " + strarr[StrSum.charAt(i) - '0']);
		}
		in.close();
	}

}
