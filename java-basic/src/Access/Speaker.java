package Access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume=volume;
    }

    public void volumUp(){
        if(volume>=100){
            System.out.println("음량초과");
        }else {
            volume+=10;
            System.out.println("음량 10증가");
        }
    }

    public void volumDown(){
            volume-=10;
            System.out.println("볼륨 10다운");
    }

    public void showVolume(){
    System.out.println("현재 볼륨 : "+volume);
}
}
