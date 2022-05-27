# gupsy
Gratifications and Uses Pilot Study from Yale University. Using Django and Python Programming Languages.
# Methods (Eric H Smith, UIC-Northwestern U SROP, Summer 1999)

### Premise of Argument

> To further develop the aims and hypothesis, I had previously discussed the signficance of implementing Spolin’s approach of educational game based learning into experiment a and sub experiment b of GUPSY’s research project.  Spolin’s approach to educational game based learning is a modern technique that directly supports the research objectives of  the University of Illinois at Chicago, Jane Addams School of Social Work, Midwest Latino Health Research, Training, and Policy Center, because obesity and type 2 diabetes is correlated to poor education among minorities and low income earning whites.  Since obesity and type 2 diabetes is correlated to poor education, health promotion techniques must become modern to increase self - efficacy.  For example, educational game based learning is a modern technique for health promotion, because it decreases access to care issues caused by low income, poor education, no telephone, or the lack of transportation for medically indigent clients or patients.
> 

Also, along with using educational game based learning as a health promotion technique, as aforementioned, we can use absorbing Markovian chains and Viterbi algorithm in a game theoretic approach to understand the health belief of a client or patient living with obesity and type 2 diabetes.  And, by using the Viterbi algorithm we can possibly predict changes in health behaviors related to self - efficacy about poor eating habits that may affect weight, blood sugar, and blood pressure.  So, Wikipedia goes on to discuss using the Viterbi algorithm with a health care example by saying, “Consider a village where all the villagers are healthy or have a fever, and the only the village doctor can determine whether each has a fever.  The doctor diagnoses fever by asking patients how they feel.  The villagers may only answer that they feel normal, dizzy, or cold.  The doctor believes that the health condition operates as a discrete Markov chain.  There are two states “Healthy” and “Fever”, but the doctor cannot observe them directly;  they are hidden from the doctor.  On each day, there is a certain chance that a patient will tell the doctor, “I feel normal”, “I feel cold”, “I feel dizzy”, depending on the patient’s health condition.”  However, again, I would like to make the Viterbi algorithm more applicable to the goals, mission, and objectives of the Midwest Latino Health Research, Training, and Policy Center by changing the original premise with:  

Suppose patients that live in Chicago were living with hypotension, ketoacidosis symptoms, and hypertension, and the HAH model clinic is the only outpatient clinic in Chicago that can determine whether the patient has low blood pressure, in between blood pressure, or high blood pressure.  The HAH model clinic can determine if the patient has hypotension, ketoacidosis symptoms, or hypertension through PIRDDIIQ to see if poor eating habits maybe correlated or low blood pressure, in between blood pressure, or high blood pressure.  The HAH model clinic believes that low blood pressure, in between pressure, and high blood pressure operates as a discrete Markov chain.  There are three different states of the patient “Hypotension”, “Ketoacidosis symptoms”, and “Hypertension”, but the HAH model clinic can not observe these three patient states directly;  they are hidden from the doctors, nursing, and social workers that are on staff.  On each day, there is a certain chance that a patient will tell the doctor, “I have experienced some weight loss” or “I have experienced some weight gain”, depending on the patient’s health condition.

### Major Premise of Argument

Now, changing the original premise of the Viterbi algorithm, we can began to proposition the new premise by determining step by step why the patient is experiencing some weight gain or weight loss.  For example:   

*Major Premise*:   Again, in Chicago, patients living in medically underserved communities may have been diagnosed with obesity and type 2 diabetes, but however are experiencing complications like hypotension, ketoacidosis, and hypertension.

*Show* that patients living in medically underserved communities that may have been diagnosed with obesity and type 2 diabetes are experiencing complications like hypotension, ketoacidosis, and hypertension.

*Proposition*:  Suppose patients living in medically underserved communities of Chicago have been diagnosed with obesity and type 2 diabetes are experiencing complications like hypotension, ketoacidosis, and hypertension.

Proof.  There exist some number of patients that have been diagnosed with obesity and type 2 diabetes are experiencing complications like hypotension, ketoacidosis, and hypertension.

$$
\forall x \in Patients \mid Complications(x) 
$$

Complications(x) is true for at least one x in Patients

Let P, P is Patients

Let P, P is some number of patients

Let P, $P \ge 1$

Let P, P is some number of African American Patients

$$
\exist x \in AfricanAmericanPatients \mid Complications(x)
$$

Let P, P is some number of Latino Patients

$$
\exists x \in LatinoPatients \mid Complications(x)
$$

Let P, P is some number of Asian Patients

