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
import com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmPlaceAndName
 * ReorganisationInstructionDetailsSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmWithdrawalTransactionType
 * ReorganisationInstructionDetailsSD4.mmWithdrawalTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmTransactionIdentification
 * ReorganisationInstructionDetailsSD4.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmTransactionSequenceNumber
 * ReorganisationInstructionDetailsSD4.mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmTransactionIdentificationStatus
 * ReorganisationInstructionDetailsSD4.mmTransactionIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmProtectTransactionStatus
 * ReorganisationInstructionDetailsSD4.mmProtectTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmRejectionReason
 * ReorganisationInstructionDetailsSD4.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmProtectIdentification
 * ReorganisationInstructionDetailsSD4.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmProtectSafekeepingAccount
 * ReorganisationInstructionDetailsSD4.mmProtectSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmSecuritiesQuantityDetails
 * ReorganisationInstructionDetailsSD4.mmSecuritiesQuantityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmContactPerson
 * ReorganisationInstructionDetailsSD4.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmCustomerReferenceIdentification
 * ReorganisationInstructionDetailsSD4.mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmUserReferenceNumber
 * ReorganisationInstructionDetailsSD4.mmUserReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4#mmTransactionRecordNumber
 * ReorganisationInstructionDetailsSD4.mmTransactionRecordNumber}</li>
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
 * "ReorganisationInstructionDetailsSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action reorganisation instruction details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReorganisationInstructionDetailsSD4", propOrder = {"placeAndName", "withdrawalTransactionType", "transactionIdentification", "transactionSequenceNumber", "transactionIdentificationStatus", "protectTransactionStatus",
		"rejectionReason", "protectIdentification", "protectSafekeepingAccount", "securitiesQuantityDetails", "contactPerson", "customerReferenceIdentification", "userReferenceNumber", "transactionRecordNumber"})
