import java.awt.*;

public class WhiteTiger extends Tiger {
    boolean hasInfected;

    public WhiteTiger(){
        hasInfected=false;
    }

    public Color getColor() {
        //Always Color.WHITE.
        return Color.WHITE;
    }

    public String toString() {
        if (hasInfected){
            return super.toString();
        } else {
            return "tgr";
        }
        //"tgr" if it hasn’t infected another Critter yet, “TGR” if it has infected.
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);
        //Same as a Tiger. Note: you’ll have to override this method to figure out if it has infected another Critter.
    }
}