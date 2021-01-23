import java.util.ArrayList;
import java.util.Random;

public class Managment {

    public ArrayList<Flat> Kaygisizlar = new ArrayList();

    public void listPrint() {

        for (Flat Flat : Kaygisizlar) {
            double Total = 0;

            System.out.print(Flat.GetFlatNu() + " numaralı daire  Toplam Borcunuz......:");

            for (Income IncomeList : Flat.KaygisizlarFlatIncomeList) {

                Total += IncomeList.Income;

            }

            System.out.println(Total);
        }

    }


    public void createFlat() {
        for (int i = 1; i < 11; i++) //
        {
            Flat F = new Flat(i);

            Kaygisizlar.add(F);
        }
    }

}
