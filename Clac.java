import java.util.Scanner;
class Calc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1:");
        int n1=sc.nextInt();
        System.out.println("Enter a operator(+,-,x,/):");
        char ch=sc.next().charAt(0);
        System.out.println("Enter a num2:");
        int n2=sc.nextInt();
        switch(ch){
            case '+':
                System.out.println("n1+n2="+(n1 + n2));
                break;
            case '-':
                System.out.println("n1-n2="+(n1 - n2));
                break;
            case 'x':
                System.out.println("n1xn2="+(n1 * n2));
            case '/':
                System.out.println("n1/n2="+(n1/n2));
                break;
            default:
                System.out.println("Invalid operator entered.");
        }
    } 
}
