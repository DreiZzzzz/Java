public class Pokemon {
    private String name;
    private String desc;
    private int num;

    public Pokemon(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}