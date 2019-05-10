package ro.banking;

public class AccountAssistant {

    private Credit creditAccount;
    private Datorii datoriiAccount;
    private Economii economiiAccount;

    public AccountAssistant() {
        creditAccount = new Credit();
        datoriiAccount = new Datorii();
        economiiAccount = new Economii();
    }

    public void acordareCredit(int amount) {
        creditAccount.acordareCredit(amount);
    }

    public void plataCredit(int amount) {
        creditAccount.plataCredit();
    }

    public void adaugaDatorie() {
        datoriiAccount.adaugareDatorie();
    }

    public void plataDatorie(int amount2) {
        datoriiAccount.plataDatorie();
    }

    public void stergereDatorie() {
        datoriiAccount.stergereDatorie();
    }

    public void depunereEconomii() {
        economiiAccount.depunere();
    }

    public void retragereEconomii(int amount3) {
        economiiAccount.retragere();
    }

    public void trandferEconomii() {
        economiiAccount.transfer();
    }
}
