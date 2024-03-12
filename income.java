package budgetpack;
public class income{
    int salary=0;
    int allowence=0;
    int rent=0;
    public income(int salary,int allowence,int rent)
    {
        this.salary=salary;
        this.allowence=allowence;
        this.rent=rent;
    }
    public int total_Income()
    {
        int total=salary+allowence+rent;
        return total;
    }
}