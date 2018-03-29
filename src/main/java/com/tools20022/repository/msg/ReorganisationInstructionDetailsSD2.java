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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DTCInstructionStatus2Code;
import com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code;
import com.tools20022.repository.codeset.InstructionRejectionReason1Code;
import com.tools20022.repository.codeset.ReorganisationTransactionType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action reorganisation
 * instruction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmPlaceAndName
 * ReorganisationInstructionDetailsSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTransactionType
 * ReorganisationInstructionDetailsSD2.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTransactionIdentification
 * ReorganisationInstructionDetailsSD2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTransactionSequenceNumber
 * ReorganisationInstructionDetailsSD2.mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmCustomerSequenceNumber
 * ReorganisationInstructionDetailsSD2.mmCustomerSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTransactionIdentificationStatus
 * ReorganisationInstructionDetailsSD2.mmTransactionIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmProtectTransactionStatus
 * ReorganisationInstructionDetailsSD2.mmProtectTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmRejectionReason
 * ReorganisationInstructionDetailsSD2.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmProtectIdentification
 * ReorganisationInstructionDetailsSD2.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmProtectSafekeepingAccount
 * ReorganisationInstructionDetailsSD2.mmProtectSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmProtectDate
 * ReorganisationInstructionDetailsSD2.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmSecuritiesQuantityDetails
 * ReorganisationInstructionDetailsSD2.mmSecuritiesQuantityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmWarrantSubscriptionChargeAmount
 * ReorganisationInstructionDetailsSD2.mmWarrantSubscriptionChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTenderOddLotIndicator
 * ReorganisationInstructionDetailsSD2.mmTenderOddLotIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmCertificate
 * ReorganisationInstructionDetailsSD2.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmCustomerReferenceIdentification
 * ReorganisationInstructionDetailsSD2.mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmUserReferenceNumber
 * ReorganisationInstructionDetailsSD2.mmUserReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmContactPerson
 * ReorganisationInstructionDetailsSD2.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmAcknowledgementDetails
 * ReorganisationInstructionDetailsSD2.mmAcknowledgementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmDeceasedBeneficialOwnerDetails
 * ReorganisationInstructionDetailsSD2.mmDeceasedBeneficialOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2#mmTransactionRecordNumber
 * ReorganisationInstructionDetailsSD2.mmTransactionRecordNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReorganisationInstructionDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action reorganisation instruction details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReorganisationInstructionDetailsSD2", propOrder = {"placeAndName", "transactionType", "transactionIdentification", "transactionSequenceNumber", "customerSequenceNumber", "transactionIdentificationStatus",
		"protectTransactionStatus", "rejectionReason", "protectIdentification", "protectSafekeepingAccount", "protectDate", "securitiesQuantityDetails", "warrantSubscriptionChargeAmount", "tenderOddLotIndicator", "certificate",
		"customerReferenceIdentification", "userReferenceNumber", "contactPerson", "acknowledgementDetails", "deceasedBeneficialOwnerDetails", "transactionRecordNumber"})
