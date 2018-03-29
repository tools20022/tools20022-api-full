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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat48Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code;
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code;
import com.tools20022.repository.codeset.DTCCPayoutType5Code;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmPlaceAndName
 * CorporateActionMovementCashMovementDetailsSD5.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmCreditDebitIndicator
 * CorporateActionMovementCashMovementDetailsSD5.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmPayoutType
 * CorporateActionMovementCashMovementDetailsSD5.mmPayoutType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmTransactionAmount
 * CorporateActionMovementCashMovementDetailsSD5.mmTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmReasonCode
 * CorporateActionMovementCashMovementDetailsSD5.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmSubReasonCode
 * CorporateActionMovementCashMovementDetailsSD5.mmSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmContraParticipantNumber
 * CorporateActionMovementCashMovementDetailsSD5.mmContraParticipantNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmEarliestPaymentDate
 * CorporateActionMovementCashMovementDetailsSD5.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmRDPReferenceNumber
 * CorporateActionMovementCashMovementDetailsSD5.mmRDPReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmTaxAdjustmentRate
 * CorporateActionMovementCashMovementDetailsSD5.mmTaxAdjustmentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5#mmTransactionQuantity
 * CorporateActionMovementCashMovementDetailsSD5.mmTransactionQuantity}</li>
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
 * "CorporateActionMovementCashMovementDetailsSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4
 * CorporateActionMovementCashMovementDetailsSD4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementCashMovementDetailsSD5", propOrder = {"placeAndName", "creditDebitIndicator", "payoutType", "transactionAmount", "reasonCode", "subReasonCode", "contraParticipantNumber", "earliestPaymentDate",
		"rDPReferenceNumber", "taxAdjustmentRate", "transactionQuantity"})
