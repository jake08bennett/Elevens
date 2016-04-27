Questions
- 

1. These games all involve a full deck of cards and a board. Also they have basically the same purpose to get the cards remaining to 0. All games involve removing all cards from a deck based on two  rules, the first is that you can pick a pair of cards that add up to the number specified in the game's name. The other is a custom rule such as quartets of high cards in Tens, JQK in Elevens, single kings in Thirteens. The differences are the size of the deck, and rules.

2. The size variable for each Board is passed in the constructor and used to make an array of cards with that given value. In the Board's getter, it's size is then accessed from the length of the cards array.

3.isLegal and anotherIsPossible are two methods which cover the differences between Elevens and Thirteens and Tens. they do this by checking and making sure the moves done are following the rules of the separate games.