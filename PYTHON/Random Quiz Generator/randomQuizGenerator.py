# Author: Benrnard Muinde
# Last modidfied March 20 2022 1:20pm
# Creates questions and answers in a random order.

import random

#quiz data...keys are states and values their capitals
capitals = {'Alabama':'Montgomery','Alaska':'juneau','Arizona':'Phoenix',
'Arkansas':'Little Rock','California':'Sacramento','Colorado':'Denver',
'Connecticut':'Hartford','Delaware':'Dover','Florida': 'Tallahassee', 
'Georgia': 'Atlanta', 'Hawaii': 'Honolulu', 'Idaho': 'Boise', 'Illinois': 
'Springfield', 'Indiana': 'Indianapolis', 'Iowa': 'Des Moines', 'Kansas': 
'Topeka', 'Kentucky': 'Frankfort', 'Louisiana': 'Baton Rouge', 'Maine': 
'Augusta', 'Maryland': 'Annapolis', 'Massachusetts': 'Boston', 'Michigan': 
'Lansing', 'Minnesota': 'Saint Paul', 'Mississippi': 'Jackson', 'Missouri': 
'Jefferson City', 'Montana': 'Helena', 'Nebraska': 'Lincoln', 'Nevada': 
'Carson City', 'New Hampshire': 'Concord', 'New Jersey': 'Trenton',
'New Mexico': 'Santa Fe', 'New York': 'Albany', 'North Carolina': 'Raleigh', 
'North Dakota': 'Bismarck', 'Ohio': 'Columbus', 'Oklahoma': 'Oklahoma City', 
'Oregon': 'Salem', 'Pennsylvania': 'Harrisburg', 'Rhode Island': 'Providence', 
'South Carolina': 'Columbia', 'South Dakota': 'Pierre', 'Tennessee': 
'Nashville', 'Texas': 'Austin', 'Utah': 'Salt Lake City', 'Vermont': 
'Montpelier', 'Virginia': 'Richmond', 'Washington': 'Olympia', 
'West Virginia': 'Charleston', 'Wisconsin': 'Madison', 'Wyoming': 'Cheyenne'}

#generate 35 quiz files
for quizNum in range(35):
    # create quiz and answer key files.
    quizFile =open('capitalsquiz%s.txt' % (quizNum + 1), 'w')
    answerKeyFile = open('capitalsquiz_answers%s.txt' % (quizNum + 1), 'w')

    # quiz header
    quizFile.write('Name:\n\nCourse\n\nDate:\n\nYear of study:\n\n')
    quizFile.write((' ' * 20) + 'State Captitals Quiz (Form %s)' % (quizNum +1))
    quizFile.write('\n\n')

    # shuffle order of states
    states = list(capitals.keys())
    random.shuffle(states)

    # loop through states make question for each
    for questionNum in range(50):
        
        # get right and wrong capitalsquiz_answers
        correctAnswer = capitals[states[questionNum]]
        wrongAnswers = list(capitals.values())
        del wrongAnswers[wrongAnswers.index(correctAnswer)]
        wrongAnswers = random.sample(wrongAnswers, 3)
        answerOptions = wrongAnswers + [correctAnswer]
        random.shuffle(answerOptions)

        # write question and answer option to the quiz files
        quizFile.write('%s. What is the capital of %s?\n' % (questionNum + 1, states[questionNum]))
        for i in range(4):
            quizFile.write('   %s. %s\n' % ('ABCD'[i], answerOptions[i]))
        quizFile.write('\n')

        #write answer to a file
        answerKeyFile.write('%s. %s\n' % (questionNum + 1, 'ABCD'[answerOptions.index(correctAnswer)]))
    quizFile.close()
    answerKeyFile.close()