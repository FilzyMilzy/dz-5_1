import javax.sound.midi.Soundbank;

public class Comparing {

    public static void main(String[] argv) {

        int value1 = 2;
        int value2 = 5;
        int value3 = 1;
        int value4 = 8;


        int sum1 = value1 + value2;
        int sum2 = value3 + value4;

        System.out.println("First condition output is:");
        if(sum1>sum2){ //according to friday slack update
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sum1++;
        sum2-=2;

        System.out.println("Second condition output is: ");
        if(sum1<sum2){//according to friday slack update
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Third condition output is: ");
        if(sum1%2 == 0 || sum2%2 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
