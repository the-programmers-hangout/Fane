package fane.listeners

import fane.common.BotObject

object BanListener {
  BotObject.bot_object.bot.getGuildById(1).retrieveAuditLogs()
}
