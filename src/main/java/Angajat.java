import com.example.spring_framework_lab.Sistem_de_evidenta_a_angajatilor;

import java.util.Objects;

public class Angajat {
    int id;
    String nume;
    String prenume;
    int varsta;
    double salariu;
    boolean statusAngajat;

    //constructor fara parametri
    Angajat() {
        this.id = 0;
        this.nume = "Necunoscut";
        this.prenume = "Necunoscut";
        this.varsta = 15;
        this.salariu = 0.0;
        this.statusAngajat = false;
    }

    //constructor cu parametri
    Angajat(int id, String nume, String prenume, int varsta, double salariu, boolean statusAngajat) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.salariu = salariu;
        this.statusAngajat = statusAngajat;
    }

    //set si get
    public int get_id() { return id;}

    public void set_id(int id) {
        this.id = id;}
    public String get_nume() {
        return nume;
    }
    public void set_nume(String nume) {
        this.nume = nume;
    }
    public String get_prenume() {
        return prenume;
    }
    public void set_prenume(String prenume) {
        this.prenume = prenume;
    }
    public int get_varsta() {
        return varsta;
    }
    public void set_varsta(int varsta) {
        this.varsta = varsta;
    }
    public double get_salariu() {
        return salariu;
    }
    public void set_salariu(double salariu) {
        this.salariu = salariu;
    }
    public boolean get_statusAngajat() { return statusAngajat; }

    public void set_statusAngajat(boolean statusAngajat) { this.statusAngajat = statusAngajat;}

    @Override
    public String toString() {
        return "Angajat { Id:" + id + ", Nume:" + nume + ", Prenume:" + prenume + ", Varsta:"
                + varsta + ", Salariu" + salariu + ", Statusul Angajatului:" + statusAngajat + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Angajat angajat = (Angajat) o;
        return id == angajat.id && varsta == angajat.varsta && Double.compare(salariu, angajat.salariu) == 0 && statusAngajat == angajat.statusAngajat && Objects.equals(nume, angajat.nume) && Objects.equals(prenume, angajat.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume, prenume, varsta, salariu, statusAngajat);
    }
}
