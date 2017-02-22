package com.example.mipc.myway.Logic;

import com.example.mipc.myway.Core.Constracts.Repository;
import com.example.mipc.myway.Core.Fakes.RepositoryExpresionFake;
import com.example.mipc.myway.Core.Fakes.RepositoryExpresionTypeFake;
import com.example.mipc.myway.Core.Models.ExpresionModel;
import com.example.mipc.myway.Core.Models.ExpresionTypeModel;
import java.util.List;


public class Score {
    
    public double GetExpresionScore(String expresion) {
        String idExpresion=getIdTypeExpresion(expresion);
        if(!isEmpty(idExpresion))
        {
            return getTypeExpresionScore(idExpresion);
        }
        else {
            return 0;
        }
    }

    private String getIdTypeExpresion(String expresion) {
        Repository<ExpresionModel> repoExpresion= new RepositoryExpresionFake();
        List<ExpresionModel> expresiones=repoExpresion.getAll();
       
        for (ExpresionModel em : expresiones) {
            if(em.getdescExpresion()==expresion)
            {
                return em.getIdTipo();
            }
        }
        return null;
    }
    private double getTypeExpresionScore(String idExpresionType) {
         Repository<ExpresionTypeModel> repoExpresionType= new RepositoryExpresionTypeFake();
         ExpresionTypeModel tipoExpresion=repoExpresionType.getByID(idExpresionType);
         if(isEmpty(tipoExpresion)){
                return tipoExpresion.getPuntaje();
        }
        return 0;
    }
    private boolean isEmpty(Object o){
        if(o==null)
            return true;
        else
            return false;

    }
}
