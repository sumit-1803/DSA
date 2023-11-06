import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] numb = {
                {1,2,3},
                {4,5,6},
                {7,8,9,}
        };
        for (int row = 0; row < numb.length; row++) {
            for (int col = 0; col < numb[row].length; col++) {
                System.out.print(numb[row][col] + " ");
            }
            System.out.println();
        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1932);
        list.add(1965);
        list.add(1456);
        list.add(1968);
        list.add(1789);
        list.add(2023);
        list.add(0);

        System.out.println(list);

        System.out.println(list.get(2));
        list.set(2,1957);
        System.out.println(list.get(2));
        


    }
}
