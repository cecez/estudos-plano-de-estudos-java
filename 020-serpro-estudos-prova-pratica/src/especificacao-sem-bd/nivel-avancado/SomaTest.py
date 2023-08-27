import unittest
from Soma import Soma

class SomaTeste(unittest.TestCase):

	def testSoma(self):
		self.assertEqual(Soma.soma(1,1), 2)
		self.assertEqual(Soma.soma(-1,1), 0)
		self.assertEqual(Soma.soma(10,1), 11)
		self.assertEqual(Soma.soma(1,-2), -1)
		self.assertEqual(Soma.soma(0,0), 0)


if __name__ == "__main__":
	unittest.main()