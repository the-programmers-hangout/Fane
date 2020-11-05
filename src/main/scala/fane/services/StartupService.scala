package fane.services

import net.dv8tion.jda.api.{JDA, JDABuilder, OnlineStatus}

class StartupService(token: Option[String]) {
  val bot: JDA = JDABuilder.createDefault(token.get).
    addEventListeners(CommandService.waiter, CommandService.client).
    setStatus(OnlineStatus.ONLINE).
    build()
  def init(): Unit = bot.awaitReady().setAutoReconnect(true)
}