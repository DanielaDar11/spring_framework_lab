import com.example.spring_framework_lab.Sistem_de_evidenta_a_angajatilor;

import java.util.Objects;

public class Concediu {
    int idAngajat;
    String tipConcediu;
    int zile;
    String dataIncepere;
    String dataSfarsit;

    //constructor implicit
    Concediu() {
        this.idAngajat = 0;
        this.tipConcediu = "Necunoscut";
        this.zile = 0;
        this.dataIncepere = "Nedefinit";
        this.dataSfarsit = "Nedefinit";
    }

    //constructor cu parametri
    Concediu(int idAngajat, String tipConcediu, int zile, String dataIncepere, String dataSfarsit) {
        this.idAngajat = idAngajat;
        this.tipConcediu = tipConcediu;
        this.zile = zile;
        this.dataIncepere = dataIncepere;
        this.dataSfarsit = dataSfarsit;
    }

    //set si get
    public int get_idAngajat() {
        return idAngajat;
    }
    public void set_idAngajat(int idAngajat) {
        this.idAngajat = idAngajat; }

    public String get_tipConcediu() {
        return tipConcediu;
    }
    public void set_tipConcediu(String tipConcediu) {
        this.tipConcediu = tipConcediu;
    }
    public int get_zile() {
        return zile;
    }
    public void set_zile(int zile) {
        this.zile = zile;
    }
    public String get_dataIncepere() {
        return dataIncepere;
    }
    public void set_dataIncepere(String dataIncepere) {
        this.dataIncepere = dataIncepere;
    }
    public String get_dataSfarsit() {
        return dataSfarsit;
    }
    public void set_dataSfarsit(String dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }


    @Override
    public String toString() {
        return "Concediu { Id Angajat:" + idAngajat + ", Tipul Concediului:" + tipConcediu + ", Zile:" + zile + ", Data Inceperii concediului:"
                + dataIncepere + ", Data Sfarsit concediului: " + dataSfarsit + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concediu concediu = (Concediu) o;
        return idAngajat == concediu.idAngajat &&
                zile == concediu.zile &&
                Objects.equals(tipConcediu, concediu.tipConcediu) &&
                Objects.equals(dataIncepere, concediu.dataIncepere) &&
                Objects.equals(dataSfarsit, concediu.dataSfarsit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAngajat, tipConcediu, zile, dataIncepere, dataSfarsit);
    }
}
