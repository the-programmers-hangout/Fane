package fane.common

import fane.configuration.{GeneralConfiguration, GuildConfiguration}
import fane.services.PopulateConfigService

import scala.collection.mutable.ListBuffer

object ConfigurationObject {
  val guild_config: ListBuffer[GuildConfiguration] = PopulateConfigService.return_guild_config
  val general_config: GeneralConfiguration = GeneralConfiguration(guilds = PopulateConfigService.list_of_config)
}
