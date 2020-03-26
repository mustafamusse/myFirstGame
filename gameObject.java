import java.awt.*;

public abstract class gameObject {

    protected int x, y;
    protected ID id;
    protected int vX, vY;

    public gameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
       return x;
    }

    public int getY(){
        return y;
    }

    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return id;
    }

    public void setvelX(int vX){
        this.vX = vX;
    }
    public void setvelY(int vY){
        this.vY = vY;
    }

    public int getvelX(int vX){
        return vY;
    }
    public int getvelY(int vY){
        return vY;
    }
}
