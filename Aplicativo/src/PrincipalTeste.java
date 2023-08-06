import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class PrincipalTeste {
        public static void main(String[] args) throws Exception {
            
            FileWriter arquivo = new FileWriter("animais.txt");

            if(arquivo != null){

            
            Mamifero mamifero1 = new Mamifero("Camelo",160.0,
            4,"Amarelo","Terra",2.2,"Plantas");

            Mamifero mamifero2 = new Mamifero("Urso",185.0,4,"Marrom","Terra",0.5,"Mel");

            Peixe peixe1 = new Peixe("Tubarão Martelo", 310.0,0,"Cinzento","Mar",1.6,"Barbatanas e cauda");
       
            
            System.out.println("\n"+mamifero1.ImprimirMamifero());
            System.out.println("\n"+mamifero2.ImprimirMamifero());
            System.out.println("\n"+peixe1.ImprimirPeixe());
            arquivo.write(System.lineSeparator()+mamifero1.ImprimirMamifero()+System.lineSeparator());
            arquivo.write(System.lineSeparator()+mamifero2.ImprimirMamifero()+System.lineSeparator());
            arquivo.write(System.lineSeparator()+peixe1.ImprimirPeixe());
            }
            arquivo.close();
        }
}
