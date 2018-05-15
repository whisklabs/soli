The German Decompounder code in this module is based on [this repo](https://github.com/jprante/elasticsearch-analysis-decompound),
but doesn't require Lucene or Elasticsearch as dependency and can be used as standalone library.

# References

The Compact Patricia Trie data structure can be found in

* Morrison, D.: Patricia - practical algorithm to retrieve information coded in alphanumeric. Journal of ACM, 1968, 15(4):514–534*

The compound splitter used for generating features for document classification is described in

* Witschel, F., Biemann, C.: Rigorous dimensionality reduction through linguistically motivated feature selection for text categorization. Proceedings of NODALIDA 2005, Joensuu, Finland*

The base form reduction step (for Norwegian) is described in

* Eiken, U.C., Liseth, A.T., Richter, M., Witschel, F. and Biemann, C.: Ord i Dag: Mining Norwegian Daily Newswire. Proceedings of FinTAL, Turku, 2006, Finland*

# License

Decompounder Analysis Plugin for Elasticsearch

Copyright (C) 2012 Jörg Prante

Derived work of ASV toolbox http://asv.informatik.uni-leipzig.de/asv/methoden

Copyright (C) 2005 Abteilung Automatische Sprachverarbeitung, Institut für Informatik, Universität Leipzig

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.