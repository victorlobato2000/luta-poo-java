package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
        l[0] = new Lutador("Paulo","Brasil",20,1.60f,68.1f,11,2,1);
        l[1] = new Lutador("Lobato","França",31,1.80f,57.8f,11,5,0);
        l[2] = new Lutador("Victor","China",20,1.71f,80.9f,1,7,1);
        l[3] = new Lutador("Vector","Estado Unidos",20,1.70f,81.1f,13,12,1);
        l[4] = new Lutador("Paul","Brasil",20,1.55f,119.1f,1,4,1);
        l[5] = new Lutador("Lovato","Canadá",20,1.80f,105.1f,6,2,3);
        
        Luta fight = new Luta();
        fight.marcarLuta(l[2], l[3]);
        fight.lutar();
    }
    
}
