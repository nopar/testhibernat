/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import com.mycompany.helper.AutoHelper;
import com.mycompany.test1.Auta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;

/**
 *
 * @author nox
 */
@ManagedBean
@SessionScoped
public class AutaController {

    String znacka;
    DataModel autaModel;
    AutoHelper helper;
    private Auta current;
    private List<Auta> zoz_aut;
    
    
    /**
     * Creates a new instance of AutaController
     */
    public AutaController() {
        helper = new AutoHelper();
        zoz_aut = helper.getAutaByZnacka("bmw");        
    }
    
    public void init(){
        helper = new AutoHelper();
        zoz_aut = helper.getAutaByZnacka("bmw");
    }
    
    public Auta getSelected(){
        if(current == null){
            current = new Auta();
        }
        return current;
    }
    
    
   /* public String vratdaco(){
        List<Auta> menko = helper.getAutaByZnacka("bmv");
        return menko.toString();
    }*/

    public List<Auta> getZoz_aut() {
        return zoz_aut;
    }

    public void setZoz_aut(List<Auta> zoz_aut) {
        this.zoz_aut = zoz_aut;
    }
    
    
}
