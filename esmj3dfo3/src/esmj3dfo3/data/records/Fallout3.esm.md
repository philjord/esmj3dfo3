Esm Record Formats 

=== 

## URL 

<p><a href="https://en.uesp.net/wiki/Oblivion:Oblivion">https://en.uesp.net/wiki/Oblivion:Oblivion</a></p> 

<p><a href="https://en.uesp.net/wiki/Oblivion_Mod:Modding#Toolmaker_Info">https://en.uesp.net/wiki/Oblivion_Mod:Modding#Toolmaker_Info</a></p> 

<p><a href="https://en.uesp.net/wiki/Oblivion_Mod:Mod_File_Format">https://en.uesp.net/wiki/Oblivion_Mod:Mod_File_Format</a></p> 

## My cut of it   

<p>An <b>ACTI</b> Activators</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>WNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTD</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DMDL</td> 

<td>byte[] 41</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DMDT</td> 

<td>byte[] 144</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 96</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DEST</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 42</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 14</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ADDN</b> Addon Node</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 21</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ALCH</b> Potions</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MICO</td> 

<td>byte[] 70</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFID</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFIT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ETYP</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ENIT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 52</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>AMMO</b> Ammunition</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 13</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ONAM</td> 

<td>byte[] 6</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 59</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MICO</td> 

<td>byte[] 76</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 13</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ANIO</b> Animated Object</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ARMA</b> Armor Addon</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICO2</td> 

<td>byte[] 31</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO3S</td> 

<td>byte[] 25</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODS</td> 

<td>byte[] 25</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOD2</td> 

<td>byte[] 63</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO2T</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 44</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOD3</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO3T</td> 

<td>byte[] 120</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOSD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 22</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ETYP</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BMDT</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 168</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ARMO</b> Armor</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICO2</td> 

<td>byte[] 31</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO4S</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO3S</td> 

<td>byte[] 64</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BIPL</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MICO</td> 

<td>byte[] 85</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BMCT</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODS</td> 

<td>byte[] 63</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOD2</td> 

<td>byte[] 25</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO2T</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO2S</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EITM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOD3</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO3T</td> 

<td>byte[] 144</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOD4</td> 

<td>byte[] 25</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MO4T</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MOSD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 144</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>REPL</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ETYP</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 52</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BMDT</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 19</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ASPC</b> Acoustic Space</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDAT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>AVIF</b> Actor Values/Perk Tree Graphics</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 64</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 9</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 140</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>BOOK</b> Books</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 65</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 34</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>BPTD</b> Body Part Data</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RAGA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BPND</td> 

<td>byte[] 84</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM1</td> 

<td>byte[] 23</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM4</td> 

<td>byte[] 17</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM5</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BPTN</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BPNN</td> 

<td>byte[] 17</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BPNT</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BPNI</td> 

<td>byte[] 42</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CAMS</b> Cameras</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 40</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CLAS</b> Classes</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 14</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ATTR</td> 

<td>byte[] 7</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CLMT</b> Climate</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>WLST</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 12</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>GNAM</td> 

<td>byte[] 17</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 14</td> 

<td>???Including pointers to nif files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 6</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CONT</b> Containers</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNTO</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>COED</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 5</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>QNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 14</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 21</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CPTH</b> Camera Path</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CREA</b> Creatures</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNTO</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>AIDT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 17</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RNAM</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>KFFZ</td> 

<td>byte[] 295</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 33</td> 

<td>???Including pointers to nif files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SPLO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EAMT</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NIFZ</td> 

<td>byte[] 68</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NIFT</td> 

<td>byte[] 729</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ACBS</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VTCK</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TPLT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>COED</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSDT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSDI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSDC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DEST</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTD</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EITM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKID</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>WNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM4</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM5</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSCR</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>CSTY</b> Combat Styles</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSTD</td> 

<td>byte[] 92</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSAD</td> 

<td>byte[] 84</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CSSD</td> 

<td>byte[] 64</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>DEBR</b> Debris</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 21</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>DIAL</b> Dialog</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>QSTI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>DOBJ</b> Default Object Manager</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>1</td> 

