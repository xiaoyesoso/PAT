package pat1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int nowFloor = 0;
		int sumTime = 0;
		for (int i = 0; i < n; ++i) {
			int num = in.nextInt();
			int dis = num - nowFloor;
			if (dis > 0) {
				sumTime += dis * 6 + 5;
			} else {
				sumTime += -dis * 4 + 5;
			}
			nowFloor = num;
		}
		System.out.println(sumTime);
		in.close();
	}

}
