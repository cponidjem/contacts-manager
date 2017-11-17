package com.fredericboisguerin.insa;
import java.util.Scanner;

public class UI {

    ContactsManager contactsManager;

    public UI(ContactsManager contactsManager){
        this.contactsManager=contactsManager;
    }

    public void start(){


        int choix;
        Scanner sc = new Scanner(System.in);
        do  {

            System.out.println("\n Interface en ligne de commande");
            System.out.println(
                            "1- Afficher les contacts\n" +
                            "2- Ajouter un contact\n" +
                            "3- Chercher un contact\n" +
                            "4- Quitter l'application\n");

            try {
                choix = Integer.parseInt(sc.nextLine());
            }
            catch (Exception e)
            {
                choix = 5;
            }
            switch (choix) {
                case 1:
                    contactsManager.printAllContacts();
                    break;
                case 2:
                    System.out.println("Rentrez les informations du contact à ajouter :\n" + "Rentrez le nom :");
                    String nom = sc.nextLine();
                    System.out.println("Rentrez l'adresse mail :");
                    String mail = sc.nextLine();
                    System.out.println("Rentrez le numero de telephone :");
                    String numero = sc.nextLine();

                    try {
                        contactsManager.addContact(nom, mail, numero);
                    } catch (Exception e) {
                        System.out.println("Exception levée par addcontact");
                    }
                    break;
                case 3:
                    System.out.println("Rentrez le nom du contact à rechercher :");
                    nom = sc.nextLine();
                    contactsManager.searchContactByName(nom);
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé le logiciel ! Bisous ! <3 <3\n");
                    break;
                default :
                    System.out.println("idiot je veux un chiffre entre 1 et 4 !\n");
                    break;
            }
        } while ((choix!=4));

        sc.close();
    }
}
