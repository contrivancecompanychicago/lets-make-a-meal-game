#Let's Make a Meal Sub Game

import random
from random import randint
import random2
from random2 import choice

import statistics

import pygame
import play
from play import *

import tkinter
from tkinter import *
from tkinter import ttk
window = Tk()


import bugsnag
from bugsnag.flask import handle_exceptions

import pusher
from pusher import requests

import sentry_sdk
from sentry_sdk.integrations.django import DjangoIntegration

import pipedream

main()

print('Lets make a Meal Game')
feeling_hungry = True
score = 0

while feeling_hungry:
  restaurant_door = randint(1, 3)
  print('Three restaurant doors ahead...')
  print('Your BMI score may increase.')
  print('Which restaurant door do you want to open?')
  door = input('1, 2 or 3?')
  door_num = int(door)
  if door_num == restaurant_door:
    print('Your BMI score has increased!')
    feeling_hungry = False
  else:
    print('This restaurant menu will not increase your BMI!')
    print('You can choose the next restaurant.')
    score = score + 1


print('Go check your BMI score with your Fitbit device!')
print('Game over!  You scored', score)



app = Flask(__name__)