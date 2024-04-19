import java.util.Scanner;

public class Input {
    public static int Int(){
        Scanner scan = new Scanner(System.in);
        int INT = scan.nextInt();
        return INT;
    }
    public static int Int(String print){
        System.out.println(print);
        Scanner scan = new Scanner(System.in);
        int INT = scan.nextInt();
        return INT;
    }


    public static float Flt(){
        Scanner scan = new Scanner(System.in);
        float FLT = scan.nextFloat();
        return FLT;
    }
    public static float Flt(String print){
        System.out.println(print);
        Scanner scan = new Scanner(System.in);
        float FLT = scan.nextFloat();
        return FLT;
    }



    public static String Str(){
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();
        return STR;
    }
    public static String Str(String print){
        System.out.println(print);
        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine();
        return STR;
    }
}