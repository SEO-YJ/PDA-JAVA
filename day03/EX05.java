package day03;

public class EX05 {
    public static void main(String[] args) {
        // OTT: Netflix, Tving
        // printOpeningLogo() : sout "넷플" "티빙"
        // netflix.play() -> printOpeningLogo
        //                   "영상 시작"
        // netflix.finish() -> sout
        Netflix netflix = new Netflix("넷플");
        Tving tving = new Tving("티빙");

        netflix.play();
        netflix.finish();
        tving.play();
        tving.finish();
    }

}

abstract class OTT {
    String ottName;

    OTT(String ottName){
        this.ottName = ottName;
    }

    abstract void printOpeningLogo();

    void play() {
        this.printOpeningLogo();
        System.out.println("영상 시작");
    }

    void finish() {
        System.out.println("다 봤다.");
    }
}

class Netflix extends OTT {
    Netflix(String ottName){
        super(ottName);
    }

    @Override
    void printOpeningLogo() {
        System.out.println("Netflix");
    }
}

class Tving extends OTT {
    Tving(String ottName){
        super(ottName);
    }

    @Override
    void printOpeningLogo() {
        System.out.println("Tving");
    }
}
