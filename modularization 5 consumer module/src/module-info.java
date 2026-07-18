module com.in28minutes.consumer {
	requires com.in28minutes.service.provider;
	requires java.logging;
	// add module to path
	// give requires 
	// even though consumer module has access to service module it cannot access everything in service module , it can only access what service module lets us to access 
}