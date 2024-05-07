import java.util.Scanner;

public class ClashRoyale {




    public void jugar(){
        char seleccionArena;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el arena del royale: ");
        seleccionArena=sc.next().charAt(0);
        Arena arena=new Arena();
        arena.iniciarArena(seleccionArena);
        System.out.println(seleccionArena);
        //arena.mostrarArena(arena);

    }
}
