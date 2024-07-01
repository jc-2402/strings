//given a route find shortest path
public class string3{
    public static float shortestpath(String path){
        int x=0; 
        int y =0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            if(dir =='N'){
                y++;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            //weat
            if(dir == 'W'){
                x--;
            }
            
        }
        
            int X2 = x*x;
            int Y2 = y*y;//  starting 0,0
            return (float) Math.sqrt(X2 + Y2);
    }
    
    public static void main(String args[]){
            String path ="WNEENESENNN";
            System.out.println(shortestpath(path));
        }
}