/**
 * Created by Administrator on 2016/12/13.
 */
public  class FizzBuzz {
    public String evaluate(int number) {
        if(number==3){
            return "Fizz";
        }else if(number==5){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
