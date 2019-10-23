package no.hiof.gruppe3.kode;

public class Bestilling {

    private long kortnr;
    private short cvc;
    private int antallBilletter = 100;


    /* her bør vi senere også sende med noe som bruker? sende dette videre til en ekstern betalingsside, som returnerer
    en boolean (True for godkjent, False for ikke godkjent), bruker returverdien her til å sende billetter på mail/sms.
    At kort blir avvist vil vises hos tredjepart.
     */
    public String bestillBillet(int velgAntallBilleter) {



        if(antallBilletter > 0){



            if(velgAntallBilleter > antallBilletter){
                return "Det finnes desverre ikke nok billetter";

            }
            else{
                antallBilletter -= velgAntallBilleter;

                boolean godkjentBetaling = sendTilBankAccept(new Bruker("abs", "def", 27));
                // sende til betalingsside, returnerer godkjent ikke godkjent
                if (godkjentBetaling){
                    sendBekreftelse(new Bruker("abs", "def", 27));

                    // Send bekreftelse(bruker) <-- sender mail med billett/ evt sms.

                    return "Bestilling vellykket";
                }

                else {
                    return "Noe gikk galt";

                }

            }
        }
        else{
            return "Det er desverre tomt for billetter";
        }


    }

    private void sendBekreftelse(Bruker bruker) {

        // sender bekreftelse på mail
    }

    private Boolean sendTilBankAccept(Bruker bruker){

        // sender brukeren videre til en sikker bankside. Denne vil returnere true dersom betalingen blir vellykket.

        return true;

    }
}