import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GerenciarFilas {
    private static void lerFilas() {

        try

        {
            FileReader fr = new FileReader("0050macacos.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
