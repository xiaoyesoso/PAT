package pat1042;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class item {
	public item(String myname) {
		name = myname;
	}

	public String name;
	public int order;
};

class MyCmp implements Comparator<item> {

	@Override
	public int compare(item o1, item o2) {
		// TODO Auto-generated method stub
		if (o1.order > o2.order) {
			return 1;
		} else if (o1.order < o2.order) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		item[] items = new item[54];
		for (int i = 1; i <= 13; ++i) {
			items[i - 1] = new item("S" + i);
		}

		for (int i = 1; i <= 13; ++i) {
			items[i + 12] = new item("H" + i);
		}

		for (int i = 1; i <= 13; ++i) {
			items[i + 25] = new item("C" + i);
		}

		for (int i = 1; i <= 13; ++i) {
			items[i + 38] = new item("D" + i);
		}

		items[52] = new item("J1");
		items[53] = new item("J2");

		int[] orders = new int[54];

		for (int i = 0; i < 54; ++i) {
			orders[i] = in.nextInt();
		}

		MyCmp cmp = new MyCmp();

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 54; ++j) {
				items[j].order = orders[j];
			}

			Arrays.sort(items, cmp);
		}

		for (int i = 0; i < 54; ++i) {
			if (i == 0) {
				System.out.print(items[i].name);
			} else {
				System.out.print(" " + items[i].name);
			}
		}
		in.close();
	}

}