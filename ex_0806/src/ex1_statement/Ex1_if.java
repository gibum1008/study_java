package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
       //제어문 - 프로그램의 흐름을 제어하는 문장
       //분기문 , 반복문 나뉨
       // 분기문 : if ,switch
       //반복문 : for, while, do-while

       //if문
       //if(조건식){
       // 조건식이 참일 떄 실행되는 영역
       //}

        int n =50;
        String str ="안녕하세요"; //String ""안에 (문자열)넣을수 있는 자료형임

        if(n != 50 ){
            str = "n은 50입니다";

        }

        System.out.println(str);


    }//main
    
}
