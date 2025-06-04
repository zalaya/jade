package dev.zalaya.kora.application.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.*;

@Component
public class Mediator {

    private final Map<Class<?>, CommandHandler<?, ?>> handlers = new HashMap<>();

    @Autowired
    public Mediator(List<CommandHandler<?, ?>> discoveredHandlers) {
        for (CommandHandler<?, ?> handler : discoveredHandlers) {
            Class<?> commandType = resolveCommandType(handler);
            handlers.put(commandType, handler);
        }
    }

    @SuppressWarnings("unchecked")
    public <C, R> R dispatch(C command) {
        CommandHandler<C, R> handler = (CommandHandler<C, R>) handlers.get(command.getClass());
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for command: " + command.getClass());
        }
        return handler.handle(command);
    }

    private Class<?> resolveCommandType(CommandHandler<?, ?> handler) {
        return (Class<?>) ((ParameterizedType) handler.getClass()
                .getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
    }
}