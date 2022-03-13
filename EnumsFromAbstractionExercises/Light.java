package EnumsFromAbstractionExercises;

public class Light {
    private Color color;

    public Light (Color color){
        this.color = color;



    }

    public void changeColor(){
        switch (this.color){
            case RED :
                this.color = Color.GREEN;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
            case GREEN :
                this.color = Color.YELLOW;
                break;

        }
    }

    public Color getColor() {
        return color;
    }
}
