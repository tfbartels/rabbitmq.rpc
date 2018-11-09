package com.rabbitmq.rpc.server;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author Gary Russell
 * @author Scott Deeg
 */
public class Server {

	@RabbitListener(queues = "rpc")
	// @SendTo("tut.rpc.replies") used when the client doesn't set replyTo.
	public int fibonacci(int n) {
		System.out.println(" [x] Received request for " + n);
		int result = fib(n);
		System.out.println(" [.] Returned " + result);
		return result;
	}

	public int fib(int n) {
		return n == 0 ? 0 : n == 1 ? 1 : (fib(n - 1) + fib(n - 2));
	}

}