<td>DATA</td> 

<td>byte[] 84</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>DOOR</b> Doors</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTD</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DMDL</td> 

<td>byte[] 50</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DEST</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODS</td> 

<td>byte[] 66</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 18</td> 

<td>???Including pointers to nif files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 5</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ECZN</b> Encounter Zone</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>EFSH</b> Effect Shaders</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICO2</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 224</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM7</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>ENCH</b> Enchantments</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 13</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ENIT</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFID</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFIT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>EXPL</b> Explosion</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 96</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EITM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 15</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 52</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 33</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>EYES</b> Eyes</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 15</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 29</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

</table></tbody><p>An <b>FACT</b> Factions</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MNAM</td> 

<td>byte[] 7</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 7</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>XNAM</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 23</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>FLST</b> Form List (non-leveled list)</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>FURN</b> Furniture</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 6</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 47</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>GLOB</b> Global Variables</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FLTV</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>GMST</b> Game Settings</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>GRAS</b> Grass</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 37</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>HAIR</b> Hair</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 39</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 96</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 25</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>HDPT</b> Head Part</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 96</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODS</td> 

<td>byte[] 33</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IDLE</b> Idle Animations</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 6</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 66</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IDLM</b> Idle Marker</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLF</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLA</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IMAD</b> Image Space Modifier</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>_IAD</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 244</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>BNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 40</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM3</td> 

<td>byte[] 40</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>UNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM1</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM2</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>WNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>XNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM4</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IMGS</b> Image Space</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 132</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>INGR</b> Ingredients</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>1</td> 

<td>ETYP</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>ENIT</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>EFID</td> 

<td>FormId</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>EFIT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IPCT</b> Impact</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 38</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DODT</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>IPDS</b> Impact Data Set</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>KEYM</b> Keys</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 48</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MICO</td> 

<td>byte[] 66</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 21</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 23</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LGTM</b> Lighting Template</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 40</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LIGH</b> Lights</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LSCR</b> Load Screens</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LNAM</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 39</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 84</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LTEX</b> Land Textures</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>GNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HNAM</td> 

<td>byte[] 3</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LVLC</b> Leveled Creatures</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLO</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLF</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LVLI</b> Leveled Items</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLF</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLG</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLO</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>COED</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>LVLN</b> LeveledCharacter</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLO</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LVLF</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>MESG</b> Message</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM7</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM8</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM9</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM4</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM5</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM6</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM0</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM1</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM2</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM3</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ITXT</td> 

<td>byte[] 19</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 31</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>MGEF</b> Magic Effects</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 19</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 31</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>MICN</b> Menu Icon</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>ZString</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

</table></tbody><p>An <b>MISC</b> Miscellaneous Items</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MICO</td> 

<td>byte[] 82</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 59</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 11</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>MSTT</b> Movable Static</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 13</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTD</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DMDL</td> 

<td>byte[] 23</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DMDT</td> 

<td>byte[] 288</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 144</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DEST</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 19</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>MUSC</b> Music</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>NAVI</b> Navigation</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>1</td> 

<td>NVCI</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>NVMI</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>1</td> 

<td>NVER</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>NOTE</b> Notes</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ONAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>XNAM</td> 

<td>byte[] 34</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 52</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 15</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 37</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>NPC_</b> NPCs</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKID</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 11</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>AIDT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNTO</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VTCK</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EAMT</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TPLT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 30</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ACBS</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ZNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SPLO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>COED</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>LNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM7</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGGA</td> 

<td>byte[] 120</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGTS</td> 

<td>byte[] 200</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM5</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM6</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ENAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HCLR</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM4</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGGS</td> 

<td>byte[] 200</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>PACK</b> Packages</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCDA</td> 

<td>byte[] 14</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCTX</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKE2</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKDD</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PTDT</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PLD2</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCHR</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>POCA</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>POEA</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>POBA</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKDT</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PLDT</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PSDT</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLB</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SLSD</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCVR</td> 

