public class topic18 {
    public static void main(String[] args) {
        Police a1=new Police();
        Police a2=new Police();
        System.out.println(a1+" "+a2);
        a1.setCode(12);
        a2.copy(a1);
        System.out.println(a2.getCode());
    }
}

class Police
{
    private String data;
    private String identity;
    private int code;
    public String getData() {
        return data;
    }

    public String getIdentity() {
        return identity;
    }

    public int getCode() {
        return code;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void copy(Police x)
    {
        this.data=x.getData();
        this.identity=x.getIdentity();
        this.code=x.getCode();

    }
}

