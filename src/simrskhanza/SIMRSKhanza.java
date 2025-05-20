package simrskhanza;

import usu.widget.util.WidgetUtilities;

/**
 *
 * @author eramedclara
 */
public class SIMRSKhanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WidgetUtilities.invokeLater(() -> {
           frmUtama utama=frmUtama.getInstance();
           utama.isWall();
           utama.setVisible(true);
        }); 
    }
    
}
