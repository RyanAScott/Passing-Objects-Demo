// Java Program to Demonstrate Objects Passing to Methods.

// Class
// Helper class
public class ObjectPassDemo {
	int a, b;

    // Default Constructor to prevent errors
    ObjectPassDemo() {

    }// ObjectPassDemo

	// Constructor
	ObjectPassDemo(int i, int j)
	{
		a = i;
		b = j;
	}// ObjectPassDemo

	// Method
	boolean equalTo(ObjectPassDemo o)
	{
		// Returns true if o is equal to the invoking
		// object notice an object is passed as an
		// argument to method
		return (o.a == a && o.b == b);
	}// equalTo
}// ObjectPassDemo Class