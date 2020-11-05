package fane.services

import com.jagrosh.jdautilities.command.{CommandClient, CommandClientBuilder}
import com.jagrosh.jdautilities.commons.waiter.EventWaiter
import fane.commands.utility._
import fane.configuration.BotConfiguration

object CommandService {
  val waiter: EventWaiter = new EventWaiter()
  val default_config: BotConfiguration = BotConfiguration()
  val config: BotConfiguration = BotConfiguration(
    prefix = sys.env.getOrElse("PREFIX", default_config.prefix),
    owner_id = sys.env.getOrElse("OWNER_ID", default_config.owner_id))

  val client: CommandClient = new CommandClientBuilder().
    setPrefix(config.prefix).
    setOwnerId(config.owner_id).
    addCommands(
      Ping,
      About
    ).
    build()
}