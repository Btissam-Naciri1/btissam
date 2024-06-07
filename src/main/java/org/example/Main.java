package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialisation du contexte Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        // Obtention du bean ServicePersonne à partir du contexte
        ServicePersonne servicePersonne = context.getBean(ServicePersonne.class);

        // Appels aux méthodes du service pour obtenir les informations sur les personnes
        System.out.println("Personne 1 Name: " + servicePersonne.getPersonne1Name());
        System.out.println("Personne 1 Age: " + servicePersonne.getPersonne1Age());
        System.out.println("Personne 2 Name: " + servicePersonne.getPersonne2Name());
        System.out.println("Personne 2 Age: " + servicePersonne.getPersonne2Age());

        // Fermeture du contexte Spring
        context.close();
    }
}
