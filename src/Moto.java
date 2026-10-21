public class Moto implements EstrategyTransporte {
    @Override public String getNombre() { return "Moto"; }
    @Override public int getTiempoMinutos() { return 10; }
    @Override public double getCosto() { return 4000; }

    @Override
    public void llegar(String destino) {
        System.out.println("En moto hacia " + destino);
    }
}