## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Proyecto Calculadora

Este proyecto es una calculadora simple escrita en Java.

## Instalación

Clona este repositorio utilizando `git clone`.

## Uso

Para usar la calculadora, ejecuta el archivo `Calculator.java` y sigue las instrucciones en pantalla.

## Ejemplo de Código

Aquí hay un ejemplo de cómo se realiza una operación de suma en la calculadora:

```java
int result = calculator.add(5, 10);
System.out.println(result); // Imprime: 15
```

## Ejemplo de Código 2

## Cambios realizados por oliver para probar el git

Ejemplo de como pedir los datos al usuario:

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce el primer número:");
int num1 = scanner.nextInt();

System.out.println("Introduce el segundo número:");
int num2 = scanner.nextInt();

System.out.println("Introduce el operador (+, -, *, /):");
String operador = scanner.next();

App app = new App();
int resultado = app.calculadora(num1, num2, operador);

System.out.println("El resultado es: " + resultado);
```
