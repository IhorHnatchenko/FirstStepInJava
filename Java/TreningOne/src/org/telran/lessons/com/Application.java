package org.telran.lessons.com;

public class Application {
    public static void main(String[] args) {
        Anime animeOne = new Anime("SAO",2011,"Science fiction","Reki Kawahara and Adati Sango");
        animeOne.setGrade(9.9);
        Anime animeTwo = new Anime("Angel next door", 2023, "Romance and daily life", "Saeki-san");
        animeTwo.setGrade(9.3);
        Anime animeThree = new Anime("Horimia", 2021, "Romane and daily life", "Masasi Isihama");
        animeThree.setGrade(9.7);


        double[] greageContane = new double[4];
        greageContane[0] = 0;
        greageContane[1] = animeOne.getGrade();
        greageContane[2] = animeTwo.getGrade();
        greageContane[3] = animeThree.getGrade();
        double length = greageContane.length;
        System.out.println("The length of massive --> " + length + "\n");


        for (int i = 0; i < length; i++){
            if(greageContane[i] > 9.6){
                System.out.println("The best anime " + i + " --> " + greageContane[i]);
                switch (i){
                    case 0:
                        System.out.println("The empty anime." + "\n");
                        break;
                    case 1:
                        System.out.println("All info -->" + animeOne + "\n");
                        break;
                    case 2:
                        System.out.println("All info -->" + animeTwo + "\n");
                        break;
                    case 3:
                        System.out.println("All info -->" + animeThree + "\n");
                        break;
                }

            }
        }



        System.out.println("Anime one -->" + animeOne);
        System.out.println("Anime two -->" + animeTwo);
        System.out.println("Anime three -->" + animeThree);


        }
}




