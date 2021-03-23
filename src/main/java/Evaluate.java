import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args){
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();


        Scanner sc=new Scanner(System.in);
        String str=null;
        System.out.print("请输入任意字符:");
        str=sc.nextLine();

        String[] strArr = str.split(" ");




        System.out.println("你输入的字符为:"+str);


        for (String sstr: strArr) {
            System.out.println(sstr);
        }
    }

}
