public class Hamster extends  Animal {
    public Hamster(String nickname){

        super(nickname);
    }

    @Override
    void Voice() {

    }


    @Override
    public void ordinaryActivity() {
        System.out.println(" run in wheel");
    }
}

