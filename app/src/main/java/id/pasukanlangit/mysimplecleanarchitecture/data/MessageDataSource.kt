package id.pasukanlangit.mysimplecleanarchitecture.data

import id.pasukanlangit.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name, print from clean architecture")
}