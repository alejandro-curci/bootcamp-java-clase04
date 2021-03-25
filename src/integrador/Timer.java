package integrador;

import java.util.Date;

public class Timer {

    private long ini;
    private long end;

    public void start() {
        Date inicio = new Date();
        ini = inicio.getTime();
    }
    public void stop() {
        Date fin = new Date();
        end = fin.getTime();
    }

    public long elapsedTime() {
        return end - ini;
    }
}
