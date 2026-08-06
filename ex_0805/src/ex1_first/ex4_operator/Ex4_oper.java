package ex1_first.ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {

    
    //증강연산자
    //1씩 증가시키거나 1씩 감소시키는 연산자 -> 요점 1씩
    //선행증감과 후행증감의 차이를 알고 있어야 한다
    int a =10;
    System.out.println("a: "+ ++a); // 정답 : 11

    int b =10;
    System.out.println("b"+ b++);  // 후행 연산자는 지금은 적용이 안됨 다음턴부터 사용값 적용  그래서 지금은 10
    System.out.println(b); // 다음부터 적용되서 11 이 됬음

        b++; //12
        ++b; //13
        --b; //12
        b--; //12
        --b; //10
        b++; //12
        --b; //10
        b++; //10 
        --b; //10
        b++; //11
        System.out.println(++b);



    //++ 앞에 있느냐 뒤에 있느냐 따라 결과가 달라 질수 가 있다.

    
    }// main

}
