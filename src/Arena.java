public class Arena {


    public char [][] arena;



    public Arena(){

    }


    public char[][] getArena() {
        return arena;
    }

    public  void iniciarArena(String seleccionArena){
        switch(seleccionArena){
            case "P":
                iniciarChica();
                break;

            case "M":{
                iniciarMediana();
                break;
            }
            case "G":
                iniciarGrande();
                break;
            default:
               System.out.println("Solo son validas las opciones P,M,G");
        }



    }



    public char [][] iniciarChica(){
        arena=new char[10][10];
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[0].length; j++) {
                arena[i][j]='*';
            }
        }
        return arena;
    }


    public char [][] iniciarMediana(){
        arena=new char[15][10];
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[0].length; j++) {
                arena[i][j]='*';
            }
        }
        return arena;
    }



    public char[][] iniciarGrande(){
        arena= new char[30][15];
    for (int i = 0; i < arena.length; i++) {
        for (int j = 0; j < arena[0].length; j++) {
            arena[i][j]='*';
        }
    }
    return arena;

    }



   public void mostrarArena(char[][] arena){
     for (int i = 0; i < arena.length ; i++) {
         for (int j = 0; j < arena[0].length ; j++) {
             System.out.print(arena[i][j] + "\t");

            }
           System.out.println();

       }
    }
}





