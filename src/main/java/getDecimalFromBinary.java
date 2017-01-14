/**
 * Created by JMPSUser on 4/26/2016.
 */
public class getDecimalFromBinary {
    public static void main (String[] args) {
        String binary = "1100";
        int total = 0;

        for (int i = 0; i < binary.length(); i++) {
            System.out.println(binary.charAt(i));
            switch (binary.charAt(i)) {
                case '0': {
                    //do nothing
                    break;
                }
                case '1': {
                    if (i == 0) {
                        System.out.println("got here 8");
                        total += 8;
                        break;
                    }
                    if (i == 1) {
                        System.out.println("got here 4");
                        total += 4;
                        break;
                    }
                    if (i == 2) {
                        System.out.println("got here 2");
                        total += 2;
                        break;
                    }
                    if (i == 3) {
                        System.out.println("got here 1");
                        total += 1;
                        break;
                    }
                }
            }
        }
        System.out.println(total);
    }//end of main
}//end of class
