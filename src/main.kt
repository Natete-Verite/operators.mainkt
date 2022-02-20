import java.awt.AWTEventMulticaster.add
fun main(){
    var say = ("Hello Verite")
    println(say)
    var rem = rem(20, 3)
    println(rem)
    var sum = sum(23, 23, 23, 23)
    println(sum)
    fact()
}
fun say(Name:String){
    println("Hello" + Name)
}
fun rem(x: Int, y:Int): Int{
    var rem = x % y
    return rem
}
fun sum(o: Int, p: Int, q: Int, r:Int): Int{
    var sum = o + p + q + r
    return sum
}
fun fact(){
    var fact = ("my adaptability is on a high level")
    println(fact)
}

