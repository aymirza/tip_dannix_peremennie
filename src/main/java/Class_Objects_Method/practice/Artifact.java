package Class_Objects_Method.practice;

public class Artifact {

    int number;
    String culture;
    int createdVek;

    public Artifact(int number){
        this.number = number;
    }
    public Artifact(int number,String culture){
        this.number = number;
        this.culture = culture;
    }
    public Artifact(int number, String culture,int createdVek){
        this.number=number;
        this.culture=culture;
        this.createdVek=createdVek;
    }

    public static void main(String[] args) {



        Artifact artifact1 = new Artifact(123);
        Artifact artifact2 = new Artifact(123,"Ацтеки");
        Artifact artifact3 = new Artifact(123,"Ацтеки",12);

        System.out.println(artifact1.toString());
        System.out.println(artifact2);
        System.out.println(artifact3);
    }



}
