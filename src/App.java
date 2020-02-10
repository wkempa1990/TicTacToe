public class App {
    public static void main(String[] args) {
        // Można zmieniac graczy z komputerowego na recznego.
        Gra gra = new Gra(false, true);
        gra.uruchom();
    }
}
