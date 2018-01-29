import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        Contacts cts[] = new Contacts[20];
        boolean continuer=false;
        Contacts ct = new Contacts();
        cts[Contacts.conts-1]=ct;
        for (int i=0; i<ct.tel.length;i++){
            ct.tel[i]=new Telephone();}


        Scanner sc = new Scanner(System.in);
         while(continuer==false)   {
            System.out.println("Que voulez-vous faire?\n" + "1-Ajouter un contact\n2-Modifier un contact" +
                    "\n3-Afficher un contact\n4-Quitter");
            choix=sc.nextInt();


            switch (choix) {

                case 1:
                    continuer = true;

                    System.out.println("Ce contact sera enregistré comme # " + Contacts.conts);
                    System.out.println("Prénom : " + ct.getPrenom());
                    ct.setPrenom(sc.next());
                    System.out.println("Nom : " + ct.getNom());
                    ct.setNom(sc.next());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.ad1.getNumero());
                    ct.ad1.setNumero(sc.next());
                    System.out.println("Rue : " + ct.ad1.getRue());
                    ct.ad1.setRue(sc.next());
                    System.out.println("App. : "+ct.ad1.getApp());
                    ct.ad1.setApp(sc.next());
                    System.out.println("Ville : "+ct.ad1.getVille());
                    ct.ad1.setVille(sc.next());
                    System.out.println("Province : "+ct.ad1.getProv());
                    ct.ad1.setProv(sc.next());
                    System.out.println("Pays : "+ct.ad1.getPays());
                    ct.ad1.setPays(sc.next());
                    System.out.println("OCCUPATION : \nPoste : " + ct.oc.getPoste());
                    ct.oc.setPoste(sc.next());
                    System.out.println("ENTREPRISE : \nNom : " + ct.oc.ent.getNom());
                    ct.oc.ent.setNom(sc.next());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.oc.ent.ad.getNumero());
                    ct.oc.ent.ad.setNumero(sc.next());
                    System.out.println("Rue : " + ct.oc.ent.ad.getRue());
                    ct.oc.ent.ad.setRue(sc.next());
                    System.out.println("App. : " + ct.oc.ent.ad.getApp());
                    ct.oc.ent.ad.setApp(sc.next());
                    System.out.println("Ville : " + ct.oc.ent.ad.getVille());
                    ct.oc.ent.ad.setVille(sc.next());
                    System.out.println("Province : " + ct.oc.ent.ad.getProv());
                    ct.oc.ent.ad.setProv(sc.next());
                    System.out.println("Pays : " + ct.oc.ent.ad.getPays());
                    ct.oc.ent.ad.setPays(sc.next());
                    System.out.println("Voulez-vous entrer un numéro de téléphone? 1-oui 2-non");
                    choix = sc.nextInt();
                    if (choix == 1) {
                        int j = 0;
                        System.out.println("À quoi sert ce numero? Maison,Travail,Mobile,...");
                        ct.tel[j].setNom(sc.next());
                        System.out.println(" Veuillez entrer un numéro");
                        ct.tel[j].setNumero(sc.next());
                        j++;
                        continuer=false;
                    } else {
                        System.out.println("Votre contact a été entré avec succès.");
                        continuer=false;
                    }
                    break;
                case 2:
                    cts[choix-1]=ct;
                    System.out.println("Quel contact voulez-vouz modifier? Vous avez : " + Contacts.conts + " contacts");
                    choix = sc.nextInt();
                    System.out.println("Vouz avez choisi le contact # " + choix);
                    System.out.println("Voici ses informations");

                    System.out.println("Ce contact sera enregistré comme # " + Contacts.conts);
                    System.out.println("Prénom : " + ct.getPrenom());
                    ct.setPrenom(sc.next());
                    System.out.println("Nom : " + ct.getNom());
                    ct.setNom(sc.next());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.ad1.getNumero());
                    ct.ad1.setNumero(sc.next());
                    System.out.println("Rue : " + ct.ad1.getRue());
                    ct.ad1.setRue(sc.next());
                    System.out.println("App. : "+ct.ad1.getApp());
                    ct.ad1.setApp(sc.next());
                    System.out.println("Ville : "+ct.ad1.getVille());
                    ct.ad1.setVille(sc.next());
                    System.out.println("Province : "+ct.ad1.getProv());
                    ct.ad1.setProv(sc.next());
                    System.out.println("Pays : "+ct.ad1.getPays());
                    ct.ad1.setPays(sc.next());
                    System.out.println("OCCUPATION : \nPoste : " + ct.oc.getPoste());
                    ct.oc.setPoste(sc.next());
                    System.out.println("ENTREPRISE : \nNom : " + ct.oc.ent.getNom());
                    ct.oc.ent.setNom(sc.next());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.oc.ent.ad.getNumero());
                    ct.oc.ent.ad.setNumero(sc.next());
                    System.out.println("Rue : " + ct.oc.ent.ad.getRue());
                    ct.oc.ent.ad.setRue(sc.next());
                    System.out.println("App. : " + ct.oc.ent.ad.getApp());
                    ct.oc.ent.ad.setApp(sc.next());
                    System.out.println("Ville : " + ct.oc.ent.ad.getVille());
                    ct.oc.ent.ad.setVille(sc.next());
                    System.out.println("Province : " + ct.oc.ent.ad.getProv());
                    ct.oc.ent.ad.setProv(sc.next());
                    System.out.println("Pays : " + ct.oc.ent.ad.getPays());
                    ct.oc.ent.ad.setPays(sc.next());
                    System.out.println("Telephones");
                    for (int j = 0; j < ct.tel.length; j++) {
                        System.out.println(ct.tel[j].getNom() + "\t" + ct.tel[j].getNumero());
                    }
                    System.out.println("Voulez-vous entrer un numéro de téléphone? 1-oui 2-non");
                    choix = sc.nextInt();
                    if (choix == 1) {
                        int j = 0;
                        System.out.println("À quoi sert ce numero? Maison,Travail,Mobile,...");
                        ct.tel[j].setNom(sc.next());
                        System.out.println(" Veuillez entrer un numéro");
                        ct.tel[j].setNumero(sc.next());
                        j++;
                        continuer=false;

                    } else {
                        System.out.println("Votre contact a été entré avec succès.");
                        continuer=false;
                    }
                    break;
                case 3 : System.out.println("Quel contact coulez-vous afficher?");
                        choix=sc.nextInt();
                        cts[choix-1]=ct;
                        System.out.println("Voici ses coordonnées : ");
                    System.out.println("Prénom : " + ct.getPrenom());
                    System.out.println("Nom : " + ct.getNom());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.ad1.getNumero());
                    System.out.println("Rue : " + ct.ad1.getRue());
                    System.out.println("App. : "+ct.ad1.getApp());
                    System.out.println("Ville : "+ct.ad1.getVille());
                    System.out.println("Province : "+ct.ad1.getProv());
                    System.out.println("Pays : "+ct.ad1.getPays());
                    System.out.println("OCCUPATION : \nPoste : " + ct.oc.getPoste());
                    System.out.println("ENTREPRISE : \nNom : " + ct.oc.ent.getNom());
                    System.out.println("ADRESSE\nNuméro Civique : " + ct.oc.ent.ad.getNumero());
                    System.out.println("Rue : " + ct.oc.ent.ad.getRue());
                    System.out.println("App. : " + ct.oc.ent.ad.getApp());
                    System.out.println("Ville : " + ct.oc.ent.ad.getVille());
                    System.out.println("Province : " + ct.oc.ent.ad.getProv());
                    System.out.println("Pays : " + ct.oc.ent.ad.getPays());
                    System.out.println("Telephones");
                    for (int j = 0; j < ct.tel.length; j++) {
                        System.out.println(ct.tel[j].getNom() + "\t" + ct.tel[j].getNumero());
                    }continuer=false;
                    break;
                case 4 : continuer=true;
                break;



            }
            }

        }
    }

