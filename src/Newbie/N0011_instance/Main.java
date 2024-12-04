package Newbie.N0011_instance;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(Earth.instance.toString());

        Moon moon = Moon.getInstance();
        System.out.println(moon.toString());
    }
}

// 单例化 公有
class Earth{
    public static Earth instance = new Earth();

    // 避免被new
    private Earth(){}

    public String toString(){
        return "Earth";
    }
}

// 单例化 私有
class Moon{
    private static Moon instance;

    private Moon(){}

    public static Moon getInstance(){
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }

    public String toString(){
        return "Moon";
    }
}
