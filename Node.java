public class Node  
{
		int key;
		String name;
		Node leftChild;
		Node rightChild;

		Node(int key, String name) 
		{
			this.key = key;
			this.name = name;
		}// end of Node 
		
		public String toString() 
		{
			return name;
		}// end of toString 
}// end of class Node 
