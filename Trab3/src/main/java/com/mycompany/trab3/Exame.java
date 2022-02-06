import java.io.Serializable;

public class Exame implements Serializable {
    private String des_exame;

    public Exame(String des_exame) {
        this.des_exame = des_exame;
    }

    public String getDes_exame() {
        return des_exame;
    }

    
}
