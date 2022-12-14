import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Jogador{
    
    protected int idJogador;
    protected String nome;
    protected float pontos;

    public Jogador(int i, String n, float p){
        idJogador =  i;
        nome = n;
        pontos = p;  
    }
    
    public Jogador(){
        idJogador =  -1;
        nome = "";
        pontos = 0F;  
    }

    public String toString(){
        DecimalFormat df= new DecimalFormat("#,##0.00");
        return "\nID:"+idJogador +
                "\nNome:"+nome +
                "\nPontos:"+ df.format(pontos);
    }
}