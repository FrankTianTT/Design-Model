package idcard;
import framework.*;

public class IDCard extends Product{
    private String owner;
    public IDCard(String owner){
        System.out.println("produce ID Card of " + owner + '.');
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("use ID Card of " + owner + '.');
    }

    public String getOwner(){
        return this.owner;
    }
}
