public abstract class Vehiculo{
    private String marca;
    private String modelo;
    private int año;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;

    }

    public void acelerar(){
        velocidadActual = velocidadActual + 10;
        System.out.println("acelerando velocidad actual:" + velocidadActual + "km/h");

    }

    

    public  void acelerar( int velocidadObjetiva){
        if(velocidadObjetiva > velocidadActual){
             
        } else {
            velocidadActual = velocidadObjetiva; 
            System.out.println("La velocidad objetiva debe ser mayor a la actual.");
        }
    
    }

    double consumo;
    
    public double calcularConsumo (double km){
        consumo = (km/100) * 10;
        System.out.println("Consumo estimado para " + km + "km: " + consumo + "litros" );
        return consumo;

    }
    public void frenar (){
        velocidadActual = 0;
        System.out.println("Vehiculo detenido");
    }

    public void mostrarInfo(){
        System.out.println(" ======== INFORMACION DEL VEHICULO ======");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("año: " + año);
        System.out.println("Velocidad actual: " + velocidadActual + "km/h");
    }


}