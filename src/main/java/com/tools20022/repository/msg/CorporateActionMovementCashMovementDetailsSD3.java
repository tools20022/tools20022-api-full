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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat28Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code;
import com.tools20022.repository.codeset.DTCCPayoutType3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmPlaceAndName
 * CorporateActionMovementCashMovementDetailsSD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmCreditDebitIndicator
 * CorporateActionMovementCashMovementDetailsSD3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmPayoutType
 * CorporateActionMovementCashMovementDetailsSD3.mmPayoutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmTransactionAmount
 * CorporateActionMovementCashMovementDetailsSD3.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmReasonCode
 * CorporateActionMovementCashMovementDetailsSD3.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmSubReasonCode
 * CorporateActionMovementCashMovementDetailsSD3.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmContraParticipantNumber
 * CorporateActionMovementCashMovementDetailsSD3.mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmEarliestPaymentDate
 * CorporateActionMovementCashMovementDetailsSD3.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmRDPReferenceNumber
 * CorporateActionMovementCashMovementDetailsSD3.mmRDPReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3#mmTaxAdjustmentRate
 * CorporateActionMovementCashMovementDetailsSD3.mmTaxAdjustmentRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = DTCCSynonym: Payout Number</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementCashMovementDetailsSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4
 * CorporateActionMovementCashMovementDetailsSD4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2
 * CorporateActionMovementCashMovementDetailsSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementCashMovementDetailsSD3", propOrder = {"placeAndName", "creditDebitIndicator", "payoutType", "transactionAmount", "reasonCode", "subReasonCode", "contraParticipantNumber", "earliestPaymentDate",
		"rDPReferenceNumber", "taxAdjustmentRate"})
