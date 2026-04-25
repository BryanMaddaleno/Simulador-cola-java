# Examen Parcial - Estructuras de Datos
## Información del Estudiante
- **Nombre:** Bryan Alexander Gonzalez Maddaleno
- **Carné:** 202503096
- **Curso:** Estructuras de Datos
- **Catedrático:** Ing. Brandon Chitay
## Descripción del Proyecto
Este sistema simula la atención de clientes en una sucursal utilizando:

- **Cola (FIFO)** → Para clientes en espera.
- **Pila (LIFO)** → Para historial de clientes atendidos.
- **Nodos y punteros** creados manualmente.
##Objetivo del Proyecto

Aplicar los conceptos fundamentales de estructuras de datos implementando desde cero:

- Cola dinámica con nodos
- Pila dinámica con nodos
- Lectura de archivos `.txt`
- Menú interactivo por consola
- Manejo de datos de clientes

## Instrucciones de Compilación y Ejecución
```
javac Nodo.java Cliente.java Cola.java Pila.java Main.java
java Main
```
## Estructura del Proyecto

```text
simulador-cola-java/
│── src/
│   ├── Nodo.java
│   ├── Cliente.java
│   ├── Cola.java
│   ├── Pila.java
│   └── Simulador.java
│
│── data/
│   └── clientes.txt
│
└── README.md