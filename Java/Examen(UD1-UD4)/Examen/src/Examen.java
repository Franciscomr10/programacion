public class Examen {

  public static void main(String[] args) throws Exception {
    /*Inicializamos las variables que vayamos a usar 
     * Dato adicional: no me funcionaba el código para poder usar el símbolo del euro por lo que lo he puesto escrito
    */

    int opcion1, opcion2, cantidad, descuento_3x2 = 0;
    double precio, total, IVA, descuento, descuento_final = 0;
    String nombre = "";

    /*Escribimos el menú y hacemos un switch con las diferentes opciones */

    System.out.println("Introduzca el tipo de producto:");
    System.out.println("1. Alimentación");
    System.out.println("2. Electrónica");
    System.out.println("3. Farmacia");
    System.out.println("4. Moda");
    opcion1 = Integer.parseInt(System.console().readLine());

    switch (opcion1) {
      case 1:
        System.out.println("1. Huevos");
        System.out.println("2. Leche");
        System.out.println("3. Pan");
        System.out.println("4. Fruta");
        System.out.println("5. Verdura");
        System.out.println("6. Otros");
        opcion2 = Integer.parseInt(System.console().readLine());

        /* Dentro de del primer switch abrimos otro para el apartado de alimentación*/

        switch (opcion2) {
          case 1:
            /*Pedimos los datos necesarios para crear la factura*/
            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());

            /*Empezamos a crear la factura (Es muchísimo mejor hacerlo con printf para el tema de estructurar la factura
            pero por falta de tiempo no he podido hacerlo mejor) */

            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);

            /*Calculamos el total con una operación sencilla*/

            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");

            /*Calculamos el IVA con otra operación sencilla y terminamos de hacer la factura luego de sumar el IVA con el total*/

            IVA = total * 0.04;
            System.out.println("IVA al 4%              " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          case 2:
            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());
            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);
            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");
            IVA = total * 0.04;
            System.out.println("IVA al 4%              " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          case 3:
            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());
            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);
            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");
            IVA = total * 0.04;
            System.out.println("IVA al 4%              " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          case 4:
            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());
            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);
            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");
            IVA = total * 0.04;
            System.out.println("IVA al 4%              " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          case 5:
            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());
            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);
            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");
            IVA = total * 0.04;
            System.out.println("IVA al 4%              " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          case 6:
            /* En este caso aplicamos un IVA del 10% */

            System.out.println("Introduzca el nombre del producto: ");
            nombre = System.console().readLine();
            System.out.println("Introduzca la cantidad de los productos");
            cantidad = Integer.parseInt(System.console().readLine());
            System.out.println("Introduzca el precio por unidad del producto");
            precio = Double.parseDouble(System.console().readLine());
            System.out.println("");
            System.out.println("Factura");
            System.out.println("__________________________");
            System.out.println("Artículo      " + nombre);
            System.out.println("Precio        " + precio + " euros/unidad");
            System.out.println("Cantidad                 " + cantidad);
            total = precio * cantidad;
            System.out.println("Total                 " + total + " euros");
            IVA = total * 0.1;
            System.out.println("IVA al 10%             " + IVA);
            System.out.println("__________________________");
            System.out.println("Total con IVA         " + (IVA + total) + " euros");
            break;
          default:
            System.out.println("No has elegido un producto válido");
            break;
          /*Terminamos el switch del apartado de alimentación y seguimos con los otros*/

        }
      case 2:
        /*Hacemos lo mismo que dentro del switch de alimentación a la hora de crear la factura, pidiendo los datos, etc */

        System.out.println("");
        System.out.println("Introduzca el nombre del producto:");
        nombre = System.console().readLine();
        System.out.println("Introduzca la cantidad de productos:");
        cantidad = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el precio por unidad del producto");
        precio = Double.parseDouble(System.console().readLine());
        System.out.println("");
        System.out.println("Factura");
        System.out.println("__________________________");
        System.out.println("Artículo      " + nombre);
        System.out.println("Precio        " + precio + " euros/unidad");
        System.out.println("Cantidad                 " + cantidad);
        total = precio * cantidad;
        System.out.println("Total                 " + total + " euros");

        /* Calculamos el descuento y después lo aplicamos a la factura restandolo del total */

        descuento = total * 0.2;
        System.out.println("Descuento del 20%      -" + descuento + " euros");
        total = total - descuento;
        System.out.println("Total con descuento      " + total + " euros");
        IVA = total * 0.21;
        System.out.println("IVA al 21%              " + IVA);
        System.out.println("__________________________");
        System.out.println("Total con IVA         " + (IVA + total) + " euros");
        break;
      case 3:
        /* Esto es igual que en la parte de alimentación */

        System.out.println("Introduzca el nombre del producto: ");
        nombre = System.console().readLine();
        System.out.println("Introduzca la cantidad de los productos");
        cantidad = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el precio por unidad del producto");
        precio = Double.parseDouble(System.console().readLine());
        System.out.println("");
        System.out.println("Factura");
        System.out.println("__________________________");
        System.out.println("Artículo      " + nombre);
        System.out.println("Precio        " + precio + " euros/unidad");
        System.out.println("Cantidad                 " + cantidad);
        total = precio * cantidad;
        System.out.println("Total                 " + total + " euros");
        IVA = total * 0.04;
        System.out.println("IVA al 4%              " + IVA);
        System.out.println("__________________________");
        System.out.println("Total con IVA         " + (IVA + total) + " euros");
        break;
      case 4:
        /* En este caso es donde se aprecia porque es mejor usar printf ya que puedes indicar cuantos decimales
         * quieres que se muestren en la pantalla
         */

        System.out.println("");
        System.out.println("Introduzca el nombre del producto:");
        nombre = System.console().readLine();
        System.out.println("Introduzca la cantidad de productos:");
        cantidad = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca el precio por unidad del producto");
        precio = Double.parseDouble(System.console().readLine());
        System.out.println("");
        System.out.println("Factura");
        System.out.println("_______________________________________________");
        System.out.println("Artículo      " + nombre);
        System.out.println("Precio        " + precio + " euros/unidad");
        System.out.println("Cantidad                 " + cantidad);
        total = precio * cantidad;
        System.out.println("Total                 " + total + " euros");

        /* Aquí calculamos un descuento de 3x2 por lo que primero vamos a calcular el dinero que se ahorra
         * y luego lo aplicamos a la factura junto con el IVA del 21%
         */

        descuento_3x2 = (cantidad / 3);
        descuento_final = descuento_3x2 * precio;

        System.out.println("Descuento (3x2)      -" + descuento_final + " euros");
        total = total - descuento_final;
        System.out.println("Total con descuento      " + total + " euros");
        IVA = total * 0.21;
        System.out.println("IVA al 21%              " + IVA);
        System.out.println("_______________________________________________");
        System.out.println("Total con IVA         " + (IVA + total) + " euros");
        break;
      default:
        System.out.println("No has introducido una categoría correctamente");
        break;
    }
  }
}
