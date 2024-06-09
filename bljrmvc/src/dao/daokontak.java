package dao;

import Koneksi.koneksikontak;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import daoimplement.impelementkontak;
import model.modelkontak;

public class daokontak extends impelementkontak {
    private Connection connection;
    private static final String INSERT = "INSERT INTO kontak (nama, nohp, alamat, paket) VALUES (?,?,?,?);";
    private static final String UPDATE = "UPDATE kontak SET nama=?, nohp=?, alamat=?, paket=? WHERE id=?;";
    private static final String DELETE = "DELETE FROM kontak WHERE id=?;";
    private static final String CARINAMA = "SELECT * FROM kontak WHERE nama LIKE ?;";
    private static final String GETALL = "SELECT * FROM kontak;";

    public daokontak() {
        connection = koneksikontak.connection();
    }

    public void insert(modelkontak b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getNohp());
            statement.setString(3, b.getAlamat());
            statement.setString(4, b.getHubungan());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

    public void update(modelkontak b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE);
            statement.setString(1, b.getNama());
            statement.setString(2, b.getNohp());
            statement.setString(3, b.getAlamat());
            statement.setString(4, b.getHubungan());
            statement.setInt(5, b.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

    public List<modelkontak> getCariNama(String nama) {
        List<modelkontak> kontakList = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement(CARINAMA);
            statement.setString(1, "%" + nama + "%");
            rs = statement.executeQuery();
            while (rs.next()) {
                modelkontak b = new modelkontak();
                b.setId(rs.getInt("id"));
                b.setNama(rs.getString("nama"));
                b.setNohp(rs.getString("nohp"));
                b.setAlamat(rs.getString("alamat"));
                b.setHubungan(rs.getString("hubungan"));
                kontakList.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return kontakList;
    }

    public List<modelkontak> getALL() {
        List<modelkontak> kontakList = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement(GETALL);
            rs = statement.executeQuery();
            while (rs.next()) {
                modelkontak b = new modelkontak();
                b.setId(rs.getInt("id"));
                b.setNama(rs.getString("nama"));
                b.setNohp(rs.getString("nohp"));
                b.setAlamat(rs.getString("alamat"));
                b.setHubungan(rs.getString("hubungan"));
                kontakList.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(daokontak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return kontakList;
    }
}
