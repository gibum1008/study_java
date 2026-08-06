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



    }//main
    
}//end
