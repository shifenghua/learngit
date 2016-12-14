/**
 * Created by $ fenghua on 2016/12/13.
 */
public class HarryPotter {

    private double sum = 0;
    public double printPrice(int[] num) {

        if(num[0] != 0){
             sum = num[0]*5*8*0.75;
        }
        if(num[1] != 0 ){
            for(int i=0;i<5;i++){
                num[i]= num[i]- num[0];
            }
                sum=sum+ num[1]*4*8*0.8;
        }
        if(num[2] != 0 ){
            for(int i=1;i<5;i++){
                num[i]= num[i]- num[1];
            }
                sum=sum+ num[2]*3*8*0.9;
        }
        if(num[3] != 0 ){
            for(int i=2;i<5;i++){
                num[i]= num[i]- num[2];
            }
                sum=sum+ num[3]*2*8*0.95;
        }
        if(num[4] != 0 ){
            for(int i=3;i<5;i++){
                num[i]= num[i]- num[3];
            }
                sum=sum+ num[4]*8;
        }
        return sum;
    }
}
