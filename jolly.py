def main(L):

    if(L[0] == 1):
        print("Jolly")
    else:
        diff = []; n = L[0]

        for i in range(1, n):
            diff.append(abs(L[i]-L[i+1]))

        diff.sort()

        #verificar si es jolly...
        jolly = True
        
        for i in range(1, n):
            if(i!=diff[i-1]):
                print("Not Jolly"); jolly = False
                break

        if jolly: print("Jolly")

if __name__ == "__main__":

    entrada_01 = [5, 1, 2, 4, -1, 6]
    entrada_02 = [4, 1, 4, 2, 3]
    entrada_04 = [1, 3]

    main(entrada_01)