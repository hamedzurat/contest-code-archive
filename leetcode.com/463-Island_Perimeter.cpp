#include <bits/stdc++.h>
using namespace std;

struct Coordinate{
    int r;
    int c;
};

Coordinate findStart(const vector<vector<int>>& grid){
    for(int i=0; i < (int)grid.size(); i++)
        for(int j=0; j < (int)grid[0].size(); j++)
            if (grid[i][j]==1) return {i,j};
    exit(1);
}

vector<Coordinate> findNeighbor(Coordinate& cell, int R, int C){
    vector<Coordinate> N;

    if(cell.r > 0) N.push_back({cell.r - 1, cell.c});
    if(cell.c > 0) N.push_back({cell.r, cell.c - 1});
    if(cell.r +1 < R) N.push_back({cell.r + 1, cell.c});
    if(cell.c +1 < C) N.push_back({cell.r, cell.c + 1});

    return N;
}

class Solution {
public:
    int islandPerimeter(const vector<vector<int>>& grid) {
        int perimeters = 0;
        int R = grid.size();
        int C = grid[0].size();
        vector<vector<bool>> visited(R, vector<bool>(C, false));
        queue<Coordinate> _;

        Coordinate start = findStart(grid);
        // cout << start.r << "-" << start.c << endl;
        _.push(start);
        visited[start.r][start.c] = true;

        while(!_.empty()){
            int p = 4;
            Coordinate now = _.front();
            _.pop();

            for(Coordinate N : findNeighbor(now, R,C)){
                if(grid[N.r][N.c]==1) p--;
                if(!visited[N.r][N.c] && grid[N.r][N.c]==1){
                    _.push(N);
                    visited[N.r][N.c] = true;
                }
            }

            // cout << "walk: " << now.r << "-" << now.c << " : " << p << endl;
            perimeters += p;
        }

        return perimeters;
    }
};

int main() {
    Solution sol;
    vector<vector<int>> grid = {
        {0,1,0,0},
        {1,1,1,0},
        {0,1,0,0},
        {1,1,0,0}
    };
    // vector<vector<int>> grid = {{1}};
    // vector<vector<int>> grid = {{1,0}};

    int out = sol.islandPerimeter(grid);
    cout << "perimeter = " << out << endl;

    return 0;
}