public class CorporateActionMovementCashMovementDetailsSD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmPlaceAndName
	 * CorporateActionMovementCashMovementDetailsSD4.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmPlaceAndName
	 * CorporateActionMovementCashMovementDetailsSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmPlaceAndName);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Credit / Debit Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the value is a debit or a credit."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmCreditDebitIndicator
	 * CorporateActionMovementCashMovementDetailsSD4.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmCreditDebitIndicator
	 * CorporateActionMovementCashMovementDetailsSD2.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, CreditDebitCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Credit / Debit Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmCreditDebitIndicator);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType3Code payoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payout associated with the event (for example: principal, long term capital gain)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmPayoutType
	 * CorporateActionMovementCashMovementDetailsSD4.mmPayoutType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, DTCCPayoutType3Code> mmPayoutType = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, DTCCPayoutType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example: principal, long term capital gain).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmPayoutType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType3Code.mmObject();
		}

		@Override
		public DTCCPayoutType3Code getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getPayoutType();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, DTCCPayoutType3Code value) {
			obj.setPayoutType(value);
		}
	};
	@XmlElement(name = "TxAmt")
	protected RestrictedFINActiveCurrencyAndAmount transactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Cash Amount</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting cash amount concerned in this transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmTransactionAmount
	 * CorporateActionMovementCashMovementDetailsSD4.mmTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmTransactionAmount
	 * CorporateActionMovementCashMovementDetailsSD2.mmTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTransactionAmount = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Cash Amount"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Resulting cash amount concerned in this transaction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmTransactionAmount);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getTransactionAmount();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RsnCd")
	protected DTCAdjustmentPaymentType2Code reasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType2Code
	 * DTCAdjustmentPaymentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Transaction Reason Code</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmReasonCode
	 * CorporateActionMovementCashMovementDetailsSD4.mmReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmReasonCode
	 * CorporateActionMovementCashMovementDetailsSD2.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DTCAdjustmentPaymentType2Code>> mmReasonCode = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DTCAdjustmentPaymentType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmReasonCode);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType2Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentType2Code> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getReasonCode();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<DTCAdjustmentPaymentType2Code> value) {
			obj.setReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SubRsnCd")
	protected DTCAdjustmentPaymentSubReason1Code subReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sub reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmSubReasonCode
	 * CorporateActionMovementCashMovementDetailsSD4.mmSubReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmSubReasonCode
	 * CorporateActionMovementCashMovementDetailsSD2.mmSubReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DTCAdjustmentPaymentSubReason1Code>> mmSubReasonCode = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DTCAdjustmentPaymentSubReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmSubReasonCode);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmSubReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentSubReason1Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentSubReason1Code> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getSubReasonCode();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<DTCAdjustmentPaymentSubReason1Code> value) {
			obj.setSubReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "ContraPtcptNb")
	protected Max8Text contraParticipantNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8Text
	 * Max8Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ContraPtcptNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Contra Participant Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContraParticipantNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction contra participant identification when shares are distributed / delivered to / from another participant."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmContraParticipantNumber
	 * CorporateActionMovementCashMovementDetailsSD4.mmContraParticipantNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmContraParticipantNumber
	 * CorporateActionMovementCashMovementDetailsSD2.mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmContraParticipantNumber);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat28Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat28Choice
	 * DateFormat28Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlstPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payable Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/Time on which the posting / draft of cash is scheduled to take place for a transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmEarliestPaymentDate
	 * CorporateActionMovementCashMovementDetailsSD4.mmEarliestPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmEarliestPaymentDate
	 * CorporateActionMovementCashMovementDetailsSD2.mmEarliestPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DateFormat28Choice>> mmEarliestPaymentDate = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<DateFormat28Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/Time on which the posting / draft of cash is scheduled to take place for a transaction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmEarliestPaymentDate);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmEarliestPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat28Choice.mmObject();
		}

		@Override
		public Optional<DateFormat28Choice> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getEarliestPaymentDate();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<DateFormat28Choice> value) {
			obj.setEarliestPaymentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RDPRefNb")
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmRDPReferenceNumber
	 * CorporateActionMovementCashMovementDetailsSD4.mmRDPReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<Exact32AlphaNumericText>> mmRDPReferenceNumber = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<Exact32AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmRDPReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact32AlphaNumericText> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getRDPReferenceNumber();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<Exact32AlphaNumericText> value) {
			obj.setRDPReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAdjstmntRate")
	protected PercentageRate taxAdjustmentRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3
	 * CorporateActionMovementCashMovementDetailsSD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAdjstmntRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAdjustmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmTaxAdjustmentRate
	 * CorporateActionMovementCashMovementDetailsSD4.mmTaxAdjustmentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD2#mmTaxAdjustmentRate
	 * CorporateActionMovementCashMovementDetailsSD2.mmTaxAdjustmentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<PercentageRate>> mmTaxAdjustmentRate = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD3, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmTaxAdjustmentRate);
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmTaxAdjustmentRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionMovementCashMovementDetailsSD3 obj) {
			return obj.getTaxAdjustmentRate();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD3 obj, Optional<PercentageRate> value) {
			obj.setTaxAdjustmentRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmCreditDebitIndicator, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmPayoutType,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmTransactionAmount, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmRDPReferenceNumber,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD3.mmTaxAdjustmentRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Number"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementCashMovementDetailsSD3";
				definition = "Provides additional information regarding corporate action movement details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementCashMovementDetailsSD4.mmObject());
				previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionMovementCashMovementDetailsSD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionMovementCashMovementDetailsSD3 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public DTCCPayoutType3Code getPayoutType() {
		return payoutType;
	}

	public CorporateActionMovementCashMovementDetailsSD3 setPayoutType(DTCCPayoutType3Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setTransactionAmount(RestrictedFINActiveCurrencyAndAmount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<DTCAdjustmentPaymentType2Code> getReasonCode() {
		return reasonCode == null ? Optional.empty() : Optional.of(reasonCode);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setReasonCode(DTCAdjustmentPaymentType2Code reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public Optional<DTCAdjustmentPaymentSubReason1Code> getSubReasonCode() {
		return subReasonCode == null ? Optional.empty() : Optional.of(subReasonCode);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setSubReasonCode(DTCAdjustmentPaymentSubReason1Code subReasonCode) {
		this.subReasonCode = subReasonCode;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<DateFormat28Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setEarliestPaymentDate(DateFormat28Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}

	public Optional<PercentageRate> getTaxAdjustmentRate() {
		return taxAdjustmentRate == null ? Optional.empty() : Optional.of(taxAdjustmentRate);
	}

	public CorporateActionMovementCashMovementDetailsSD3 setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
		return this;
	}
}