package no.hiof.gruppe3.kode;

public class Innstillinger {

    public void endrePassord(LagNyBruker bruker, String passord, String nyttPassord, String bekreftNyttPassord){

        if(passordSjekk(bruker.getPassord(), passord)){

            if (nyttPassord.equals(bekreftNyttPassord)){

                bruker.setPassord(nyttPassord);
            }
            else{
                System.out.println("passordene er ikke like");
            }

        }
        else{
            System.out.println("Passordet er feil");
        }

    }

    public void endreEpost (LagNyBruker bruker, String passord, String nyEpost, String bekreftEpost){

        if(passordSjekk(bruker.getPassord(), passord)){

            if (nyEpost.equals(bekreftEpost)){

                bruker.setEpost(nyEpost);

            }
            else{
                System.out.println("Epostene er ikke like");
            }
        }
        else{
            System.out.println("Feil passord");
        }

    }

    private Boolean passordSjekk(String faktiskPassord, String tastetPassord){

        boolean passordLikt = false;

        if (tastetPassord.equals(faktiskPassord)){
            passordLikt = true;
        }

        return passordLikt;


    }

}
