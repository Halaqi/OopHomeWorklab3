public class Account {
  private   float balance;
    public Account ()
    {
        this.balance = 0.0f;

    }
    public float getDeposit(float amount)
    {
        balance = balance + amount;
        return balance;

    }
    public float checkBalance()
    {
        return (float) balance;

    }
    public float getWithDraw(float amount)
    {
        if (balance>0.0f)
    {
        balance-=amount;
    }
    else
    {
        System.out.println("There is no money in your account:");
    }

         return  balance;
    }
}