$$
\exists x \in AsianPatients \mid Complications(x)
$$

Let P, P is some number of Native American Patients

$$
\exists x \in NativeAmericanPatients \mid Complications(x)
$$

Let P, P is some number of White American Patients

$$
\exists x \in WhiteAmericanPatients \mid Complications(x)
$$

If some number of patients are African Americans, then they have complications related to obesity and type 2 diabetes

$$
Patients_(AfricanAmerican) \implies Complications(x)
$$

If some number of patients are Latino Americans, then they have complications related to obesity and type 2 diabetes

$$
Patients_(LatinoAmerican) \implies Complications(x)
$$

If some number of patients are Asian Americans, then they have complications related to obesity and type 2 diabetes

$$
Patients_(AsianAmerican) \implies Complications(x)
$$

If some number of patients are Native Americans, then they have complications related to obesity and type 2 diabetes

$$
Patients_(NativeAmerican) \implies Complications(x)
$$

If some number of patients are White Americans, then they have complications related to obesity and type 2 diabetes

$$
Patients_(WhiteAmerican) \implies Complications(x)
$$

Let H, H is Hypotension

Let H, H is Complications(x)

Let H, $H \ge 1$

Let K, K is Ketoacidosis

Let K, K is Complications(x)

Let K, $K \ge 1$

Let T, T is Hypertension

Let T, T is Complications(x)

Let T, $T \ge 1$

To further explain Complications(x), *by example,* according to Achouayb, et. al article “*A mathematical model for the burden of diabetes and its complications*”, they proposed the following model: 

