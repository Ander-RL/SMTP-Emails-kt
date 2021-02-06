import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class MyFileReader(path: String) {

    var from: String
    var to: String
    var password: String
    var subject: String
    var content: String

    init {
        val file: File = File(path)
        val bfr: BufferedReader = BufferedReader(FileReader(file))
        val list: List<String> = bfr.readLines()
        from = list[0]
        to = list[1]
        password = list[2]
        subject = list[3]
        content = list[4]
    }
}