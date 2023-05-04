# 游戏主要入口
import pygame
from source import tools, setup

from source import tools


def main():
    game = tools.Game()
    game.run(setup.GRAPHICS)


if __name__ == '__main__':
    main()



