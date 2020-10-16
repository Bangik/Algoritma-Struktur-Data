
package workshop;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 * E41191882
 * TIF international
 */
public class Workshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Televisi tv = new Televisi("Tv Tempoe Doeloe, 14 inchies ", 10);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV", "TRANS TV", "TPI", "TV 7", "TVRI", "TV G", "AN TV"};
        String [] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV", "METRO TV", "TRANS TV", "TPI", "TV 7"};
        
        System.out.println("Achmad Dinofaldi, Membeli Televisi : " + tv.getDeskripsi());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
    
}
