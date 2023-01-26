package gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayListSoru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> grades=new ArrayList<>();
        String answer;
        int sum=0;
        int avg=0;
        int passed=0;

        do {
            System.out.println("not gir: ");
            int grade=input.nextInt();
            grades.add(grade);
            sum+=grade;
            input.nextLine();
            System.out.println("devam etmek istiyor musun?");
            answer=input.nextLine();
        }while(answer.equalsIgnoreCase("yes"));
        avg = sum / grades.size();
        System.out.println("avg = " + avg);

        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i)>avg)
                passed++;
        }

        System.out.println("passed student(s) = " + passed);

    }
}
