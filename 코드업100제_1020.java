import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 이건 왜안될까?
        // String number[] =sc.next().split("-");
        // int first = Integer.parseInt(number[0]);
        // int end = Integer.parseInt(number[1]);

        String value= sc.next();
        String value1=value.replaceAll("-", "");

        
        System.out.println(value1);

        sc.close();

    } 
}
