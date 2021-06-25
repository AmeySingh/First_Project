object StudentMarksCal {
  def main(args: Array[Int]) {
    var grade = 80;

    if( grade >= 90 && grade <=100){
      println("Grade A ");
    } else if( grade >= 80 && grade <=90){
      println("Grade B ");
    } else if( grade >= 70 && grade <=80){
      println("Grade C ");
    } else{
      println("Failure");
    }
  }
}
