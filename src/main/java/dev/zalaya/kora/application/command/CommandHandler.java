package dev.zalaya.kora.application.command;

public interface CommandHandler<C, R> {

    R handle(C command);

}
