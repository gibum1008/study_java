package ex_work;

import java.util.Scanner;

public class Ex3_work3 {

    public static void main(String[] args) {
      //나이 : 14
      //키 : 140
      //탑승불가
      //키보드에서 나이와 키를 입력을 받는다
      //나이가 15세 아성아고너 카거 150cm이상이면 탑승 가능
      //그렇지 않으면 탑승 불가를 출력

      Scanner sc =new Scanner(System.in);

      System.out.print("나이 입력");
      int age = sc.nextInt(); 

      System.out.print("키 입력");
      int hight = sc.nextInt();

      String str ="";

      if(age >=15 || hight >= 150 ){
        str = "탑승 가능";
    }else {
        str ="탑승 불가";
    }
        System.out.println(str);

        
        


    }//main
    
}//end