public class CorporateActionMovementCashMovementDetailsSD5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmPlaceAndName
	 * CorporateActionMovementCashMovementDetailsSD4.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmCreditDebitIndicator
	 * CorporateActionMovementCashMovementDetailsSD4.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, CreditDebitCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Credit / Debit Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the value is a debit or a credit.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType5Code payoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType5Code
	 * DTCCPayoutType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmPayoutType
	 * CorporateActionMovementCashMovementDetailsSD4.mmPayoutType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, DTCCPayoutType5Code> mmPayoutType = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, DTCCPayoutType5Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example: principal, long term capital gain).";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmPayoutType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType5Code.mmObject();
		}

		@Override
		public DTCCPayoutType5Code getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getPayoutType();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, DTCCPayoutType5Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmTransactionAmount
	 * CorporateActionMovementCashMovementDetailsSD4.mmTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<RestrictedFINActiveCurrencyAndAmount>> mmTransactionAmount = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "TxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Cash Amount"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmount";
			definition = "Resulting cash amount concerned in this transaction.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getTransactionAmount();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RsnCd")
	protected DTCAdjustmentPaymentType4Code reasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType4Code
	 * DTCAdjustmentPaymentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmReasonCode
	 * CorporateActionMovementCashMovementDetailsSD4.mmReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DTCAdjustmentPaymentType4Code>> mmReasonCode = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DTCAdjustmentPaymentType4Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Transaction Reason Code"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Transaction reason.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentType4Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentType4Code> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getReasonCode();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<DTCAdjustmentPaymentType4Code> value) {
			obj.setReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SubRsnCd")
	protected DTCAdjustmentPaymentSubReason2Code subReasonCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmSubReasonCode
	 * CorporateActionMovementCashMovementDetailsSD4.mmSubReasonCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DTCAdjustmentPaymentSubReason2Code>> mmSubReasonCode = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DTCAdjustmentPaymentSubReason2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "SubRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubReasonCode";
			definition = "Transaction sub reason.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmSubReasonCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAdjustmentPaymentSubReason2Code.mmObject();
		}

		@Override
		public Optional<DTCAdjustmentPaymentSubReason2Code> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getSubReasonCode();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<DTCAdjustmentPaymentSubReason2Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmContraParticipantNumber
	 * CorporateActionMovementCashMovementDetailsSD4.mmContraParticipantNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Max8Text>> mmContraParticipantNumber = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "ContraPtcptNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Contra Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraParticipantNumber";
			definition = "Transaction contra participant identification when shares are distributed / delivered to / from another participant.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmContraParticipantNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getContraParticipantNumber();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<Max8Text> value) {
			obj.setContraParticipantNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlstPmtDt")
	protected DateFormat48Choice earliestPaymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat48Choice
	 * DateFormat48Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmEarliestPaymentDate
	 * CorporateActionMovementCashMovementDetailsSD4.mmEarliestPaymentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DateFormat48Choice>> mmEarliestPaymentDate = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<DateFormat48Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "EarlstPmtDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payable Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date/Time on which the posting / draft of cash is scheduled to take place for a transaction.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmEarliestPaymentDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat48Choice.mmObject();
		}

		@Override
		public Optional<DateFormat48Choice> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getEarliestPaymentDate();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<DateFormat48Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (event details, options, movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related activity types 74, and 54. If event details and cash option are sourced from the activity type 74, then activity type 74 will be in RDP reference number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP reference number based on DTCC event group (reorganization, distribution, or redemption)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmRDPReferenceNumber
	 * CorporateActionMovementCashMovementDetailsSD4.mmRDPReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Exact32AlphaNumericText>> mmRDPReferenceNumber = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<Exact32AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (event details, options, movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related activity types 74, and 54. If event details and cash option are sourced from the activity type 74, then activity type 74 will be in RDP reference number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP reference number based on DTCC event group (reorganization, distribution, or redemption).";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact32AlphaNumericText> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getRDPReferenceNumber();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<Exact32AlphaNumericText> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD4#mmTaxAdjustmentRate
	 * CorporateActionMovementCashMovementDetailsSD4.mmTaxAdjustmentRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<PercentageRate>> mmTaxAdjustmentRate = new MMMessageAttribute<CorporateActionMovementCashMovementDetailsSD5, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "TaxAdjstmntRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAdjustmentRate";
			definition = "Set of the DTC legacy sub reason codes representing tax rate. Used with reason codes ‘TJXD’ ‘TJXF’ ‘TJXI’ ‘TJXL’ ‘TJXR’ ‘TJXT’ ‘TJXU’ to identify the correct tax rate.";
			previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmTaxAdjustmentRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getTaxAdjustmentRate();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<PercentageRate> value) {
			obj.setTaxAdjustmentRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TxQty")
	protected FinancialInstrumentQuantity15Choice transactionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5
	 * CorporateActionMovementCashMovementDetailsSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity used on adjustment transactions which when summed across all extension movements equals the relevant balance in the core message. For example, a summation of loan and borrow movements when summed which is negative will show the net total in the borrow balance in the core message. While a summation of loan and borrow movements which is positive will show in the loan balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionMovementCashMovementDetailsSD5, Optional<FinancialInstrumentQuantity15Choice>> mmTransactionQuantity = new MMMessageAssociationEnd<CorporateActionMovementCashMovementDetailsSD5, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmObject();
			isDerived = false;
			xmlTag = "TxQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantity";
			definition = "Quantity used on adjustment transactions which when summed across all extension movements equals the relevant balance in the core message. For example, a summation of loan and borrow movements when summed which is negative will show the net total in the borrow balance in the core message. While a summation of loan and borrow movements which is positive will show in the loan balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionMovementCashMovementDetailsSD5 obj) {
			return obj.getTransactionQuantity();
		}

		@Override
		public void setValue(CorporateActionMovementCashMovementDetailsSD5 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setTransactionQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmCreditDebitIndicator, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmPayoutType,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmTransactionAmount, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmReasonCode,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmSubReasonCode, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmContraParticipantNumber,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmEarliestPaymentDate, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmRDPReferenceNumber,
						com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmTaxAdjustmentRate, com.tools20022.repository.msg.CorporateActionMovementCashMovementDetailsSD5.mmTransactionQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout Number"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementCashMovementDetailsSD5";
				definition = "Provides additional information regarding corporate action movement details.";
				previousVersion_lazy = () -> CorporateActionMovementCashMovementDetailsSD4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionMovementCashMovementDetailsSD5 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public DTCCPayoutType5Code getPayoutType() {
		return payoutType;
	}

	public CorporateActionMovementCashMovementDetailsSD5 setPayoutType(DTCCPayoutType5Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getTransactionAmount() {
		return transactionAmount == null ? Optional.empty() : Optional.of(transactionAmount);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setTransactionAmount(RestrictedFINActiveCurrencyAndAmount transactionAmount) {
		this.transactionAmount = transactionAmount;
		return this;
	}

	public Optional<DTCAdjustmentPaymentType4Code> getReasonCode() {
		return reasonCode == null ? Optional.empty() : Optional.of(reasonCode);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setReasonCode(DTCAdjustmentPaymentType4Code reasonCode) {
		this.reasonCode = reasonCode;
		return this;
	}

	public Optional<DTCAdjustmentPaymentSubReason2Code> getSubReasonCode() {
		return subReasonCode == null ? Optional.empty() : Optional.of(subReasonCode);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setSubReasonCode(DTCAdjustmentPaymentSubReason2Code subReasonCode) {
		this.subReasonCode = subReasonCode;
		return this;
	}

	public Optional<Max8Text> getContraParticipantNumber() {
		return contraParticipantNumber == null ? Optional.empty() : Optional.of(contraParticipantNumber);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setContraParticipantNumber(Max8Text contraParticipantNumber) {
		this.contraParticipantNumber = contraParticipantNumber;
		return this;
	}

	public Optional<DateFormat48Choice> getEarliestPaymentDate() {
		return earliestPaymentDate == null ? Optional.empty() : Optional.of(earliestPaymentDate);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setEarliestPaymentDate(DateFormat48Choice earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}

	public Optional<PercentageRate> getTaxAdjustmentRate() {
		return taxAdjustmentRate == null ? Optional.empty() : Optional.of(taxAdjustmentRate);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setTaxAdjustmentRate(PercentageRate taxAdjustmentRate) {
		this.taxAdjustmentRate = taxAdjustmentRate;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionQuantity() {
		return transactionQuantity == null ? Optional.empty() : Optional.of(transactionQuantity);
	}

	public CorporateActionMovementCashMovementDetailsSD5 setTransactionQuantity(FinancialInstrumentQuantity15Choice transactionQuantity) {
		this.transactionQuantity = transactionQuantity;
		return this;
	}
}