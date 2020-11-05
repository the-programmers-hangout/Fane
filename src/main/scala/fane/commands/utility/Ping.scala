package fane.commands.utility

import com.jagrosh.jdautilities.command.Command
import com.jagrosh.jdautilities.command.CommandEvent

object Ping extends Command {
    this.name = "ping"
    this.help = "Check bot's latency"
    this.guildOnly = false
    this.aliases = Array[String]("ping")

    override def execute(event: CommandEvent): Unit = {
        event.reply("Pong!")
    }
}