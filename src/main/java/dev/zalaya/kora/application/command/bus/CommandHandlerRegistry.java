package dev.zalaya.kora.application.command.bus;

import dev.zalaya.kora.domain.command.*;

import org.springframework.context.ApplicationContext;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CommandHandlerRegistry {

    private final Map<Class<? extends Command<?>>, CommandProvider<?>> providers =  new HashMap<>();

    public CommandHandlerRegistry(ApplicationContext context) {
        String[] beans =  context.getBeanDefinitionNames();

        for (String bean : beans) {
            register(context, bean);
        }
    }

    @SuppressWarnings("unchecked")
    private void register(ApplicationContext context, String bean) {
        Class<?> handler = context.getType(bean);
        Class<?>[] generics = GenericTypeResolver.resolveTypeArguments(handler, CommandHandlerRegistry.class);

        if (generics != null && generics.length == 2) {
            Class<? extends Command<?>> command = (Class<? extends Command<?>>) generics[1];
            CommandProvider<?> provider = new CommandProvider<>(context, (Class<? extends CommandHandler<?, ?>>) handler);

            providers.put(command, provider);
        }
    }

    @SuppressWarnings("unchecked")
    public <R, C extends Command<R>> CommandHandler<R, C> getHandler(Class<C> command) {
        return ((CommandProvider<CommandHandler<R, C>>) providers.get(command)).get();
    }

}
