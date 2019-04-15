# SciFi UI Project

Name: Shane Keenan

Student Number: C17702215

# Description of the assignment

The purpose of this assignment was to develop a better understanding of the Java environment as well as using the Processing library in order to create a user interface with a science fiction theme. This resulting creation can either be something which already exists in the form of a movie or computer game or it can be completely self-created. It needs to have animation and interactivity as well as show and utilize all the aspects which have been learned during the OOP module. In the end, it was decided to go with something that was self-created in the form of an old-school, colorful computer terminal.

# Instructions

When the program turns on the user is greeted to a welcome message. The design principle of this interface was an oldschool computer terminal that would activite different programs when the user pushes one of the ten buttons available. The user is also prompted to follow the instructions that display on some of these programs, for example moving the man with W/A/S/D and touching the tiger with the mouse cursor. 

# How it works

The buttons and computer terminal were created as objects through the Processing draw library. Each button was given a boolean condition so that when one is selected the others cannot be activated and any sound is reset and/or paused. When a button is clicked it activates any function that was made from it such as .draw(), .update(), etc. 

# What I am most proud of in the assignment

I am proud of taking the simple idea of a computer terminal and making it light-hearted, colorful and fun. I am also proud of overcoming the challenges and issues faced during its implementation and I also enjoyed adding in little elements such as the sounds and the appearance of the buttons when they are clicked on and off.

# Issues Faced

Some of the *issues faced* included:

- Program crashing when most keys pressed
- Conflict issues with button pressed
- Button turning on and off multiple times
- Sound issues overlapping on different buttons
- Multiple buttons playing at once
- Getting the character sprite to move

Ways in which they were *overcome*:

1. Increasing the keys pressed array size
2. Making a boolean of buttonsPressed to make one true and the others false
3. When mouse is pressed making it false so that it only activates once
4. Using the .pause() from the minim library
5. Setting other buttons to false
6. Using iteration through spriteSheet movement

# Example of Code

This is a segment of code which was used to add a noise and response effect when the user didn't press a button but instead tapped on the monitor or the computer terminal:

```Java

            else if(mouseX>100 && mouseX<700 && mouseY>50 && mouseY<300){
                ping.play();
                ping.rewind();
                if(tapOn){
                    fill(255);
                    ellipse(mouseX,mouseY,10,10);
                }
            }

            else if(mouseX>0 && mouseX<width && mouseY>0 && mouseY < height){
                clank.play();
                clank.rewind();
                if(tapOn){
                    fill(255);
                    ellipse(mouseX,mouseY,10,10);
                }
            }
```

This is an image using a relative URL:

![image](https://user-images.githubusercontent.com/38283909/55492464-2a060500-562f-11e9-91e7-32c9629ee07a.png)

This is an image using an absolute URL:

<a href="https://ibb.co/zZ1x9rb"><img src="https://i.ibb.co/BBm3Wtj/screenshot2.png" alt="screenshot2" border="0"></a>

This is a youtube video:

[![youtubeScreenshot](https://user-images.githubusercontent.com/38283909/55491509-81a37100-562d-11e9-82f2-2c4fac6faa18.PNG)](https://youtu.be/02jJRolMXUo)
