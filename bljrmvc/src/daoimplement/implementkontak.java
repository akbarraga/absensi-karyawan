/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daoimplement;

import java.util.List;
import model.modelkontak;

/**
 *
 * @author DELL
 */
public interface implementkontak {

    public List<modelkontak> getALL();

    public void insert(modelkontak b);

    public void update(modelkontak b);

    public void delete(int id);

    public List<modelkontak> getDATA(String text);
    
}
