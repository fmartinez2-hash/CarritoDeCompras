# Carrito de Compras - Proyecto de Refactorización (DAW)

Este proyecto es el resultado de una práctica de refactorización de código Java, centrada en la aplicación de buenos principios de diseño (SOLID), manejo de excepciones y mejora de la escalabilidad.

## 🛠️ Mejoras Implementadas

- **Separación de Responsabilidades:** Se separó la lógica de negocio (Carrito e Item) de la interfaz de usuario (Main).
- **Encapsulamiento:** Los atributos de `Item` ahora son privados, protegidos por Getters y Setters con validaciones para evitar precios negativos o desorbitados.
- **Escalabilidad:** Se sustituyó `ArrayList` por `LinkedHashMap<Item, Integer>`. Esto permite:
  - Búsquedas más rápidas.
  - Gestión nativa de **cantidades** por cada producto.
- **Manejo de Errores:** Implementación de excepciones como `IllegalArgumentException` y `NoSuchElementException`.
- **Código Limpio:** Uso de constantes para símbolos de moneda y límites de negocio, eliminando "números mágicos" y cadenas de texto sueltas.

## 🚀 Cómo ejecutarlo
1. Clona el repositorio o descarga los archivos `.java`.
2. Compila con `javac Main.java`.
3. Ejecuta con `java Main`.

## 📚 Documentación
El código incluye comentarios en formato **Javadoc**. Para generar la documentación HTML, utiliza:
`javadoc -d doc *.java`
