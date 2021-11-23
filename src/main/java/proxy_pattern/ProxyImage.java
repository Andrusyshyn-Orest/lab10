package proxy_pattern;

import lombok.Getter;

@Getter
public class ProxyImage implements Image{
    private RealImage realImmage;
    private String filename;

    public ProxyImage(String filename){
        this.realImmage = new RealImage(filename);
        this.filename = filename;
    }

    @Override
    public void display() {
        this.realImmage.loadFromDisk();
        this.realImmage.display();
    }
}
