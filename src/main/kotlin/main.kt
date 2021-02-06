import org.apache.commons.mail.Email
import org.apache.commons.mail.SimpleEmail

fun main() {

    val email: Email = SimpleEmail()
    val reader = MyFileReader("C:\\path")

    email.hostName = "smtp.gmail.com"
    email.setSmtpPort(587)
    email.isSSLOnConnect = true
    email.setFrom(reader.from)
    email.addTo(reader.to)
    email.setAuthentication(reader.from, reader.password)
    email.subject = reader.subject
    email.setMsg(reader.content)

    println(" *** Sending email...")
    email.send()
    println(" *** Email sent!")

}