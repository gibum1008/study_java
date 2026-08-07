package ex1_statement;

public class Ex1_for {
    public static void main(String[] args) {
      
        //for문 : 특정 코드를 원하는 만큼 반복하고자 할 떄
        //for( 초기식; 조건식; 증감식 ){
        // 조건식이 참일 떄 수행되는 영역
        //}
        //int i =0; //전역 변수 for문에서도 사용가능

        for( int i = 0; i <=2; i++){
             // 지역변수 탄생자체를 for문에서 생겨난 i 는 for문에서만 사용가능
            // 첫번쨰 i=0 -> 두번쨰 (조건식) 참일경우 출력 -> 세번쨰 (증감식)i++ 
            // -> 네번쨰 조건문으로 들어감 ->5번쨰 조건식이 실패 나올떄까지 반복함 

            System.out.println(i);

        }//for

        System.out.println("-----------------");

        //10-1까지 반복하는 for문

        for( int i=10; i>=1; i-- ){
            System.out.println(i);

        }//for문

        System.out.println("-----------------");

        //1-100까지 반복하는 for문을 만드는데
        //5의 배수만 출력

        for(int i =1; i<=100; i++){

            if(i % 5 == 0 ){
                System.out.println(i);

            }
            
            System.out.println("-----------------");
            
         for( i =5; i <= 100; i += 5){

                System.out.println(i);

         }//for문


        }//for문



        
    }//main
}//end
