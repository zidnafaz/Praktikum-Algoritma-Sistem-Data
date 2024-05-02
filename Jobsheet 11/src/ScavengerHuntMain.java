public class ScavengerHuntMain {
    public static void main(String[] args) {

        ScavengerHunt scavengerHunt = new ScavengerHunt();

        scavengerHunt.addPoint("Kalau hitam dibilang bersih, kalau putih dibilang kotor?", "Papan Tulis");
        scavengerHunt.addPoint("Sabun, sabun apa yang paling genit?", "Sabun Colek");
        scavengerHunt.addPoint("Gajah apa yang paling baik hati?", "Gajahat");

        scavengerHunt.startHunt();
        
    }
}
