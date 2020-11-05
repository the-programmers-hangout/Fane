package fane.commands.utility

import java.awt.Color
import java.time.{Duration, LocalDateTime}

import com.jagrosh.jdautilities.command.{Command, CommandEvent}
import fane.services.CommandService
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.entities.MessageEmbed

object About extends Command {
  this.name = "about"
  this.help = "Print general information about Bot"
  this.guildOnly = false
  this.aliases = Array[String]("about")

  val boot_time: LocalDateTime = LocalDateTime.now()

  override def execute(event: CommandEvent): Unit = {
    val time_diff: Long = Duration.between(boot_time, LocalDateTime.now()).getSeconds
    val pretty_time: String = String.format("%d day(s), %d hour(s), %02d minute(s), and %02d second(s)",
      time_diff / 3600*60 ,time_diff / 3600, (time_diff % 3600) / 60, time_diff % 60)

    val build_info =
      s"""
         |```
         |Version: 0.0.1
         |Scala: ${util.Properties.versionNumberString}
         |```
         |""".stripMargin

    val embed: MessageEmbed = new EmbedBuilder().
      setThumbnail(event.getSelfUser.getAvatarUrl).
      setTitle(event.getSelfUser.getName).
      setColor(Color.decode("#FE7C00")).
      setDescription("Propagate bans in the TPH Network.").
      addField("Prefix", CommandService.default_config.prefix, true).
      addField("Creator", CommandService.default_config.author, true).
      addField("Bot Info", build_info, false).
      addField("Uptime", pretty_time, false).
      addField("Source", CommandService.default_config.source_code, false).
      build()
    event.reply(embed)
  }
}
