package kontrol;

import javax.swing.JOptionPane;
import dao.daokontak;
import daoimplement.implementkontak;
import model.modelkontak;
import view.mvcviewkontak;
import java.util.List;
import model.tablemodelkontak;

public class controlerkontak {

    private mvcviewkontak frame_kontak;
    private implementkontak imp_kontak;
    private List<modelkontak> list_kontak;

    public controlerkontak(mvcviewkontak frame_kontak) {
        frame_kontak = frame_kontak;
        imp_kontak = (implementkontak) new daokontak();
        list_kontak = imp_kontak.getALL();
    }

    // Reset form fields
    public void reset() {
        frame_kontak.getID().setText("");
        frame_kontak.getNAMA().setText("");
        frame_kontak.getHP().setText("");
        frame_kontak.getALAMAT().setText("");
        frame_kontak.getHUBUNGAN().setSelectedItem("--- Pilih Hubungan ---");
        frame_kontak.getDATA().setText("");
    }

    // Load data into the table
    public void isiTable() {
        list_kontak = imp_kontak.getALL();
        tablemodelkontak tmb = new tablemodelkontak(list_kontak);
        frame_kontak.getTABEL().setModel(tmb);
    }

    // Populate form fields when a table row is clicked
    public void isiField(int row) {
        if (row >= 0 && row < list_kontak.size()) {
            modelkontak kontak = list_kontak.get(row);
            frame_kontak.getID().setText(String.valueOf(kontak.getId()));
            frame_kontak.getNAMA().setText(kontak.getNama());
            frame_kontak.getHP().setText(kontak.getNohp());
            frame_kontak.getALAMAT().setText(kontak.getAlamat());
            frame_kontak.getHUBUNGAN().setSelectedItem(kontak.getHubungan());
        }
    }

    // Insert new data into the database
    public void insert() {
        if (!frame_kontak.getNAMA().getText().trim().isEmpty()
                && !frame_kontak.getHP().getText().trim().isEmpty()
                && !frame_kontak.getALAMAT().getText().trim().isEmpty()) {

            modelkontak b = new modelkontak();
            b.setNama(frame_kontak.getNAMA().getText());
            b.setNohp(frame_kontak.getHP().getText());
            b.setAlamat(frame_kontak.getALAMAT().getText());
            b.setHubungan(frame_kontak.getHUBUNGAN().getSelectedItem().toString());

            imp_kontak.insert(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            isiTable();
            reset();
        } else {
            JOptionPane.showMessageDialog(frame_kontak, "Data Tidak Boleh Kosong");
        }
    }

    // Update existing data in the database
    public void update() {
        if (!frame_kontak.getID().getText().trim().isEmpty()) {
            modelkontak b = new modelkontak();
            b.setId(Integer.parseInt(frame_kontak.getID().getText()));
            b.setNama(frame_kontak.getNAMA().getText());
            b.setNohp(frame_kontak.getHP().getText());
            b.setAlamat(frame_kontak.getALAMAT().getText());
            b.setHubungan(frame_kontak.getHUBUNGAN().getSelectedItem().toString());

            imp_kontak.update(b);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            isiTable();
            reset();
        } else {
            JOptionPane.showMessageDialog(frame_kontak, "Silahkan Pilih Data yang Akan Diupdate");
        }
    }

    // Delete data from the database
    public void delete() {
        if (!frame_kontak.getID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame_kontak.getID().getText());
            imp_kontak.delete(id);

            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            isiTable();
            reset();
        } else {
            JOptionPane.showMessageDialog(frame_kontak, "Silahkan Pilih Data yang Akan Dihapus");
        }
    }

    // Search data by name
    public void isiTableCariNama() {
        list_kontak = imp_kontak.getDATA(frame_kontak.getDATA().getText());
        tablemodelkontak tmb = new tablemodelkontak(list_kontak);
        frame_kontak.getTABEL().setModel(tmb);
    }

    public void carinama() {
        if (!frame_kontak.getDATA().getText().trim().isEmpty()) {
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame_kontak, "Silahkan Masukkan Nama yang Akan Dicari");
        }
    }
}
