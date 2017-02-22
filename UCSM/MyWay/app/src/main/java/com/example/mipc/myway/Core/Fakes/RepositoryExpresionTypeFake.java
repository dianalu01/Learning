package com.example.mipc.myway.Core.Fakes;


import com.example.mipc.myway.Core.Constracts.Repository;
import com.example.mipc.myway.Core.Models.ExpresionTypeModel;

import java.util.ArrayList;
import java.util.List;

public class RepositoryExpresionTypeFake implements Repository<ExpresionTypeModel> {
     
    private List<ExpresionTypeModel> tiposExpresiones;
    
    public RepositoryExpresionTypeFake(){
        tiposExpresiones = new ArrayList<ExpresionTypeModel>();
        tiposExpresiones.add(new ExpresionTypeModel("T01","Muy Buena",7));
        tiposExpresiones.add( new ExpresionTypeModel("T02","Buena",3));
        tiposExpresiones.add(new ExpresionTypeModel("T03","Regular",1));
     }


    @Override
    public ExpresionTypeModel getByID(String id) {
        
        for (ExpresionTypeModel etm : tiposExpresiones) {
            if(etm.getIdTipo().equals(id))
            {
                return etm;
            }
        }
        return null;
    }
    @Override
    public List<ExpresionTypeModel> getAll() {
        return tiposExpresiones;
    }
    @Override
    public boolean Insert(ExpresionTypeModel register) {
        if(register!=null)
        {
            tiposExpresiones.add(register);
            return true;
        }
        return false;
    }

    @Override
    public boolean Update(ExpresionTypeModel register) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(ExpresionTypeModel register) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



  
}
