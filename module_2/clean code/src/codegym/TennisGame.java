package codegym;

public class TennisGame {

    public static Object getScore(String nameOfPlayer1, String nameOfPlayer2, int playerScore1, int playerScore2) {
        String score = "";
        int tempScore = 0;
        if (playerScore1 == playerScore2) {
            score = beEqual(playerScore1);
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            score = toWin(playerScore1, playerScore2);
        } else {
            score += readScore(tempScore, playerScore1, playerScore2);
        }

        return score;
    }

    public static String beEqual(int playerScore1) {
        String score = "";
        switch (playerScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String toWin(int playerScore1, int playerScore2) {
        String score = "";
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String readScore(int tempScore, int playerScore1, int playerScore2) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                score += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}