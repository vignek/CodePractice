"""
Fruit of loom
"""

class Fruit(object):
    """
    Does Fruity stuff
    """
    def __init__(self):
        super().__init__()
        print("Fruit created")
    
    def nutrition(self):
        print("4g fiber")

    def calories(self):
        print("100Kal")


class Banana(Fruit):
    """
    Bananas yo
    """

    def __init__(self):
       super().__init__()
       print("Bananas created")

    def nutrition(self):
        super().nutrition()
        print("10g fiber")

    def color(self):
        print("yellow")
    

a = Banana()
a.nutrition()
a.color()