package proxy_pattern;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }

    public void loadFromDisk(){
        System.out.println("loading from disk");
    }
}
