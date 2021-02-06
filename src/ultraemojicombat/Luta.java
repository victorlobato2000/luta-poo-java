package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.aprovado = false;
            this.desafiante = l1;
            this.desafiado = l2;
        }
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("----------DESAFIADO---------");
            this.desafiado.apresentar();
            System.out.println("--------DESAFIANTE---------");
            this.desafiante.apresentar();
            
            Random num_aleatorio = new Random();
            int vencedor = num_aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do "+ this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do "+ this.desafiado.getNome());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
           }
        }else{
            System.out.println("Não é possivel lutar!");
        }
    }
}
