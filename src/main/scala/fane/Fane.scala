package fane

import fane.services.StartupService

object Fane {
    def main(args: Array[String]): Unit = {
        try {
            val token: Option[String] = Some(args.head)
            val client: Unit = new StartupService(token).init()
        }
        catch {
            case _: IllegalArgumentException => println("Couldn't find a valid token")
        }
    }
}
