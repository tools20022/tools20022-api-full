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
import com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#SettlementDate
 * TransferRejectedStatusReason1Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#SettlementPlace
 * TransferRejectedStatusReason1Code.SettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#FinancialInstrumentIdentification
 * TransferRejectedStatusReason1Code.FinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#NotEnoughFinancialInstrument
 * TransferRejectedStatusReason1Code.NotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#SettlementParties
 * TransferRejectedStatusReason1Code.SettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#CertificateNumber
 * TransferRejectedStatusReason1Code.CertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#InvestmentAccount
 * TransferRejectedStatusReason1Code.InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#AcquisitionDate
 * TransferRejectedStatusReason1Code.AcquisitionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#AccountBlockedForCorporateAction
 * TransferRejectedStatusReason1Code.AccountBlockedForCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#AccountBlockedMissingDocuments
 * TransferRejectedStatusReason1Code.AccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#FinancialInstrumentIdentificationAndName
 * TransferRejectedStatusReason1Code.FinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#PhysicalDeliveryImpossible
 * TransferRejectedStatusReason1Code.PhysicalDeliveryImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#LegallyImpossible
 * TransferRejectedStatusReason1Code.LegallyImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#NotCompliantWithSLA
 * TransferRejectedStatusReason1Code.NotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#Other
 * TransferRejectedStatusReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code#FinancialInstrumentQuantity
 * TransferRejectedStatusReason1Code.FinancialInstrumentQuantity}</li>
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
 * "TransferRejectedStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transfer or settlement instruction rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransferRejectedStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code SettlementDate = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code SettlementPlace = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementPlace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code FinancialInstrumentIdentification = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code NotEnoughFinancialInstrument = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughFinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.NotEnoughFinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParties"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code SettlementParties = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParties";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.SettlementParties.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code CertificateNumber = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.CertificateNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code InvestmentAccount = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.InvestmentAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquisitionDate"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code AcquisitionDate = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquisitionDate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.AcquisitionDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForCorporateAction"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code AccountBlockedForCorporateAction = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedForCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code AccountBlockedMissingDocuments = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedMissingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.AccountBlockedMissingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code FinancialInstrumentIdentificationAndName = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentIdentificationAndName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryImpossible"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code PhysicalDeliveryImpossible = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.PhysicalDeliveryImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyImpossible"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code LegallyImpossible = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.LegallyImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code NotCompliantWithSLA = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.NotCompliantWithSLA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code Other = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransferRejectedStatusReason1Code
	 * TransferRejectedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final TransferRejectedStatusReason1Code FinancialInstrumentQuantity = new TransferRejectedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.mmObject();
			codeName = RejectedStatusReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransferRejectedStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected TransferRejectedStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DDAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferRejectedStatusReason1Code";
				definition = "Specifies the reason for a transfer or settlement instruction rejected status.";
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.SettlementDate, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.SettlementPlace,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.FinancialInstrumentIdentification, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.NotEnoughFinancialInstrument,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.SettlementParties, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.CertificateNumber,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.InvestmentAccount, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.AcquisitionDate,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.AccountBlockedForCorporateAction, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.AccountBlockedMissingDocuments,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.FinancialInstrumentIdentificationAndName, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.PhysicalDeliveryImpossible,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.LegallyImpossible, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.NotCompliantWithSLA,
						com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.Other, com.tools20022.repository.codeset.TransferRejectedStatusReason1Code.FinancialInstrumentQuantity);
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
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
	}

	public static TransferRejectedStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransferRejectedStatusReason1Code[] values() {
		TransferRejectedStatusReason1Code[] values = new TransferRejectedStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransferRejectedStatusReason1Code> {
		@Override
		public TransferRejectedStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransferRejectedStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}