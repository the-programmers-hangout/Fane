package fane.services

import java.util

import fane.common.BotObject
import fane.configuration.{GuildConfiguration, BotConfiguration}
import net.dv8tion.jda.api.entities.Guild

import scala.collection.mutable.ListBuffer

object PopulateConfigService {
  val list_of_config: ListBuffer[GuildConfiguration] = ListBuffer[GuildConfiguration]()
  val list_of_guilds: util.List[Guild] = BotObject.bot_object.bot.getGuilds
  val default_bot_config: BotConfiguration = BotConfiguration()

  val return_guild_config: ListBuffer[GuildConfiguration] = {
    list_of_guilds.forEach(i => list_of_config.append(GuildConfiguration(guildId = i.getId)))
    list_of_config
  }
}
