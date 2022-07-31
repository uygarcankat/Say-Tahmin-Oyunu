import java.util.Scanner;
import java.util.Arrays;



public class Prediction {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int number= (int) (Math.random()*100);
        System.out.println(number);
        int selected;
        int right=0;
        int []wrong_number= new int[5];
        boolean isWrong=false;
        boolean isWin=false;

       while(right<5){

           System.out.println("Lütfen sayı giriniz");
           selected=input.nextInt();

           if(selected==number){

               System.out.println("Tebrikler! doğru bir sayı girdiniz");
               isWin=true;
               break;
           }

           else{


               if(selected<0 || selected>99){

                   System.out.println("Girdiğiniz sayı aralık dışındadır! ");

                   if(!isWrong){

                       isWrong=true;
                       System.out.println("Bundan sonraki yapacağınız aralık dışı bir girişte kalan hakkınızda eksilme yaşanacaktır.");

                   }

                   else{

                       System.out.println("Birden çok aralık dışı giriş yaptınız");

                       right++;
                       System.out.println("Kalan hakkınız : " + (5-right));
                   }

                   continue;

               }

               else if(selected>number){

                   System.out.println("Gizli sayı daha küçük bir değer");

               }

               else {

                   System.out.println("Gizli sayı daha büyük bir değer");
               }

               wrong_number[right]=selected;
               right++;
               System.out.println("Kalan hakkınız " + (5-right));

           }
       }

        if(!isWin) {

            System.out.println("Üzgünüz Hakkınız bitmiştir");

            if(!isWrong){

                System.out.println("Tahminleriniz"+ Arrays.toString( wrong_number));

            }


        }
    }
}
