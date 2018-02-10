/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.HoldingAccountLevel1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the level at which the safekeeping holding account has been
 * defined.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#SafekeepingAccount
 * HoldingAccountLevel1Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level1
 * HoldingAccountLevel1Code.Level1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level2
 * HoldingAccountLevel1Code.Level2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level3
 * HoldingAccountLevel1Code.Level3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level4
 * HoldingAccountLevel1Code.Level4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level5
 * HoldingAccountLevel1Code.Level5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level6
 * HoldingAccountLevel1Code.Level6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level7
 * HoldingAccountLevel1Code.Level7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level8
 * HoldingAccountLevel1Code.Level8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code#Level9
 * HoldingAccountLevel1Code.Level9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
 * HoldingAccountLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldingAccountLevel1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the level at which the safekeeping holding account has been defined."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingAccountLevel1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code SafekeepingAccount = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level1"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level1 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level1";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level2"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level2 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level2";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level3"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level3 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level3";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level4"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level4 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level4";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level4.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level5"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level5 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level5";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level5.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level6"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level6 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level6";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level6.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level7"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level7 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level7";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level7.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level8"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level8 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level8";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level8.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
	 * HoldingAccountLevel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level9"</li>
	 * </ul>
	 */
	public static final HoldingAccountLevel1Code Level9 = new HoldingAccountLevel1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level9";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingAccountLevel1Code.mmObject();
			codeName = HoldingAccountLevelCode.Level9.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, HoldingAccountLevel1Code> codesByName = new LinkedHashMap<>();

	protected HoldingAccountLevel1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingAccountLevel1Code";
				definition = "Specifies the level at which the safekeeping holding account has been defined.";
				trace_lazy = () -> HoldingAccountLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingAccountLevel1Code.SafekeepingAccount, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level1,
						com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level2, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level3, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level4,
						com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level5, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level6, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level7,
						com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level8, com.tools20022.repository.codeset.HoldingAccountLevel1Code.Level9);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(Level1.getCodeName().get(), Level1);
		codesByName.put(Level2.getCodeName().get(), Level2);
		codesByName.put(Level3.getCodeName().get(), Level3);
		codesByName.put(Level4.getCodeName().get(), Level4);
		codesByName.put(Level5.getCodeName().get(), Level5);
		codesByName.put(Level6.getCodeName().get(), Level6);
		codesByName.put(Level7.getCodeName().get(), Level7);
		codesByName.put(Level8.getCodeName().get(), Level8);
		codesByName.put(Level9.getCodeName().get(), Level9);
	}

	public static HoldingAccountLevel1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingAccountLevel1Code[] values() {
		HoldingAccountLevel1Code[] values = new HoldingAccountLevel1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingAccountLevel1Code> {
		@Override
		public HoldingAccountLevel1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingAccountLevel1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}