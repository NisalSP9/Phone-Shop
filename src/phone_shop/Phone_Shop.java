/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone_shop;

import com.phone_shop.view.Phone_Shop_Login;

/**
 *
 * @author NisalSP9
 */
public class Phone_Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phone_Shop_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Phone_Shop_Login(null, true).setVisible(true);
    }

}
