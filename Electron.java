public interface Electron {

    boolean onOrOff = false;

    boolean on();


    boolean off();

    default void electronic(){
        if(onOrOff){
            System.out.println("Default");
        }
    }
}
