/**
 * Created by $ fenghua on 2016/12/13.
 */
public class OddEven {

    public String  printNum(){
        String number = null;
        for(int i=0;i<=100;i++) {
            number += "" +i;}
        return String.valueOf(number);
    }

    public String evaluate(int num) {
        if(isEven(num)){
            return "Even";
        }else if(isOdd(num)){
            return "Odd";
        }
        return String.valueOf(num);
    }

    private boolean isEven(int num) {
        return num%2 == 0;
    }

    private boolean isOdd(int num) {
        return num/2!=0 && num%2 == 1;
    }
}