public class ReorganisationInstructionDetailsSD2 {

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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTp")
	protected ReorganisationTransactionType1Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the reorganisation transaction type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<ReorganisationTransactionType1Code>> mmTransactionType = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<ReorganisationTransactionType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Identifies the reorganisation transaction type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReorganisationTransactionType1Code.mmObject();
		}

		@Override
		public Optional<ReorganisationTransactionType1Code> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<ReorganisationTransactionType1Code> value) {
			obj.setTransactionType(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected Max15Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number assigned by the depository. Transaction identification will be either the DTC instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max15Text>> mmTransactionIdentification = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max15Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the depository. Transaction identification will be either the DTC instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
		}

		@Override
		public Optional<Max15Text> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max15Text> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxSeqNb")
	protected Max3NumericText transactionSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max3NumericText>> mmTransactionSequenceNumber = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTransactionSequenceNumber();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max3NumericText> value) {
			obj.setTransactionSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrSeqNb")
	protected Max9NumericText customerSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier for each customer in a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max9NumericText>> mmCustomerSequenceNumber = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max9NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CstmrSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumber";
			definition = "Unique identifier for each customer in a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Optional<Max9NumericText> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getCustomerSequenceNumber();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max9NumericText> value) {
			obj.setCustomerSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TxIdSts")
	protected DTCInstructionStatus2Code transactionIdentificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<DTCInstructionStatus2Code>> mmTransactionIdentificationStatus = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<DTCInstructionStatus2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationStatus";
			definition = "Status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCInstructionStatus2Code.mmObject();
		}

		@Override
		public Optional<DTCInstructionStatus2Code> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTransactionIdentificationStatus();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<DTCInstructionStatus2Code> value) {
			obj.setTransactionIdentificationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctTxSts")
	protected DTCProtectInstructionStatus1Code protectTransactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code
	 * DTCProtectInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctTxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the Protect Instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<DTCProtectInstructionStatus1Code>> mmProtectTransactionStatus = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<DTCProtectInstructionStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTransactionStatus";
			definition = "Status of the Protect Instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCProtectInstructionStatus1Code.mmObject();
		}

		@Override
		public Optional<DTCProtectInstructionStatus1Code> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getProtectTransactionStatus();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<DTCProtectInstructionStatus1Code> value) {
			obj.setProtectTransactionStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected List<InstructionRejectionReason1Code> rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which an inbound instruction message or a cancellation instruction message is rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, List<InstructionRejectionReason1Code>> mmRejectionReason = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, List<InstructionRejectionReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason for which an inbound instruction message or a cancellation instruction message is rejected.";
			maxOccurs = 6;
			minOccurs = 0;
			simpleType_lazy = () -> InstructionRejectionReason1Code.mmObject();
		}

		@Override
		public List<InstructionRejectionReason1Code> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, List<InstructionRejectionReason1Code> value) {
			obj.setRejectionReason(value);
		}
	};
	@XmlElement(name = "PrtctId", required = true)
	protected Max15Text protectIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the protect itself or of that is being covered. It is required for the function types cover protect (COVR), cover protect directly to agent (COVA) and cover on behalf of another participant (COVP)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Max15Text> mmProtectIdentification = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Max15Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect itself or of that is being covered. It is required for the function types cover protect (COVR), cover protect directly to agent (COVA) and cover on behalf of another participant (COVP).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}

		@Override
		public Max15Text getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getProtectIdentification();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Max15Text value) {
			obj.setProtectIdentification(value);
		}
	};
	@XmlElement(name = "PrtctSfkpgAcct")
	protected RestrictedFINMax35Text protectSafekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax35Text
	 * RestrictedFINMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctSfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectSafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For cover protect instructions whereby one safekeeping account is covering on behalf of another safekeeping account. The protect safekeeping account will be the account which submitted the original protect instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<RestrictedFINMax35Text>> mmProtectSafekeepingAccount = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<RestrictedFINMax35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctSfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectSafekeepingAccount";
			definition = "For cover protect instructions whereby one safekeeping account is covering on behalf of another safekeeping account. The protect safekeeping account will be the account which submitted the original protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax35Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINMax35Text> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getProtectSafekeepingAccount();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<RestrictedFINMax35Text> value) {
			obj.setProtectSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctDt", required = true)
	protected ISODate protectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the protect was created. It is required for transaction types cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and \r\ncover protect on behalf of another participant transaction (COVP)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, ISODate> mmProtectDate = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date on which the protect was created. It is required for transaction types cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and \r\ncover protect on behalf of another participant transaction (COVP).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, ISODate value) {
			obj.setProtectDate(value);
		}
	};
	@XmlElement(name = "SctiesQtyDtls")
	protected SecuritiesQuantityDetailsSD4 securitiesQuantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<SecuritiesQuantityDetailsSD4>> mmSecuritiesQuantityDetails = new MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<SecuritiesQuantityDetailsSD4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityDetails";
			definition = "Provides information about securities quantity linked to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesQuantityDetailsSD4.mmObject();
		}

		@Override
		public Optional<SecuritiesQuantityDetailsSD4> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getSecuritiesQuantityDetails();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<SecuritiesQuantityDetailsSD4> value) {
			obj.setSecuritiesQuantityDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "WarrtSbcptChrgAmt")
	protected RestrictedFINActiveCurrencyAndAmount warrantSubscriptionChargeAmount;
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WarrtSbcptChrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantSubscriptionChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Warrant subscription amount entered by client when instructing on a warrant exercise instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<RestrictedFINActiveCurrencyAndAmount>> mmWarrantSubscriptionChargeAmount = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<RestrictedFINActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "WarrtSbcptChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantSubscriptionChargeAmount";
			definition = "Warrant subscription amount entered by client when instructing on a warrant exercise instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAndAmount> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getWarrantSubscriptionChargeAmount();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<RestrictedFINActiveCurrencyAndAmount> value) {
			obj.setWarrantSubscriptionChargeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TndrOddLotInd")
	protected YesNoIndicator tenderOddLotIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TndrOddLotInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderOddLotIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the tender offer accepts odd lots. \r\nYes: tender offer accepts odd lots.\r\nNo: tender offer does not accept odd lots."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<YesNoIndicator>> mmTenderOddLotIndicator = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TndrOddLotInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOddLotIndicator";
			definition = "Indicates whether the tender offer accepts odd lots. \r\nYes: tender offer accepts odd lots.\r\nNo: tender offer does not accept odd lots.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTenderOddLotIndicator();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<YesNoIndicator> value) {
			obj.setTenderOddLotIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cert")
	protected CorporateActionCertificateSD1 certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCertificateSD1
	 * CorporateActionCertificateSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate information for a given instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<CorporateActionCertificateSD1>> mmCertificate = new MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<CorporateActionCertificateSD1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate information for a given instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionCertificateSD1.mmObject();
		}

		@Override
		public Optional<CorporateActionCertificateSD1> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<CorporateActionCertificateSD1> value) {
			obj.setCertificate(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrRefId")
	protected Max30Text customerReferenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max30Text>> mmCustomerReferenceIdentification = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getCustomerReferenceIdentification();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max30Text> value) {
			obj.setCustomerReferenceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UsrRefNb")
	protected Max6Text userReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the transaction used by the transmitting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max6Text>> mmUserReferenceNumber = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max6Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "UsrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserReferenceNumber";
			definition = "Unique identification of the transaction used by the transmitting party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Optional<Max6Text> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getUserReferenceNumber();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max6Text> value) {
			obj.setUserReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsn")
	protected ContactIdentification5 contactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ContactIdentification5
	 * ContactIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party contact information for the given instruction; required for voluntary offer instruction transaction (VOIT), protect transaction (PROT) and protect on behalf of another participant transaction (PROP); not required for cover protect instructions like cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and cover protect on behalf of another participant transaction (COVP)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<ContactIdentification5>> mmContactPerson = new MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<ContactIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Party contact information for the given instruction; required for voluntary offer instruction transaction (VOIT), protect transaction (PROT) and protect on behalf of another participant transaction (PROP); not required for cover protect instructions like cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and cover protect on behalf of another participant transaction (COVP).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentification5.mmObject();
		}

		@Override
		public Optional<ContactIdentification5> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getContactPerson();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<ContactIdentification5> value) {
			obj.setContactPerson(value.orElse(null));
		}
	};
	@XmlElement(name = "AckDtls")
	protected CorporateActionAcknowledgementSD1 acknowledgementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAcknowledgementSD1
	 * CorporateActionAcknowledgementSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement information relative to corporate action reorganisation instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<CorporateActionAcknowledgementSD1>> mmAcknowledgementDetails = new MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<CorporateActionAcknowledgementSD1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "AckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementDetails";
			definition = "Acknowledgement information relative to corporate action reorganisation instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionAcknowledgementSD1.mmObject();
		}

		@Override
		public Optional<CorporateActionAcknowledgementSD1> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getAcknowledgementDetails();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<CorporateActionAcknowledgementSD1> value) {
			obj.setAcknowledgementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DcsdBnfclOwnrDtls")
	protected DeceasedStatusSD1 deceasedBeneficialOwnerDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeceasedStatusSD1
	 * DeceasedStatusSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcsdBnfclOwnrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeceasedBeneficialOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner information related to CD early redemption instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<DeceasedStatusSD1>> mmDeceasedBeneficialOwnerDetails = new MMMessageAssociationEnd<ReorganisationInstructionDetailsSD2, Optional<DeceasedStatusSD1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "DcsdBnfclOwnrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeceasedBeneficialOwnerDetails";
			definition = "Beneficial owner information related to CD early redemption instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeceasedStatusSD1.mmObject();
		}

		@Override
		public Optional<DeceasedStatusSD1> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getDeceasedBeneficialOwnerDetails();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<DeceasedStatusSD1> value) {
			obj.setDeceasedBeneficialOwnerDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TxRcrdNb")
	protected Max10NumericText transactionRecordNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10NumericText
	 * Max10NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2
	 * ReorganisationInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRcrdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionRecordNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction record number for ATAM or ART system which may be causing pending status. Corresponds to ATP RBN number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max10NumericText>> mmTransactionRecordNumber = new MMMessageAttribute<ReorganisationInstructionDetailsSD2, Optional<Max10NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "TxRcrdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRecordNumber";
			definition = "Transaction record number for ATAM or ART system which may be causing pending status. Corresponds to ATP RBN number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}

		@Override
		public Optional<Max10NumericText> getValue(ReorganisationInstructionDetailsSD2 obj) {
			return obj.getTransactionRecordNumber();
		}

		@Override
		public void setValue(ReorganisationInstructionDetailsSD2 obj, Optional<Max10NumericText> value) {
			obj.setTransactionRecordNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmPlaceAndName, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTransactionType,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTransactionIdentification, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTransactionSequenceNumber,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmCustomerSequenceNumber, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTransactionIdentificationStatus,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmProtectTransactionStatus, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmRejectionReason,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmProtectIdentification, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmProtectSafekeepingAccount,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmProtectDate, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmSecuritiesQuantityDetails,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmWarrantSubscriptionChargeAmount, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTenderOddLotIndicator,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmCertificate, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmCustomerReferenceIdentification,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmUserReferenceNumber, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmContactPerson,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmAcknowledgementDetails, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmDeceasedBeneficialOwnerDetails,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD2.mmTransactionRecordNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationInstructionDetailsSD2";
				definition = "Provides additional information regarding corporate action reorganisation instruction details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public ReorganisationInstructionDetailsSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<ReorganisationTransactionType1Code> getTransactionType() {
		return transactionType == null ? Optional.empty() : Optional.of(transactionType);
	}

	public ReorganisationInstructionDetailsSD2 setTransactionType(ReorganisationTransactionType1Code transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public Optional<Max15Text> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public ReorganisationInstructionDetailsSD2 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public ReorganisationInstructionDetailsSD2 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public Optional<Max9NumericText> getCustomerSequenceNumber() {
		return customerSequenceNumber == null ? Optional.empty() : Optional.of(customerSequenceNumber);
	}

	public ReorganisationInstructionDetailsSD2 setCustomerSequenceNumber(Max9NumericText customerSequenceNumber) {
		this.customerSequenceNumber = customerSequenceNumber;
		return this;
	}

	public Optional<DTCInstructionStatus2Code> getTransactionIdentificationStatus() {
		return transactionIdentificationStatus == null ? Optional.empty() : Optional.of(transactionIdentificationStatus);
	}

	public ReorganisationInstructionDetailsSD2 setTransactionIdentificationStatus(DTCInstructionStatus2Code transactionIdentificationStatus) {
		this.transactionIdentificationStatus = transactionIdentificationStatus;
		return this;
	}

	public Optional<DTCProtectInstructionStatus1Code> getProtectTransactionStatus() {
		return protectTransactionStatus == null ? Optional.empty() : Optional.of(protectTransactionStatus);
	}

	public ReorganisationInstructionDetailsSD2 setProtectTransactionStatus(DTCProtectInstructionStatus1Code protectTransactionStatus) {
		this.protectTransactionStatus = protectTransactionStatus;
		return this;
	}

	public List<InstructionRejectionReason1Code> getRejectionReason() {
		return rejectionReason == null ? rejectionReason = new ArrayList<>() : rejectionReason;
	}

	public ReorganisationInstructionDetailsSD2 setRejectionReason(List<InstructionRejectionReason1Code> rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public Max15Text getProtectIdentification() {
		return protectIdentification;
	}

	public ReorganisationInstructionDetailsSD2 setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = Objects.requireNonNull(protectIdentification);
		return this;
	}

	public Optional<RestrictedFINMax35Text> getProtectSafekeepingAccount() {
		return protectSafekeepingAccount == null ? Optional.empty() : Optional.of(protectSafekeepingAccount);
	}

	public ReorganisationInstructionDetailsSD2 setProtectSafekeepingAccount(RestrictedFINMax35Text protectSafekeepingAccount) {
		this.protectSafekeepingAccount = protectSafekeepingAccount;
		return this;
	}

	public ISODate getProtectDate() {
		return protectDate;
	}

	public ReorganisationInstructionDetailsSD2 setProtectDate(ISODate protectDate) {
		this.protectDate = Objects.requireNonNull(protectDate);
		return this;
	}

	public Optional<SecuritiesQuantityDetailsSD4> getSecuritiesQuantityDetails() {
		return securitiesQuantityDetails == null ? Optional.empty() : Optional.of(securitiesQuantityDetails);
	}

	public ReorganisationInstructionDetailsSD2 setSecuritiesQuantityDetails(SecuritiesQuantityDetailsSD4 securitiesQuantityDetails) {
		this.securitiesQuantityDetails = securitiesQuantityDetails;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getWarrantSubscriptionChargeAmount() {
		return warrantSubscriptionChargeAmount == null ? Optional.empty() : Optional.of(warrantSubscriptionChargeAmount);
	}

	public ReorganisationInstructionDetailsSD2 setWarrantSubscriptionChargeAmount(RestrictedFINActiveCurrencyAndAmount warrantSubscriptionChargeAmount) {
		this.warrantSubscriptionChargeAmount = warrantSubscriptionChargeAmount;
		return this;
	}

	public Optional<YesNoIndicator> getTenderOddLotIndicator() {
		return tenderOddLotIndicator == null ? Optional.empty() : Optional.of(tenderOddLotIndicator);
	}

	public ReorganisationInstructionDetailsSD2 setTenderOddLotIndicator(YesNoIndicator tenderOddLotIndicator) {
		this.tenderOddLotIndicator = tenderOddLotIndicator;
		return this;
	}

	public Optional<CorporateActionCertificateSD1> getCertificate() {
		return certificate == null ? Optional.empty() : Optional.of(certificate);
	}

	public ReorganisationInstructionDetailsSD2 setCertificate(CorporateActionCertificateSD1 certificate) {
		this.certificate = certificate;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public ReorganisationInstructionDetailsSD2 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<Max6Text> getUserReferenceNumber() {
		return userReferenceNumber == null ? Optional.empty() : Optional.of(userReferenceNumber);
	}

	public ReorganisationInstructionDetailsSD2 setUserReferenceNumber(Max6Text userReferenceNumber) {
		this.userReferenceNumber = userReferenceNumber;
		return this;
	}

	public Optional<ContactIdentification5> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public ReorganisationInstructionDetailsSD2 setContactPerson(ContactIdentification5 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}

	public Optional<CorporateActionAcknowledgementSD1> getAcknowledgementDetails() {
		return acknowledgementDetails == null ? Optional.empty() : Optional.of(acknowledgementDetails);
	}

	public ReorganisationInstructionDetailsSD2 setAcknowledgementDetails(CorporateActionAcknowledgementSD1 acknowledgementDetails) {
		this.acknowledgementDetails = acknowledgementDetails;
		return this;
	}

	public Optional<DeceasedStatusSD1> getDeceasedBeneficialOwnerDetails() {
		return deceasedBeneficialOwnerDetails == null ? Optional.empty() : Optional.of(deceasedBeneficialOwnerDetails);
	}

	public ReorganisationInstructionDetailsSD2 setDeceasedBeneficialOwnerDetails(DeceasedStatusSD1 deceasedBeneficialOwnerDetails) {
		this.deceasedBeneficialOwnerDetails = deceasedBeneficialOwnerDetails;
		return this;
	}

	public Optional<Max10NumericText> getTransactionRecordNumber() {
		return transactionRecordNumber == null ? Optional.empty() : Optional.of(transactionRecordNumber);
	}

	public ReorganisationInstructionDetailsSD2 setTransactionRecordNumber(Max10NumericText transactionRecordNumber) {
		this.transactionRecordNumber = transactionRecordNumber;
		return this;
	}
}