public class Computer implements Electron {
    RAM ram;

    Processor cpu;

    Storage storage;
    public Computer( RAM ram, Processor cpu, Storage storage){
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public boolean on(){
        return true;
    }

    public boolean off(){
        return true;
    }
 

}
