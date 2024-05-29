# TheGameOfLife
The Game of Life is a simulation game developed by the mathematician Conway John as a research model
The life cycle of the living organism. The game is played on a huge matrix whose members are sites
Possible survivals: each site can have one of the following two situations:
A. "Yesh Haim" - a full life site - will be marked as a full square
B. "There is no life" - an empty life site - we will mark it as an empty square
For example, given the following matrix:
You can see that the site (1,1) has no life, and that of this site
There are 4 living neighbors and they are: (0,0), (0,1), (1,2) and (2,1).
On the other hand, site (0,3) has life, and this site has a neighbor
live one which is (1,2)
CONWAY'S BASIC LAWS OF GENETICS:
• Birth - in every site where there is "no life" that has exactly 3 living neighbors, there will be a birth in the next generation. Other
The site remains "lifeless" - empty.
• Death - at any site where there is "life" that has 0 or 1 living neighbors, death will occur in the next generation as a result
from loneliness In any site where "there is life" and if there are 4 or more living neighbors, death will occur in the next generation as a result
From "Population Explosion".
• Existence - any site where "there is life" and has 2 or 3 living neighbors, will continue to exist in the next generation.
The processes of birth, death and existence occur simultaneously in all sites and create a new state of life called
New generation
The program presents a simulation of the game of life on a 10x10 matrix as follows:
• First the program will create a matrix with random values ​​representing the life states
the beginners
• The program will display the life matrix in a window on which the sites must be drawn as empty squares
and full according to the situations of life. 
• There is a button in the upper left corner of the drawing surface. Each time you press the button, the program will calculate the
The life modes of the next generation and update the display.
