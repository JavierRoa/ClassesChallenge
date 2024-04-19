public class Account {

    private int numeroCuenta;
    private double balanceCuenta;
    private String nombreCliente;
    private String correo;
    private int telefono;

    // Constructor
    public Account(int numeroCuenta, double balanceCuenta, String nombreCliente, String correo, int telefono) {
        this.numeroCuenta = numeroCuenta;
        this.balanceCuenta = balanceCuenta;
        this.nombreCliente = nombreCliente;
        this.correo = correo;
        this.telefono = telefono;
    }
    // Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getBalanceCuenta() {
        return balanceCuenta;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getCorreo() {
        return correo;
    }
    public int getTelefono() {
        return telefono;
    }
    // Setters
    public void setNumeroCuenta() {
        this.numeroCuenta = numeroCuenta;
    }
    public void setBalanceCuenta() {
        this.balanceCuenta = balanceCuenta;
    }
    public void setNombreCliente() {
        this.nombreCliente = nombreCliente;
    }
    public void setCorreo() {
        this.correo = correo;
    }
    public void setTelefono() {
        this.telefono = telefono;
    }
    // Métodos de depósito y retiro.
    public void deposit(double cantidad) {
        balanceCuenta += cantidad;
        System.out.println("Depósito exitoso. Nuevo saldo: " + balanceCuenta);
    }
    public void withdraw(double cantidad) {
        if (cantidad > balanceCuenta) {
            System.out.println("Fondos insuficientes");
        } else {
            balanceCuenta -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + balanceCuenta);
        }
    }
}
