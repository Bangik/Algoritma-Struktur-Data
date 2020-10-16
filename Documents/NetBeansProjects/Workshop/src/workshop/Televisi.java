
package workshop;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 * E41191882
 * TIF international
 */
public class Televisi {
    public String Deskripsi;
    private int jumlahChannel;
    public String [] Channels;

    public Televisi(String Deskripsi, int jumlahChannel){
        this.Deskripsi = Deskripsi;
        this.jumlahChannel = jumlahChannel;       
    }
    String getDeskripsi(){
        return Deskripsi;
    }
    void getChannels(){
        System.out.println("Belum ada channel yang diset!");
    }
    void setChannels(String [] Channels){
        if(Channels.length >= 10){
            System.out.println("Maaf Tv ini hanya menyimpan 10 channel");
        }else{
            System.out.println("Informasi channel berhasil diupdate!");
            this.Channels = Channels;
        }
    }
    void setChannelAktif(int channelAktif){       
        if(channelAktif >= 8){
            System.out.println("Channel yang anda inginkan belum diset!");
        }else{
            System.out.println("Pindah Channel ke : " + Channels[channelAktif]);
        }
    }
    
   void setVolume(int Volume){
       System.out.println("intensitas volume sekarang : " + Volume);
   }
}
