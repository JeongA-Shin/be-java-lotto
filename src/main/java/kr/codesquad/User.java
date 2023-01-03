package kr.codesquad;

import java.util.*;


public class User{

    private ArrayList<Integer> inputs;
    private int bonusBall;

    public User() {
        inputs = new ArrayList<>();
    }

    public ArrayList<Integer> getLottoInput(){
        System.out.println("당첨 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String inputNumbers = sc.nextLine();
        for(String input : inputNumbers.split(", ")){
            inputs.add(Integer.valueOf(input));
        }
        return inputs;
    }

    public Integer getBonusLottoInput() {
        System.out.println("보너스 볼을 입력해주세요. ");
        Scanner sc = new Scanner(System.in);
        this.bonusBall = sc.nextInt();
        return bonusBall;
    }


}
