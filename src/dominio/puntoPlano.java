
package dominio;


public class puntoPlano {
private int x;
    int y;
    int distancia;
    
    public puntoPlano(int x,int y){
    this.x=x;
    this.y=y;
    }
    
    public void moverArriba(int aumento){
        y=y+aumento;
    }
    
    public void moverAbajo(int aumento){
        y=y-aumento;
    }
    
    public void moverDerecha(int aumento){
    x+=aumento;
    }
    
    public void moverIzquierda(int aumento){
    x-=aumento;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public double calculoDistancia( puntoPlano P1, puntoPlano P2){
        int x1=P2.getX();
        int y1=P2.getY();
        int x2=P1.getX();
        int y2=P1.getY();
        int r1,r2;
        r1=x2-x1;
        r2=y2-y1;
        double z1 = Math.pow(r1,2);
        double z2 = Math.pow(r1,2);
        double distancia = Math.sqrt(z1+z2);
        return distancia;
    }
}