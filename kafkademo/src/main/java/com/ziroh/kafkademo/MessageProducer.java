package com.ziroh.kafkademo;

public interface MessageProducer 
{
	public void produceMessage(String Topic,String message);
}
