public class Carro extends Vehiculo{
    private int cilindraje;
    private String tipoCombustible;

    public Carro(String marca, String modelo, String año, int cilindraje, String tipoCombustible){
        super(marca, modelo, cilindraje);
        this.setCilindraje(cilindraje);
        this.setTipoCombustible (tipoCombustible);

    }
    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    double litros;
    
    @Override 
    public double calcularConsumo(double km){
        litros = km * (cilindraje/100000.0);
        System.out.println("Consumo para " + km + "km con" + cilindraje + "cc: " + litros + "litros de " + tipoCombustible);
        return litros;
    }
    

    @Override 
    public void mostrarInfo(){
        System.out.println("Tipo: carro de combustion");
        System.out.println("cilindraje: " + cilindraje + " cc");
        System.out.println("combustible: " + tipoCombustible);
    }
}
    
