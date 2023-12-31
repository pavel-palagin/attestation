public abstract class Animal {
    private String nickname;

    public Animal(String nickname){
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    abstract void Voice();

    abstract void ordinaryActivity();

    @Override
    public String toString() {
        return this.getClass().getName() + " " + nickname;
    }
}