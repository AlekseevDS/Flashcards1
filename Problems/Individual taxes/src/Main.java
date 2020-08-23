import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfComp = scan.nextInt();
        int[] incomeComp = new int[numOfComp];
        int[] taxesComp = new int[numOfComp];

        for (int i = 0; i < incomeComp.length; i++) {
            incomeComp[i] = scan.nextInt();
        }
        for (int i = 0; i < taxesComp.length; i++) {
            taxesComp[i] = scan.nextInt();
        }
        double[] perComp = calkPer(incomeComp, taxesComp);
        System.out.println(numMaxComp(perComp));
    }

    public static double[] calkPer(int[] inComp, int[] per) {
        double[] calkPerComp = new double[inComp.length];
        for (int i = 0; i < per.length; i++) {
            calkPerComp[i] = inComp[i] * per[i] / 100d;
        }
        return calkPerComp;
    }

    public static int numMaxComp(double[] allComp) {
        double values = 0;
        int index = 0;
        int num = 0;
        for (double ch : allComp) {
            index++;
            if (ch > values) {
                values = ch;
                num = index;
            }
        }
        return num;
    }
}
