public class JavaStream {

    static boolean Isletter(String x){
        return(x!=null &&x!=""&& x.chars().allMatch(Character::isAlphabetic));

    }
    public static void main(String[] args) {

    String Word="JavaPrograms";

    System.out.println(JavaStream.Isletter(Word));


    }

}
