package dev.zalaya.kora.application.command.bus;

import dev.zalaya.kora.domain.command.CommandHandler;

import org.springframework.context.ApplicationContext;

public class CommandProvider<H extends CommandHandler<?, ?>> {

    private final ApplicationContext context;
    private final Class<H> handler;

    public CommandProvider(ApplicationContext context, Class<H> handler) {
        this.context = context;
        this.handler = handler;
    }

    public H get() {
        return context.getBean(handler);
    }

}
