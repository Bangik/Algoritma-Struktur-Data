
package workshop2;

import workshop.Televisi;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 * E41191882
 * TIF international
 */
public class TelevisiModern extends Televisi{

    static String TELETEXT = "Teletext";
    static String TV = "Televisi";
    private String Disc;
    
    public TelevisiModern(String Deskripsi, int jumlahChannel) {
        super(Deskripsi, jumlahChannel);
    }
    String getDeskripsi(){
        return Deskripsi;
    }
    void getChannels(){
        System.out.println("Belum ada channel yang diset!");
    }

    void setChannels(String[] semuaChannel) {        
        System.out.println("Informasi channel berhasil diupdate");
        this.Channels = semuaChannel;       
    }

    void setChannelsAktif(int channelAktif) {
        System.out.println("Pindah Channel ke : " + Channels[channelAktif]);
    }

    void setVolume(int Volume) {
       System.out.println("intensitas volume sekarang : " + Volume);
    }
    void setModusTampilan(String TELETEXT) {
        System.out.println("Modus Tampilan : " + TELETEXT);
    }
    void setHalamanTeletext(int Halaman){
        System.out.println("Berpindah ke halaman teletext " + Halaman);
    }

    void playCD() {
        if(Disc == null){
            System.out.println("Tidak ada CD didalam DiskTray!");
        }else{
            System.out.println("Memutar Film " + Disc);
        }
    }
    void setDiscTray(String Disc){
        this.Disc = Disc;
    }
    
    
    
}
