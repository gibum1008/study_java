package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {
      
        //키보드에서 값을 받기 위한 scanner객체 - 대문자는 클래스다.
        Scanner sc = new Scanner( System.in );

        System.out.print("정수 : ");
        int n =sc.nextInt(); //nextint는 정수
        System.out.println("값 " + n);

        System.out.print("문자열 : "); //println ->enter, print -> 옆에 출력
        String s =sc.next(); //next는 모두 문자열로 바꾼다.
        System.out.println("값 : "+ s);







    }//main
    
}//end
