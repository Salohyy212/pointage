package com.salohy;

import java.time.Instant;
import java.util.Date;


public record Employe(String nom, String prenom, int numeroDeMatricule, Date dateDeNaissance, Instant dateDembauche, Instant dateFinDeContrat, Salaire salaire, String categorie ) {

}
