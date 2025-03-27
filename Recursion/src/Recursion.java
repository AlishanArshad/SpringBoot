public class Recursion {
    public static void main(String[] args) {
        printNum(5);
        System.out.println(" ");
        printFwd(1);

    }
    public static void printNum(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void printFwd(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        printFwd(n+1);

    }
}