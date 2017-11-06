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
 * TSE/JASDEC extension codes for mergers
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#mmSurvivingCompany
 * InstitutionalClassificationCode.mmSurvivingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#mmDiscontinuedCompany
 * InstitutionalClassificationCode.mmDiscontinuedCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#mmSubsidiary
 * InstitutionalClassificationCode.mmSubsidiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#mmUnknown
 * InstitutionalClassificationCode.mmUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode#mmParent
 * InstitutionalClassificationCode.mmParent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstitutionalClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "TSE/JASDEC extension codes for mergers"</li>
 * </ul>
 */
public class InstitutionalClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * In the case of a merger, the Issuer or the Counterparty is the surviving
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SURV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is the surviving company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSurvivingCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivingCompany";
			definition = "In the case of a merger, the Issuer or the Counterparty is the surviving company.";
			owner_lazy = () -> InstitutionalClassificationCode.mmObject();
			codeName = "SURV";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is the
	 * discontinued company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscontinuedCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is the discontinued company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDiscontinuedCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscontinuedCompany";
			definition = "In the case of a merger, the Issuer or the Counterparty is the discontinued company.";
			owner_lazy = () -> InstitutionalClassificationCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is a subsidiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subsidiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is a subsidiary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSubsidiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subsidiary";
			definition = "In the case of a merger, the Issuer or the Counterparty is a subsidiary.";
			owner_lazy = () -> InstitutionalClassificationCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * In the case of a merger, the classification of the Issuer or the
	 * Counterparty is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the classification of the Issuer or the Counterparty is unknown."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "In the case of a merger, the classification of the Issuer or the Counterparty is unknown.";
			owner_lazy = () -> InstitutionalClassificationCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * In the case of a merger, the Issuer or the Counterparty is a parent
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstitutionalClassificationCode
	 * InstitutionalClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In the case of a merger, the Issuer or the Counterparty is a parent company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmParent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parent";
			definition = "In the case of a merger, the Issuer or the Counterparty is a parent company.";
			owner_lazy = () -> InstitutionalClassificationCode.mmObject();
			codeName = "PRNT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstitutionalClassificationCode";
				definition = "TSE/JASDEC extension codes for mergers";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstitutionalClassificationCode.mmSurvivingCompany, com.tools20022.repository.codeset.InstitutionalClassificationCode.mmDiscontinuedCompany,
						com.tools20022.repository.codeset.InstitutionalClassificationCode.mmSubsidiary, com.tools20022.repository.codeset.InstitutionalClassificationCode.mmUnknown,
						com.tools20022.repository.codeset.InstitutionalClassificationCode.mmParent);
			}
		});
		return mmObject_lazy.get();
	}
}