<td>byte[] 7</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRV</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKAM</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKED</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PUID</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLF</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLT</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>IDLA</td> 

<td>byte[] 32</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKW3</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PTD2</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKFD</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PKPT</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>PERK</b> Perk</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCTX</td> 

<td>byte[] 71</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EPF3</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCHR</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCDA</td> 

<td>byte[] 33</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PRKC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 59</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 15</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PRKF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EPFT</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EPF2</td> 

<td>byte[] 7</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EPFD</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PRKE</td> 

<td>byte[] 3</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 167</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>PROJ</b> Projectile</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTF</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM2</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 168</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DEST</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DSTD</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 68</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM1</td> 

<td>byte[] 50</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 29</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>PWAT</b> Placeable Water</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>QUST</b> Quests</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM0</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>QOBJ</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NNAM</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>QSTA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCDA</td> 

<td>byte[] 11</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCTX</td> 

<td>byte[] 64</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INDX</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>QSDT</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCHR</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>RACE</b> Races</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ONAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGGA</td> 

<td>byte[] 120</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGTS</td> 

<td>byte[] 200</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNAM</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HNAM</td> 

<td>byte[] 164</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ENAM</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FGGS</td> 

<td>byte[] 200</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>INDX</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 33</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 42</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 72</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM1</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODD</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MNAM</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ATTR</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM0</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DNAM</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CNAM</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>PNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>UNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>YNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NAM2</td> 

<td>byte[] 0</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>VTCK</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DESC</td> 

<td>byte[] 1</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>RADS</b> Unknown RADS ?</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>REGN</b> Regions</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDMD</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDOT</td> 

<td>byte[] 624</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ICON</td> 

<td>byte[] 23</td> 

<td>???Including pointers to dds files.</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDMP</td> 

<td>byte[] 22</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDWT</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDSD</td> 

<td>byte[] 84</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RCLR</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>WNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RPLI</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RPLD</td> 

<td>byte[] 48</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RDAT</td> 

<td>byte[] 8</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>RGDL</b> Ragdoll</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>NVER</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 14</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>XNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>TNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RAFD</td> 

<td>byte[] 60</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RAFB</td> 

<td>byte[] 42</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>RAPS</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 42</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>SCOL</b> Static Collection</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODT</td> 

<td>byte[] 528</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ONAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>DATA</td> 

<td>byte[] 56</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>MODL</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>SCPT</b> Scripts</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRV</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SLSD</td> 

<td>byte[] 24</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCVR</td> 

<td>byte[] 17</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCRO</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCHR</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCDA</td> 

<td>byte[] 1331</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SCTX</td> 

<td>byte[] 4106</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>SOUN</b> Sounds</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNDX</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>ANAM</td> 

<td>byte[] 10</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>GNAM</td> 

<td>byte[] 2</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>HNAM</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FNAM</td> 

<td>byte[] 31</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SNDD</td> 

<td>byte[] 36</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>SPEL</b> Spells</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>CTDA</td> 

<td>byte[] 28</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFID</td> 

<td>byte[] 4</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>EFIT</td> 

<td>byte[] 20</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>FULL</td> 

<td>byte[] 11</td> 

<td>???</td> 

</tr> 

<tr> 

<td>?</td> 

<td>SPIT</td> 

<td>byte[] 16</td> 

<td>???</td> 

</tr> 

</table></tbody><p>An <b>STAT</b> Statics</p> 

<table class="wikitable" width="100%"> 

<tbody><tr> 

<th width="4%">C</th> 

<th width="4%">Subrecord</th> 

<th width="10%"><a href="https://en.uesp.net/wiki/Oblivion_Mod:File_Format_Conventions" title="Oblivion Mod:File Format Conventions">Type</a></th> 

<th>Info</th> 

</tr> 

<tr> 

<td>+</td> 

<td>EDID</td> 

<td>ZString</td> 

<td>Editor ID, used only by consturction kit, not loaded at runtime</td> 

</tr> 

<tr> 

<td>?</td> 

<td>OBND</td> 

<td>byte[] 12</td> 

<td>???</td> 

</tr> 

<tr> 
