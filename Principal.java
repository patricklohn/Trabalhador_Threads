public class Principal {
    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 200);
        Trabalhador raimundo = new Trabalhador("bota", 200);
        Trabalhador estefano = new Trabalhador("Casaco", 200);
        severino.start();
        raimundo.start();
        estefano.start();
    }
}
