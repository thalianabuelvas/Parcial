public final class CarroElectrico extends Carro{
    private double capacidadBateria;
    private double autonomiakm;

    public CarroElectrico(String marca, String modelo, String año, int cilindraje, String tipoCombustible){
        super(marca, modelo, año, cilindraje, tipoCombustible);
        this.setCilindraje(cilindraje);
        this.setTipoCombustible(tipoCombustible);
        

    }
    double kwh;
    @Override 
    public double calcularConsumo(double km){
        kwh=(km / autonomiakm) * capacidadBateria;
        System.out.println("consumo para" + km + "km:" + kwh + "kwh(electrico)");
        return kwh;

    }
    public void cargarBateria(){
        System.out.println("Bateria cargada al 100%");
        System.out.println("Autonomia disponible: " + autonomiakm + " km ");
    }

    @Override 
    public void mostrarInfo(){
        System.out.println("Tipo: carro electrico");
        System.out.println("capacidad bateria: " + capacidadBateria + " Kwh");
        System.out.println("Autonomia: " + autonomiakm);
    } 


}