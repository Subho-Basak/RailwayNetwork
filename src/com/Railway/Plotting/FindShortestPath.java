package com.Railway.Plotting;

import javax.swing.JOptionPane;

public class FindShortestPath {
	final static int N = 40;
	static int path[], count;
	final static int IN=9999999;
	static boolean hasPath, isBlocked, wasSearched;
	public int dijsktra(int cost[][], int source, int target, String string) {
		int dist[], prev[], selected[];
		int i, m, min, start, d, j, noPath = 0;
		boolean hasNoPath = false;
		path = new int[N];
		dist = new int[N];
		prev = new int[N];
		selected = new int[N];
		System.out.println("Entered Djikstra");

		for (i = 0; i < N; i++) {
			dist[i] = IN;
			prev[i] = -1;
		}
		start = source;
		selected[start] = 1;
		dist[start] = 0;
		while (selected[target] == 0) {
			min = IN;
			m = 0;
			for (i = 0; i < N; i++) {
				d = dist[start] + cost[start][i];
				if (d < dist[i] && selected[i] == 0) {
					dist[i] = d;
					prev[i] = start;
				}
				if (min > dist[i] && selected[i] == 0) {
					min = dist[i];
					m = i;
				}
			}
			start = m;
			selected[start] = 1;
			System.out.println("Within while");
			noPath++;
			if (noPath > 100)// it catches the noPath logic
			{
				hasNoPath = true;
				break;
			}
		}
		System.out.println("Out of while");

		if (hasNoPath == true) {
			hasPath = false;

			if (string.equals("blocked")) {
				int n = JOptionPane
						.showConfirmDialog(
								p1,
								"Do you really want to block this route ?\nThere is no alternate path available\n if you block this route.",
								"Message", JOptionPane.YES_NO_OPTION);

				return n;
			} else if (string.equals("search"))
				JOptionPane.showMessageDialog(p1,
						"There is no route available !");
			;

		} else {
			start = target;
			j = 0;
			count = 0;
			while (start != -1) {
				path[j] = start;
				start = prev[start];
				count++;
				j++;

				if (count > 50) {
					System.out.println("No path");
					break;
				}
				System.out.println("within while start");
			}
			// path[j]='\0';
			// strrev(path);
			for (j = 0; j < count; j++)
				System.out.print(path[j] + "->");

			if (count >= 2)
				hasPath = true;

			// p1.repaint();
			// p1.revalidate();
			// p1.validate();
			p1.updateUI();

		}
		// printf("%s", path)

		return dist[target];
	}

}
