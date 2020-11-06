package fane.configuration

import scala.collection.mutable.ListBuffer

case class GeneralConfiguration(guilds: ListBuffer[GuildConfiguration] = ListBuffer[GuildConfiguration](),
                                 total_commands_executed: Int = 0)

case class GuildConfiguration(guildId: String = "",
                              prefix: String = "fane!",
                              logging_channel: String = "logging",
                              total_commands_executed: Int = 0)
