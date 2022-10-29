package WS;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
POGO Plain Old Java Object
 */
@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConvetionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return 10.68*mt;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
            return new Compte(code,Math.random()*90000,new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){

        List<Compte> Comptes=new ArrayList<>();
        Comptes.add(new Compte(1L,Math.random()*90000,new Date()));
        Comptes.add(new Compte(2L,Math.random()*90000,new Date()));
        Comptes.add(new Compte(3L,Math.random()*90000,new Date()));
        return Comptes;
    }
}
