package ch08.sec04;

public class Audio implements RemoteControl{
    //필드
    private int volume;

    //interface의 추상메소드 오버라이딩
    @Override
    public void turnOn(){
        System.out.println("Audio 켬");
    }
    @Override
    public void turnOff(){
        System.out.println("Audio 끔");
    }
    @Override
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = volume;
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = volume;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨:" + volume);
    }
}
