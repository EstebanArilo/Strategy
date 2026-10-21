public class Bus implements EstrategyTransporte {
    @Override public String getNombre() { return "Bus"; }
    @Override public int getTiempoMinutos() { return 20; }
    @Override public double getCosto() { return 2800; }

    @Override
    public void llegar(String destino) {
        System.out.println("En bus hacia " + destino);
    }
}