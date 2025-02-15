import com.example.spring_framework_lab.Sistem_de_evidenta_a_angajatilor;

import java.util.Objects;

public  class EvaluarePerformanta {
    private int idAngajat;
    private String dataEvaluare;
    private float scor;
    private String comentarii;

    //constructor implicit
    public EvaluarePerformanta() {
        this.idAngajat = 0;
        this.dataEvaluare = "Necunoscut";
        this.scor = 0.0f;
        this.comentarii = "Fara comentarii";
    }
    //constructor cu parametri
    public EvaluarePerformanta(int idAngajat, String dataEvaluare, float scor, String comentarii) {
        this.idAngajat = idAngajat;
        this.dataEvaluare = dataEvaluare;
        this.scor = scor;
        this.comentarii = comentarii;
    }
    //getere si setere
    public int get_IdAngajat() {
        return idAngajat;
    }
    public void set_IdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }
    public String get_DataEvaluare() {
        return dataEvaluare;
    }
    public void set_DataEvaluare(String dataEvaluare) {
        this.dataEvaluare = dataEvaluare;
    }
    public float get_Scor() {
        return scor;
    }
    public void set_Scor(float scor) {
        this.scor = scor;
    }
    public String get_Comentarii() {
        return comentarii;
    }
    public void set_Comentarii(String comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public String toString() {
        return "EvaluarePerformanta {idAngajat=" + idAngajat +", dataEvaluare="
                + dataEvaluare +", scor=" +scor + ", comentarii=" + comentarii+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvaluarePerformanta that = (EvaluarePerformanta) o;
        return idAngajat == that.idAngajat &&
                Float.compare(that.scor, scor) == 0 &&
                Objects.equals(dataEvaluare, that.dataEvaluare) &&
                Objects.equals(comentarii, that.comentarii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAngajat, dataEvaluare, scor, comentarii);
    }

}
