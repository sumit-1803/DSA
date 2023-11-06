public class findCharInString {
    public static void main(String[] args) {
        String name = "Sumit";
        char target = 'm';
        System.out.println(searchS( name, target));
    }

    static boolean searchS(String name , char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
