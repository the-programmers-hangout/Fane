package fane.common

import fane.configuration.{BotConfiguration, GeneralConfiguration, GuildConfiguration}
import fane.services.PopulateConfigService

import scala.collection.mutable.ListBuffer

object GuildConfigurationObject {
  val guild_config: ListBuffer[GuildConfiguration] = PopulateConfigService.return_guild_config
  val general_config: GeneralConfiguration = GeneralConfiguration(guilds = PopulateConfigService.list_of_config)
}
