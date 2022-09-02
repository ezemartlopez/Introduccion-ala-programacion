public class Ejercicio {
    
    public static void main(String[] args) {
        Persona fulanito = new Persona();
        //Modoficando valores de las propiedades del Objeto
        fulanito.setEdad(22);
        fulanito.setNombre("Juanito");
        fulanito.setTelefono("011-2234-4552");
        //mostrando valores del objeto con sus getters
        System.out.println("Edad: "+fulanito.getEdad());
        System.out.println("Nombre : "+fulanito.getNombre());
        System.out.println("Telefono : "+fulanito.getTelefono());
    }
}

class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        // Getters
        public int getEdad() {
        return this.edad;
        }
        public String getNombre() {
        return this.nombre;
        }
        public String getTelefono() {
        return this.telefono;
        }

        // Setters
        public void setEdad(int newEdad) {
            this.edad = newEdad;
        }
        public void setNombre(String newNombre) {
            this.nombre = newNombre;
        }
        public void setTelefono(String newTelefono) {
            this.telefono = newTelefono;
        }
    }