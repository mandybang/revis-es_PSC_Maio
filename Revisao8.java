public class Revisao8 {
    public static void main(String[] args) {
       /** int x = 0;
        int y = x++;
        int z = y;

        x++;
        ++z;
        z++;
        ++y;
        System.out.println(x+y+z); */

       /**double notaUm, notaDois;

        notaUm = notaDois = 10;
        notaUm = Math.pow(notaUm, 2);
        System.out.println(notaUm + notaDois);*/


        /**int [] arrayNumeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i<arrayNumeros.length; i++) {
            soma += arrayNumeros[0];
        }
        System.out.println(soma);*/

      /**String filme = null;
       String[] filmes = {"Oppenheirmer", "Pobres Criaturas", "Barbie"};

       for (int i =0; i <filmes.length; i++) {
        filme = filmes[i];
       }
       System.out.println(filme);*/
       
       /**String filme = null;
       String[] filmes = {"Oppenheirmer", "Pobres Criaturas", "Barbie"};

       filme = filmes[1].substring(0,6);
       System.out.println(filme);*/

       /**String filme = null;
       String[] filmes = {"Oppenheirmer", "Pobres Criaturas", "Barbie"};

       filme = filmes[2].substring(3,5);
       System.out.println(filme);*/

       String[] filmes = {"Oppenheirmer", "Pobres Criaturas", "Barbie"};

       int tamanho = filmes[0].length() + filmes[1].length() + filmes[2].length();
       System.out.println(tamanho);

    }
    
}
