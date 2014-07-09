package com.epam.mv.entity;


import java.util.ArrayList;
import java.util.List;

public abstract class CompoundText<T> {
    protected List<T> components = new ArrayList<T>();

    protected  CompoundText(List<T> component){
        this.components=component;
    }
}
