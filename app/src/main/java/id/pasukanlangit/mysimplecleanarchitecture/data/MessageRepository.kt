package id.pasukanlangit.mysimplecleanarchitecture.data

import id.pasukanlangit.mysimplecleanarchitecture.domain.IMessageRepository
import id.pasukanlangit.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}