package doubt;


//Payment object is an immutable object..
public class Payment {

    private int amt, debitaccno, creditaccno;

    public Payment(int amt, int debitaccno, int creditaccno) {
        this.amt = amt;
        this.debitaccno = debitaccno;
        this.creditaccno = creditaccno;
    }

    public int getAmt() {
        return amt;
    }

    public int getDebitaccno() {
        return debitaccno;
    }

    public int getCreditaccno() {
        return creditaccno;
    }
}
