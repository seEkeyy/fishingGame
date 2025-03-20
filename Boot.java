/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    public Boot() {
        super.setCost(0);
    }
    @Override
    public boolean wasCaught(Hook h)
    {
        return true;
    }
}

