import java.sql.Time;
import java.time.LocalTime;

public class recursiveFibo {
    public static void main(String[] args) {
        System.out.println(FiboNacci(10));
        long end = System.currentTimeMillis();
    }

    public static int FiboNacci(int n){
        if (n<2){
            return n;
        }

        return (FiboNacci(n-1)+FiboNacci(n-2));
    }
}
