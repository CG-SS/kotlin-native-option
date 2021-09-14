import dev.cgss.kotlin.native.Option
import platform.posix.option

fun main() {
    val opt = Option.of(1)
    println("Hello, Kotlin/Native! " + opt.isEmpty())
    
}