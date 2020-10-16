
package workshop2;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 * E41191882
 * TIF international
 */
public class Workshop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inchies ", 100);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV", "TRANS TV", "TPI", "TV 7", "TVRI", "TV G", "AN TV"};
        
        System.out.println("Achmad Dinofaldi Membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        
        tv.setChannelsAktif(3);
        tv.setVolume(10);
        tv.setChannelsAktif(10);
        tv.setChannelsAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
    
}
