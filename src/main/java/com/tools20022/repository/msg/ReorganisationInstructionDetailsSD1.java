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
import com.tools20022.repository.codeset.ReorganisationTransactionType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmPlaceAndName
 * ReorganisationInstructionDetailsSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmTransactionType
 * ReorganisationInstructionDetailsSD1.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmTransactionIdentification
 * ReorganisationInstructionDetailsSD1.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmTransactionSequenceNumber
 * ReorganisationInstructionDetailsSD1.mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmCustomerSequenceNumber
 * ReorganisationInstructionDetailsSD1.mmCustomerSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmProtectIdentification
 * ReorganisationInstructionDetailsSD1.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmProtectSafekeepingAccount
 * ReorganisationInstructionDetailsSD1.mmProtectSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmProtectDate
 * ReorganisationInstructionDetailsSD1.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmSecuritiesQuantityDetails
 * ReorganisationInstructionDetailsSD1.mmSecuritiesQuantityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmWarrantSubscriptionChargeAmount
 * ReorganisationInstructionDetailsSD1.mmWarrantSubscriptionChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmNonExemptInstructionsAllowedIndicator
 * ReorganisationInstructionDetailsSD1.mmNonExemptInstructionsAllowedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmSolicitationFeeIndicator
 * ReorganisationInstructionDetailsSD1.mmSolicitationFeeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmTenderOddLotIndicator
 * ReorganisationInstructionDetailsSD1.mmTenderOddLotIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmCertificate
 * ReorganisationInstructionDetailsSD1.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmCustomerReferenceIdentification
 * ReorganisationInstructionDetailsSD1.mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmUserReferenceNumber
 * ReorganisationInstructionDetailsSD1.mmUserReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmContactPerson
 * ReorganisationInstructionDetailsSD1.mmContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmAcknowledgementDetails
 * ReorganisationInstructionDetailsSD1.mmAcknowledgementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1#mmDeceasedBeneficialOwnerDetails
 * ReorganisationInstructionDetailsSD1.mmDeceasedBeneficialOwnerDetails}</li>
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
 * "ReorganisationInstructionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action reorganisation instruction details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReorganisationInstructionDetailsSD1", propOrder = {"placeAndName", "transactionType", "transactionIdentification", "transactionSequenceNumber", "customerSequenceNumber", "protectIdentification",
		"protectSafekeepingAccount", "protectDate", "securitiesQuantityDetails", "warrantSubscriptionChargeAmount", "nonExemptInstructionsAllowedIndicator", "solicitationFeeIndicator", "tenderOddLotIndicator", "certificate",
		"customerReferenceIdentification", "userReferenceNumber", "contactPerson", "acknowledgementDetails", "deceasedBeneficialOwnerDetails"})
public class ReorganisationInstructionDetailsSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Identifies the reorganisation transaction type.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReorganisationTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAttribute mmCustomerSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CstmrSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumber";
			definition = "Unique identifier for each customer in a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	@XmlElement(name = "PrtctId")
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect itself or of that is being covered. It is required for the function types cover protect (COVR), cover protect directly to agent (COVA) and cover on behalf of another participant (COVP).";
			maxOccurs = 1;
			minOccurs = 0;
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	@XmlElement(name = "PrtctDt")
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAttribute mmProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date on which the protect was created. It is required for transaction types cover protect transaction (COVR), cover protect directly to agent transaction (COVA) and \r\ncover protect on behalf of another participant transaction (COVP).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SctiesQtyDtls")
	protected SecuritiesQuantityDetailsSD3 securitiesQuantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3
	 * SecuritiesQuantityDetailsSD3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityDetails";
			definition = "Provides information about securities quantity linked to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAttribute mmWarrantSubscriptionChargeAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "WarrtSbcptChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantSubscriptionChargeAmount";
			definition = "Warrant subscription amount entered by client when instructing on a warrant exercise instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "NonXmptInstrsAllwdInd")
	protected YesNoIndicator nonExemptInstructionsAllowedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonXmptInstrsAllwdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExemptInstructionsAllowedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether DTC participant is willing to accept penalties as a result of processing instructions prior to maturity of CD redemptions events.\r\nYes: participant accepts penalties.\r\nNo: participant does not accept penalties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonExemptInstructionsAllowedIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "NonXmptInstrsAllwdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExemptInstructionsAllowedIndicator";
			definition = "Indicates whether DTC participant is willing to accept penalties as a result of processing instructions prior to maturity of CD redemptions events.\r\nYes: participant accepts penalties.\r\nNo: participant does not accept penalties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SlctnFeeInd")
	protected YesNoIndicator solicitationFeeIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFeeInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is a solicitation fee on the event. This fee is paid soliciting dealer.\r\nYes: there is a solicitation fee.\r\nNo: there is not a solicitation fee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationFeeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeIndicator";
			definition = "Indicates whether there is a solicitation fee on the event. This fee is paid soliciting dealer.\r\nYes: there is a solicitation fee.\r\nNo: there is not a solicitation fee.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAttribute mmTenderOddLotIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "TndrOddLotInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderOddLotIndicator";
			definition = "Indicates whether the tender offer accepts odd lots. \r\nYes: tender offer accepts odd lots.\r\nNo: tender offer does not accept odd lots.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAssociationEnd mmCertificate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate information for a given instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionCertificateSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAssociationEnd mmAcknowledgementDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "AckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementDetails";
			definition = "Acknowledgement information relative to corporate action reorganisation instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionAcknowledgementSD1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1
	 * ReorganisationInstructionDetailsSD1}</li>
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
	public static final MMMessageAssociationEnd mmDeceasedBeneficialOwnerDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "DcsdBnfclOwnrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeceasedBeneficialOwnerDetails";
			definition = "Beneficial owner information related to CD early redemption instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeceasedStatusSD1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmPlaceAndName, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmTransactionType,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmTransactionIdentification, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmTransactionSequenceNumber,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmCustomerSequenceNumber, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmProtectIdentification,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmProtectSafekeepingAccount, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmProtectDate,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmSecuritiesQuantityDetails, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmWarrantSubscriptionChargeAmount,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmNonExemptInstructionsAllowedIndicator, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmSolicitationFeeIndicator,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmTenderOddLotIndicator, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmCertificate,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmCustomerReferenceIdentification, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmUserReferenceNumber,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmContactPerson, com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmAcknowledgementDetails,
						com.tools20022.repository.msg.ReorganisationInstructionDetailsSD1.mmDeceasedBeneficialOwnerDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationInstructionDetailsSD1";
				definition = "Provides additional information regarding corporate action reorganisation instruction details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public ReorganisationInstructionDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<ReorganisationTransactionType1Code> getTransactionType() {
		return transactionType == null ? Optional.empty() : Optional.of(transactionType);
	}

	public ReorganisationInstructionDetailsSD1 setTransactionType(ReorganisationTransactionType1Code transactionType) {
		this.transactionType = transactionType;
		return this;
	}

	public Optional<Max15Text> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public ReorganisationInstructionDetailsSD1 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public ReorganisationInstructionDetailsSD1 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public Optional<Max9NumericText> getCustomerSequenceNumber() {
		return customerSequenceNumber == null ? Optional.empty() : Optional.of(customerSequenceNumber);
	}

	public ReorganisationInstructionDetailsSD1 setCustomerSequenceNumber(Max9NumericText customerSequenceNumber) {
		this.customerSequenceNumber = customerSequenceNumber;
		return this;
	}

	public Optional<Max15Text> getProtectIdentification() {
		return protectIdentification == null ? Optional.empty() : Optional.of(protectIdentification);
	}

	public ReorganisationInstructionDetailsSD1 setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = protectIdentification;
		return this;
	}

	public Optional<RestrictedFINMax35Text> getProtectSafekeepingAccount() {
		return protectSafekeepingAccount == null ? Optional.empty() : Optional.of(protectSafekeepingAccount);
	}

	public ReorganisationInstructionDetailsSD1 setProtectSafekeepingAccount(RestrictedFINMax35Text protectSafekeepingAccount) {
		this.protectSafekeepingAccount = protectSafekeepingAccount;
		return this;
	}

	public Optional<ISODate> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public ReorganisationInstructionDetailsSD1 setProtectDate(ISODate protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<SecuritiesQuantityDetailsSD3> getSecuritiesQuantityDetails() {
		return securitiesQuantityDetails == null ? Optional.empty() : Optional.of(securitiesQuantityDetails);
	}

	public ReorganisationInstructionDetailsSD1 setSecuritiesQuantityDetails(com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3 securitiesQuantityDetails) {
		this.securitiesQuantityDetails = securitiesQuantityDetails;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getWarrantSubscriptionChargeAmount() {
		return warrantSubscriptionChargeAmount == null ? Optional.empty() : Optional.of(warrantSubscriptionChargeAmount);
	}

	public ReorganisationInstructionDetailsSD1 setWarrantSubscriptionChargeAmount(RestrictedFINActiveCurrencyAndAmount warrantSubscriptionChargeAmount) {
		this.warrantSubscriptionChargeAmount = warrantSubscriptionChargeAmount;
		return this;
	}

	public Optional<YesNoIndicator> getNonExemptInstructionsAllowedIndicator() {
		return nonExemptInstructionsAllowedIndicator == null ? Optional.empty() : Optional.of(nonExemptInstructionsAllowedIndicator);
	}

	public ReorganisationInstructionDetailsSD1 setNonExemptInstructionsAllowedIndicator(YesNoIndicator nonExemptInstructionsAllowedIndicator) {
		this.nonExemptInstructionsAllowedIndicator = nonExemptInstructionsAllowedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getSolicitationFeeIndicator() {
		return solicitationFeeIndicator == null ? Optional.empty() : Optional.of(solicitationFeeIndicator);
	}

	public ReorganisationInstructionDetailsSD1 setSolicitationFeeIndicator(YesNoIndicator solicitationFeeIndicator) {
		this.solicitationFeeIndicator = solicitationFeeIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getTenderOddLotIndicator() {
		return tenderOddLotIndicator == null ? Optional.empty() : Optional.of(tenderOddLotIndicator);
	}

	public ReorganisationInstructionDetailsSD1 setTenderOddLotIndicator(YesNoIndicator tenderOddLotIndicator) {
		this.tenderOddLotIndicator = tenderOddLotIndicator;
		return this;
	}

	public Optional<CorporateActionCertificateSD1> getCertificate() {
		return certificate == null ? Optional.empty() : Optional.of(certificate);
	}

	public ReorganisationInstructionDetailsSD1 setCertificate(com.tools20022.repository.msg.CorporateActionCertificateSD1 certificate) {
		this.certificate = certificate;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public ReorganisationInstructionDetailsSD1 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<Max6Text> getUserReferenceNumber() {
		return userReferenceNumber == null ? Optional.empty() : Optional.of(userReferenceNumber);
	}

	public ReorganisationInstructionDetailsSD1 setUserReferenceNumber(Max6Text userReferenceNumber) {
		this.userReferenceNumber = userReferenceNumber;
		return this;
	}

	public Optional<ContactIdentification5> getContactPerson() {
		return contactPerson == null ? Optional.empty() : Optional.of(contactPerson);
	}

	public ReorganisationInstructionDetailsSD1 setContactPerson(com.tools20022.repository.msg.ContactIdentification5 contactPerson) {
		this.contactPerson = contactPerson;
		return this;
	}

	public Optional<CorporateActionAcknowledgementSD1> getAcknowledgementDetails() {
		return acknowledgementDetails == null ? Optional.empty() : Optional.of(acknowledgementDetails);
	}

	public ReorganisationInstructionDetailsSD1 setAcknowledgementDetails(com.tools20022.repository.msg.CorporateActionAcknowledgementSD1 acknowledgementDetails) {
		this.acknowledgementDetails = acknowledgementDetails;
		return this;
	}

	public Optional<DeceasedStatusSD1> getDeceasedBeneficialOwnerDetails() {
		return deceasedBeneficialOwnerDetails == null ? Optional.empty() : Optional.of(deceasedBeneficialOwnerDetails);
	}

	public ReorganisationInstructionDetailsSD1 setDeceasedBeneficialOwnerDetails(com.tools20022.repository.msg.DeceasedStatusSD1 deceasedBeneficialOwnerDetails) {
		this.deceasedBeneficialOwnerDetails = deceasedBeneficialOwnerDetails;
		return this;
	}
}