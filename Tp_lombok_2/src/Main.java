
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1)
                .nombre("Alex")
                .email("alex@gmail.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2)
                .nombre("Juan")
                .build();

        Usuario usuario3 = Usuario.builder()
                .id(3)
                .email("juan@gmail.com")
                .build();


        //Esto es posible gracias al decorador @Data que agrega el metodo toString()
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
    }
}