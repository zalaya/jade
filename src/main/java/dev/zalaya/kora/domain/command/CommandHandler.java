package dev.zalaya.kora.domain.command;

public interface CommandHandler<R, C extends Command<R>> {

    R handle(C command);

}
