package org.example.model;

import org.example.conn.connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class HoSoThiSinhDAO {
    private Random random;

    public int add(HoSoThiSinh a) {
        Connection cn =null;
        PreparedStatement check  =null;
        random = new Random();
        try {
            String sql = "SELECT * FROM HOSOTHISINH WHERE SoCMND=?";
            cn= connection.conn();
            check = cn.prepareStatement(sql);
            check.setString(1, a.getSocmnd());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                return 0;
            } else {

                PreparedStatement pst  =null;
                try {

                    String check1= "SELECT * FROM HOSOTHISINH WHERE MaTS=?";
                    cn = (Connection) connection.conn();
                    PreparedStatement p = cn.prepareStatement(check1);
                    p.setString(1, a.getMaTS());
                    ResultSet resultSet = p.executeQuery();
                    if (resultSet.next()) {
                        return 0;
                    } else {
                        try {
                            String sql1 = "INSERT INTO HOSOTHISINH VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst = cn.prepareStatement(sql1);

                            pst.setString(1, String.valueOf(random.nextInt(10000)));
                            pst.setString(2,a.getMadtut());
                            pst.setString(3,"1");
                            pst.setString(4,a.getMadantoc());
                            pst.setString(5,a.getMakvut());
                            pst.setString(6,a.getHoten());
                            pst.setDate(7, Date.valueOf(a.getNgaysinh()));
                            pst.setString(8,a.getGioitinh());
                            pst.setString(9,a.getSocmnd());
                            pst.setString(10,"Chua xet");
                            pst.setFloat(11,0);
                            pst.setFloat(12,0);
                            pst.setFloat(13,0);
                            pst.setFloat(14,0);
                            pst.setFloat(15,0);
                            pst.setFloat(16,0);
                            pst.setFloat(17,0);
                            pst.setFloat(18,0);
                            pst.setFloat(19,0);
                            pst.setFloat(20,0);




                            if (pst.executeUpdate() > 0) {
                                System.out.println("add thanh cong");
                                return 1;
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }



                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        cn.close();
                        pst.close();
                    }catch(Exception e) {

                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int delete(HoSoThiSinh a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "DELETE FROM HOSOTHISINH WHERE MaTS=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getMaTS());
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int update(HoSoThiSinh a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "UPDATE HOSOTHISINH SET HoTen=?, NgaySinh=?, GioiTinh=?, SoCMND=?, MaDoiTuongUuTien=?, MaKhuVucUuTien=?, MaDanToc=? WHERE MaTS=?";
            cn = connection.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getHoten());
            pst.setString(2, a.getNgaysinh());
            pst.setString(3, a.getGioitinh());
            pst.setString(4, a.getSocmnd());
            pst.setString(5, a.getMadtut());
            pst.setString(6, a.getMakvut());
            pst.setString(7, a.getMadantoc());
            pst.setString(8, a.getMaTS());

            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int dangKiHoSo(HoSoThiSinh a) {
        Connection cn =null;
        PreparedStatement check  =null;
        try {
            String sql = "SELECT * FROM HOSOTHISINH WHERE SoCMND=?";
            cn= connection.conn();
            check = cn.prepareStatement(sql);
            check.setString(1, a.getSocmnd());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                return 0;
            } else {

                PreparedStatement pst  =null;
                try {

                    String check1= "SELECT * FROM HOSOTHISINH WHERE MaTS=?";
                    cn = (Connection) connection.conn();
                    PreparedStatement p = cn.prepareStatement(check1);
                    p.setString(1, a.getMaTS());
                    ResultSet resultSet = p.executeQuery();
                    if (resultSet.next()) {
                        return 0;
                    } else {
                        try {
                            String sql1 = "INSERT INTO HOSOTHISINH VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst = cn.prepareStatement(sql1);

                            pst.setString(1, String.valueOf( new Random().nextInt(100000)));
                            pst.setString(2,a.getMadtut());
                            pst.setString(3,"1");
                            pst.setString(4,a.getMadantoc());
                            pst.setString(5,a.getMakvut());
                            pst.setString(6,a.getHoten());
                            pst.setDate(7, Date.valueOf(a.getNgaysinh()));
                            pst.setString(8,a.getGioitinh());
                            pst.setString(9,a.getSocmnd());
                            pst.setString(10,"Chua xet");
                            pst.setFloat(11,0);
                            pst.setFloat(12,0);
                            pst.setFloat(13,0);
                            pst.setFloat(14,0);
                            pst.setFloat(15,0);
                            pst.setFloat(16,0);
                            pst.setFloat(17,0);
                            pst.setFloat(18,0);
                            pst.setFloat(19,0);
                            pst.setFloat(20,0);

                            if (pst.executeUpdate() > 0) {
                                System.out.println("add thanh cong");
                                return 1;
                            }
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }



                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        cn.close();
                        pst.close();
                    }catch(Exception e) {

                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
