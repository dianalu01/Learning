package com.example.mipc.myway.DataAccess;


import com.example.mipc.myway.Core.Constracts.Repository;
import com.example.mipc.myway.Core.Models.ExpresionModel;

import java.util.ArrayList;
import java.util.List;

public class RepositoryExpresion implements Repository<ExpresionModel> {
    private final List<ExpresionModel> expresiones;
    public RepositoryExpresion(){
        expresiones = new ArrayList<>();
        expresiones.add(new ExpresionModel("E01","Gracias","T02"));
        expresiones.add( new ExpresionModel("E02","Disculpa","T03"));
    }


    @Override
    public ExpresionModel getByID(String id) {
        
        for (ExpresionModel em : expresiones) {
            if(em.getIdExpresion().equals(id))
            {
                return em;
            }
        }
        return null;
    }
    @Override
    public List<ExpresionModel> getAll() {
        return expresiones;
    }
    @Override
    public boolean Insert(ExpresionModel register) {
        if(register!=null)
        {
            expresiones.add(register);
            return true;
        }
        return false;
    }

    @Override
    public boolean Update(ExpresionModel register) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(ExpresionModel register) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



  
}
