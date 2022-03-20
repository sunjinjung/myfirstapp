fun main(){
    print("Enter the score:")
    val score= readLine()!!.toDouble()
    var grade: Char= 'F'

    when (score){
        in 90.0..100.0->grade='A'
        in 80.0..89.9->grade='B'
        in 70.0..79.9->grade='C'
        else->grade='F'
    }

    /*if (score>=90.0){
        grade='A'
    } else if (score>=80 && score <=89.9){
        grade='B'
    } else if (score>=70 && score <=79.9){
        grade='C'
    }*/

    println("score:$score,grade:$grade")



}