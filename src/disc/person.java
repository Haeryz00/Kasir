package disc;

public abstract class person<t> {
    public String nama;


    public t getNama() {
        return (t) nama;
    }

    public void setNama(t nama) {
        this.nama = (String) nama;
    }

    public abstract double getMebershipdisc();
}
