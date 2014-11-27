import java.util.Scanner;

public class Forelesning {
    public static void main(String[] args) {
        int variabel = test(5, 10);
        System.out.println(variabel);

        System.out.println(test(5, 10));

        String s = "Spørsmål 1";
        System.out.println(sporKarolineOmNoe(s));
        // ...
        String sporsmaal = "Spørsmål 2";
        System.out.println(sporKarolineOmNoe(sporsmaal));
        System.out.println(sporKarolineOmNoe("Spørsmål 3"));
    }

    public static int test(int i /* 5 */, int j /* 10 */) {
        return i + j;
    }

    public static String sporKarolineOmNoe(String sporsmaal) {
        System.out.println(sporsmaal);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

}
