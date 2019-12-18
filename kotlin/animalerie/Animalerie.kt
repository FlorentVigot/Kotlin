// interface Animal
interface Animal{
    fun quiSuisJe (){}
    fun parler (){}
}

// classe Animalerie
class Animalerie{
    var allAnimals = mutableListOf<Animal>()
    fun addAnimal(isWhat: Animal){
        allAnimals.add(isWhat)
    }
    fun affiche(){
        for(i in allAnimals){
            i.quiSuisJe()
            i.parler()
        }
    }
}

// classe des animaux (chat,chien,cochon)
class chat: Animal{
    override fun quiSuisJe() {
        println("Je suis un chat")
    }
    override fun parler(){
        println("et je fais Miaou")
        println("---------------------------")
    }
}
class chien: Animal{
    override fun quiSuisJe() {
        println("Je suis un chien")
    }
    override fun parler(){
        println("et je fais waf")
        println("---------------------------")
    }
}
class cochon: Animal{
    override fun quiSuisJe() {
        println("Je suis un cochon")
    }
    override fun parler(){
        println("et je fais groin")
        println("---------------------------")
    }
}

fun main(){
    println("Bienvenue dans l'Animalerie")
    println("---------------------------")
    val Animalerie = Animalerie()

    Animalerie.addAnimal(chat())
    Animalerie.addAnimal(chien())
    Animalerie.addAnimal(cochon())

    Animalerie.affiche()
}






