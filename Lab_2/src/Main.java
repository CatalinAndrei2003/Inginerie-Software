
 enum NumarClasa {
    I, II, III, IV;
}

 enum Gen {
     masculin, feminin, nespecificat;
 }

 public class Main {
     public static void main(String[] args) {
         Scoala scoala = new Scoala();

         Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
         Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

         scoala.adaugaClasa("1A", clasa1A);
         scoala.adaugaClasa("2B", clasa2B);

         Elev elev1 = new Elev("Ion Popescu", Gen.masculin);
         Elev elev2 = new Elev("Ana Ionescu", Gen.feminin);

         scoala.adaugaElevInClasa("1A", elev1);
         scoala.adaugaElevInClasa("2B", elev2);

         System.out.println("Număr total de clase: " + scoala.getNumarClase());
         System.out.println("Număr total de elevi: " + scoala.getTotalElevi());

         scoala.eliminaElevDupaNume("Ion Popescu");
         System.out.println("Număr total de elevi după eliminare: " + scoala.getTotalElevi());
     }
 }



