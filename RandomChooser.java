public class RandomChooser extends Player {
    public boolean cooperates(){
        return ((int)Math.random()*2) == 1;
    }
}
