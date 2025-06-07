package dev.zalaya.kora.application.command;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CommandDispatcher {

    private final Map<Class<?>, CommandHandler<?, ?>> handlers = new HashMap<>();

    public <C extends Command<R>, R> void register(Class<C> commandClass, CommandHandler<C, R> handler) {
        handlers.put(commandClass, handler);
    }

    @SuppressWarnings("unchecked")
    public <C extends Command<R>, R> R dispatch(C command) {
        CommandHandler<C, R> handler = (CommandHandler<C, R>) handlers.get(command.getClass());

        if (handler == null) {
            throw new IllegalStateException("No handler registered for command: " + command.getClass().getName());
        }

        return handler.handle(command);
    }
}