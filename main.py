pip install replit-play

import play # this is the first line in the program



play.start_program() # this is the last line in the program

box = play.new_box(
        color='black',
        x=0,
        y=0,
        width=100,
        height=200,
        border_color="light blue",
        border_width=10
    )

character = play.new_image(
        image='character.png', 
        x=0, 
        y=0, 
        angle=0, 
        size=100, 
        transparency=100
    )

greeting = play.new_text(
        words='hi there', 
        x=0, 
        y=0, 
        angle=0, 
        font=None, 
        font_size=50, 
        color='black', 
        transparency=100
    )