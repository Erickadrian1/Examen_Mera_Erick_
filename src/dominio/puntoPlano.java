
package dominio;


public class puntoPlano {
private int x;
    int y;
    int distancia;
    
    public puntoPlano(int x,int y){
    this.x=x;
    this.y=y;
    }
    
    public void moverArriba(int incremento){
        y=y+incremento;
    }
    
    public void moverAbajo(int incremento){
        y=y-incremento;
    }
    
    public void moverDerecha(int incremento){
    x+=incremento;
    }
    
    public void moverIzquierda(int incremento){
    x-=incremento;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public double calculoDistancia(Punto T1, Punto T2){
        int x1=T2.getX();
        int y1=T2.getY();
        int x2=T1.getX();
        int y2=T1.getY();
        int r1,r2;
        r1=x2-x1;
        r2=y2-y1;
        double z1 = Math.pow(r1,2);
        double z2 = Math.pow(r1,2);
        double distancia = Math.sqrt(z1+z2);
        return distancia;
    }
}
