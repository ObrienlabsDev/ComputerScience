# https://cs.stanford.edu/people/eroberts/courses/soco/projects/neural-networks/Neuron/index.html
class Neuron:
    value = 1
    activationFunction = 1
    bias = 0
    weightedSumOfInputs = 1
    inputVector = 1
    weightVector = 1

    # default constructor

    def __init__(this, bias, value=0):
        this.bias = bias
        this.value = value

    def printOn(this):
        print(f"{this.bias},{this.value}")



neuron = Neuron(2)
#print(neuron.bias, neuron.value)
neuron.printOn()

