package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private Long code;
    private double solde;
    @XmlTransient
    private Date dateCreattion;

    public Compte() {
    }

    public Compte(Long code, double solde, Date dateCreattion) {
        this.code = code;
        this.solde = solde;
        this.dateCreattion = dateCreattion;
    }

    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreattion() {
        return dateCreattion;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreattion(Date dateCreattion) {
        this.dateCreattion = dateCreattion;
    }
}
