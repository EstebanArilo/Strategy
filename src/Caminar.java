public class Caminar implements EstrategyTransporte {
    @Override public String getNombre() { return "Caminar"; }
    @Override public int getTiempoMinutos() { return 30; }
    @Override public double getCosto() { return 0; }

    @Override
    public void llegar(String destino) {
        System.out.println("Caminando hacia " + destino);
    }
}