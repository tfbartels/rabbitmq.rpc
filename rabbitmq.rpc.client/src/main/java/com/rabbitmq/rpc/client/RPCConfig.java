package com.rabbitmq.rpc.client;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gary Russell
 * @author Scott Deeg
 *
 */
@Profile({"rpc"})
@Configuration
public class RPCConfig {

	@Profile("client")
	private static class ClientConfig {

		@Bean
		public Queue queue() {	
			return new Queue("rpc");
		}
		
		@Bean
		public DirectExchange exchange() {
			return new DirectExchange("rpc");
		}

		@Bean
		public Client client() {
	 	 	return new Client();
		}

	}

}