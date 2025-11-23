# Programa de Búsqueda Binaria
Este proyecto lo hice para poder leer un número y una lista de valores desde un archivo, aplicar el algoritmo de búsqueda binaria y guardar el resultado en otro archivo. La búsqueda binaria me sirve para encontrar un número de manera rápida dentro de una lista ordenada.

## ¿Qué hace mi programa?
1. Primero lee un archivo llamado `bin.txt`.
2. La primera línea del archivo contiene el número que quiero buscar.
3. Las siguientes líneas contienen los números que forman la lista.
4. El programa guarda todos esos números y los convierte en un arreglo.
5. Después aplica el algoritmo de **búsqueda binaria** para intentar encontrar el número.
6. Si lo encuentra, guarda la posición donde está.
7. Si no lo encuentra, avisa que el número no aparece en la lista.
8. Todo el resultado lo escribe en un archivo llamado `salida.txt`.

## Formato del archivo bin.txt
El archivo debe verse así:
75
2
5
9

15
23
38
56
75
99
100
200

- La primera línea (7) es el número a buscar.  
- Todas las demás líneas son los valores dentro de la lista, la cual debe estar **ordenada** para que la búsqueda binaria funcione correctamente.

## Archivo generado

- `salida.txt` → Aquí se guarda el resultado de la búsqueda:
  - La posición donde se encontró el número  
  - O un mensaje indicando que no se encontró  

## Cómo lo ejecuto

Primero compilo el programa:

