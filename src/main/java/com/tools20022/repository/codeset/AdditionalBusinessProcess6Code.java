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
import com.tools20022.repository.codeset.AdditionalBusinessProcessCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the additional business process linked to a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcessCode
 * AdditionalBusinessProcessCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmClaimOrCompensation
 * AdditionalBusinessProcess6Code.mmClaimOrCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmNotificationOfReversal
 * AdditionalBusinessProcess6Code.mmNotificationOfReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmTaxRefund
 * AdditionalBusinessProcess6Code.mmTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmPartialMandatoryPutRedemption
 * AdditionalBusinessProcess6Code.mmPartialMandatoryPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmPartialPreFunding
 * AdditionalBusinessProcess6Code.mmPartialPreFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmFullPrefunding
 * AdditionalBusinessProcess6Code.mmFullPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code#mmRequiredAction
 * AdditionalBusinessProcess6Code.mmRequiredAction}</li>
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
 * <li>"CLAI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBusinessProcess6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the additional business process linked to a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code
 * AdditionalBusinessProcess2Code}</li>
 * </ul>
 */
public class AdditionalBusinessProcess6Code extends AdditionalBusinessProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimOrCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#mmClaimOrCompensation
	 * AdditionalBusinessProcess2Code.mmClaimOrCompensation}</li>
	 * </ul>
	 */
	public static final MMCode mmClaimOrCompensation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimOrCompensation";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.mmClaimOrCompensation;
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationOfReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#mmNotificationOfReversal
	 * AdditionalBusinessProcess2Code.mmNotificationOfReversal}</li>
	 * </ul>
	 */
	public static final MMCode mmNotificationOfReversal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationOfReversal";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.mmNotificationOfReversal;
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess2Code#mmTaxRefund
	 * AdditionalBusinessProcess2Code.mmTaxRefund}</li>
	 * </ul>
	 */
	public static final MMCode mmTaxRefund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRefund";
			previousVersion_lazy = () -> AdditionalBusinessProcess2Code.mmTaxRefund;
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialMandatoryPutRedemption"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialMandatoryPutRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialMandatoryPutRedemption";
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPreFunding"</li>
	 * </ul>
	 */
	public static final MMCode mmPartialPreFunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPreFunding";
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrefunding"</li>
	 * </ul>
	 */
	public static final MMCode mmFullPrefunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrefunding";
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalBusinessProcess6Code
	 * AdditionalBusinessProcess6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredAction"</li>
	 * </ul>
	 */
	public static final MMCode mmRequiredAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredAction";
			owner_lazy = () -> AdditionalBusinessProcess6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CLAI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalBusinessProcess6Code";
				definition = "Specifies the additional business process linked to a corporate action event.";
				previousVersion_lazy = () -> AdditionalBusinessProcess2Code.mmObject();
				code_lazy = () -> Arrays.asList(AdditionalBusinessProcess6Code.mmClaimOrCompensation, AdditionalBusinessProcess6Code.mmNotificationOfReversal, AdditionalBusinessProcess6Code.mmTaxRefund,
						AdditionalBusinessProcess6Code.mmPartialMandatoryPutRedemption, AdditionalBusinessProcess6Code.mmPartialPreFunding, AdditionalBusinessProcess6Code.mmFullPrefunding, AdditionalBusinessProcess6Code.mmRequiredAction);
				trace_lazy = () -> AdditionalBusinessProcessCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}