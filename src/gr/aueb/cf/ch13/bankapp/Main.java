package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.JointAccount;
import gr.aueb.cf.ch13.bankapp.model.OverDraftAccount;

public class Main {

    public static void main(String[] args) {
        JointAccount accountHolders = new JointAccount("Nikos", "Margie");
        OverDraftAccount accountOne = new OverDraftAccount(1000.00);

        System.out.println("Account holder 1 is: " + accountHolders.getHolderOne());
        System.out.println("Account holder 2 is: " + accountHolders.getHolderTwo());

        System.out.println("Balance before withdraw is: " + accountOne.getBalance());
        System.out.println("Balance after Overdraft withdraw is: " + accountOne.withdraw(1100.00));
    }
}
