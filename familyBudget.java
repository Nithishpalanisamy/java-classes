import budgetpack.Expenses;
import budgetpack.income;
public class familyBudget{
    public static void main(String[] args)
    {
        Expenses e=new Expenses(7000,3000,5000);
        income i=new income(15000,1000,3000);
        int total_exp=e.total_exepences();
        int total_inc=i.total_Income();
        int saving_amt=total_inc-total_exp;
        System.out.println("Savings of family is Rs."+saving_amt);
    }
}