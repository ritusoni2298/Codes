import random
def inputPlayerLetter():
    # Let's the player type which letter they want to be.
    # Returns a list with the player's letter as the first item, and the computer's letter as the second.
    letter = ''
    while not (letter == '1' or letter == '0'):
        print('Do you want to be 1 or 0?')
        letter = input().upper()

    # the first element in the tuple is the player's letter, the second is the computer's letter.
    if letter == '1':
        return ['1', '0']
    else:
        return ['0', '1']

def whoGoesFirst():
    # Randomly choose the player who goes first.
    print('Press 1 to start first otherwise computer will go first.')
    ls = input()
    if ls=='1':
        return 'player'
    else:
        return 'computer'
        
def isSpaceFree(board, move):
    # Return true if the passed move is free on the passed board.
    return board[move] == ' '

def getPlayerMove(board):
    # Let the player type in his move.
    move = ' '
    while move not in '1 2 3 4 5 6 7 8 9'.split() or not isSpaceFree(board, int(move)):
        print('What is your next move? (1-9)')
        move = input()
    return int(move)

def makeMove(board, letter, move):
    board[move] = letter

def isBoardFull(board):
    # Return True if every space on the board has been taken. Otherwise return False.
    for i in range(1, 10):
        if isSpaceFree(board, i):
            return False
    return True
    
def getComputerMove(board, computerLetter):
    # Given a board and the computer's letter, determine where to move and return that move.
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
    # Reset the board
    theBoard = [' '] * 10
    playerLetter, computerLetter = inputPlayerLetter()
    turn = whoGoesFirst()
    print('The ' + turn + ' will go first.')
    gameIsPlaying = True
    
    while gameIsPlaying:
        if turn == 'player':
            # Player's turn.
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
