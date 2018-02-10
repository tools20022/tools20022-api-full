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
import com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transfer or settlement instruction rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#SettlementDate
 * TransferRejectedStatusReason2Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#SettlementPlace
 * TransferRejectedStatusReason2Code.SettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#FinancialInstrumentIdentification
 * TransferRejectedStatusReason2Code.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#NotEnoughFinancialInstrument
 * TransferRejectedStatusReason2Code.NotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#SettlementParties
 * TransferRejectedStatusReason2Code.SettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#CertificateNumber
 * TransferRejectedStatusReason2Code.CertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvestmentAccount
 * TransferRejectedStatusReason2Code.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#AcquisitionDate
 * TransferRejectedStatusReason2Code.AcquisitionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#AccountBlockedForCorporateAction
 * TransferRejectedStatusReason2Code.AccountBlockedForCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#AccountBlockedMissingDocuments
 * TransferRejectedStatusReason2Code.AccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#FinancialInstrumentIdentificationAndName
 * TransferRejectedStatusReason2Code.FinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#PhysicalDeliveryImpossible
 * TransferRejectedStatusReason2Code.PhysicalDeliveryImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#LegallyImpossible
 * TransferRejectedStatusReason2Code.LegallyImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#NotCompliantWithSLA
 * TransferRejectedStatusReason2Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#FinancialInstrumentQuantity
 * TransferRejectedStatusReason2Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvestorNameAddressUnknown
 * TransferRejectedStatusReason2Code.InvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InsufficientInvestorData
 * TransferRejectedStatusReason2Code.InsufficientInvestorData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvalidAccountServicer
 * TransferRejectedStatusReason2Code.InvalidAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvalidNomineeAccount
 * TransferRejectedStatusReason2Code.InvalidNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvalidNewPlanManager
 * TransferRejectedStatusReason2Code.InvalidNewPlanManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#CurrentYearPartial
 * TransferRejectedStatusReason2Code.CurrentYearPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#PartialNotSupported
 * TransferRejectedStatusReason2Code.PartialNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#FinancialInstrumentTaxYear
 * TransferRejectedStatusReason2Code.FinancialInstrumentTaxYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvalidISAType
 * TransferRejectedStatusReason2Code.InvalidISAType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#InvalidCashAccount
 * TransferRejectedStatusReason2Code.InvalidCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code#DuplicateTransferReference
 * TransferRejectedStatusReason2Code.DuplicateTransferReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
 * RejectedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DDAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferRejectedStatusReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transfer or settlement instruction rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferRejectedStatusReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code SettlementDate = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code SettlementPlace = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementPlace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code FinancialInstrumentIdentification = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code NotEnoughFinancialInstrument = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughFinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParties"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code SettlementParties = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParties";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementParties.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code CertificateNumber = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.CertificateNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvestmentAccount = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvestmentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquisitionDate"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code AcquisitionDate = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquisitionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.AcquisitionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForCorporateAction"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code AccountBlockedForCorporateAction = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedForCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code AccountBlockedMissingDocuments = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedMissingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedMissingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code FinancialInstrumentIdentificationAndName = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryImpossible"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code PhysicalDeliveryImpossible = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.PhysicalDeliveryImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyImpossible"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code LegallyImpossible = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.LegallyImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code NotCompliantWithSLA = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code FinancialInstrumentQuantity = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvestorNameAddressUnknown = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvestorNameAddressUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientInvestorData"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InsufficientInvestorData = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientInvestorData";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InsufficientInvestorData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAccountServicer"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvalidAccountServicer = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAccountServicer";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidAccountServicer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidNomineeAccount"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvalidNomineeAccount = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNomineeAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidNomineeAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidNewPlanManager"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvalidNewPlanManager = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidNewPlanManager";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidNewPlanManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearPartial"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code CurrentYearPartial = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearPartial";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.CurrentYearPartial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialNotSupported"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code PartialNotSupported = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialNotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.PartialNotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentTaxYear"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code FinancialInstrumentTaxYear = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentTaxYear";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentTaxYear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidISAType"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvalidISAType = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidISAType";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidISAType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCashAccount"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code InvalidCashAccount = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.InvalidCashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason2Code
	 * TransferRejectedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateTransferReference"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason2Code DuplicateTransferReference = new TransferRejectedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransferReference";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.mmObject();
			codeName = RejectedStatusReasonCode.DuplicateTransferReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransferRejectedStatusReason2Code> codesByName = new LinkedHashMap<>();

	protected TransferRejectedStatusReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DDAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferRejectedStatusReason2Code";
				definition = "Specifies the reason for a transfer or settlement instruction rejected status.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.SettlementDate, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.SettlementPlace,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.FinancialInstrumentIdentification, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.NotEnoughFinancialInstrument,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.SettlementParties, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.CertificateNumber,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvestmentAccount, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.AcquisitionDate,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.AccountBlockedForCorporateAction, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.AccountBlockedMissingDocuments,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.FinancialInstrumentIdentificationAndName, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.PhysicalDeliveryImpossible,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.LegallyImpossible, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.NotCompliantWithSLA,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.FinancialInstrumentQuantity, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvestorNameAddressUnknown,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InsufficientInvestorData, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvalidAccountServicer,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvalidNomineeAccount, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvalidNewPlanManager,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.CurrentYearPartial, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.PartialNotSupported,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.FinancialInstrumentTaxYear, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvalidISAType,
						com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.InvalidCashAccount, com.tools20022.repository.codeset.TransferRejectedStatusReason2Code.DuplicateTransferReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(SettlementPlace.getCodeName().get(), SettlementPlace);
		codesByName.put(FinancialInstrumentIdentification.getCodeName().get(), FinancialInstrumentIdentification);
		codesByName.put(NotEnoughFinancialInstrument.getCodeName().get(), NotEnoughFinancialInstrument);
		codesByName.put(SettlementParties.getCodeName().get(), SettlementParties);
		codesByName.put(CertificateNumber.getCodeName().get(), CertificateNumber);
		codesByName.put(InvestmentAccount.getCodeName().get(), InvestmentAccount);
		codesByName.put(AcquisitionDate.getCodeName().get(), AcquisitionDate);
		codesByName.put(AccountBlockedForCorporateAction.getCodeName().get(), AccountBlockedForCorporateAction);
		codesByName.put(AccountBlockedMissingDocuments.getCodeName().get(), AccountBlockedMissingDocuments);
		codesByName.put(FinancialInstrumentIdentificationAndName.getCodeName().get(), FinancialInstrumentIdentificationAndName);
		codesByName.put(PhysicalDeliveryImpossible.getCodeName().get(), PhysicalDeliveryImpossible);
		codesByName.put(LegallyImpossible.getCodeName().get(), LegallyImpossible);
		codesByName.put(NotCompliantWithSLA.getCodeName().get(), NotCompliantWithSLA);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(InsufficientInvestorData.getCodeName().get(), InsufficientInvestorData);
		codesByName.put(InvalidAccountServicer.getCodeName().get(), InvalidAccountServicer);
		codesByName.put(InvalidNomineeAccount.getCodeName().get(), InvalidNomineeAccount);
		codesByName.put(InvalidNewPlanManager.getCodeName().get(), InvalidNewPlanManager);
		codesByName.put(CurrentYearPartial.getCodeName().get(), CurrentYearPartial);
		codesByName.put(PartialNotSupported.getCodeName().get(), PartialNotSupported);
		codesByName.put(FinancialInstrumentTaxYear.getCodeName().get(), FinancialInstrumentTaxYear);
		codesByName.put(InvalidISAType.getCodeName().get(), InvalidISAType);
		codesByName.put(InvalidCashAccount.getCodeName().get(), InvalidCashAccount);
		codesByName.put(DuplicateTransferReference.getCodeName().get(), DuplicateTransferReference);
	}

	public static TransferRejectedStatusReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferRejectedStatusReason2Code[] values() {
		TransferRejectedStatusReason2Code[] values = new TransferRejectedStatusReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferRejectedStatusReason2Code> {
		@Override
		public TransferRejectedStatusReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferRejectedStatusReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}