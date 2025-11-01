// Classe principale : point d'entrée du programme
public class App {

    // Méthode main : exécutée automatiquement au lancement du programme
    public static void main(String[] args) {
        System.out.println("Hello World !");
        // Création d'un nouvel objet de la classe Test
        // Cela exécute le constructeur de la classe Test
        new Test();
    }
}

// Classe secondaire (non publique) appelée "Test"
class Test {
    // Déclaration d'une variable d'instance (membre de la classe)
    // Chaque objet Test possède sa propre variable "test_2"
    int test_2 = 0;

    // Constructeur de la classe Test
    // Le constructeur est appelé automatiquement lors de la création d'un objet avec "new Test()"
    Test() {
        // Affiche la valeur de la variable test_2 (ici : 0)
        System.out.println(test_2);
    }
}
