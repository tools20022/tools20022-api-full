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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Preferred method used to reach the individual contact within an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethod1Code
 * PreferredContactMethod1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#mmLetter
 * PreferredContactMethodCode.mmLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#mmEmail
 * PreferredContactMethodCode.mmEmail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#mmPhone
 * PreferredContactMethodCode.mmPhone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#mmFax
 * PreferredContactMethodCode.mmFax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode#mmMobileOrCellPhone
 * PreferredContactMethodCode.mmMobileOrCellPhone}</li>
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
 * <li>"LETT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreferredContactMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preferred method used to reach the individual contact within an organisation."
 * </li>
 * </ul>
 */
public class PreferredContactMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Preferred method used to reach the contact is per letter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Letter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per letter."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLetter = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Letter";
			definition = "Preferred method used to reach the contact is per letter.";
			owner_lazy = () -> PreferredContactMethodCode.mmObject();
			codeName = "LETT";
		}
	};
	/**
	 * Preferred method used to reach the contact is per email.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Email"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per email."</li>
	 * </ul>
	 */
	public static final MMCode mmEmail = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Email";
			definition = "Preferred method used to reach the contact is per email.";
			owner_lazy = () -> PreferredContactMethodCode.mmObject();
			codeName = "MAIL";
		}
	};
	/**
	 * Preferred method used to reach the contact is per phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per phone."</li>
	 * </ul>
	 */
	public static final MMCode mmPhone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Phone";
			definition = "Preferred method used to reach the contact is per phone.";
			owner_lazy = () -> PreferredContactMethodCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Preferred method used to reach the contact is per fax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAXX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Preferred method used to reach the contact is per fax."</li>
	 * </ul>
	 */
	public static final MMCode mmFax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			definition = "Preferred method used to reach the contact is per fax.";
			owner_lazy = () -> PreferredContactMethodCode.mmObject();
			codeName = "FAXX";
		}
	};
	/**
	 * Preferred method used to reach the contact is per mobile or cell phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreferredContactMethodCode
	 * PreferredContactMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileOrCellPhone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Preferred method used to reach the contact is per mobile or cell phone."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMobileOrCellPhone = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileOrCellPhone";
			definition = "Preferred method used to reach the contact is per mobile or cell phone.";
			owner_lazy = () -> PreferredContactMethodCode.mmObject();
			codeName = "CELL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LETT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreferredContactMethodCode";
				definition = "Preferred method used to reach the individual contact within an organisation.";
				code_lazy = () -> Arrays.asList(PreferredContactMethodCode.mmLetter, PreferredContactMethodCode.mmEmail, PreferredContactMethodCode.mmPhone, PreferredContactMethodCode.mmFax, PreferredContactMethodCode.mmMobileOrCellPhone);
				derivation_lazy = () -> Arrays.asList(PreferredContactMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}