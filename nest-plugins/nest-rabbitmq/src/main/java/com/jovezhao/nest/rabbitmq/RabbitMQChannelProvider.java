package com.jovezhao.nest.rabbitmq;

import com.jovezhao.nest.ddd.event.ChannelProvider;
import com.jovezhao.nest.ddd.event.EventConsumer;
import com.jovezhao.nest.ddd.event.EventProducer;

/**
 * Created by zhaofujun on 2017/6/22.
 */
public class RabbitMQChannelProvider extends ChannelProvider<RabbitMQProviderConfig> {
    @Override
    protected EventConsumer createEventConsumer() {
        return new RebbitMQEventConsumer();
    }

    @Override
    public EventProducer createEventProducer() {
        return new RabbitMQEventProducer();
    }
}