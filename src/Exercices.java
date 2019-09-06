import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercices {
    public List exercice1(List<String> liste){
        return liste.stream()
                .map((n)->n.toUpperCase())
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
    }

    public List exercice2(List<String> liste){
        return liste.stream()
                .filter((n)->n!="INUTILE")
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
    }

    public String exercice3(List<String> liste){
        return liste.stream()
                .collect(Collectors.joining());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */

    }


    public String exercice4(List<String> liste){
        return liste.stream()
                .map((n)->n.toUpperCase())
                .collect(Collectors.toList()).stream()
                .filter((n)->!n.equals("AAA"))
                .collect(Collectors.joining());

        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
    }

    public List exercice5(List<Integer> liste){
        return liste.stream()
                .map((n)->n*2)
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
    }

    public Integer exercice6(List<Integer> liste){
        int rep = liste.stream()
                .reduce((x,y)->x*y)
                .get();
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        return rep;
    }

    public List exercice7(List<Integer> liste){
        return liste.stream()
                .filter((x)->(x*x)>50).collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
    }

    public List exercice8(List<Integer> liste){
        liste = liste.stream()
                .map((n)->n*9)
                .map((n)->Character.getNumericValue(n.toString().charAt(0))
        )
                .collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        return liste;
    }

    public List exercice9(){
        List<Integer> inf = Stream.iterate(1,i->i+1)
                .filter((n)->(n%3==0)&&(n%7==0))
                .limit(10)
                .collect(Collectors.toList());
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        return inf;
    }

    public List exercice10(){
        List<Integer> inf = Stream.iterate(1,i->i+1)
                .filter((n)->((Math.sqrt(n)%1==0)))
                .limit(20)
                .collect(Collectors.toList());
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        return inf;
    }
}
