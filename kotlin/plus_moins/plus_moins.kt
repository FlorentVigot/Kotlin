fun main(args: Array<String>) {
    check()
}



// Nombre de tours
val tours=6

// Valeur donnée par le premier joueur
fun number1():Int{
    println("Veuillez rentrer un nombre entre 1 et 100")
    var number1 = readLine()!!
    return number1.toInt()
}

// function Stop

fun stop():Int{

    var arreter = readLine()!!

    if (arreter == "STOP"){
        return -1000
    }
    else {
        return arreter.toInt()
    }
}

fun check(){
    var number = number1()


  maBoucle@ for (i in 1..tours) {
    var tourRestant = (tours - i)
    if (i == tours){
        println("Vous avez perdu !!")
    }
    else{
        println("Inscrivez un nombre entre 1 et 100. Si vous voulez abandonner, inscrivez le mot STOP")
        var joueur = stop()
        when (joueur) {

            in 0..number - 1 -> {
                println("le nombre est plus grand ")
            }
            number -> {
                println("Bravo vous avez trouvé le nombre !!!")
                break@maBoucle
            }
            in number..100 -> {
                println("le nombre est plus petit")
            }
            -1000 -> {
                println("Vous avez abandonné.")
                break@maBoucle
            }
            else -> {
                println("Erreur !!")
            }

        }



        println("Il vous reste " + tourRestant + "tours.")


    }
  }


}