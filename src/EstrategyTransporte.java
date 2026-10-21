public interface EstrategyTransporte {
    String getNombre();
    int getTiempoMinutos();
    double getCosto();
    void llegar(String destino);
}