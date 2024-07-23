public class Main {

    public static void main(String[] args) {

        Cliente giovani = new Cliente();
        giovani.setNome("Giovani de Moura André");


        Conta cc = new ContaCorrente(giovani);
        Conta poupanca = new ContaPoupanca(giovani);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
