package com.example.mipc.myway.Core.Constracts;

import java.util.List;


public interface Repository <T> {
    
public T getByID(String id);
public List<T> getAll();
public boolean Insert(T register);
public boolean Update(T register);
public boolean Delete(T register);   

}