
#### APAW-ECP1-AngelaSanchez

### Descripción
- Este proyecto  es la solución a la practica 1 de la asignatura APAW.

# Strategy

## ¿Qué es?

- Es un patron de comportamiento que determina como se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea.

## Ventajas 

- Facilita la implementación de distintas estrategias o comportamientos específicos en clases hijas a través de una clase común. 
- Se aplica el polimorfismo.

## Recomendación

- Usar cuando en un mismo programa debamos proporcionar distintas alternativas de comportamiento,ya que permite a través de clases independientes encapsular las distintas estrategias.

## Ejemplo

- Un caso real de uso del patrón estrategia está reflejado en el comportamiento de las herramientas de compresión de las que disponemos en nuestros ordenadores.
- La organización es la siguiente:

    - ClienteCompresion que nos va a pedir la compresión de archivos. 
    - EstrategiaCompresion, interfaz, que recibirá la petición del cliente y la pasará al hijo                      correspondiente mediante el método abstracto comprimir.
    - EstrategiaCompresionZip, hijo de EstrategiaCompresion, que implementa el método del padre con el algoritmo correspondiente a la compresión zip. 
    - EstrategiaCompresionRar, hijo de EstrategiaCompresion, que implementa el método del padre con el algoritmo correspondiente a la compresión rar. 
    
- De esta manera al cliente solicitará un algoritmo concreto y el padre trasladará la petición a los hijos, permitiendo que se comprima de formas diferentes.

![alt text](https://github.com/asancgom/APAW-ECP1-EF-AngelaSanchez/blob/develop/Strategy.png)
