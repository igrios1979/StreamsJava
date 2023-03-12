Además de los operadores terminales forEach, anyMatch y findFirst, existen muchos otros operadores terminales en Java Streams que se utilizan para realizar diversas tareas. A continuación, te menciono algunos de los operadores terminales más comunes en Java Streams:

count: Este operador terminal devuelve el número de elementos en el Stream como un valor largo (long). Por ejemplo:

vbnet
Copy code
Stream<String> nombres = Stream.of("Juan", "María", "Pedro", "Ana");
long numNombres = nombres.count();
collect: Este operador terminal se utiliza para recolectar los elementos del Stream en una colección u otro objeto. Por ejemplo:

php
Copy code
Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
List<Integer> listaNumeros = numeros.collect(Collectors.toList());
max y min: Estos operadores terminales devuelven el elemento máximo o mínimo en el Stream, según un comparador dado. Por ejemplo:

sql
Copy code
Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
Optional<Integer> maximo = numeros.max(Comparator.naturalOrder());
Optional<Integer> minimo = numeros.min(Comparator.naturalOrder());
reduce: Este operador terminal se utiliza para reducir los elementos del Stream a un solo valor utilizando una función de reducción. Por ejemplo:

css
Copy code
Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
int sumaNumeros = numeros.reduce(0, (a, b) -> a + b);
toArray: Este operador terminal se utiliza para convertir los elementos del Stream en un arreglo. Por ejemplo:

sql
Copy code
Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
Integer[] arregloNumeros = numeros.toArray(Integer[]::new);
Estos son solo algunos de los operadores terminales más comunes en Java Streams. Existen muchos otros operadores terminales que se pueden utilizar según las necesidades específicas del programa.



----------------------------------------------------------------------------------------------------------------------------------

La clase Optional es una API de Java que se introdujo en Java 8 para abordar el problema de los valores nulos (null values) en las aplicaciones. Es una clase que representa un objeto que puede contener un valor nulo o no nulo. Esta API se puede utilizar en cualquier lugar donde se necesite una referencia a un objeto que podría ser nulo.

La API Optional de Java proporciona un mecanismo para evitar excepciones de tipo NullPointerException. En lugar de devolver un valor nulo, los métodos que utilizan Optional devuelven un objeto Optional vacío o un objeto Optional que contiene un valor no nulo.

La clase Optional tiene dos métodos principales:

isPresent(): Este método devuelve true si el objeto Optional contiene un valor no nulo y false en caso contrario.

get(): Este método devuelve el valor almacenado en el objeto Optional si existe. Si el objeto Optional está vacío, el método lanza una excepción de tipo NoSuchElementException.

Además de estos métodos, Optional también proporciona otros métodos como orElse(), orElseGet(), orElseThrow() y map() que se utilizan para acceder al valor del objeto Optional.

La API Optional se utiliza comúnmente para mejorar la legibilidad del código y evitar excepciones de tipo NullPointerException en los casos en que los valores pueden ser nulos. Al utilizar la clase Optional, se puede escribir un código más claro y fácil de leer que indica claramente cuando un valor puede ser nulo y cómo se debe tratar en caso de que sea nulo.

---------------------------------------------------------------------
En Java, la función reduce se utiliza para realizar una operación de reducción en una secuencia de elementos. La operación de reducción toma una función binaria y la aplica acumulativamente a todos los elementos de la secuencia para producir un resultado único.



---------------------------------------------------------------------------

```IntStream es una interfaz de Java 8 que proporciona una secuencia de valores enteros primitivos. Forma parte de la API de Streams de Java y proporciona un conjunto de métodos para crear y manipular secuencias de valores enteros.

IntStream proporciona una variedad de métodos para crear secuencias de valores enteros, como range(), rangeClosed(), iterate() y generate(). También proporciona una variedad de métodos para filtrar, mapear y reducir los elementos de la secuencia.

Algunos de los métodos comúnmente utilizados de IntStream son:

filter(IntPredicate predicate): Devuelve una secuencia que consiste en los elementos que cumplen el predicado dado.
map(IntUnaryOperator mapper): Devuelve una secuencia que consiste en los resultados de aplicar la función dada a los elementos de esta secuencia.
sum(): Devuelve la suma de los elementos en esta secuencia.
average(): Devuelve un OptionalDouble que describe la media aritmética de los elementos de esta secuencia, o un Optional vacío si esta secuencia está vacía.
reduce(int identity, IntBinaryOperator op): Devuelve el resultado de la acumulación de los elementos de esta secuencia utilizando el identificador y el operador dados.
IntStream se puede obtener a partir de una matriz de enteros, una Collection de enteros o mediante el uso de uno de los métodos de fábrica proporcionados por la interfaz IntStream.

IntStream está diseñado para trabajar con enteros primitivos y está optimizado para el rendimiento. Evita los costos de auto-encajonamiento y desencajonamiento, lo que lo hace más eficiente que trabajar con secuencias de objetos.```





