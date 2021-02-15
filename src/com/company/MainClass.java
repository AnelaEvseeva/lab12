import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost;
    int countChildrens;

    Children []child=null;
}

class Children {
    String name;
    int age;
}

public class MainClass {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите количество сотрудников ");
	int count = sc.nextInt();
	sc.nextLine();

	Sotrudnik []sotr = new Sotrudnik[count];
	System.out.println("Введите информацию о каждом сотруднике: ");
	for (int i = 0; i<sotr.length; i++) {
	    sotr[i]=new Sotrudnik();
	    System.out.println("Введите фамилию "+(i+1)+" сотрудника");
	    sotr[i].fam = sc.nextLine();

	    System.out.println("Введите его имя");
	    sotr[i].im = sc.nextLine();

        System.out.println("Введите его отчество");
        sotr[i].otch = sc.nextLine();

        System.out.println("Введите его должность");
        sotr[i].doljnost = sc.nextLine();

        System.out.println("Введите количество детей");
        sotr[i].countChildrens = sc.nextInt();
        sc.nextLine();

        if(sotr[i].countChildrens!=0) {
            sotr[i].child = new Children[sotr[i].countChildrens];
            System.out.println("Дети");
            for(int j = 0; j<sotr[i].child.length; j++){
                sotr[i].child[j]=new Children();

                System.out.println("Введите имя "+(i+1)+" ребенка");
                sotr[i].child[j].name = sc.nextLine();

                System.out.println("Введите его возраст");
                sotr[i].child[j].age = sc.nextInt();
                sc.nextLine();
            }
        }
    }
	System.out.println("\nСотрудники фирмы \n фам \t имя \t отч \t должность");
	for(Sotrudnik s : sotr){
	    System.out.print(s.fam+"\t"+s.im+"\t"+s.otch+"\t"+s.doljnost);
	    System.out.println("\n Дети: ");

	    for(Children c : s.child)
	        System.out.println("\t\t\t"+c.name+"\t\t"+c.age);
	    System.out.println("");
    }
    }
}
