import model.BankAccount;
import org.junit.Assert;
import org.junit.Test;
import service.MainBankService;

public class TestCasesForBankingService {

    @Test
    public void testDepositingMoney()
    {
        BankAccount bankAcc = new BankAccount();

        bankAcc.deposit(6000);
        Assert.assertEquals(bankAcc.getBalance(), 0, 0);

        bankAcc.deposit(499);
        Assert.assertEquals(bankAcc.getBalance(), 499, 0);
    }

    @Test
    public void testWithdrawingMoney()
    {
        BankAccount bankAcc = new BankAccount(500);

        bankAcc.withdraw(600);
        Assert.assertEquals(bankAcc.getBalance(), 500, 0);

        bankAcc.withdraw(150);
        Assert.assertEquals(bankAcc.getBalance(), 350, 0);

    }

    @Test
    public void testTransferringMoney()
    {
        BankAccount bankAcc = new BankAccount(500);
        BankAccount bankAcc2 = new BankAccount(20);

        MainBankService.transferMoney(bankAcc, bankAcc2, 600);
        Assert.assertEquals(bankAcc.getBalance(), 500, 0);
        Assert.assertEquals(bankAcc2.getBalance(), 20, 0);

        MainBankService.transferMoney(bankAcc, bankAcc2, 500);
        Assert.assertEquals(bankAcc.getBalance(), 0, 0);
        Assert.assertEquals(bankAcc2.getBalance(), 520, 0);
    }
}
