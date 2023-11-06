import java.util.Random;
public class selfMadeBubbleSort {
    public static void main(String[] args) {
//        int[] x = {6,5,4,3,2,1};
        int size = 100000;
        int[] largeArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            largeArray[i] = random.nextInt(1000000); // Adjust the range as needed

        }

        for (int k : largeArray) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int i = 0; i < largeArray.length - 1; i++) {
            for (int j = 0; j < largeArray.length - 1-i; j++) {
                if(largeArray[j]>largeArray[j+1]){
                    int temp=largeArray[j];
                    largeArray[j]=largeArray[j+1];
                    largeArray[j+1]=temp;
                }
            }
        }

        for (int j : largeArray) {
            System.out.print(j + " ");
        }
    }
}
