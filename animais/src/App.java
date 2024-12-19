public class App
{
    public static void main(String[] args) throws Exception
    {
        Peixe tubarao = new Peixe("tubarao", "cinzento", "mar", 300, 1.5, 0, "barbatanas e cauda");
        Mamifero ursoCanada = new Mamifero("mel", "ursoCanada", "vermelho", "terra", 180, 0.5, 4);
        Mamifero camelo = new Mamifero("-", "camelo", "amaelo", "terra", 150, 2.0, 4);

        System.out.println(tubarao.toString());        
        System.out.println(ursoCanada.toString());        
        System.out.println(camelo.toString());        
    }
}
