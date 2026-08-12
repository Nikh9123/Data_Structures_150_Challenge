class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int car[][] = new int[position.length][2];

        for(int i = 0 ; i < speed.length ; i++){
            car[i][0] = position[i] ;
            car[i][1] = speed[i] ;
        }

        Arrays.sort(car, (a, b) -> b[0] - a[0]);

        Stack<Double>stack = new Stack();

        for(int i = 0 ; i < speed.length ; i++){
            double time = (double)(target - car[i][0]) / car[i][1];


            if(stack.isEmpty() || stack.peek() < time){
                stack.push(time);
            }
        }
        return stack.size() ;
    }
}
