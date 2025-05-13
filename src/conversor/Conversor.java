/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author marti
 */
public class Conversor {
    private double valor;
    private String unidad;

    // Constructor
    public Conversor(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    // Método para convertir a bits
    public double aBits() {
        switch (unidad.toUpperCase()) {
            case "B":
                return valor * 8;
            case "KB":
                return valor * 8 * 1024;
            case "MB":
                return valor * 8 * Math.pow(1024, 2);
            case "GB":
                return valor * 8 * Math.pow(1024, 3);
            case "TB":
                return valor * 8 * Math.pow(1024, 4);
            default:
                return valor; // Si ya está en bits
        }
    }

    // Método para convertir a bytes
    public double aBytes() {
        return switch (unidad.toUpperCase()) {
            case "BITS" -> valor / 8;
            case "KB" -> valor * 1024;
            case "MB" -> valor * Math.pow(1024, 2);
            case "GB" -> valor * Math.pow(1024, 3);
            case "TB" -> valor * Math.pow(1024, 4);
            default -> valor;
        }; // Si ya está en bytes
    }

    // Método para convertir a kilobytes
    public double aKB() {
        return switch (unidad.toUpperCase()) {
            case "BITS" -> valor / 8 / 1024;
            case "B" -> valor / 1024;
            case "MB" -> valor * 1024;
            case "GB" -> valor * Math.pow(1024, 2);
            case "TB" -> valor * Math.pow(1024, 3);
            default -> valor;
        }; // Si ya está en KB
    }

    // Método para convertir a megabytes
    public double aMB() {
        return switch (unidad.toUpperCase()) {
            case "BITS" -> valor / 8 / Math.pow(1024, 2);
            case "B" -> valor / Math.pow(1024, 2);
            case "KB" -> valor / 1024;
            case "GB" -> valor * 1024;
            case "TB" -> valor * Math.pow(1024, 2);
            default -> valor;
        }; // Si ya está en MB
    }

    // Método para convertir a gigabytes
    public double aGB() {
        return switch (unidad.toUpperCase()) {
            case "BITS" -> valor / 8 / Math.pow(1024, 3);
            case "B" -> valor / Math.pow(1024, 3);
            case "KB" -> valor / Math.pow(1024, 2);
            case "MB" -> valor / 1024;
            case "TB" -> valor * 1024;
            default -> valor;
        }; // Si ya está en GB
    }

    // Método para convertir a terabytes
    public double aTB() {
        return switch (unidad.toUpperCase()) {
            case "BITS" -> valor / 8 / Math.pow(1024, 4);
            case "B" -> valor / Math.pow(1024, 4);
            case "KB" -> valor / Math.pow(1024, 3);
            case "MB" -> valor / Math.pow(1024, 2);
            case "GB" -> valor / 1024;
            default -> valor;
        }; // Si ya está en TB
    }
    public static void main(String[] args) {
        Conversor conversor = new Conversor(100, "MB");

        System.out.println("100 MB en bits: " + conversor.aBits());
        System.out.println("100 MB en bytes: " + conversor.aBytes());
        System.out.println("100 MB en kilobytes: " + conversor.aKB());
        System.out.println("100 MB en megabytes: " + conversor.aMB());
        System.out.println("100 MB en gigabytes: " + conversor.aGB());
        System.out.println("100 MB en terabytes: " + conversor.aTB());
    }
}
