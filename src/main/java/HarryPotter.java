/**
 * Created by $ fenghua on 2016/12/13.
 */
public class HarryPotter {
    public String printPrice(int num) {
        if(num==1){
            return "8 EUR";
        }else if(num==2){
            return num*8*0.95+"EUR";
        }else if(num==3){
            return num*8*0.9+"EUR";
        }else if(num==4){
            return num*8*0.8+"EUR";
        }else if(num==5){
            return num*8*0.75+"EUR";
        }
        return null;
    }
}
