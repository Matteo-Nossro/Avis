package fr.esgi.fx.avis.entities;

public class Moderateur extends Utilisateur {
    private final String numeroDeTelephone;

    public Moderateur(Long id, String pseudo, String motDePasse, String email, String numeroDeTelephone) {
        super(id, pseudo, motDePasse, email);
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() { return numeroDeTelephone; }
}
