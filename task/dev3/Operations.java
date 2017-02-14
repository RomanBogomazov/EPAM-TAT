class Operations
{
	public int average(Person[] persons, int count)
	{
		int sum = 0;
		for(int i = 0; i < count; i++) 
			sum += Integer.valueOf(persons[i].age);
		return sum /= count;
	}

	public int max_age(Person[] persons, int count)
	{
		int max = 0;

		for(int i = 0; i < count; i++) 
		{
			if(max < Integer.valueOf(persons[i].age))
				max = Integer.valueOf(persons[i].age);
		}
		return max;
	}

/*	public String popular_female_name(Person[] persons, int count)
	{
		String name;
		int max_count, count = 0;
		
		for(int i = 0; i < count; i++) 
		{
			name = persons[0].name;
			max_count = count;
			for(int j = i+1; j < count; j++) 
			{
				if(name.equals(persons[j].name)) count++;
					max = Integer.valueOf(persons[i].age);
			}
		}
		return name;
	}
*/}