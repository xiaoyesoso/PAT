import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    in.close();
    int c = a + b;
    String str = Integer.toString(c);
    for (int i = str.length() - 3; i > 0; i = i - 3) {
      if (!(i == 1 && c < 0))
        str = str.substring(0, i) + ','+ str.substring(i, str.length());
    }
    System.out.println(str);
  }
}
