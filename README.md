# first-fit-job-java


The operating system uses different memory management schemes to optimize resource allocation. The responsibility of these schemes is to allocate memory chunks based on the demand by the operating system. The three most commonly used allocation schemes are first to fit, best fit, and worst fit.
The first fit memory allocation scheme checks the empty memory block in a sequential manner. This means that the memory block found empty at the first attempt is checked for size; if the size is not less than the required size, it is allocated. One of the biggest issues in this memory allocation scheme is, when a process is allocated to a comparatively larger space than needed, it creates huge chunks of memory space.
