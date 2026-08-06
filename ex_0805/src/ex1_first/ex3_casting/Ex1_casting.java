package ex1_first.ex3_casting;

public class Ex1_casting {
    public static void main(String[] args) {
        //casting(형변환)
        //1. 프로모션
        // - 큰 자료형에 작은 자료형을 대입하는 것(자동)
        double d1 = 100.5;//8 byte
        int n1 = 200; // 4byte
        d1 = n1;
        System.out.println("d1 :"+ d1); // 정답 d1: 200.0

        int n2 = 100; //4byte
        char ch ='A';//2byte
        n2 = ch; // 아스키코드로 65로 변경  -> 타임이 달라도 
        System.out.println("n2 :"+ n2); // 정답 n2:65




    }
    
}
