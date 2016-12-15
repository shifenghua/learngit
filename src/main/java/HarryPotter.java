/**
 * Created by $ fenghua on 2016/12/13.
 */
public class HarryPotter {

    private double sum = 0;
    public double printPrice(int[] num) {

        theFistIsNotZero(num[0]);
        theFirstTwoIsNotZero(num);
        theFirstThreeIsNotZero(num);
        theFirstFourIsNotZero(num);
        theAllIsNotZero(num);
        return sum;
    }

    private void theAllIsNotZero(int[] num) {
        if(num[4] != 0 ){
            for(int i=3;i<5;i++){
                num[i]= num[i]- num[3];
            }
                sum=sum+ num[4]*8;
        }
    }

    private void theFirstFourIsNotZero(int[] num) {
        if(num[3] != 0 ){
            for(int i=2;i<5;i++){
                num[i]= num[i]- num[2];
            }
                sum=sum+ num[3]*2*8*0.95;
        }
    }

    private void theFirstThreeIsNotZero(int[] num) {
        if(num[2] != 0 ){
            for(int i=1;i<5;i++){
                num[i]= num[i]- num[1];
            }
                sum=sum+ num[2]*3*8*0.9;
        }
    }

    private void theFirstTwoIsNotZero(int[] num) {
        if(num[1] != 0 ){
            for(int i=0;i<5;i++){
                num[i]= num[i]- num[0];
            }
                sum=sum+ num[1]*4*8*0.8;
        }
    }

    private void theFistIsNotZero(int i) {
        if(i != 0){
             sum = i *5*8*0.75;
        }
    }
}
