import random 

website = ['home', 'about', 'eligibity', 'visa', 'GInfo', 'employment', 'salary', 'contact']
people = ['emre', 'irene', 'jinnie', 'miso']

emre = []
emco = 0

irene = []
irco= 0

jinnie = []
jico=0

miso = []
mico=0

randompage= ''
randompeople = ''

for x in range(8):
    randompage = random.choice(website)
    website.remove(randompage)
    randompeople = random.choice(people)
    if randompeople == 'emre':
        emre.append(randompage)
        emco = emco + 1
        if emco == 2:
            people.remove('emre')
    elif randompeople == 'irene':
        irene.append(randompage)
        irco = irco + 1
        if irco == 2:
            people.remove('irene')
    if randompeople == 'jinnie':
        jinnie.append(randompage)
        jico = jico + 1
        if jico == 2:
            people.remove('jinnie')
    if randompeople == 'miso':
        miso.append(randompage)
        mico = mico + 1
        if mico == 2:
            people.remove('miso')


print('Congrats, the website succesfully divided for team members')
print("Emre's pages: ", emre)
print("Jinnie's pages: ", jinnie)
print("Irene's pages: ", irene)
print("Miso's pages: ", miso)

