import java.util.*;

class calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y,a,s,m,d,choice;
        System.out.println("Enter a num");
        x=sc.nextInt();
        System.out.println("Enter a num");
        y=sc.nextInt();
        
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");

        System.out.println("Enter your choice:");
        choice=sc.nextInt();

        if(choice==1)
        {
            a=x+y;
            System.out.println("Addition of two num is:"+a);
        }
        else if(choice==2)
        {
            s=x-y;
            System.out.println("substraction of two num is:"+s);
        }
        else if(choice==3)
        {
            m=x*y;
            System.out.println("Multiplication of two num is:"+m);
        }
        else if(choice==4)
        {
            d=x/y;
            System.out.println("Division of two num is:"+d);
        }  
    }
}