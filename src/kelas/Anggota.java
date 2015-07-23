/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kelas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Administrator
 */
public class Anggota extends Konek{
public Anggota(){
    try {
        super.cStatement();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error ==> "+e);
    }
}

public void insert(String id_angg, String nama_angg, String tempat_lahir_angg,
        String tanggal_lahir_angg, String jns_kel_angg, String almt_angg,
        String kerja_angg){
    try
    {
        String sql="INSERT INTO tbl_anggota (id_angg, nama_angg, tempat_lahir_angg, "
                    +"tanggal_lahir_angg,jns_kel_angg, almt_angg, kerja_angg)"
                    +"VALUES('"+id_angg+"','"+nama_angg+"','"+tempat_lahir_angg+"','"
                    + ""+tanggal_lahir_angg+"','"+jns_kel_angg+"','"+almt_angg+"','"
                    + ""+kerja_angg+"')";
        //semua perintah QUERY di Java hrus d apit tanda petik agar tidak d exekusi sebagai syntax java
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data BERHASIL di Simpan");
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Data GAGAL di Simpan karena ==> "+ex);
    }
}

public void update(String id_angg, String nama_angg, String tempat_lahir_angg,
        String tanggal_lahir_angg, String jns_kel_angg, String almt_angg,
        String kerja_angg)
  {
      try
      {
          String sql="UPDATE tbl_anggota SET id_angg='"+id_angg+"',"
                  + "nama_angg='"+nama_angg+"',tempat_lahir_angg='"+tempat_lahir_angg+"',"
                  + "tanggal_lahir_angg='"+tanggal_lahir_angg+"',jns_kel_angg='"+jns_kel_angg+"',"
                  + "almt_angg='"+almt_angg+"',kerja_angg='"+kerja_angg+"'"
                  + "WHERE id_angg='"+id_angg+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Berhasil di Perbaharui");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Perbaharui karena ==> "+x);
      }
  }

public DefaultTableModel modelAnggota= new DefaultTableModel();
 public void hapus()
 {
     int row = modelAnggota.getRowCount();
     for(int i=0;i<row;i++)
     {
         modelAnggota.removeRow(0);
     }
 }

 public void tampilData()
 {
     //String ID = null;
      hapus();
      try
       {
                String sql="SELECT * FROM tbl_anggota ORDER BY id_angg ASC";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"ID","NAMA","TMPT_LHR","TGL_LHR",""
                                + "JKEL","ALAMAT","PEKERJAAN"};
                modelAnggota.setColumnIdentifiers(kolom);
                

               while (set.next())
                {
                  /*ResultSet a = statement.getGeneratedKeys();
                  if (a.next()){
                  ResultSetMetaData rsmd = (ResultSetMetaData) a.getMetaData();
                  int colCount = rsmd.getColumnCount();
                  do{
                    for (int i=1;i<=colCount; i++){
                    String key = set.getString(i);
                    }
                  }
                    while (set.next());
                  } else {
                        JOptionPane.showMessageDialog(null, set);
                   }*/

                     //int id =set.getInt("id_angg");
                     String Id = set.getString("id_angg");
                     String Nm=set.getString("nama_angg");
                     String Tmpt_lhr=set.getString("tempat_lahir_angg");
                     String Tgl_lhr=set.getString("tanggal_lahir_angg");
                     String xtgl = Tgl_lhr.substring(8,10);
                     String xbulan = Tgl_lhr.substring(5,7);
                     String xtahun = Tgl_lhr.substring(0,4);
                     String tanggal = xtgl+"-"+xbulan+"-"+xtahun;
                     String JKel=set.getString("jns_kel_angg");
                     String Almt=set.getString("almt_angg");
                     String kerja=set.getString("kerja_angg");

                     //id = Integer.parseInt(ID);
                     String[]data={Id,Nm,Tmpt_lhr,tanggal,JKel,Almt,kerja};
                     modelAnggota.addRow(data);
                 }
       }
       catch(Exception exc)
       {
           JOptionPane.showMessageDialog(null, "Data GAGAL di Tampilkan karena ==> "+exc);
       }
    }

public void cari(String caridata)
 {
      hapus();
      try
       {
                String sql="SELECT * FROM tbl_anggota WHERE nama_angg like '"+caridata+"%'"
                        + "and nama_angg like '%"+caridata+"%'";
                ResultSet set=statement.executeQuery(sql);
                String[] kolom ={"ID","NAMA","TMPT_LHR","TGL_LHR",""
                                + "JKEL","ALAMAT","PEKERJAAN"};
                modelAnggota.setColumnIdentifiers(kolom);
                while (set.next())
                {
                     //int id =set.getInt("id_angg");
                     String Id = set.getString("id_angg");
                     String Nm=set.getString("nama_angg");
                     String Tmpt_lhr=set.getString("tempat_lahir_angg");
                     String Tgl_lhr=set.getString("tanggal_lahir_angg");
                     String xtgl = Tgl_lhr.substring(8,10);
                     String xbulan = Tgl_lhr.substring(5,7);
                     String xtahun = Tgl_lhr.substring(0,4);
                     String tanggal = xtgl+"-"+xbulan+"-"+xtahun;
                     String JKel=set.getString("jns_kel_angg");
                     String Almt=set.getString("almt_angg");
                     String kerja=set.getString("kerja_angg");

                     //id = Integer.parseInt(ID);
                     String[]data={Id,Nm,Tmpt_lhr,tanggal,JKel,Almt,kerja};
                     modelAnggota.addRow(data);
                }
       }
       catch(Exception exc)
       {
         JOptionPane.showMessageDialog(null,"Data GAGAL Ditampilkan "+exc);
       }
    }

public void hapusdata(String delete)
  {
      try
      {
          String sql="DELETE FROM tbl_anggota WHERE id_angg='"+delete+"'";
          statement.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Telah di Hapus");
      }
      catch (Exception x)
      {
          JOptionPane.showMessageDialog(null,"Data GAGAL di Hapus karena ==> "+x);
      }
  }

  public void cetakanggota()
  {
      try
      {
          HashMap parameters=new HashMap();
          String namafile="report/LaporanAng.jasper";
          JasperPrint JPrint = JasperFillManager.fillReport(namafile, parameters,statement.getConnection());
          JasperViewer.viewReport(JPrint,false);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(null, "Tidak Dapat Ditampilkan karena "+e);
      }
  }

}
