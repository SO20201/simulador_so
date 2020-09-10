package Model;

public class PCB {
    int PID;
    int PC;
    int burstTime;
    int prioridad;
    int estado;
    int memoria;
    
    public PCB(int pid) {
        this.PID = pid;
        generarValoresAleatorios();
    }
    
    public PCB(int pid, int bt) {
        this.PID = pid;
        burstTime = bt;
        estado = Proceso.NUEVO;
        generarMemoria();
    }
    
    private void generarValoresAleatorios(){
        //Min + (int)(Math.random() * ((Max - Min) + 1))
        burstTime = Proceso.MIN_BT + (int)(Math.random()*((Proceso.MAX_BT-Proceso.MIN_BT)+1));
        //Valor aleatorio entero entre 1 y 5
        prioridad = (int)(Math.random()*5+1);
        generarMemoria();
    }
    private void generarMemoria(){
        //Valor aleatorio en base a el tiempo de burst time
        memoria= (int)(burstTime - 50 + 10 * Math.random()+1);
    }
}
