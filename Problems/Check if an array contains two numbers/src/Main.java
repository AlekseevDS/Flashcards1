import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt(); // The first line contains the size of an array.
        int[] arr = new int[len];
        int n;
        int m;
        boolean result = false;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        n = scan.nextInt();
        m = scan.nextInt();
        ArrayList<Integer> placeOfN = searchList(arr, n);
        ArrayList<Integer> placeOfM = searchList(arr, m);

        for (int i = 0; i < placeOfN.size(); i++){
            for (int c = 0; c < placeOfM.size(); c++) {
                if (placeOfN.get(i) == placeOfM.get(c) + 1 || placeOfN.get(i) == placeOfM.get(c) -1) {
                    result = true;
                    break;
                }
            }

        }
        System.out.println(result);
    }

    public static ArrayList<Integer> searchList(int[] arrName, int num) {
        ArrayList<Integer> place = new ArrayList<Integer>();
        int count = -1;
        for(int i: arrName){
            count = count + 1;
            if (i == num) {
                place.add(count);
            }
        }
        return place;
    }

}