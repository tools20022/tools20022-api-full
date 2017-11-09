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
 * Specifies the reason for a pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatusReason1Code
 * PendingStatusReason1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmKnowYourCustomerDocumentMissing
 * PendingStatusReasonCode.mmKnowYourCustomerDocumentMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmFATCAReportingDateMissing
 * PendingStatusReasonCode.mmFATCAReportingDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmRightsHolderMissing
 * PendingStatusReasonCode.mmRightsHolderMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmModificationInProcess
 * PendingStatusReasonCode.mmModificationInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmAuthorisation
 * PendingStatusReasonCode.mmAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode#mmAuthorisedButPending
 * PendingStatusReasonCode.mmAuthorisedButPending}</li>
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
 * "PendingStatusReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a pending status."</li>
 * </ul>
 */
public class PendingStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Know Your Customer (KYC) document is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
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
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "KYCM";
		}
	};
	/**
	 * FATCA reporting date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
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
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "FRDM";
		}
	};
	/**
	 * Rights holder information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
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
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "RIGH";
		}
	};
	/**
	 * Modification to the account data is in process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification to the account data is in process."</li>
	 * </ul>
	 */
	public static final MMCode mmModificationInProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationInProcess";
			definition = "Modification to the account data is in process.";
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "MODI";
		}
	};
	/**
	 * Authorisation is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
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
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "ATHR";
		}
	};
	/**
	 * Authorisation is provided but the account change is still pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatusReasonCode
	 * PendingStatusReasonCode}</li>
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
	 * "Authorisation is provided but the account change is still pending."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisedButPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedButPending";
			definition = "Authorisation is provided but the account change is still pending.";
			owner_lazy = () -> PendingStatusReasonCode.mmObject();
			codeName = "ATHP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatusReasonCode";
				definition = "Specifies the reason for a pending status.";
				code_lazy = () -> Arrays.asList(PendingStatusReasonCode.mmKnowYourCustomerDocumentMissing, PendingStatusReasonCode.mmFATCAReportingDateMissing, PendingStatusReasonCode.mmRightsHolderMissing,
						PendingStatusReasonCode.mmModificationInProcess, PendingStatusReasonCode.mmAuthorisation, PendingStatusReasonCode.mmAuthorisedButPending);
				derivation_lazy = () -> Arrays.asList(PendingStatusReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}