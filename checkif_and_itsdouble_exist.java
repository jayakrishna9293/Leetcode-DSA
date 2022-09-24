public class checkif_and_itsdouble_exist {
    public boolean checkIfExist(int[] arr) {
        int start, end, mid;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; ++i)
        {
            start = 0;
            end = arr.length - 1;

            while (start <= end)
            {
                mid = start + (end - start) / 2;

                if (i != mid && 2 * arr[i] == arr[mid])
                    return true;
                else if (2 * arr[i] < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return false;
    }
}
