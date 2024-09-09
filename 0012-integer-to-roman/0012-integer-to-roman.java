class Solution {
    public String intToRoman(int n) {
        String units[]=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[]=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds[]=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]=new String[]{"","M","MM","MMM"};
        return thousands[n/1000]+hundreds[(n%1000)/100]+tens[(n%100)/10]+units[n%10];

    }
}