import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    private BufferedReader reader;

    public Leitura() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem + " ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Erro ao ler a entrada: " + e.getMessage());
            return "";
        }
    }

    public int lerInt(String mensagem) {
        while (true) {
            String linha = lerString(mensagem);
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
    }

    public double lerDouble(String mensagem) {
        while (true) {
            String linha = lerString(mensagem);
            try {
                return Double.parseDouble(linha);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número (use '.' para casas decimais).");
            }
        }
    }

    public void fechar() {
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao fechar o leitor: " + e.getMessage());
        }
    }
}