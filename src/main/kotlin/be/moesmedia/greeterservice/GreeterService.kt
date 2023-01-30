package be.moesmedia.greeterservice

import be.moesmedia.resources.greet.v1.Greet
import be.moesmedia.resources.greet.v1.GreetApiServiceGrpc
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class GreeterService: GreetApiServiceGrpc.GreetApiServiceImplBase() {
    override fun getGreeting(
        request: Greet.GetGreetingRequest,
        responseObserver: StreamObserver<Greet.GetGreetingResponse>
    ) {
        responseObserver.onNext(
            Greet.GetGreetingResponse.newBuilder().setGreeting("Hello there... ${request.name}!").build())
        responseObserver.onCompleted()
    }
}