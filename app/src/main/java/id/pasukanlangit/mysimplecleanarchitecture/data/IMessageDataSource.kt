package id.pasukanlangit.mysimplecleanarchitecture.data

import id.pasukanlangit.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String) : MessageEntity
}