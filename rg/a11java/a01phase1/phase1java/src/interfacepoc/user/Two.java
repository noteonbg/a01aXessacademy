package interfacepoc.user;

import interfacepoc.creator.FourPaymentInterface;
import interfacepoc.creator.HDFCPayment3;

public class Two {

    public static void main(String[] args) {

        FourPaymentInterface pi =new HDFCPayment3();
        pi.makePayment(23,24);



    }
}
