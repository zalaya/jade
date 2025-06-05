package dev.zalaya.kora.application.command.bus;

import dev.zalaya.kora.domain.command.Command;

import org.springframework.stereotype.Component;

@Component
public class CommandBus {

    private final CommandHandlerRegistry registry;

    public CommandBus(CommandHandlerRegistry registry) {
        this.registry = registry;
    }

    @SuppressWarnings("unchecked")
    public <R, C extends Command<R>> R dispatch(C command) {
        return (R) registry.getHandler(command.getClass()).handle(command);
    }

}
