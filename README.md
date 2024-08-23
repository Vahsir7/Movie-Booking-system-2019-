This is my first "project" made in Java, my first programming language. This comprises all the basic class and object relations I have learnt before High School.

## How to run
1. Clone the repository
2. Open the terminal and navigate to the directory where the repository is cloned
3. Run the following command:
```bash
    java MOVIE
```
if you want to recompile the code, run the following command:
```bash
    javac MOVIE.java
    java MOVIE
```

## What to expect

The program has a simple menu consisting of 4 options:
1. About us
2. Movie details
3. Ticket booking
4. Exit

First the user must navigate to `Movie details` to find the movie details. The user must note down the **Movie CODE** of the movie he/she wants to book tickets for.

After selecting option 2 for `Movie details` page, it asks us to select the language of the movie. The user can select the language of the movie and then the program displays the movie details. The user can note down the **Movie CODE** of the movie he/she wants to book tickets for.

Then the user can navigate to `Ticket booking` to book tickets for the movie by pressing 3.
First prompt is asked about the **Movie CODE** of the movie the user wants to book tickets for. The user must enter the **Movie CODE** of the movie he/she wants to book tickets for.

Then the user must enter the number of tickets he/she wants to book. The user must enter the number of tickets he/she wants to book and the type of seat the user wants to book.

*Here availability of seats is also checked*

After that user is asked to give their credentials for ticket booking (*data is not stored*)

Then a **Ticket** is generated with the details of the movie, the number of tickets booked, the type of seat booked, and the total amount to be paid.

After this if user visits the `Movie details` panel the amount of seats available is updated.
 
The user can navigate to `Exit` to exit the program.