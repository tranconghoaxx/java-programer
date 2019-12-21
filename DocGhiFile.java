/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlymonhoc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Computer Strix
 */
public class DocGhiFile {
    public static void ghidulieu(ArrayList<MonHoc>dsmh,String tenFile)
    {
        try {
            FileOutputStream fos = new FileOutputStream(tenFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsmh);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ArrayList<MonHoc>docdulieu(String tenFile)
    {
        ArrayList<MonHoc>dsmh = new ArrayList<MonHoc>();
        try {
            FileInputStream fis = new FileInputStream(tenFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            dsmh = (ArrayList<MonHoc>) ois.readObject();
            ois.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dsmh;
    }
}
