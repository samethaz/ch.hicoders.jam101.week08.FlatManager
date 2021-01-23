import java.util.ArrayList;

public class Flat {

    public ArrayList<Income> KaygisizlarFlatIncomeList = new ArrayList();

    int FlatNu = 0;

    public Flat(int FlatNu) {

        this.FlatNu = FlatNu;

        for (int i = 0; i < 13; i++) //
        {
            Income in = new Income(i, GetPay());

            KaygisizlarFlatIncomeList.add(i, in);
        }
    }

    public double GetPay() {

        return Math.random() * 400;
    }

    public ArrayList<Income> GetIncome() {

        return this.KaygisizlarFlatIncomeList;

    }

    public int GetFlatNu() {

        return this.FlatNu;

    }

}
