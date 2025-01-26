package gr.aueb.cf.ch13.bankapp.model;

public class JointAccount {
    private String holderOne;
    private String holderTwo;

    public JointAccount(){}

    public JointAccount(String holderOne, String holderTwo) {
        this.holderOne = holderOne;
        this.holderTwo = holderTwo;
    }

    public String getHolderOne() {
        return holderOne;
    }

    public void setHolderOne(String holderOne) {
        this.holderOne = holderOne;
    }

    public String getHolderTwo() {
        return holderTwo;
    }

    public void setHolderTwo(String holderTwo) {
        this.holderTwo = holderTwo;
    }
}
