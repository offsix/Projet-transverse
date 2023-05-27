package Modele;

import java.time.LocalDate;

public class ModeleCalendrier {

  private LocalDate datedebut;
  private LocalDate datefin;

  public ModeleCalendrier(LocalDate datedebut,LocalDate datefin){
    this.datedebut = datedebut;
    this.datefin = datefin;
  }
  
  public final LocalDate getDatedebut() {
    return datedebut;
  }

  public final void setDatedebut(LocalDate datedebut) {
    this.datedebut = datedebut;
  }

  public final LocalDate getDatefin() {
    return datefin;
  }

  public final void setDatefin(LocalDate datefin) {
    this.datefin = datefin;
  }
}
