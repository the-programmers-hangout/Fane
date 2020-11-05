package fane.configuration

import scala.collection.mutable.ArrayBuffer

case class GeneralConfiguration(guilds: ArrayBuffer[GuildConfiguration] = ArrayBuffer[GuildConfiguration](),
                                 total_commands_executed: Int = 0)

case class GuildConfiguration(guildId: String = "",
                              prefix: String = "fane!",
                              logging_channel: String = "",
                              total_commands_executed: Int = 0)
