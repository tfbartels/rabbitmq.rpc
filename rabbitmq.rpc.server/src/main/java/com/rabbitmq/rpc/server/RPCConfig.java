package com.rabbitmq.rpc.server;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
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


	@Profile("server")
	private static class ServerConfig {

		@Bean
		public Queue queue() {
			return new Queue("rpc");
		}

		@Bean
		public DirectExchange exchange() {
			return new DirectExchange("rpc");
		}

		@Bean
		public Binding binding(DirectExchange exchange, Queue queue) {
			return BindingBuilder.bind(queue).to(exchange).with("rpc");
		}

		@Bean
		public Server server() {
			return new Server();
		}

	}

}