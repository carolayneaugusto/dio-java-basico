package edu.carolayne.primeirocurso;

public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Carolayne";
        String secondName = "Augusto";

        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String secondName){
        return "Resultado do método " +   firstName.concat(" ").concat(secondName);
    }
}
