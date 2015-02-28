Given has book Idiot for 5 dollars
Given has book Lord of the Rings for 14 dollars
Then count should be 2 books

When sold book Neznaika
Then should get exception

When sold book Lord of the Rings
Then count should be 1 books
