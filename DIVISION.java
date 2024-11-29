 public class DIVISION {

    private final int tableSize; // Size of the hash table

    public  DIVISION (int tableSize) {
        this.tableSize = tableSize; //Should be a prime number for better distribution
    }

    //Very basic hash function—use a better one in production!
    public int hash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue = hashValue * 16 + key.charAt(i); //Simple string hashing
        }
        return Math.abs(hashValue % tableSize); //Modulo operation using division
    }

    public static void main(String[] args) {
        DIVISION hashFunction = new DIVISION (11); //Table size is 11 (a prime number)

        String[] keys = {"jane", "cassandra", "stacy", "joshua", "dave"};

        for (String key : keys) {
            int index = hashFunction.hash(key);
            System.out.println("Key: " + key + ", Hash Index: " + index);
        }
    }
}
