"""
Inheritance
Aquires properties of Base class to derived class
"""


class Bike(object):

    def __init__(self):
        super().__init__()
        print("1 Bike Created")
    
    def start(self):
        print("3 Bike Started")
    
    def stop(self):
        print("4 Bike Stopped")


class BMW(Bike):

    def __init__(self):
        # super().__init__()
        Bike.__init__()
        print("2 BMW Created")

bike = BMW()
bike.start()
bike.stop()