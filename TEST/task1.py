import random
def inputPlayerLetter():
    
    letter = ''
    while not (letter == '1' or letter == '0'):
        print('Do you want to be 1 or 0?')
        letter = input().upper()


    if letter == '1':
        return ['1', '0']
    else:
        return ['0', '1']

def whoGoesFirst():
    print('Press 1 to start first otherwise computer will go first.')
    ls = input()
    if ls=='1':
        return 'player'
    else:
        return 'computer'
        
def isSpaceFree(board, move):
    
    return board[move] == ' '

def getPlayerMove(board):
   
    move = ' '
    while move not in '1 2 3 4 5 6 7 8 9'.split() or not isSpaceFree(board, int(move)):
        print('What is your next move? (1-9)')
        move = input()
    return int(move)

def makeMove(board, letter, move):
    board[move] = letter

def isBoardFull(board):
    for i in range(1, 10):
        if isSpaceFree(board, i):
            return False
    return True
    
def getComputerMove(board, computerLetter):
    if computerLetter == '1':
        playerLetter = '0'
    else:
        playerLetter = '1'
    
    possibleMoves = []
    for i in range(1, 10):
        if isSpaceFree(board, i):
            possibleMoves.append(i)
    if len(possibleMoves) != 0:
        g=random.choice(possibleMoves)
        copy =[i for i in board]
        makeMove(copy, computerLetter,g)
        return g

while True:
    theBoard = [' '] * 10
    playerLetter, computerLetter = inputPlayerLetter()
    turn = whoGoesFirst()
    print('The ' + turn + ' will go first.')
    gameIsPlaying = True
    
    while gameIsPlaying:
        if turn == 'player':
            print(theBoard[1:])
            move = getPlayerMove(theBoard)
            makeMove(theBoard, playerLetter, move)
            
            if isBoardFull(theBoard):
                print(theBoard[1:])
                print('now full')
                break
            else:
                turn = 'computer'
                    
        else:
            move = getComputerMove(theBoard, computerLetter)
            makeMove(theBoard, computerLetter, move)
            print(theBoard[1:])
            if isBoardFull(theBoard):
                print(theBoard[1:])
                print('now full')
                break
            else:
                turn = 'player'
    
    x=input('Wanna again try! press Yes else see you soon')
    if (x.lower())[0] =='y':
        gameIsPlaying=False