public class ReorganisationInstructionDetailsSD4 {

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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "WdrwlTxTp")
	protected ReorganisationWithdrawalTransactionType1Code withdrawalTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code
	 * ReorganisationWithdrawalTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reorganisation withdrawal transaction type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithdrawalTransactionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "WdrwlTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransactionType";
			definition = "Identifies the reorganisation withdrawal transaction type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReorganisationWithdrawalTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the depository. Transaction identification will be either the DTC instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmTransactionSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmTransactionIdentificationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationStatus";
			definition = "Status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCInstructionStatus2Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	 * definition} = "Status of the protect instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PrtctTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTransactionStatus";
			definition = "Status of the protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCProtectInstructionStatus1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmRejectionReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Reason for which an inbound instruction message or a cancellation instruction message is rejected.";
			maxOccurs = 6;
			minOccurs = 0;
			simpleType_lazy = () -> InstructionRejectionReason1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmProtectIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect itself or of that is being covered. It is required for the function types cover protect (COVR), cover protect directly to agent (COVA) and cover on behalf of another participant (COVP).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmProtectSafekeepingAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PrtctSfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectSafekeepingAccount";
			definition = "For cover protect instructions whereby one safekeeping account is covering on behalf of another safekeeping account. The protect safekeeping account will be the account which submitted the original protect instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAssociationEnd mmSecuritiesQuantityDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityDetails";
			definition = "Provides information about securities quantity linked to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAssociationEnd mmContactPerson = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPerson";
			definition = "Party contact information for the given instruction; required for voluntary offer instruction transaction (VOIT), protect transaction (PROT) and protect on behalf of another participant transaction (PROP); not required for cover protect instructions like cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and cover protect on behalf of another participant transaction (COVP).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContactIdentification5.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmUserReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "UsrRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserReferenceNumber";
			definition = "Unique identification of the transaction used by the transmitting party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max6Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4
	 * ReorganisationInstructionDetailsSD4}</li>
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
	public static final MMMessageAttribute mmTransactionRecordNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxRcrdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRecordNumber";
			definition = "Transaction record number for ATAM or ART system which may be causing pending status. Corresponds to ATP RBN number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmPlaceAndName, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmWithdrawalTransactionType,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmTransactionIdentification, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmTransactionSequenceNumber,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmTransactionIdentificationStatus, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmProtectTransactionStatus,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmRejectionReason, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmProtectIdentification,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmProtectSafekeepingAccount, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmSecuritiesQuantityDetails,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmContactPerson, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmCustomerReferenceIdentification,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmUserReferenceNumber, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD4.mmTransactionRecordNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationInstructionDetailsSD4";
				definition = "Provides additional information regarding corporate action reorganisation instruction details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public ReorganisationInstructionDetailsSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<ReorganisationWithdrawalTransactionType1Code> getWithdrawalTransactionType() {
		return withdrawalTransactionType == null ? Optional.empty() : Optional.of(withdrawalTransactionType);
	}

	public ReorganisationInstructionDetailsSD4 setWithdrawalTransactionType(ReorganisationWithdrawalTransactionType1Code withdrawalTransactionType) {
		this.withdrawalTransactionType = withdrawalTransactionType;
		return this;
	}

	public Optional<Max15Text> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public ReorganisationInstructionDetailsSD4 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public ReorganisationInstructionDetailsSD4 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public Optional<DTCInstructionStatus2Code> getTransactionIdentificationStatus() {
		return transactionIdentificationStatus == null ? Optional.empty() : Optional.of(transactionIdentificationStatus);
	}

	public ReorganisationInstructionDetailsSD4 setTransactionIdentificationStatus(DTCInstructionStatus2Code transactionIdentificationStatus) {
		this.transactionIdentificationStatus = transactionIdentificationStatus;
		return this;
	}

	public Optional<DTCProtectInstructionStatus1Code> getProtectTransactionStatus() {
		return protectTransactionStatus == null ? Optional.empty() : Optional.of(protectTransactionStatus);
	}

	public ReorganisationInstructionDetailsSD4 setProtectTransactionStatus(DTCProtectInstructionStatus1Code protectTransactionStatus) {
		this.protectTransactionStatus = protectTransactionStatus;
		return this;
	}

	public List<InstructionRejectionReason1Code> getRejectionReason() {
		return rejectionReason == null ? rejectionReason = new ArrayList<>() : rejectionReason;
	}

	public ReorganisationInstructionDetailsSD4 setRejectionReason(List<InstructionRejectionReason1Code> rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public Max15Text getProtectIdentification() {
		return protectIdentification;
	}

	public ReorganisationInstructionDetailsSD4 setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = Objects.requireNonNull(protectIdentification);
		return this;
	}

	public Optional<RestrictedFINMax35Text> getProtectSafekeepingAccount() {
		return protectSafekeepingAccount == null ? Optional.empty() : Optional.of(protectSafekeepingAccount);
	}

	public ReorganisationInstructionDetailsSD4 setProtectSafekeepingAccount(RestrictedFINMax35Text protectSafekeepingAccount) {
		this.protectSafekeepingAccount = protectSafekeepingAccount;
		return this;
	}

	public Optional<SecuritiesQuantityDetailsSD4> getSecuritiesQuantityDetails() {
		return securitiesQuantityDetails == null ? Optional.empty() : Optional.of(securitiesQuantityDetails);
	}

	public ReorganisationInstructionDetailsSD4 setSecuritiesQuantityDetails(com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4 securitiesQuantityDetails) {
		this.securitiesQuantityDetails = securitiesQuantityDetails;
		return this;
	}

	public Optional<ContactIdentification5> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public ReorganisationInstructionDetailsSD4 setContactPerson(com.tools20022.repository.msg.ContactIdentification5 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public ReorganisationInstructionDetailsSD4 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<Max6Text> getUserReferenceNumber() {
		return userReferenceNumber == null ? Optional.empty() : Optional.of(userReferenceNumber);
	}

	public ReorganisationInstructionDetailsSD4 setUserReferenceNumber(Max6Text userReferenceNumber) {
		this.userReferenceNumber = userReferenceNumber;
		return this;
	}

	public Optional<Max10NumericText> getTransactionRecordNumber() {
		return transactionRecordNumber == null ? Optional.empty() : Optional.of(transactionRecordNumber);
	}

	public ReorganisationInstructionDetailsSD4 setTransactionRecordNumber(Max10NumericText transactionRecordNumber) {
		this.transactionRecordNumber = transactionRecordNumber;
		return this;
	}
}