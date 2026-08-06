package ex1_first;

public class Ex2_valueType {
    public static void main(String[] args) {

        /*
        자바의 기본 자료형
        논리형: boolean.... 1bit 
        문자형: char..2byte
        정수형: byte, ..1byte -> -128 ~ 127
            short,..2byte -> -32768 ~ 32767
            int, ..4byte -> -21억~21억
             long... 8byte -> -922경~922경
    실수형: float..4.x byte -> 
            double...8.x byte -> 

            변수: 데이터를 저장하는 공간 //이름역활하는 역활
            자료형 변수명;(선언)
            변수명 = 값;(대입 )

            자료형 변수명 = 값;(초기화)

            변수선언 규칙
            1. 숫자로 시작할 수 없다.
            2._를 제외한 특수문자는 사용할 수 없다.(공백도 X)
            3. 한글로 변수 이름 짓을 수 없다.
            4.반드시 소문자 알파벳으로 시작하도록 한다
            */


        // 1. 카멜표기법(Camel Case)
        //    - 첫 글자는 소문자로 시작하고, 이후 단어의 첫 글자는 대문자로 작성합니다.
        //    - 예시: myVariableName, studentAge
        //
        // 2. 파스칼 표기법(Pascal Case)
        //    - 모든 단어의 첫 글자를 대문자로 작성합니다.
        //    - 주로 클래스 이름에 사용됩니다.
        //    - 예시: MyVariableName, StudentAge
        //
        // 3. 헝가리안 표기법(Hungarian Notation)
        //    - 변수명 앞에 자료형 또는 정보를 접두어로 붙입니다.
        //    - 예시: strName (문자열), nAge (정수), bFlag (논리형)
        //
        // 4. 스네이크 표기법(Snake Case)
        //    - 단어와 단어 사이를 밑줄(_)로 구분하며, 모두 소문자를 사용합니다.
        //    - 예시: my_variable_name, student_age


         //논리형: 참과 거짓(true, false)의 두 가지 값만을
         //저장할 수 있는 자료형

        boolean b1;// 선언
        b1 = true; // 대입
        b1 = false; // 
        //b1 =10: <- 자료형 타입이 올바르지 않기 떄문에 오류 발생
        System.out.println("b1 : "+b1 );
    
        //정수형 : 소수점이 없는 정수값만 저장하는 자료형
        byte b = 127;
        short s =32767;
        int n =5000;
        long lo = 22000000000L;

        System.out.println("b : "+b );
        System.out.println("s : "+s );
        System.out.println("n : "+n );
        System.out.println("lo : "+ lo);


    }
}
