import model.BankAccount;
import org.junit.Assert;
import org.junit.Test;
import service.MainBankService;

public class TestCasesForBankingService {

    @Test
    public void testDepositingMoney()
    {
        BankAccount bankAcc = new BankAccount();
        BankAccount bankAcc2 = new BankAccount();

        bankAcc.deposit(6000);
        bankAcc2.deposit(50);

        Assert.assertEquals(bankAcc.getBalance(), 0, 0);
        Assert.assertEquals(bankAcc2.getBalance(), 50, 0);
    }

    @Test
    public void testWithdrawingMoney()
    {
        BankAccount bankAcc = new BankAccount(500);
        BankAccount bankAcc2 = new BankAccount(20);

        bankAcc.withdraw(150);
        bankAcc2.withdraw(30);

        Assert.assertEquals(bankAcc.getBalance(), 350, 0);
        Assert.assertEquals(bankAcc2.getBalance(), 20, 0);
    }

    @Test
    public void testTransferringMoney()
    {
        BankAccount bankAcc = new BankAccount(500);
        BankAccount bankAcc2 = new BankAccount(20);
        BankAccount bankAcc3 = new BankAccount(10);
        BankAccount bankAcc4 = new BankAccount(60);

        MainBankService.transferMoney(bankAcc, bankAcc2, 600);
        MainBankService.transferMoney(bankAcc3, bankAcc4, 5);

        Assert.assertEquals(bankAcc.getBalance(), 500, 0);
        Assert.assertEquals(bankAcc2.getBalance(), 20, 0);
        Assert.assertEquals(bankAcc3.getBalance(), 5, 0);
        Assert.assertEquals(bankAcc4.getBalance(), 65, 0);
    }
}
