#include <iostream>
#include <stack>
#include <vector>
using namespace std;

struct Coordinate {
    int row;
    int col;
};

vector<Coordinate> getNeighbors(const Coordinate& cell, int rowCount, int columnCount) {
    vector<Coordinate> neighbors;
    if(cell.row > 0)
        neighbors.push_back({ cell.row - 1, cell.col });
    if(cell.row + 1 < rowCount)
        neighbors.push_back({ cell.row + 1, cell.col });
    if(cell.col > 0)
        neighbors.push_back({ cell.row, cell.col - 1 });
    if(cell.col + 1 < columnCount)
        neighbors.push_back({ cell.row, cell.col + 1 });
    return neighbors;
}

class Solution {
    public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int rowCount      = image.size();
        int columnCount   = image[0].size();
        int originalColor = image[sr][sc];
        if(originalColor == color)
            return image;

        stack<Coordinate> _;
        _.push({ sr, sc });

        while(!_.empty()) {
            Coordinate currentCell = _.top();
            _.pop();

            image[currentCell.row][currentCell.col] = color;

            for(Coordinate neighborCell : getNeighbors(currentCell, rowCount, columnCount)) {
                if(image[neighborCell.row][neighborCell.col] == originalColor) {
                    _.push(neighborCell);
                }
            }
        }

        return image;
    }
};
