# Conversor de Monedas en Java

Una aplicación de consola que realiza conversiones entre diferentes monedas utilizando tasas de cambio en tiempo real obtenidas de una API REST.

## Características

✔ **Consumo de API REST** - Obtiene tasas de cambio actualizadas de ExchangeRate API
✔ **Manejo de JSON** - Parseo eficiente con Gson
✔ **Programación Orientada a Objetos** - Código modular y bien estructurado
✔ **Conversión de monedas en tiempo real** - Cálculos precisos entre múltiples monedas
✔ **Interfaz de usuario interactiva** - Menú en consola fácil de usar

## Monedas soportadas

- **USD** - Dólar estadounidense
- **ARS** - Peso argentino
- **BRL** - Real brasileño
- **PEN** - Sol peruano

## Requisitos previos

- Java 11 o superior
- Maven 3.6 o superior
- Conexión a internet (para consumir la API)

## Instalación

1. Clonar el repositorio o descargar los archivos
2. Navegar al directorio del proyecto
3. Compilar con Maven:
```bash
mvn clean compile
```

4. Empaquetar la aplicación:
```bash
mvn package
```

## Ejecución

Opción 1 - Con Maven:
```bash
mvn exec:java -Dexec.mainClass="Principal"
```

Opción 2 - Directo con JAR:
```bash
java -cp target/ConversorMonedas-1.0.0.jar:target/dependency/* Principal
```

## Ejemplo de uso

```
===== CONVERSOR DE MONEDAS =====
1. USD -> ARS
2. ARS -> USD
3. USD -> BRL
4. BRL -> USD
5. USD -> PEN
6. PEN -> USD
7. Salir
Elija una opción: 5
Ingrese el valor: 100

Valor convertido: 372.50
```

## Estructura del proyecto

```
ConversorMonedas/
├── src/main/java/
│   ├── Principal.java      (Clase principal con menú)
│   ├── Conversor.java      (Lógica de conversión)
│   ├── ApiService.java     (Consumo de API)
│   └── Moneda.java         (Modelo de datos)
├── pom.xml                 (Configuración Maven)
└── README.md               (Este archivo)
```

## Clases principales

### Principal.java
Contiene el método `main()` y la lógica del menú interactivo. Gestiona la entrada del usuario y coordina el flujo de la aplicación.

### ApiService.java
Realiza las peticiones HTTP a la API de ExchangeRate y convierte la respuesta JSON en un objeto `Moneda` usando Gson.

### Conversor.java
Clase utilitaria que contiene el método estático `convertir()` para aplicar las tasas de cambio a los montos ingresados.

### Moneda.java
Modelo de datos que mapea la estructura JSON de la respuesta de la API, almacenando las tasas de cambio.

## Dependencias

- **Gson 2.10.1** - Librería para parsear JSON

## API utilizada

[ExchangeRate API](https://www.exchangerate-api.com/)
- URL: `https://api.exchangerate-api.com/v4/latest/[MONEDA_BASE]`
- Servicio gratuito sin autenticación requerida

## Mejoras futuras posibles

- [ ] Agregar más monedas al menú
- [ ] Guardar historial de conversiones
- [ ] Interfaz gráfica con JavaFX o Swing
- [ ] Caché de tasas de cambio para evitar requests repetidas
- [ ] Validación mejorada de entrada de usuario
- [ ] Generación de reportes en PDF

## Autor

Proyecto educativo para ejercitar conceptos de POO, consumo de APIs y manipulación de JSON.

## Licencia

Este proyecto está bajo licencia MIT - siéntese libre de usarlo y modificarlo.
