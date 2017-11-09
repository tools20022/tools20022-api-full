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
 * Specifies the reason for a pending account opening status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReason1Code
 * PendingOpeningStatusReason1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmKnowYourCustomerDocumentMissing
 * PendingOpeningStatusReasonCode.mmKnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmFATCAReportingDateMissing
 * PendingOpeningStatusReasonCode.mmFATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmRightsHolderMissing
 * PendingOpeningStatusReasonCode.mmRightsHolderMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmAuthorisation
 * PendingOpeningStatusReasonCode.mmAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmAuthorisedButPending
 * PendingOpeningStatusReasonCode.mmAuthorisedButPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmNotOpened
 * PendingOpeningStatusReasonCode.mmNotOpened}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode#mmRestrictions
 * PendingOpeningStatusReasonCode.mmRestrictions}</li>
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
 * "PendingOpeningStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending account opening status."</li>
 * </ul>
 */
public class PendingOpeningStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Know Your Customer (KYC) document is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDocumentMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Know Your Customer (KYC) document is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmKnowYourCustomerDocumentMissing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDocumentMissing";
			definition = "Know Your Customer (KYC) document is missing.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "KYCM";
		}
	};
	/**
	 * FATCA reporting date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDateMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "FATCA reporting date is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmFATCAReportingDateMissing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDateMissing";
			definition = "FATCA reporting date is missing.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "FRDM";
		}
	};
	/**
	 * Rights holder information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIGH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolderMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights holder information is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmRightsHolderMissing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolderMissing";
			definition = "Rights holder information is missing.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "RIGH";
		}
	};
	/**
	 * Authorisation is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation is required."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Authorisation is required.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "ATHR";
		}
	};
	/**
	 * Authorisation is provided but account opening is still pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedButPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Authorisation is provided but account opening is still pending."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisedButPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			definition = "Authorisation is provided but account opening is still pending.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "ATHP";
		}
	};
	/**
	 * Account is not yet open, even for partial use.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOpened"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is not yet open, even for partial use."</li>
	 * </ul>
	 */
	public static final MMCode mmNotOpened = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotOpened";
			definition = "Account is not yet open, even for partial use.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "NOTO";
		}
	};
	/**
	 * Account will be opened when restrictions are addressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingOpeningStatusReasonCode
	 * PendingOpeningStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restrictions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account will be opened when restrictions are addressed."</li>
	 * </ul>
	 */
	public static final MMCode mmRestrictions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restrictions";
			definition = "Account will be opened when restrictions are addressed.";
			owner_lazy = () -> PendingOpeningStatusReasonCode.mmObject();
			codeName = "REST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingOpeningStatusReasonCode";
				definition = "Specifies the reason for a pending account opening status.";
				code_lazy = () -> Arrays.asList(PendingOpeningStatusReasonCode.mmKnowYourCustomerDocumentMissing, PendingOpeningStatusReasonCode.mmFATCAReportingDateMissing, PendingOpeningStatusReasonCode.mmRightsHolderMissing,
						PendingOpeningStatusReasonCode.mmAuthorisation, PendingOpeningStatusReasonCode.mmAuthorisedButPending, PendingOpeningStatusReasonCode.mmNotOpened, PendingOpeningStatusReasonCode.mmRestrictions);
				derivation_lazy = () -> Arrays.asList(PendingOpeningStatusReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}