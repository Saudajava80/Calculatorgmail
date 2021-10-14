package Lexicon.sauda.se;

/*
  Hello world!

 */
         import java.util.Scanner;
         import java.util.concurrent.atomic.AtomicReference;

public class App 
{
    private static final AtomicReference<Object> NumberFormatException=new AtomicReference<Object>();

    public static void main(String[] args, Object e)
    {
        boolean aslongAS =true;
        double Number1 =0, Number2=0;
        String reslut =""; String reslut2="";
        Scanner input =new Scanner(System.in);

        String reslut3="";
        while (aslongAS){
            {
                System.out.println("Enter a number");
                Number1 = Double.parseDouble(input.nextLine());
                System.out.println("Enter expression + - * /");
                reslut =input.nextLine();
                System.out.println("Enter a number");
                Number2 = Double.parseDouble(input.nextLine());

            }catch (NumberFormatException) new void[]{
                    System.out.println("incorrect valuse"),
            }
            switch (reslut){
                case "+":
                    System.out.println(addition(Number1,Number2));
                    break;
                case "-":
                    System.out.println(subtraction(Number1,Number2));
                    break;
                case "*":
                    System.out.println(multiplication(Number1,Number2));
                    break;
                case "/":
                    System.out.println(Division(Number1,Number2));
                    break;
                default:
                    System.out.println("Unknown error.What happened?");
                    break;
            }
            System.out.println("continue calculating? Type:yes or no?");
            reslut2 =input.nextLine();
            if(reslut2.contains("Yes")|| reslut2.contains("yes")){
                System.out.println("Prees Ok");
                reslut3=input.nextLine();
            }
            if(reslut2.contains("No")|| reslut2("no")){
                System.out.println("GOOD BYE!");
                aslongAS=false;
            }
        }
    }

    private static boolean reslut2(String no) {
    }

    public static double addition(double Number1,double Number2)
    {
        return Number1+Number2;
    }
    public static double subtraction(double Number1,double Number2)
    {
        return Number1-Number2;
    }
    public static double multiplication(double Number1,double Number2)
    {
        return Number1*Number2;
    }
    public static double Division(double Number1,double Number2)
    {
        if (Number2==0){
            System.out.println("You know that you cant divide a number with 0");
        }
        return Number1/Number2;
    }

    public static Object getNumberFormatException() {
        return NumberFormatException;
    }

    public static void setNumberFormatException(Object numberFormatException) {
        NumberFormatException.set(numberFormatException);
    }
}
