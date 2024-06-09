/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontrol;
import java.util.List;
import model.*;

/**
 *
 * @author DELL
 */
public interface implementkontak {
    public void insert(modelkontak b);
    public void update(modelkontak b);
    public void delete(int id);
    
    public List<modelkontak> getALL();
    public List<modelkontak> getCariNama(String nama);
    
    
}
