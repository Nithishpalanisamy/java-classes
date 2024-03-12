package budgetpack;
public class Expenses{
    int food=0;
    int cloth=0;
    int educational=0;
    public Expenses(int food,int cloth,int educational)
    {
        this.food=food;
        this.cloth=cloth;
        this.educational=educational;
    }
    public int total_exepences()
    {
        int total=food+cloth+educational;
        return total;
    }
}