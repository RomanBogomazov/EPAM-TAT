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

	public String popular_female_name(Person[] persons, int count)
	{
		String name = null;
		int max_count, count_cycle = 0;
		max_count = count;
			
		for(int i = 0; i < count; i++) 
		{
			if(persons[i].sex.equals("female")) {
				name = persons[i].name;
				for(int j = i+1; j < count; j++)
					if(name.equals(persons[j].name))
						count_cycle++;

				if(max_count < count_cycle)
				{
					max_count = count_cycle;
					name = persons[i].name;
				}
			
				}
		}
		return name;
	}
}