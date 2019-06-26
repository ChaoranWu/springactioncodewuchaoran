package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CDPlayer implements MediaPlayer {
private CompactDisc cd;
@Autowired
    public CDPlayer(CompactDisc cd){
     this.cd = cd;
    }


    public void player() {
        cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
