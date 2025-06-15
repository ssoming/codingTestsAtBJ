package goorm.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SuccessPersonCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        int cnt = Integer.parseInt(count);
        List<String[]> testInfo = new ArrayList<>();


        for(int i = 0; i<cnt; i++){
            String[] info = new String[2];
            String countPerson = br.readLine();
            info[0] = countPerson;
            String scores = br.readLine();
            info[1] = scores;
            // System.out.println("info[0] : " + info[0]);
            // System.out.println("info[1] : " + info[1]);
            testInfo.add(info);
        }

        for(int i = 0; i < testInfo.size() ; i++){
            String[] info = testInfo.get(i);
            int countPerson = Integer.parseInt(info[0]);
            String[] scores = info[1].split(" ");

            List<Integer> realScores = new ArrayList<>();
            int average = 0;

            for(int j=0; j <scores.length; j++ ){
                String score = scores[j];
                if(!score.isEmpty()){
                    average += Integer.parseInt(score);
                    realScores.add(Integer.parseInt(score));
                }
            }
            // System.out.println("total : " + average);
            // System.out.println("countPerson : " + countPerson);
            double realAverage =  (double) average/countPerson ;
            // System.out.println("realAverage : " + realAverage);
            average = (int) Math.ceil(realAverage);
            int successCnt = 0;
            for(int j=0; j <realScores.size(); j++ ){
                // System.out.println("average : " + average);
                // System.out.println("realScores.get(j) : " +realScores.get(j));
                if(realScores.get(j) >=average ){
                    successCnt++;
                }else if (realScores.size() == 1){
                    successCnt++;
                }
            }

            System.out.println(successCnt + "/" + realScores.size());

        }

    }
}
