package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class tablemodelkontak extends AbstractTableModel {
        
    private final List<modelkontak> list_kontak;
    
    public tablemodelkontak(List<modelkontak> list_kontak) {
        this.list_kontak = list_kontak;
    }
    
    @Override
    public int getRowCount() {
        return list_kontak.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NAMA";
            case 2:
                return "NOHP";
            case 3:
                return "ALAMAT";
            case 4:
                return "HUBUNGAN";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list_kontak.get(row).getId();
            case 1:
                return list_kontak.get(row).getNama();
            case 2:
                return list_kontak.get(row).getNohp();
            case 3:
                return list_kontak.get(row).getAlamat();
            case 4:
                return list_kontak.get(row).getHubungan();
            default:
                return null;
        }
    }
}
