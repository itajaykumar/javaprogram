import java.util.Scanner;

public class EMployee {
    static float hr(float sal) {
        return (sal * 30) / 100;
    }
      static float da(float basic){
         return(basic*20)/100;
      }
   static float ta(){
      return 2000;
   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enrer the Emplyee name");
        String name = sc.next();
        System.out.println("enter the basic salary");
        float sal = sc.nextInt();
        float result=hr(sal);
        System.out.println(result);
        System.out.println("enter the income");
       float income= sc.nextInt();
        float incomeResult=tax(income);

          

    }
}
