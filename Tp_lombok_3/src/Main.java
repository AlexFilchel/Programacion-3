import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto(1,"Java Basico",1500,"Autor A");
        Producto p2 = new Producto(2,"Java Avanzado",2000,"Autor B");
        Producto p3 = new Producto(3,"Python Basico",1200,"Autor A");

        List<ProductoDTO> listaDTO = new ArrayList<>();

        listaDTO.add(new ProductoDTO(p1.getCodigo(),p1.getNombre(), p1.getPrecio()));
        listaDTO.add(new ProductoDTO(p2.getCodigo(),p2.getNombre(), p2.getPrecio()));
        listaDTO.add(new ProductoDTO(p3.getCodigo(),p3.getNombre(), p3.getPrecio()));

        System.out.println("Productos DTO:");
        for (ProductoDTO dto : listaDTO){
            System.out.println(dto);
        }

    }
}