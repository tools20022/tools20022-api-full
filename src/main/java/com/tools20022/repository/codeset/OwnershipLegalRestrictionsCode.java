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
 * Specifies the regulatory restrictions applicable to a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode#USLegal144A
 * OwnershipLegalRestrictionsCode.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode#NoRestrictions
 * OwnershipLegalRestrictionsCode.NoRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode#Restrictions
 * OwnershipLegalRestrictionsCode.Restrictions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictions1Code
 * OwnershipLegalRestrictions1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"A144"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OwnershipLegalRestrictionsCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a financial instrument."
 * </li>
 * </ul>
 */
public class OwnershipLegalRestrictionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ownership or transfer of an unregistered security issued, pursuant to US
	 * legal restrictions 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode
	 * OwnershipLegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A144"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode USLegal144A = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			definition = "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.";
			owner_lazy = () -> OwnershipLegalRestrictionsCode.mmObject();
			codeName = "A144";
		}
	};
	/**
	 * Ownership or transfer of a security that is not subject to restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode
	 * OwnershipLegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is not subject to restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NoRestrictions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRestrictions";
			definition = "Ownership or transfer of a security that is not subject to restrictions.";
			owner_lazy = () -> OwnershipLegalRestrictionsCode.mmObject();
			codeName = "NRST";
		}
	};
	/**
	 * Ownership or transfer of a security that is subject to restrictions, and
	 * not pursuant to 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode
	 * OwnershipLegalRestrictionsCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Restrictions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			definition = "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.";
			owner_lazy = () -> OwnershipLegalRestrictionsCode.mmObject();
			codeName = "RSTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("A144");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OwnershipLegalRestrictionsCode";
				definition = "Specifies the regulatory restrictions applicable to a financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode.USLegal144A, com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode.NoRestrictions,
						com.tools20022.repository.codeset.OwnershipLegalRestrictionsCode.Restrictions);
				derivation_lazy = () -> Arrays.asList(OwnershipLegalRestrictions1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}