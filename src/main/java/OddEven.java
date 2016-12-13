/**
 * Created by $ fenghua on 2016/12/13.
 */
public class OddEven {
    public String evaluate(int num) {
        if(isOdd(num)){
            return "Odd";
        }else if(isEven(num)){
            return "Even";
        }
        return String.valueOf(num);
    }

    private boolean isEven(int num) {
        return num%2==0;
    }

    private boolean isOdd(int num) {
        return num%2==1;
    }
}