![ModelingDiabetesMathematically.jpg](Methods%20(Eric%20H%20Smith,%20UIC-Northwestern%20U%20SROP,%20Su%20f383c92169a843bd809657f1913aaa77/ModelingDiabetesMathematically.jpg)

We are using this model to further understand the calculations needed to later carry out the methodology in the minor premise of the argument.  So, Achouayb, et, al proposed by saying, “If $C = C(t)$ and $D = D(t)$ represent the number of persons living with diabetes with and without complications, respectively, and $N = N(t) = C(t) + D(t)$ denote the size of the population living with diabetes at time t, then as noted earlier, $N(t) \approx 0.03$ of the world’s population.”

*Given*:  Let $I_N = I_N(t)$ denotes the incidence of diabetes mellitus

*Given*:  $\mu = mortality_N$ natural mortality rate related to diabetes

*Given*: $\lambda = Probability_N$ of a person living with diabetes developing a complication

*Given*:  $\gamma = Complications_N$ rate at which persons living with diabetes are cured

*Given*:  $\nu = Complications_N$ rate at which persons living with diabetes complications will become disabled

Given: $\delta = mortality_N$ mortality rate due to that are not necessarily related to diabetes

And, also,

Let P, $P_(population) = N$

Let P, $P_(AfricanAmericans) + P_(LatinoAmericans) + P_(AsianAmericans) + P_(NativeAmericans) + P_(WhiteAmericans) = N_(patients)$

*Based on what was given*, $N_(patients) \implies I_N = I_N(t)$

So, in terms of $I_N = I_N(t)$, may suggest the implementation of “*Markov Pattern of Social Deprivation for Mexicans living with Diabetes*” Model,

![MarkovianModelSocialDeprivationDiabetes.png](Methods%20(Eric%20H%20Smith,%20UIC-Northwestern%20U%20SROP,%20Su%20f383c92169a843bd809657f1913aaa77/MarkovianModelSocialDeprivationDiabetes.png)

but how and why does $I(t)$ has such a terrible fate?

So, *by definition* of the Fibonacci Sequence will be used to understand the terrible fate of $N_(patients)$,

$\because$ *because* $I_N(t) \ge I_t$.

Since, $I_N(t) \ge I_t$, *by mathematical induction*, we can say the following in terms of

$$
I_(t_n) = I_(t-1) + I_(t-2)
$$

when $t \le 12$ months in one calendar year, according to Fibonacci’s Sequence, 

$\because$  *because* the number of Incidences (*I*) is affected by time (t) as a constant, when *g* is also a constant for at least some number of humans with a mass of at least 70*kgs*.

*By example*, 

$$
I_(t_0) = I_(t-1) + I_(t-2)
$$

$$
I_(t_1) = I_(t_0) + I_(t-1) + I_(t-2)
$$

$$
I_(t_2) = I_(t_1) + I_(t-1) + I_(t-2)
$$

$$
I_(t_3) = I_(t_2) + I_(t-1) + I_(t-2)
$$

$$
I_(t_4) = I_(t_3) + I_(t-1) + I_(t-2)
$$

$$
I_(t_5) = I_(t_4) + I_(t-1) + I_(t-2)
$$

$$
I_(t_6) = I_(t_5) + I_(t-1) + I_(t-2)
$$

$$
I_(t_7) = I_(t_6) + I_(t-1) + I_(t-2)
$$

$$
I_(t_8) = I_(t_7) + I_(t-1) + I_(t-2)
$$

$$
I_(t_9) = I_(t_8) + I_(t-1) + I_(t-2)
$$

$$
I_(t_(10)) = I_(t_9) + I_(t-1) + I_(t-2)
$$

$$
I_(t_(11)) = I_(t_(10)) + I_(t-1) + I_(t-2)
$$

Here at $I_(t_(\jmath))$ we will begin to draw some conclusion about $P_N = [P_(AA), P_(LA), P_(NA), P_(WA)]$  that may be living with diabetes, by saying the following:

$$
I_(t_(\jmath)) = I_(t_(11)) + I_(t-1) + I_(t-2)
$$

But, before we can draw some conclusions about $P_N$,

$\because$ because *by theorem* $P \equiv Q$.

So, as aforementioned, *given by the major premise* in terms of I(t) and D(t) the following:

$$
P \equiv Q \implies I(t) \equiv D(t)
$$

And, also 

$$
I(t) \equiv D(t) \implies I_(t_n) \equiv D_(t_n)
$$

And, $I_(t_n) \implies D_(t_n)$, *by example,*

And, *by carrying out algorithmic steps* to do the following:

 $I_(t_0) \implies D_(t_0)$ or by just saying $P_(Nondeprived) \implies Obesity$, or generally saying $SES_0 \implies Obesity$

$I_(t_1) \implies D_(t_1)$ or by just saying $P_(Lacking) \implies Prediabetes$, or generally saying $SES_1 \implies Prediabetes$

$I_(t_2) \implies D_(t_2)$ or by just saying $P_(ModeratePoor) \implies Type1Diabetes$, or generally saying $SES_2 \implies Type1Diabetes$

Also,

$$
⁍
$$

$I_(t_3) \implies D_(t_3)$ or by just saying $P_(Poor) \implies Type2Diabetes$, or generally saying $SES_3 \implies Type2Diabetes$

Also,

$$
I_(t_3) \implies \mu \cdot D
$$

So, as *t* steps increases with some number of iterations, then the number of incidences will increase morbidity or mortality among *N* patient population living with Type 2 Diabetes.  But, Markov is missing some information during his analysis of “*Pattern of Social Deprivation of Mexicans living with Type 2 Diabetes*”.  For example, in terms of $P_N \le 0.03$ according to Achouayb, et. al’s model, we can disprove any outliers from Markov’s model.   Also, for example, as was aforementioned in the introduction about why Pima Indians get sick, likewise, Pima Indians are not the only patient population that get sick from poor eating habits or Mexicans contracting type 2 diabetes are not a mystery in major medically underserved cities like Chicago.  Also, African Americans, Asian Americans or other minority groups in Chicago should not be underrepresented in health disparity data. 

*By example*, *given already* that $I = D(t) = P_N$

$0.03 \cdot P_N \le 1$

*By algebra*, $\because because$ $P_N = I(t)$ by saying

$P_N \le \frac{1}{0.03} \le \frac{0.03 steps}{12months}$ 

### *Patient Prevalence Game*:  the prequel to ‘*GUPSY’s Night Sweets Game*’

To further explore Markov’s and Achouayb, et. al.’s analysis, we must use an example from a game theoretic approach:  

Imagine a situation in which eight people, numbered consecutively 1 - 8, are arranged in a circle.  Starting from person #1, every second person in the circle is eliminated.  The elimination process continues until one person remains.  In the first round the people numbered 2, 4, 6, and 8 are eliminated, in the second round people numbered 3, 7 are eliminated, and in the third round person #5 is eliminated.  So, after the third round only person #1 remains.  

Keeping the background information in mind, the purpose of the ‘*Patient Prevalence Game*’ is to promote patient education through peer - to - peer education and peer recovery and wellness (PRW) support for participants that maybe living with obesity and type 2 diabetes.  Also, game participants’ health belief about complications related to obesity and type 2 diabetes maybe modified through implementing the transtheoretical model of change during game play.  And, during game play, outcomes may show behavior modification related to obesity and type 2 diabetes, through peer - to - peer education techniques.  Hopefully, peer - to - peer education techniques will cause game participants to rise to action and confront stigmas related to obesity and type 2 diabetes, because these stigmas could be related to fat - shaming, living in dehumanizing communities, or even unemployment.  Also, during game play, game participants’ recognition of these stigmas may be stimulated by culturally appropriate game objects on the dystopic city of Chicago map game board.  And, during game play, will these culturally appropriate game objects stimulate a positive feedback response initially towards the game participant precontemplating a change in poor eating behaviors that may lead to a decrease in weight, blood pressure, blood sugar, cholesterol levels, or even dramatic reductions in health care system encounters? 

### Rules and Setup for Patient Prevalence Game

It is a turn-based game, which must be iterated with any number from 1, 2, 4, 6, or 8 players.  Each player, in a non-time based format must go from the 1st dystopic ward all the way to the 76th dystopic ward without any random attack, random food attack, or even being defected from the game.  Any player is defected from the game, that means that got medically underserved during game play.   The whole idea is to make it home safe and eat a healthy meal! 

**Player character pulling ‘*Dummy Vector*’ cards**

![DummyVector.jpeg](Methods%20(Eric%20H%20Smith,%20UIC-Northwestern%20U%20SROP,%20Su%20f383c92169a843bd809657f1913aaa77/DummyVector.jpeg)

If one or more of the player characters randomly land on a dystopic ward, they each may have to pull a ‘*Dummy Vector*’ card.  The card may have warnings related to an overachievement or underachievement of some number of food items from the ‘*Big 7 Circle*’.

**Player character pulling ‘*Faustian Bargain*’ cards**

If one or more of the player characters randomly land on a dystopic ward, they each may have to pull a ‘*Faustian Bargain*’ card.  The card may have suggestions related to alcohol treatment, drug counseling, or smoking cessation.

**Player character Power Ups**

If one or more of the player characters randomly land in the Englewood dystopic ward, they each can power up to avoid further susceptibility against an attack or food attack, by jumping to the Near South dystopic ward.

**Player character Power Downs**

If one or more of the player characters randomly land from a previous move in the New City, Douglas, or Lower Westside dystopic wards must power down to Englewood dystopic ward, by jumping backwards.

**Player character pulling ‘*Specific Dynamic Action*’ cards**

If one or more player characters randomly land on a dystopic ward, they each may have to pull a ‘*Specific Dynamic Action*’ card because of overachievement or underachievement of some number of food items collected from a previous dystopic ward.  This is another way for the player character to Power Up directly to the next dystopic ward on their next move.

**Who will be attacked with complications related to diabetes during game play?**   

The characteristics of the human host are clearly related to disease risk.  Factors such as gender, age, and race have a major effect.

2 Players will be African American, 1 Male and 1 Female

2 Players will be Latino American, 1 Male and 1 Female

2 Players will be Asian American, 1 Male and 1 Female

2 Players will be White American, 1 Male and 1 Female

All male players are numbered odd consecutively 1 - 8

African American Male player is number #1

Latino American Male player is number #3

Asian American Male player is number #5

White American Male player is number #7

All female players are numbered even consecutively 2 - 8

African American Female player is number #2

Latino American Female player is number #4

Asian American Female player is number #6

White American Female player is number #8

**Where in Chicago 76 dystopic wards will the complications related to diabetes arise during game play?**

![1200px-Chicago_community_areas_map.svg.png](Methods%20(Eric%20H%20Smith,%20UIC-Northwestern%20U%20SROP,%20Su%20f383c92169a843bd809657f1913aaa77/1200px-Chicago_community_areas_map.svg.png)

*By theorem*, covering a board with trominoes, 

Instead of a complete circle like the city of Boston, the game board is within the city of Chicago 76 dystopic wards made up of 76 squares or rectangles, or other polygons that are nonconcentric 

Each ward in the city of Chicago is numbered consecutively and randomly 1 - 76 on the city of Chicago dystopic ward map

The 2 African American players can experience a jump state in any of the 76 dystopic wards by some number of iterations

The 2 Latino American players can experience a jump state in any of the 76 dystopic wards by some number of iterations

The 2 Asian American players can experience a jump state in any of the 76 dystopic wards by some number of iterations

The 2 White American players can experience a jump state in any of the 76 dystopic wards by some number of iterations

### Da Dream City Grid

| ⁍ | Neighborhood | Community Color | SES Score | Maslow’s  Hierarachy of Needs Score | ⁍    Life Shock Score | Player Character’s Fate |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | West Pullman | Teal Blue | 0 |  |  |  |
| 2 | Riverdale | Teal Blue | 1 |  |  | Susceptible to an attack in ⁍ |
| 3 | Hegewisch | Teal Blue | 2 |  |  | Player must pull ‘Dummy Vector’ card because of being susceptible to a food attack in ⁍ and overachievement of sodium |
| 4 | East Side | Teal Blue | 3 |  | 0 | At ⁍,  player must pull ‘Faustian Bargain’ card and go to Alcohol Treatment Program in West Pullman because of relapse  |
| 5 | South Deering | Teal Blue | 0 |  |  |  |
| 6 | Pullman | Teal Blue | 1 |  |  | Susceptible to an attack in ⁍ |
| 7 | Roseland | Teal Blue | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to a food attack in ⁍ and overachievement of lipoproteins |
| 8 | Morgan Park | Off Green | 3 |  | 1 | At ⁍, player must pull “Specific Dynamic Action” card, if they moved from Roseland |
| 9 | Mount Greenwood | Off Green | 0 |  |  |  |
| 10 | Beverly | Off Green | 1 |  |  | Susceptible to an attack in ⁍ |
| 11 | Ashburn | Off Green | 2 |  |  | Player must pull ‘Dummy Vector’ card because of Susceptibility to a food attack in ⁍and overachievement of lipids |
| 12 | Ashburn Gresham | Off Green | 3 | 0 | 2 | At ⁍, player will defect from game |
| 13 | Washington Heights | Off Green | 0 |  |  |  |
| 14 | Chatham | Teal Blue | 1 |  |  | Susceptible to an attack in ⁍ |
| 15 | Burnside | Teal Blue | 2 |  |  | Player must pull  ‘Dummy Vector’ card because of susceptibility to a food attack in    ⁍ and overachievement of calories |
| 16 | Calumet Heights | Teal Blue | 3 |  | 3 | At ⁍, player must pull ‘Faustian Bargain’ card and go to Washington Heights for Smoking Cessation Program |
| 17 | South Chicago | Teal Blue | 0 |  |  |  |
| 18 | Avalon Park | Teal Blue | 1 |  |  | Susceptible to an attack in ⁍ |
| 19 | South Shore | Yellow | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to a food attack in ⁍ and underachievement of magnesium |
| 20  | Woodlawn | Yellow | 3 |  | 4 | At ⁍, player must pull “Specific Dynamic Action” card, if they moved from South Shore |
| 21 | Greater Grand Crossing | Yellow | 0 |  |  |  |
| 22 | Englewood | Orange | 1 |  | Player can Power-Up against Food Attack by moving to Near South Ward | Susceptible to an attack in ⁍ |
| 23 | West Englewood | Orange | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to a food attack in ⁍ and underachievement of fiber |
| 24 | Chicago Lawn | Orange | 3 | 1 | 5 | At ⁍, player will defect from game |
| 25 | West Lawn | Orange | 0 |  |  |  |
| 26 | Clearing | Orange | 1 |  |  | Susceptible to an attack in ⁍ |
| 27 | Garfield Ridge | Orange | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and underachievement of potassium |
| 28 | West Elsdon  | Orange | 3 |  | 6 | At ⁍, player must pull ‘Faustian Bargain’ card and go to West Lawn for Drug Treatment Counseling because of relapse |
| 29 | Gage Park  | Orange | 0 |  |  |  |
| 30 | New City | Orange  | 1 |  | Player power downs to Englewood because an increase in weight, if the player makes one move over to Armor Square on the next move | Susceptible to an attack in ⁍ |
| 31 | Armour Square | Yellow | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍  and overachievement of sodium |
| 32 | Washington Park  | Yellow | 3 |  | 7 | ⁍, player must pull “Specific Dynamic Action” card, if they moved over from Armour Square |
| 33 | Hyde Park | Yellow | 0 |  |  |  |
| 34 | Kenwood | Yellow | 1 |  |  | Susceptible to an attack in ⁍ |
| 35 | Oakland | Yellow | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and overachievement of lipoproteins |
| 36 | Grand Blvd | Yellow | 3 | 2 | 0 | At ⁍, player will defect from game |
| 37 | Douglas | Yellow | 0 |  | Player powers down on next move, if it is 1 move over to Armor Square back to Englewood  |  |
| 38 | Bridgeport | Yellow | 1 |  |  | Susceptible to an attack in ⁍ |
| 39 | McKinley Park | Orange | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and overachievement of lipids |
| 40 | Brighton Park  | Orange | 3 |  | 1 | At ⁍,  player must pull ‘Faustian Bargain’ card and go to Douglas for Alcohol Treatment Program because of relapse |
| 41 | Archer Heights | Orange | 0 |  |  |  |
| 42 | South Lawndale | Red | 1 |  |  | Susceptible to an attack in ⁍ |
| 43 | Lower Westside | Red | 2 |  | On the next move, if its 1 move over to Armour Square, the player will power down to Englewood due to increase in weight | Player must pull ‘Dummy Vector’ card because of susceptible to food attack in ⁍  and overachievement of calories |
| 44 | Near South | Lavender  | 3 |  | 2 | ⁍, player must pull “Specific Dynamic Action” card, if they moved over from Lower Westside |
| 45 | Loop | Lavender | 0 |  |  |  |
| 46 | Near Westside | Pink | 1 |  |  | Susceptible to an attack in ⁍ |
| 47 | North Lawndale | Pink | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and underachievement of Magnesium |
| 48 | East Garfield Park | Pink | 3 | 3 | 1 | At ⁍, the player will defect the game |
| 49 | West Garfield Park | Pink | 0 |  |  |  |
| 50 | Austin | Pink | 1 |  |  | Susceptible to an attack in ⁍ |
| 51 | Humboldt Park | Pink | 2 |  | Player was removed, because they did not feed the crocodile at the crocodile lagoon | Susceptible to food attack at the Crocodile Lagoon |
| 52 | West Town | Pink | 3 |  | 2 | At ⁍, player must pull ‘Faustian Bargain’ card to and West Garfield Park for Smoking Cessation Program |
| 53 | Near North | Lavender | 0 |  |  |  |
| 54 | Lincoln Park | Light Blue | 1 |  | Player was removed because of an attack by swooping Red-winged blackbird | Susceptible to attack at Lincoln Park Ponds and Zoo |
| 55 | Logan Square | Light Blue | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack at ⁍ and underachievement of fiber |
| 56 | Hermosa | Blue | 3 |  | 3 | ⁍, player must pull “Specific Dynamic Action” card, if they moved over from Logan Square |
| 57 | Belmont-Cragin | Blue | 0 |  |  |  |
| 58 | Montclare | Blue | 1 |  |  | Susceptible to an attack in⁍ |
| 59 | Dunning | Blue | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and underachievement of potassium |
| 60 | Portage Park | Blue | 3 | 4 | 4 | At ⁍, the player will defect the game |
| 61 | Irving Park | Blue | 0 |  |  |  |
| 62 | Avondale | Light Blue | 1 |  |  | Susceptible to an attack in⁍ |
| 63 | North Center | Light Blue | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in⁍ and underachievement of calcium |
| 64 | Lakeview | Light Blue | 3 |  | Player was removed and exits to Advocate Illinois Masonic Hospital because of food attack in Boystown | At ⁍, relapses to Irving Park for Drug Treatment Program |
| 65 | Uptown | Green | 0 |  |  | Player exits to Camp Tent City at Montrose Point Harbor |
| 66 | Edgewater | Green | 1 |  |  | Susceptible to an attack in⁍ |
| 67 | Rogers Park | Green | 2 |  | Picnic at Loyola Park Beach | Food attack occurred while visiting Loyola Park Beach with family and friends |
| 68 | West Ridge | Green | 3 |  | 6 | ⁍, player must pull “Specific Dynamic Action” card, if they moved over from Rogers Park |
| 69 | Lincoln Square | Green | 0 |  |  |  |
| 70 | Albany Park | Green | 1 |  |  | Susceptible to an attack in ⁍ |
| 71 | North Park | Green | 2 |  |  | Player must pull ‘Dummy Vector’ card because of susceptibility to food attack in ⁍ and overachievement of sodium |
| 72 | Forest Glen | Green | 3 | 5 | 7 | At ⁍, the player defects the game |
| 73 | Jefferson Park | Green | 0 |  |  |  |
| 74 | Norwood Park | Green | 1 |  |  | Susceptible to an attack in ⁍ |
| 75 | Edison Park | Green | 2 |  |  | Player exits to go home to cook dinner to avoid susceptible food attack from fast food |
| 76 | O’ Hare | Green | 3 |  | 0 | Alternative, player exits to a diner problem at La Alojamiento y Comida Confabularse |
|  |  |  |  |  |  |  |

**How much?**

Each player at the beginning of their start state will be given 500 SNAP Bucks to survive on the city of Chicago map board

**When did complications related to diabetes arise during game play?**

When will the player character get exposed to complications related to diabetes?

When will the complications related to diabetes begin in $Ward(\jmath)(\imath)$

**What?**

*By example* of the Monty Hall Problem:  On the game show Let’s make a Deal, hosted by Monty Python, a contestant chooses one of three closed doors, two of which have a goat behind them and one of which has a car.  Monty, who know where the car is, then opens  one of the two remaining doors.  The door he opens always has a goat behind it (he never reveals the car!).  If he has a choice, then he picks a door at random with equal probabilities.  Monty then offers the contestant the option of switching to the other  unopened door.  If the contestant’s goal is to get the car, should she switch doors?

During game play, what will be each player character’s fate with each jump state from dystopic Ward#1 all the way to Ward#76, which is the game play end state?

$I_(AttackRate) \approx \lambda \approx P_N \approx P(\jmath)(\imath)$

$I_(AttackRate) =$  (Number of player characters at risk in whom a certain illness develops) $\div$ (Total number of people at risk in $Ward(\jmath)(\imath)$) is based on what ward the player moves to for food

$D_(FoodAttackRate) =$  (Number of player characters who at a certain fast food, Aldi’s, Jewel’s, Mariano’s became ill) $\div$ (Total number of people at risk in $Ward(\jmath)(\imath)$ that eat fast food, Aldi’s, Jewel’s, Mariano’s ) is based on what ward the player moves to for food

$Attack Rate_(Ward_n) \implies Food Attack Rate_(Ward_n)$

Also, *by definition of conditional probability* the following when a player character will experience a food attack that

$$
 Player_N \implies GroceryStore_(ward(\jmath)(\imath)) \land D_(FoodAttack)
$$

And, also, 

$$
Player_N \implies FastFood_(ward(\jmath)(\imath)) \land D_(FoodAttack)
$$

*By theorem of Law of Total Probability (LOTP),* the probability of events occurring during game play is:

*By establishing* first that

$P_N \approx Probability(Ward(\jmath)) \mid Probability(Ward(\imath)) \lessapprox 1$ 

$Probability(Ward(\jmath)) \times Probability(Ward(\imath)) \lessapprox 1$

$Probability(Ward(\jmath)) \lessapprox \frac{1}{Probability(Ward(\imath))}$

So,

$$
 Probability(FoodAttack)=\sum_{i=1}^{n}Probability(FoodAttack \mid Attack_i) Probability(Attack_i)
$$

Also, by definition of conditional independence, Events A and B are said to be conditionally independent given Event E if $P(A \cap B \mid E) = P(A \mid E)P(B \mid E)$. 

And, 

$$
Probability(Attack \cap FoodAttack \mid Defect) = Probability(Attack \mid Defect)Probability(FoodAttack \mid Defect)
$$

Probability that a player character will land in a ward in which some attack, food attack, or may defect;

*By the naive definition of binomial coefficient*, 

$$
Ward_(\jmath)(\imath) \choose Players_N
$$

And, also, within one iteration less than or equal to 12,

$$
76 Wards \choose 8 Players
$$

as a result, 8 players can choose 76 dystopic wards, which may result in 18,855,883,575 chances of experiencing an attack, food attack, or defect during game play.

[Combinations Calculator (nCr)](https://www.calculatorsoup.com/calculators/discretemathematics/combinations.php?n=76&r=8&action=solve)

$Probability(PowerUp) = Probability(PowerUp \mid Ward_i)\cdot \frac{1}{4} + Probability(PowerUp \mid Ward_j) \cdot \frac{1}{4} + Probability(PowerUp \mid Ward_n) \cdot \frac{1}{4} + Probability(PowerUp \mid Ward_k) \cdot \frac{1}{4}$

$Probability(PowerUp) = 1 \cdot \frac{1}{4} + 0 \cdot \frac {1}{4} + 0 \cdot \frac{1}{4} + 0 \cdot \frac{1}{4} = \frac{1}{4} \approx 0.25$

So during game play, the eight player characters have $18,855,883,575 \times 0.25 \approx 4,713,970,894$ chances to possibly power up against an attack, food attack, or even defect from the game.

### Minor Premise of Argument

Now, knowing the aforementioned major premise during game play, we must discover what will be the emission probabilities of changes in behavior such as weight loss, weight gain, or a health care system encounter, based on $Player_N$ participating in one iteration or more to experience self - efficacy about obesity and type 2 diabetes.

### Story Proof

*Show* that the three different collinear complications:  Hypotension, Ketoacidosis symptoms, or Hypertension, which have hidden states that will result in the emission probabilities related to weight loss and weight gain, or a health care system encounter during game play of $Player_N$ landing on $Ward_N$ in a least one iteration.

Suppose the following:

$$
Player_NStartState \mapsto \circlearrowleft Hypotension \rightleftarrows^{PlayerJumpState}\rightleftarrows Ketoacidosis \leftrightarrows^{PlayerJumpState}\leftrightarrows Hypertension \circlearrowright Player_NVictoryState \multimap             
$$

**Proof.**  There exist that $Player_N$ may start the game with Hypotension, Ketoacidosis symptoms, or Hypertension, which are collinear complications that may result in emission probabilities equaled to weight loss, weight gain, or a health care system encounter.

*By quotient-remainder theorem* the following:  Given any integer n and any positive integer d, there exist integers q and r such that $n = dq + r$, and $0 \le r < d$.

*Restating from the major premise*, let d, d is $P_N$ as a positive integer, which is the $Player_N$ Start State outcomes

*Restating from the major premise*, let q, q is H as a positive integer, which is some some number of Hypotension patients outcomes

*By substitution and multiplication rule*, 

$$
n_(NextPlayer_NState) = P_N \cdot H_N + r
$$

*Restating what has already been given*, $D_N = D_N(t)$

*Restating what has already been given*, $C_N = C_N(t)$ is the $Player_N$ Start State

*Restating what has already been given*, $\lambda \cdot D \implies C_N(t)$

*Restating what has already been given*, $C_N(t) \implies \delta \cdot C$

*Restating what has already been given*, $C_N(t) \implies \nu \cdot C$

*Restating what has already been given*, $C_N(t) \implies \mu \cdot C$ is the $Player_N$  Fall State or Victory State

$\lambda$ is a nonzero probability vector and a nonzero state vector, which can be stated as $\vec{\lambda}$

$$
\vec{\lambda} \lessapprox 1
$$

Then, *by algebra*, 

$$
\vec{\lambda} \cdot D \lessapprox 1
$$

Also, *by algebra*,

$$
\frac{1}{D} \lessapprox \vec{\lambda}
$$

Where D is a nonzero vector.  Since D is a nonzero vector,

*by algebra, we know from the given* the following: $D = N -C$.

$$
D = N - C \implies \frac{1}{N - C} \lessapprox \vec{\lambda}
$$

And, since if D is a nonzero vector, then N and C as well are nonzero vectors.

So, *by algebra*, 

$$
⁍
$$

And, *by theorem* the following:

A scalar $\lambda$ is an eigenvalue of an $n \times n$ matrix $\mathnormal{A}$ if and only if $\lambda$  satisfies the characteristics equation $\mathnormal{det}(A - \lambda \cdot I) = 0$,

but *by algebraic substitution*

$$
\mathnormal{det}(\frac{C}{N} - \vec\lambda \cdot C) \lessapprox 1
$$

And, also *by the matrix inverse and quotient property*

$$
\mathnormal{det}(\frac{1}{N} \cdot C - \vec\lambda \cdot C) \lessapprox 1
$$

So, $\frac{1}{N}$  and $\vec\lambda$ are nonzero scalars.

Let C, C is some number of patients living with complications

Let C, $C \ge 1$

Let C, C is a set with some number of elements

$$
⁍
$$

So, let H, H is Hypotension

Let H, $H \ge 1$

Let K, K is Ketoacidosis

Let K, $K \ge 1$

Let $\tau$, $\tau$  is Hypertension

Let $\tau$, $\tau \ge 1$

And, *by matrix operations*, we can say the following:

$$
\frac{1}{N} \cdot \begin{bmatrix} Hypotension\\                Ketoacidosis\\                                      \vdots\\                   Complications_n\\          \end{bmatrix}   - \vec\lambda \cdot \begin{bmatrix}              Hypotension\\                Ketoacidosis\\                      \vdots\\                   Complications_n\\                    \end{bmatrix}   \lessapprox \begin{bmatrix}                         0\\                                1\\                                0\\ \end{bmatrix}
$$

$$
\frac{1}{N} \cdot \begin{bmatrix} Ketoacidosis\\          Hypertension\\               \vdots\\              Complications_n                \end{bmatrix} -               \vec\lambda \cdot \begin{bmatrix} Ketoacidosis\\               Hypertension\\                      \vdots\\                 Complications_n         \end{bmatrix} \lessapprox \begin{bmatrix}                         0\\                               1\\                                0\\                     \end{bmatrix}
$$

[Patient Incidences Algorithm written in Pseudocode](Methods%20(Eric%20H%20Smith,%20UIC-Northwestern%20U%20SROP,%20Su%20f383c92169a843bd809657f1913aaa77/Patient%20Incidences%20Algorithm%20written%20in%20Pseudocode%20d1540fac27a64e0ca3096e47b3d02183.md)
