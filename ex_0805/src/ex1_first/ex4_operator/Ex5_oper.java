package ex1_first.ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {

        //삼항(조건)연산자
        //하나의 조건식을 통해 발생하는 결과를 원하는 타임으로
        //반활할 수 있도록 하는 연산자

        int a = 10;
        int b = 15;
        int res = ++a >=b ? 100 : 200;  //조건식이 참일떄 가져가는게 100, 거짓일떄 가져가는것이 200 -> so 200
        //  조건연산자이지만 삼항연사자를 거치면 -> 정수

        System.out.println(("res : ")+res);

        int n1 =10;
        int n2 =20;
        float(n1+=n1) == n2 ? 3.14f : 5.19f; //앞에가 참 뒤에가 거짓 so 참이니 3.14 
        System.out.println(("res")+res);
                                    //실수 double ,float 있지만 float은 ㅇ오류가 난다 뒤에 f 를 안붙이면

        a= 10;
        b = 12;
        char rss3= ++a >= b || (a-8) +7 <= b && 13 -b >= 0 && (a+=b) - (a%b) > 10? '0' :'x'
        //11 12(거짓)     10   12(참)     1 (참)     23-11=12 (참) so 참
        System.out.println("res3: "+ res3);


    }//main

}//class end
