# ViewPagerwithFragments
Android - ViewPager with Fragments using FragmentPagerAdapter / FragmentStatePagerAdapter

Summary
FragmentPagerAdapter
- Fragments are DETACHED when not in use
- Fragments remain in memory
- Used when there are less Fragments
- Generally ised for static Fragments

FragmentStatePagerAdapter
- Fragments are DESTROYED when not in use
- Fragments are removed - Memory Efficient
- Used when the are a large number of Fragments
- Generally used for Dynamic Fragments
