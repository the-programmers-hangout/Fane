package fane

import fane.services.StartupService
import fane.common.BotObject

object Fane {
    def main(args: Array[String]): Unit = {
        try {
            val token: Option[String] = Some(args.head)
            val _: Unit = BotObject.bot_object = new StartupService(token)
            val _: Unit = BotObject.bot_object.init()
        }
        catch {
            case _: IllegalArgumentException => println("Couldn't find a valid token")
        }
    }
}
