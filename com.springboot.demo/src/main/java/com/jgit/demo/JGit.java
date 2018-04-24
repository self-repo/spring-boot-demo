package com.jgit.demo;

import java.io.File;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

public class JGit {

	public static void main(String[] args) {

		try {
			CloneCommand cloneCommand = Git.cloneRepository();
			cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider("username", "password"));
			Git git = cloneCommand.setURI("http://xxxxxx/minerva.git")
					.setBranch("minerva-dxwang-v2").setDirectory(new File("E://fx/jgit-repo/minerva")).call();
			git.checkout();
			
		} catch (InvalidRemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GitAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
