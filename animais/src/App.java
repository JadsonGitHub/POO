public class App
{
    public static void main(String[] args) throws Exception
    {
        Peixe tubarao = new Peixe("tubarao", "cinzento", "mar", 300, 1.5, 0, "barbatanas e cauda");
        Mamifero ursoCanada = new Mamifero( "urso do canada", "vermelho", "terra", 180, 0.5, 4, "mel");

        Animal c0 = new Animal("camelo", "amarelo", "terra", 150, 2.0, 4);
        Animal c1 = new Mamifero("camelo", "amarelo", "terra", 150, 2.0, 4, "?");

        Mamifero c2 = new Mamifero("camelo", "amarelo", "terra", 150, 2.0, 4, "?");
        Mamifero c3 = (Mamifero) new Animal("camelo", "amarelo", "terra", 150, 2.0, 4);
        
        System.out.println();
        System.out.println(tubarao.toString());
        System.out.println();
        System.out.println(ursoCanada.toString());
        System.out.println();
        System.out.println(c0.toString());
        System.out.println();
        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c2.toString());
        System.out.println();
        System.out.println(c3.toString());
        System.out.println();
    }
}