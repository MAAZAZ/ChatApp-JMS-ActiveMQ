package broker;

import org.apache.activemq.broker.BrokerService;

public class ActiveMQBroker {
    public static void main(String[] args) throws Exception {
        BrokerService brokerService=new BrokerService();
        brokerService.setPersistent(false);
        brokerService.addConnector("tcp://0.0.0.0:61616");
        brokerService.start();
    }
}