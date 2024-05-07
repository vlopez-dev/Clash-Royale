import java.util.Scanner;

public class ClashRoyale {




    public void jugar(){
        String seleccionArena;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el arena del royale: ");
        seleccionArena=sc.next();
        Arena arena=new Arena();
        arena.iniciarArena(seleccionArena);
        arena.mostrarArena(arena.getArena());

        //arena.mostrarArena(arena);

    }
}
