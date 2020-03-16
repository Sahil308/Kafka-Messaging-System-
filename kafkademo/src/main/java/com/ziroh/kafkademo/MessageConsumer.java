package com.ziroh.kafkademo;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface MessageConsumer 
{
	public List<ConsumerRecord<String, String>> consumeMessage(String topic);
}
