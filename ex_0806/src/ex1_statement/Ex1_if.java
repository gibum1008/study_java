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

        int n = 49; // 변수 n에 49를 저장

        String str = "안녕하세요"; // String 자료형, 문자열을 저장할 수 있음. 현재 "안녕하세요"로 초기화.
        String str2 = ""; // 위에 이미 선언되어 있기 때문에 중복 선언 주의(오류 발생). 빈 문자열로 str 초기화.

        // if문: n이 50과 같으면 아래 코드 실행
        if(n == 50){
            str = "n은 50입니다"; // n이 50이면 str에 해당 문자열 저장
        }

        // if문: n이 50이 아니면 아래 코드 실행
        if(n != 50 ){
            str = "n은 50이 아닙니다"; // n이 50이 아니면 str에 해당 문자열 저장
        }

        System.out.println(str); // str 변수의 값을 출력


    }//main
    
}
