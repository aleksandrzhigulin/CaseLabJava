public class Main {

  public static void main(String[] args) {
    int a = 2;
    int b = 5;

    System.out.println("Start a: " + a + ", b: " + b);

    int[] result = swap(a,b);

    a = result[0];
    b = result[1];

    System.out.println("Result a: " + a + ", b: " + b);
  }

  public static int[] swap(int a, int b) {
    a = a  + b;
    b = a - b;
    a = a - b;
    return new int[]{a,b};
  }
}
