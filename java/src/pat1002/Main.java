package pat1002;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Comparator;
import java.util.Map;

class unit {
	public int n;
	public double a;
};

public class Main {
	public static void main(String[] args) {
		Map<Integer, Double> myMap = new TreeMap<Integer, Double>(
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2 - o1;
					}
				});
		Scanner in = new Scanner(System.in);
		for (int cnt = 0; cnt < 2; ++cnt) {
			int num = in.nextInt();
			for (int i = 0; i < num; ++i) {
				int n = in.nextInt();
				double a = in.nextDouble();
				if (myMap.containsKey(n))
					myMap.put(n, myMap.get(n) + a);
				else
					myMap.put(n, a);
			}
		}
		Vector<unit> vv = new Vector<unit>();
		for (Map.Entry<Integer, Double> entry : myMap.entrySet()) {
			if (entry.getValue() != 0) {
				unit myUnit = new unit();
				myUnit.n = entry.getKey();
				myUnit.a = entry.getValue();
				vv.add(myUnit);
			}
		}
		System.out.print(vv.size());
		for (int i = 0; i < vv.size(); ++i) {
			System.out.printf(" %d %.1f", vv.get(i).n, vv.get(i).a);
		}
		System.out.println();
		in.close();
	}

}
