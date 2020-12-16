import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,y,y1;
        System.out.print("Введите x:");
        x=in.nextDouble();
        System.out.print("Введите y:");
        y=in.nextDouble();
        y1=Math.sqrt(1-Math.pow(x,2));
        if /*((x>=-1)&&(x<=1))*/
        ((x>1)||(x<-1))
        {
            System.out.println("Неправильный Х");
            System.exit(0);
        }
        if (x<=1)
        {
            if (y1<=y)
            {
                System.out.println("y принадлежит области");
            }
            else
            {
                System.out.println("y не принадлежит области");
            }

        }
        else if (x>=-1)
        {
            if (y1>=y)
            {
                System.out.println("y принадлежит области");
            }
            else
            {
                System.out.println("y не принадлежит области");
            }
        }
    }
}