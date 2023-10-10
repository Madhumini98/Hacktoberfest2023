def sum_of_odd_numbers(n):
    sum = 0
    for i in range(n):
        odd_number = 2 * i + 1
        sum += odd_number
        yield sum

n_terms = 1000  # Adjust the number of terms to observe the divergence
partial_sums = list(sum_of_odd_numbers(n_terms))

# Plotting the partial sums to visualize divergence
import matplotlib.pyplot as plt

plt.plot(range(1, n_terms + 1), partial_sums)
plt.xlabel("Number of Terms")
plt.ylabel("Partial Sum")
plt.title("Divergence of the Sum of Odd Numbers")
plt.grid()
plt.show()
