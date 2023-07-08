public class topic13 {
    public static void main(String[] args) {
        Friend a1=new Friend("hassan");
        Friend a2=new Friend("hassan");
        Friend a3=new Friend("hassan");
        Friend a4=new Friend("hassan");
        System.out.println(Friend.count);
    }
}
class Friend
{
    String name;
    static int count;
    Friend(String name)
    {
        this.name=name;
        this.count++;
    }
}
