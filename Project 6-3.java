# Open my_data.txt file in read mode using 'with' statement
with open('my_data.txt', 'r') as file_in:
    # Open my_copy.txt file in write mode using 'with' statement
    with open('my_copy.txt', 'w') as file_out:
        # Iterate over each line in my_data.txt
        for line in file_in:
            # Write each line from my_data.txt to my_copy.txt
            file_out.write(line)