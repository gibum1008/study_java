package ex1_statement;

import javax.print.DocFlavor.STRING;

public class Ex2_if_else {
    public static void main(String[] args) {

        // if-else문 : 하나의 조건식에 대해서
        // 참일떄와 거짓일 떄를 모두 판단할 수 있는 제어문
        int n = 40;
        String str = "";

        if (++n >= 50) {
            // 조건식이 참일 떄 실행되는 영역
            str = "n은 50 이상의 수 ";

        } else {
            // 조건식이 거짓일 떄 실행되는 영역
            str = "50 미만의 수 ";

        } /*
           
        int age = 30; 
        str = "";
        str = age >= 30 ? "드실만큼... " : "더 드셔도..";
        System.out.println(str);
        */
        }

        

        //위의 30 어쩌고 코드를 
        //삼항연산자로 구현

    }// main


