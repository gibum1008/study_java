package ex_work;

public class Ex1_work {
    public static void main(String[] args) {
      
        //나이가 15세 이상이거나, 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        int age =14;
        int height = 160;
        
        String str = "";

        if(age >=15 || height >= 150 ){
            str = "탑승 가능";
        }else {
            str ="탑승 불가";

        }
        System.out.println(str);
        //1번 문제
        age =20;
        String str = "";
                
        if(age >= 20){
            str = "성인입니다";
        }
        System.out.println(str);

        //2번 문제
        int score = 70;
        String mo ="";

        if(score >=60){
            mo = "합격";
        }

        //3번 문제
        int momey =12000;
        String k ="";

        if(momey >= 10000){
            k ="구매가능";
        }
        //6번 문제
        age = 22;
        String kk ="";

        if(age>=20){
            kk="성인";
        }else(kk = "미성년자");
        


    }//main
    
}//end
