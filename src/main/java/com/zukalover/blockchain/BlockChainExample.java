package com.zukalover.blockchain;

import java.util.Arrays;

public class BlockChainExample {

	public static void main(String[] args)
	{
		/**
		 * BlockChain 
		 * Made of Blocks = Hash of previous block + transactions
		 * They are chained together
		 */
		
		Transaction transaction1 = new Transaction("Peter","Sam",100L);
		Transaction transaction2 = new Transaction("Sam","Ryan",1000L);
		Transaction transaction3 = new Transaction("Sam","Ryan",1000L);

		/**
		 * The first block does not have a previous block
		 * It is called a genesys block
		 */

		// A hash is nothing but a digital signature
		Block firstBlock = new Block(0,Arrays.asList(transaction1,transaction2));
		System.out.println(firstBlock.hashCode());
		Block secondBlock = new Block(firstBlock.hashCode(),Arrays.asList(transaction3));
		System.out.println(secondBlock.hashCode());
		/**
		 * 1627583016
			1380398836
			
			1627611195
			1381272385

		 */
	}
}
