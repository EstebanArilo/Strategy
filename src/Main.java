public class Main {
    public static void main(String[] args) {
        Viajero esteban = new Viajero(new Caminar());
        esteban.irA("la universidad");

        esteban.setEstrategia(new Bus());
        esteban.irA("la universidad");

        esteban.setEstrategia(new Moto());
        esteban.irA("la universidad");
    }
}