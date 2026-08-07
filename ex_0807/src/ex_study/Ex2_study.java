package ex_study;

import java.util.Scanner;

public class Ex2_study {
    public static void main(String[] args) {
      
      //문제 1)  
      //나이 : 14
      //키 : 140
      //탑승불가
      //키보드에서 나이와 키를 입력을 받는다
      //나이가 15세 아성아고너 카거 150cm이상이면 탑승 가능
      //그렇지 않으면 탑승 불가를 출력

        
       

        Scanner sc = new Scanner( System.in );

        System.out.println( "age :");
        int age = sc.nextInt();

        System.out.println("hight : ");
        int hight = sc.nextInt();

        if(age>=15 || hight>=150){
            System.out.println("탑승 가능 ");

        }else { 
            System.out.println("탑승 불가");
        }

        
        
        
       






        //문제 2
        //수1: 10 
        //수2: 20
        //연산자 : +
        //10 + 20 =30
        //#연산자는 스캐너의 .next() 사용하자

       // Scanner sc = new Scanner( System.in );

        //System.out.println("수 1 :");
        //int su1 = sc.nextInt();

        //System.out.println("수 2 : ");
        //int su2 = sc.nextInt();
   
        //System.out.println("연산자 : ");
        //String str = sc.next();

        //switch (str) {
           // case"+" :
             //   System.out.println(su1 + "+" + su2 +"=" +(su1+su2));
                
              //  break;
            
            //case "-":
              //  System.out.println(su1 + "-"+ su2 +"=" +(su1 - su2));    
               // break;
            
            //case "*":
              //  System.out.println(su1 + "*" +su2 +"=" +(su1*su2) );
               // break;

            //case"/":
              //  System.out.println(su1 + "/" +su2 +"=" +((float)su1/su2));    

            //default:
              //  System.out.println("오류입니다");
               // break;
       // }
    
   
   
   
   
   
   
   
    }//main
    
}//end
