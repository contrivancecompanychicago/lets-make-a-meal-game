"""How many pizzas do we need?"""

import math
import sys

if len(sys.argv) > 1:
    people = int(sys.argv[1])
else:
    people = int(raw_input("How many RSVPs? "))

# The MUC (Meetup Universal Constant)
attending = people * .65

print
print "%d people will show up (guess)" % attending

# Appetite estimation
slices = attending * 2.5

# Basic pizza geometry
pies = slices / 8

print "%.1f pizzas (or so)" % pies

# From answers to the 10/2012 project night:
#   81 answers
#   26 meat 32%
#   37 veg 45%
#   16 cheese 20%
#   2 vegan 3%

vegan = int(.03 * pies) or 1
meat = int(.33 * pies) or 1
veg = int(.45 * pies) or 1
cheese = pies - vegan - meat - veg
if cheese < 1:
    cheese = 1
cheese = int(math.ceil(cheese))

print
print "%2d cheese" % cheese
print "%2d meat" % meat
print "%2d veggie" % veg
print "%2d vegan" % vegan
print
print "%2d total" % (cheese + meat + veg + vegan)