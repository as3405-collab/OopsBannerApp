public class OopsBannerApp {
    static class CharacterPatternMap {

        Character character;

        String[] pattern;

       public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern   = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[] {
            " ***  ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            " ***  "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[] {
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[] {
            " **** ",
            "*     ",
            "*     ",
            " **** ",
            "     *",
            "     *",
            " **** "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[] {
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  "
        });

        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap charMap : charMaps) {
            if (charMap.getCharacter() == ch) {
                return charMap.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = 7;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder row = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                row.append(pattern[line]);
                row.append(" "); 
            }

            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}