public class Income {

    double Income = 250;

    int mountNu;

    public Income(int mountNu) {

        this.mountNu = mountNu;
    }

    public Income(int mountNu, double Income) {

        this(mountNu);

        this.Income -= Income;
    }
}

