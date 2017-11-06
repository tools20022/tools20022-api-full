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
 * Specifies the regulatory restrictions applicable to a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#mmUSLegal144A
 * LegalRestrictions1Code.mmUSLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#mmNoRestrictions
 * LegalRestrictions1Code.mmNoRestrictions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code#mmRestrictions
 * LegalRestrictions1Code.mmRestrictions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"USLE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LegalRestrictions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the regulatory restrictions applicable to a security."</li>
 * </ul>
 */
public class LegalRestrictions1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ownership or transfer of an unregistered security issued, pursuant to US
	 * legal restrictions 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUSLegal144A = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USLegal144A";
			definition = "Ownership or transfer of an unregistered security issued, pursuant to US legal restrictions 144A.";
			owner_lazy = () -> LegalRestrictions1Code.mmObject();
			codeName = "USLE";
		}
	};
	/**
	 * Ownership or transfer of a security that is not subject to restrictions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRestrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is not subject to restrictions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoRestrictions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoRestrictions";
			definition = "Ownership or transfer of a security that is not subject to restrictions.";
			owner_lazy = () -> LegalRestrictions1Code.mmObject();
			codeName = "NORE";
		}
	};
	/**
	 * Ownership or transfer of a security that is subject to restrictions, and
	 * not pursuant to 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LegalRestrictions1Code
	 * LegalRestrictions1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestrictions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restrictions";
			definition = "Ownership or transfer of a security that is subject to restrictions, and not pursuant to 144A.";
			owner_lazy = () -> LegalRestrictions1Code.mmObject();
			codeName = "REST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("USLE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictions1Code";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalRestrictions1Code.mmUSLegal144A, com.tools20022.repository.codeset.LegalRestrictions1Code.mmNoRestrictions,
						com.tools20022.repository.codeset.LegalRestrictions1Code.mmRestrictions);
			}
		});
		return mmObject_lazy.get();
	}
}