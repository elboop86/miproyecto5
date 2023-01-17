package com.example.classproduct;

/*
* Crear una clase: Product
	* atributos encapsulados (private)
	* constructores:
		* vacío
		* con todos los parámetros
	* métodos getter setter
	* toString

* Crear una clase Main
	* Crear 5 productos
	* Crear un array de productos
	* Estadísticas
		* Calcular la suma precio total de los productos del array
		* Calcular la media de precio de los productos del array
		* Calcular el precio máximo
		* Evitar contabilizar un precio si es nulo en el precio medio
        * Calcular precio total de stock, teniendo en cuenta las unidades de cada producto
          * Puedo tener 5 unidades de producto a 100 € cada una y por tanto el precio total
			sería 500 €

* Crear una clase Manufacturer
	* Asociar la clase a Product, de manera que un producto tiene un fabricante

* Crear enum ProductCategory para categorías de producto y agregarla como atributo a la clase Product

* Crear atributo boolean en Product para indicar si un producto está a la venta o no, es decir,
  si está activado. Influye en las estadísticas, si un producto no está activado entonces no se
  debe usar para calcular el precio total ni la media ni el max.
 */
public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("prod1", 19.99d, 2, "green", 167);
        Product product2 = new Product("silla ergonómica", 450d, 1, "gray", 30000);
        Product product3 = new Product("silla gaming", 800d, 1, "gray", 20000);
        Product product4 = new Product("mesa", null, 1, "gray", 30000);
        Product product5 = new Product("lámpara", 1200d, 1, "gray", 30000);


        // Crear un array de productos
        Product[] products = {product1, product2, product3, product4, product5};

        // calcular precio total
        double sumPrice = 0d;
        int countWithPrice = 0; // 4 en vez de 5

        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() != null) {
                sumPrice += products[i].getPrice();
                countWithPrice++;
            }
        }

        // Calcular la media de precio de los productos del array
        // double avgPrice = sumPrice / products.length;
        double avgPrice = sumPrice / countWithPrice;

        // Calcular el precio máximo
        double maxPrice = 0d;
        for (Product product : products) {
            if (product.getPrice() != null && product.getPrice() > maxPrice)
                maxPrice = product.getPrice();
        }

        // imprimir estadísticas
        System.out.println("Numero total de productos: " + products.length);
        System.out.println("Numero de productos con precio asignado: " + countWithPrice);
        System.out.println("Precio total de los productos: " + sumPrice);
        System.out.println("Precio medio de los productos: " + avgPrice);
        System.out.println("Precio maximo de los productos: " + maxPrice);

    }
}
