package com.xworkz.yono.savings;
import com.xworkz.yono.savings.BankAccount;
import com.xworkz.yono.savings.SavingsAccount;
import sun.awt.geom.AreaOp;

public class BankExcecutor {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.credit(500);
        myAccount.credit(500);
        myAccount.credit(500);
        System.out.println("Avialable balance on my account"+myAccount.getbalance());

        SavingsAccount friendsAccount=new SavingsAccount();
        myAccount.transfer(500,friendsAccount);
        System.out.println("available balance on my friends account "+friendsAccount.getbalance());

        SavingsAccount dadsAccount=new SavingsAccount();
        myAccount.transfer(200,dadsAccount);
        System.out.println("available balance on my dadsAccount"+dadsAccount.getbalance());

        SavingsAccount momsAccount=new SavingsAccount();
        myAccount.transfer(300,momsAccount);
        System.out.println("available balance on my momsAccount"+momsAccount.getbalance());



    }
}
