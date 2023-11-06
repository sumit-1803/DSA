public class Patterns {
    public static void main(String[] args) {
//        starPattern();
//        numPattern();
//        blockPattern();
        reverseStarPattern();
    }
    static void starPattern(){
        for (int row = 1; row < 6; row++) {
            System.out.println();
            for (int column = 1; column <= row ; column++) {
                System.out.print("*");
            }
        }
    }

    static void reverseStarPattern(){
        for (int row = 1; row < 6; row++) {
            System.out.println();
            for (int column = 1; column<=6-row; column++) {
                System.out.print("*");

            }

        }
    }


    static void numPattern(){
        for (int row = 1; row < 6; row++) {
            System.out.println();
            for (int column = 1; column < row; column++) {
                System.out.print(column);
            }

        }
    }

    static void blockPattern(){
        for (int row = 1; row < 6; row++) {
            System.out.println();
            for (int column = 1; column <= 5 ; column++) {
                System.out.print("*");
            }
        }
    }
    static void incdecPattern(){
        for (int row = 1; row < 10; row++) {
            System.out.println();
            int num ;


        }
    }
}
