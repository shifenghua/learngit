/**
 * Created by Administrator on 2016/12/13.
 */
public  class FizzBuzz {
    public String evaluate(int number) {
        if(isMultipleOf3(number)){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf3(int number) {
        return number%3==0;
    }
}
