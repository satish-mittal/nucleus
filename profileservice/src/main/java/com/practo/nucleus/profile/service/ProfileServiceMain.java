package com.practo.nucleus.profile.service;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import com.practo.nucleus.profile.ProfileService;

public class ProfileServiceMain {

	public static void main(String[] args) {
		try {
			TServerTransport serverTransport = new TServerSocket(9090);
			TServer server = new TThreadPoolServer(
					new TThreadPoolServer.Args(serverTransport).processor(
					new ProfileService.Processor<ProfileServiceImpl>(
					new ProfileServiceImpl())));
			
			System.out.println("Starting profile service on port 9090");
			server.serve();
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
