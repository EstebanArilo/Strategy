public class Viajero {
    private EstrategyTransporte estrategia;

    public Viajero(EstrategyTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategyTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void irA(String destino) {
        System.out.println("Medio: " + estrategia.getNombre());
        System.out.println("Tiempo estimado: " + estrategia.getTiempoMinutos() + " min");
        System.out.println("Costo: $" + estrategia.getCosto());
        estrategia.llegar(destino);
        System.out.println("---");
    }
}