package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
       
       //다중if문( else if)
       //여러개의 조건 비교가 필요한 경우 사용하는 if문 
       
       //if(조건식1){
       // 조건식 1이 참일 떄 실행되는 영역 
       //}else if(조건식2){
       //조건식 2가 참일 떄 실행되는 영역 
        //}


        int num = 50;
        String str = "";

        if(num >= 90){
            str ="A";
        }else if(num >= 80){
            str = "B";
        }else if(num >= 70){
            str ="C";
        }else if(num >= 60){
            str ="D";
        }else {
            //위의 조건식들이 모두 거짓일떄 반드시 호출되는 영역
            str = "F";
        }
        System.out.println(str);

        //나이가 20이상이면 -> 성인요금
        //14이상 20미만 -> 청소년 요금
        //8이상 14미만 -> 어린이 요금 
        //8미만 -> 유아요금

        int age =7;
        String Fee = "";

        if(age >= 20 ){
            Fee = "성인요금";
        }else if(age >= 14){
            Fee = "청소년 요금";
        }else if(age >= 8){
            Fee ="어린이 요금";
        }else{
            Fee = "유아 요금";
        }
        System.out.println(Fee);




    } //main






    }//end
    

