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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the level of the safekeeping holding account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#SafekeepingAccount
 * HoldingAccountLevelCode.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level1
 * HoldingAccountLevelCode.Level1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level2
 * HoldingAccountLevelCode.Level2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level3
 * HoldingAccountLevelCode.Level3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level4
 * HoldingAccountLevelCode.Level4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level5
 * HoldingAccountLevelCode.Level5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level6
 * HoldingAccountLevelCode.Level6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level7
 * HoldingAccountLevelCode.Level7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level8
 * HoldingAccountLevelCode.Level8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode#Level9
 * HoldingAccountLevelCode.Level9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.HoldingAccountLevel1Code
 * HoldingAccountLevel1Code}</li>
 * </ul>
 * </li>
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
 * "HoldingAccountLevelCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the level of the safekeeping holding account."</li>
 * </ul>
 */
public class HoldingAccountLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Holding account is defined as the safekeeping account (Level 0).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Holding account is defined as the safekeeping account (Level 0)."</li>
	 * </ul>
	 */
	public static final MMCode SafekeepingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Holding account is defined as the safekeeping account (Level 0).";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Holding account is defined as the sub-level 1 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 1 account."</li>
	 * </ul>
	 */
	public static final MMCode Level1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level1";
			definition = "Holding account is defined as the sub-level 1 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL1";
		}
	};
	/**
	 * Holding account is defined as the sub-level 2 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 2 account."</li>
	 * </ul>
	 */
	public static final MMCode Level2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level2";
			definition = "Holding account is defined as the sub-level 2 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL2";
		}
	};
	/**
	 * Holding account is defined as the sub-level 3 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 3 account."</li>
	 * </ul>
	 */
	public static final MMCode Level3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level3";
			definition = "Holding account is defined as the sub-level 3 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL3";
		}
	};
	/**
	 * Holding account is defined as the sub-level 4 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 4 account."</li>
	 * </ul>
	 */
	public static final MMCode Level4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level4";
			definition = "Holding account is defined as the sub-level 4 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL4";
		}
	};
	/**
	 * Holding account is defined as the sub-level 5 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 5 account."</li>
	 * </ul>
	 */
	public static final MMCode Level5 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level5";
			definition = "Holding account is defined as the sub-level 5 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL5";
		}
	};
	/**
	 * Holding account is defined as the sub-level 6 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 6 account."</li>
	 * </ul>
	 */
	public static final MMCode Level6 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level6";
			definition = "Holding account is defined as the sub-level 6 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL6";
		}
	};
	/**
	 * Holding account is defined as the sub-level 7 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 7 account."</li>
	 * </ul>
	 */
	public static final MMCode Level7 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level7";
			definition = "Holding account is defined as the sub-level 7 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL7";
		}
	};
	/**
	 * Holding account is defined as the sub-level 8 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 8 account."</li>
	 * </ul>
	 */
	public static final MMCode Level8 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level8";
			definition = "Holding account is defined as the sub-level 8 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL8";
		}
	};
	/**
	 * Holding account is defined as the sub-level 9 account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingAccountLevelCode
	 * HoldingAccountLevelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Level9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holding account is defined as the sub-level 9 account."</li>
	 * </ul>
	 */
	public static final MMCode Level9 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Level9";
			definition = "Holding account is defined as the sub-level 9 account.";
			owner_lazy = () -> HoldingAccountLevelCode.mmObject();
			codeName = "LVL9";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HoldingAccountLevelCode";
				definition = "Specifies the level of the safekeeping holding account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingAccountLevelCode.SafekeepingAccount, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level1,
						com.tools20022.repository.codeset.HoldingAccountLevelCode.Level2, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level3, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level4,
						com.tools20022.repository.codeset.HoldingAccountLevelCode.Level5, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level6, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level7,
						com.tools20022.repository.codeset.HoldingAccountLevelCode.Level8, com.tools20022.repository.codeset.HoldingAccountLevelCode.Level9);
				derivation_lazy = () -> Arrays.asList(HoldingAccountLevel1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}