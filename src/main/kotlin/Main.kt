
const val name: String = "Nana"
var greeting: String? = "hello"

fun main() {

}

fun conditions(){

    if(name != null){
        print("name isn't null")
    }else{
        print("name is null")
    }
    println("")

    when(greeting){
        null -> print("hi")
        "hello" -> print("$greeting $name")
        else -> print(greeting)
    }
    println(name);

    val greetingToPrint = if(greeting != null) greeting else "Hi"
    va testPr = "g"
    print(g)
}
