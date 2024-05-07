public class Arena {


    public char [][] arenaGrande;
    public char [][] arenaMediana;
    public char [][] arenaChica;

public Arena(){
    arenaGrande = new char[30][15];
    arenaMediana = new char[15][10];
    arenaChica = new char[10][10];
}






    public  void iniciarArena(char seleccionArena){
        switch(seleccionArena){
            case 'P':
                iniciarChica();

            case 'M':{
                iniciarMediana();

            }
            case 'G':
                iniciarGrande();

        }



    }



    public void iniciarChica(){
        arenaChica=new char[10][10];
        for (int i = 0; i < arenaChica.length; i++) {
            for (int j = 0; j < arenaChica.length; j++) {
                arenaChica[i][j]='*';
            }
        }
    }


    public void iniciarMediana(){
        arenaMediana=new char[15][10];
        for (int i = 0; i < arenaMediana.length; i++) {
            for (int j = 0; j < arenaMediana.length; j++) {
                arenaMediana[i][j]='*';
            }
        }
    }
    public char[][] iniciarGrande(){
    arenaGrande=new char[30][15];
    for (int i = 0; i < arenaGrande.length; i++) {
        for (int j = 0; j < arenaGrande.length; j++) {
            arenaGrande[i][j]='*';
        }
    }
    return arenaGrande;
    }



  //  public void mostrarArena(Arena arena){
   //     for (int i = 0; i < ; i++) {
     //       for (int j = 0; j < ; j++) {
       //         System.out.print(chars[j] + "\t");

            }
         //   System.out.println();

       // }
   // }
//}





