public class Main {
    public static void main(String[] args) {
    var dog = 8.0 ;
    var cat = 3.6 ;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    var dog2 = dog + 4;
    var cat2 = cat + 4;
    var paper2 = paper +4;
    System.out.println(dog2);
    System.out.println(cat2);
    System.out.println(paper2);

    var dog3 = dog - 3.5;
    var cat3 = cat - 1.6;
    var paper3 = paper - 7639;
    System.out.println(dog3);
    System.out.println(cat3);
    System.out.println(paper3);

    var friend = 19;
    System.out.println(friend);
    friend = friend - 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    var boxerWeightOne = 78.2;
    var boxerWeightTwo = 82.7;
    var result1 = boxerWeightOne + boxerWeightTwo;
    System.out.println(result1);
    var result2 = boxerWeightTwo - boxerWeightOne;
    System.out.println(result2);

    var result3 = boxerWeightTwo % boxerWeightOne;
    System.out.println(result3);


    var hourWorkAll = 640;
    var hourEvery = 8;
    var worker = hourWorkAll / hourEvery;
    System.out.println("Всего работников в компании - "+worker+" человек");
    var worker2 = worker + 94;
    var hourWorkAll2 = worker2 * hourEvery;
    System.out.println("Если в компании работает "+worker2+" человека,то всего "+hourWorkAll2+" часов работы может быть поделено между сотрудниками");
    }
}