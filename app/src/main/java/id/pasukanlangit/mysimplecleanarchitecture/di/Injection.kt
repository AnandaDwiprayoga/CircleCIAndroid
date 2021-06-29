package id.pasukanlangit.mysimplecleanarchitecture.di

import id.pasukanlangit.mysimplecleanarchitecture.data.IMessageDataSource
import id.pasukanlangit.mysimplecleanarchitecture.data.MessageDataSource
import id.pasukanlangit.mysimplecleanarchitecture.data.MessageRepository
import id.pasukanlangit.mysimplecleanarchitecture.domain.IMessageRepository
import id.pasukanlangit.mysimplecleanarchitecture.domain.MessageInteractor
import id.pasukanlangit.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}