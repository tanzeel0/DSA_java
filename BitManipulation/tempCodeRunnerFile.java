      int ans = 0;
        for(int i=0; i<31; i++){
            int cnt = 0;
            for(int j=0; j<nums.length-1; j++){
                if((nums[j] & (1 << i)) != 0) cnt++;   
            }
            if(cnt %3 == 1) ans = ans | (1 << i);
        }
        System.out.println(ans);