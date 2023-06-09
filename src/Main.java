import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try

        {
            FileReader fr = new FileReader("0050macacos.txt");
            BufferedReader br = new BufferedReader(fr);
            int cont = 0;
            String linha;
            String linha1;
            linha1 = br.readLine();
            while((linha = br.readLine()) != null){
                System.out.println(linha);
                cont++;
            }
            System.out.println(cont);
            linha1= linha1.replaceAll("[a-zA-Z]", "");
            linha1 = linha1.replaceAll(" ","");
            System.out.println(linha1);
            br.close();
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
