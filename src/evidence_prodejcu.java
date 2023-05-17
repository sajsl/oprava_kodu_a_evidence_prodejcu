import java.math.BigDecimal;
import java.time.LocalDate;

public class evidence_prodejcu {

    public static void main(String[] args) {
        String nameAndSurname = "MichalStanislav";
        LocalDate sellersDateOfBirth = LocalDate.of(2022,12,22);
        int numberOfContracts = 10;
        int tonsSold = 50;
        String cityOfHeadquarter = "Prague";
        String licensePlate = "5AZ 0563";
        double consumptionInLiters = 5.6;
        String ipAddress = "192.168.48.39";

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu činí " + (tonsSold / numberOfContracts) + " tun.");
    }
}