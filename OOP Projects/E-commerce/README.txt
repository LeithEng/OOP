OOP project: E-commerce Console App

----Project Overview----

This repository contains the implementation for a Java console application which uses OOP concepts to mimic real-life e-commerce platforms

----Features----

I) Customer and Admin authentification

*Login system: Users (whether they are admins or customers) must provide a valid username and password in order to access the platform.

*Differentiation between admins and customers: The program is able to differentiate between customers and admins, and provides different functionalities and services to each of them.

II) Admin interface 

*Admins are one of the 2 classes which inherits from an abstract User class (which contains the basic attributes of a user: the username and the password, and a few methods common to all users).

*Inventory management: Admins are able to directly alter the inventory by adding, removing and editing products. 

*They're also allowed to add other users to the list of admins, and see all the orders customers made.

*All the operations admins can make are shown in the form of a menu unique to admins.

III) Customer interface

*Customers are the other class which inherits from the User class.

*Shopping: Customers are able to add and remove products from their shopping cart, and they can also make orders, which allows them to buy the contents of the shopping cart.

*Interacting with products: Customers can also rate products, leave feedback and check all the info concerning any product in the inventory (including the average ratings and the feedback of other users)

*Account management: Users are allowed to show all the details concerning their accounts and alter some of them (such as the password).

*All the operations customers can make are shown in the form of a menu unique to customers

IV) Products

*Products are divided into various categories, including, among others, Electronics, Books, Furniture..., with each category having its own set of attributes describing the products (only books have "Number of pages" as an attribute, for example).

*All the categories are classes that inherit from the same abstract class Product, which contains attributes that are common to all products (such as the name, the price, the quantity in stock....)

V) Inventory 


*The platform has its inventory, consisting of various products sorted by category (Which I implemented in the form of Arraylists within the Inventory class)

*The inventory is automatically updated each time a user makes a purchase, and users aren't allowed to buy a product if it's out of stock

*Only admins can see the full inventory at once. They can also add and remove products from the inventory.

VI) Orders

*The Order class handles the transition from a user's shopping cart to order completion by automatically deducting the correct amount of money from a user's balance and updating the inventory.

*The list of completed orders is stored in an Arraylist which is only accessible by admins.

VII) Optional features:
	1/ User reviews and ratings
	
	-Users can rate products (out of 5). The ratings of each products is stored in a list unique to that product. Customers are 

	allowed to see the average rating of a product out of 5
	
	-They can also provide written feedback and reviews of a product. All the feedback is stored in a list, which can be accessed by 	
	any customer to check the reviews of other customers

	2/ Loyalty points
	
	-Loyalty points is a system that rewards users for their purchases on the e-commerce platform. Each time they make an order, users 

	get loyalty points equal to 1/5 of the total cost of that order. 
	
	-Everytime a user's loyalty points exceed 100 at the completion of an order, they get some bonus balance equal to the amount of 

	points that exceeded 100, and the points get reset (so let's say a user has 50 points, and they made an order which gave them 80 	
	more points, so they have 130 at the completion of the order. They'll get 30 dinars added to their account's balance as a reward, 	
	and their points go back to 0)

	




