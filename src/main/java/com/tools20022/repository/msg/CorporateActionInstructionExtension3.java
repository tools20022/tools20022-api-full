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
import com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code;
import com.tools20022.repository.codeset.DTCInstructionStatus1Code;
import com.tools20022.repository.codeset.DTCServiceType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConditionAcceptance1;
import com.tools20022.repository.msg.CUSIPIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmPlaceAndName
 * CorporateActionInstructionExtension3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmStatus
 * CorporateActionInstructionExtension3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmInstructionType
 * CorporateActionInstructionExtension3.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmServiceTypeIndicator
 * CorporateActionInstructionExtension3.mmServiceTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmProtectIdentification
 * CorporateActionInstructionExtension3.mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmProtectDate
 * CorporateActionInstructionExtension3.mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmAccountTransactionProcessorRelativeBlockNumber
 * CorporateActionInstructionExtension3.
 * mmAccountTransactionProcessorRelativeBlockNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmConditionalQuantity
 * CorporateActionInstructionExtension3.mmConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmTenderBidPrice
 * CorporateActionInstructionExtension3.mmTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmOddLotFlag
 * CorporateActionInstructionExtension3.mmOddLotFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmAcknowledgementFlag
 * CorporateActionInstructionExtension3.mmAcknowledgementFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmConditionsAcceptance
 * CorporateActionInstructionExtension3.mmConditionsAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmDTCDisbursedSecurity
 * CorporateActionInstructionExtension3.mmDTCDisbursedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmDTCDisbursedSecurityDescription
 * CorporateActionInstructionExtension3.mmDTCDisbursedSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3#mmPayingAgent
 * CorporateActionInstructionExtension3.mmPayingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionExtension3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instruction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionExtension3", propOrder = {"placeAndName", "status", "instructionType", "serviceTypeIndicator", "protectIdentification", "protectDate", "accountTransactionProcessorRelativeBlockNumber",
		"conditionalQuantity", "tenderBidPrice", "oddLotFlag", "acknowledgementFlag", "conditionsAcceptance", "dTCDisbursedSecurity", "dTCDisbursedSecurityDescription", "payingAgent"})
public class CorporateActionInstructionExtension3 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionInstructionExtension3, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "Sts")
	protected DTCInstructionStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus1Code
	 * DTCInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction status at DTC (The Depository Trust Corporation)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Status</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCInstructionStatus1Code>> mmStatus = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCInstructionStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Status"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Instruction status at DTC (The Depository Trust Corporation).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCInstructionStatus1Code.mmObject();
		}

		@Override
		public Optional<DTCInstructionStatus1Code> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<DTCInstructionStatus1Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrTp")
	protected DTCCorporateActionInstructionType1Code instructionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Instruction Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCCorporateActionInstructionType1Code>> mmInstructionType = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCCorporateActionInstructionType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "InstrTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Instruction Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCorporateActionInstructionType1Code.mmObject();
		}

		@Override
		public Optional<DTCCorporateActionInstructionType1Code> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getInstructionType();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<DTCCorporateActionInstructionType1Code> value) {
			obj.setInstructionType(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcTpInd")
	protected DTCServiceType1Code serviceTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCServiceType1Code
	 * DTCServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTpInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of specific DTC service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Service Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCServiceType1Code>> mmServiceTypeIndicator = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<DTCServiceType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "SvcTpInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Service Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceTypeIndicator";
			definition = "Type of specific DTC service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCServiceType1Code.mmObject();
		}

		@Override
		public Optional<DTCServiceType1Code> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getServiceTypeIndicator();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<DTCServiceType1Code> value) {
			obj.setServiceTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctId")
	protected Max16Text protectIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Identification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Max16Text>> mmProtectIdentification = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Identification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Identifies the protect that was submitted. Required when instruction type is Cover Protect. This identification is either from DTC system which was assigned upon the submission of the protect instruction or is an identification that pertains to a cover protect submitted directly to the agent (indicated by instruction type).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getProtectIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<Max16Text> value) {
			obj.setProtectIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the protect was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<ISODate>> mmProtectDate = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date at which the protect was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<ISODate> value) {
			obj.setProtectDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTxPrcrRltvBlckNb")
	protected Number accountTransactionProcessorRelativeBlockNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTxPrcrRltvBlckNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTransactionProcessorRelativeBlockNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account Transaction Processor Relative Block Number. DTCC (The Depository Trust and Clearing Corporation). reference identification to the share movement on an instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: ATP RBN Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Number>> mmAccountTransactionProcessorRelativeBlockNumber = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "AcctTxPrcrRltvBlckNb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "ATP RBN Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTransactionProcessorRelativeBlockNumber";
			definition = "Account Transaction Processor Relative Block Number. DTCC (The Depository Trust and Clearing Corporation). reference identification to the share movement on an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getAccountTransactionProcessorRelativeBlockNumber();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<Number> value) {
			obj.setAccountTransactionProcessorRelativeBlockNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CondlQty")
	protected RestrictedFINDecimalNumber conditionalQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINDecimalNumber
	 * RestrictedFINDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election).\nIn case of proration, if this minimum quantity is not reached then the instruction is void."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Conditional Quantity</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINDecimalNumber>> mmConditionalQuantity = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINDecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "CondlQty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditional Quantity"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election).\nIn case of proration, if this minimum quantity is not reached then the instruction is void.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINDecimalNumber.mmObject();
		}

		@Override
		public Optional<RestrictedFINDecimalNumber> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getConditionalQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<RestrictedFINDecimalNumber> value) {
			obj.setConditionalQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "TndrBidPric")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount tenderBidPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TndrBidPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Required only if tender offer accepts bid prices; price must fall between the maximum and minimum price acceptable to the offer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Tender Bid Price</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmTenderBidPrice = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "TndrBidPric";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Tender Bid Price"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderBidPrice";
			definition = "Required only if tender offer accepts bid prices; price must fall between the maximum and minimum price acceptable to the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getTenderBidPrice();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setTenderBidPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "OddLotFlg")
	protected YesNoIndicator oddLotFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OddLotFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the odd lot is accepted for tender offers."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Odd Lot Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<YesNoIndicator>> mmOddLotFlag = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "OddLotFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Odd Lot Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotFlag";
			definition = "Indicates whether the odd lot is accepted for tender offers.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getOddLotFlag();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<YesNoIndicator> value) {
			obj.setOddLotFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "AckFlg")
	protected YesNoIndicator acknowledgementFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckFlg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that submitter has agreed to all terms and conditions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Acknowledgement Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<YesNoIndicator>> mmAcknowledgementFlag = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "AckFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Acknowledgement Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementFlag";
			definition = "Indicates that submitter has agreed to all terms and conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getAcknowledgementFlag();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<YesNoIndicator> value) {
			obj.setAcknowledgementFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "CondsAccptnc")
	protected List<ConditionAcceptance1> conditionsAcceptance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ConditionAcceptance1
	 * ConditionAcceptance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CondsAccptnc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionsAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides an acceptance flag for the identified conditions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Conditions Acceptance</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructionExtension3, List<ConditionAcceptance1>> mmConditionsAcceptance = new MMMessageAssociationEnd<CorporateActionInstructionExtension3, List<ConditionAcceptance1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "CondsAccptnc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Conditions Acceptance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionsAcceptance";
			definition = "Provides an acceptance flag for the identified conditions.";
			maxOccurs = 9;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConditionAcceptance1.mmObject();
		}

		@Override
		public List<ConditionAcceptance1> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getConditionsAcceptance();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, List<ConditionAcceptance1> value) {
			obj.setConditionsAcceptance(value);
		}
	};
	@XmlElement(name = "DTCDsbrsdScty")
	protected CUSIPIdentification1 dTCDisbursedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification that DTC (The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<CUSIPIdentification1>> mmDTCDisbursedSecurity = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<CUSIPIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurity";
			definition = "Security identification that DTC (The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CUSIPIdentification1.mmObject();
		}

		@Override
		public Optional<CUSIPIdentification1> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getDTCDisbursedSecurity();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<CUSIPIdentification1> value) {
			obj.setDTCDisbursedSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCDsbrsdSctyDesc")
	protected RestrictedFINMax31Text dTCDisbursedSecurityDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINMax31Text
	 * RestrictedFINMax31Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCDsbrsdSctyDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCDisbursedSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the security that will be disbursed by DTC (The Depository Trust Corporation) as entitlement for the corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Description (DTC Disbursed
	 * Security)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINMax31Text>> mmDTCDisbursedSecurityDescription = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<RestrictedFINMax31Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "DTCDsbrsdSctyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Description (DTC Disbursed Security)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCDisbursedSecurityDescription";
			definition = "Description of the security that will be disbursed by DTC (The Depository Trust Corporation) as entitlement for the corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINMax31Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINMax31Text> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getDTCDisbursedSecurityDescription();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<RestrictedFINMax31Text> value) {
			obj.setDTCDisbursedSecurityDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "PngAgt")
	protected Max8Text payingAgent;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructionExtension3
	 * CorporateActionInstructionExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Paying agent for this corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Paying Agent</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Max8Text>> mmPayingAgent = new MMMessageAttribute<CorporateActionInstructionExtension3, Optional<Max8Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmObject();
			isDerived = false;
			xmlTag = "PngAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Paying Agent"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Paying agent for this corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max8Text.mmObject();
		}

		@Override
		public Optional<Max8Text> getValue(CorporateActionInstructionExtension3 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionInstructionExtension3 obj, Optional<Max8Text> value) {
			obj.setPayingAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmStatus,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmInstructionType, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmServiceTypeIndicator,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmProtectIdentification, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmAccountTransactionProcessorRelativeBlockNumber, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmTenderBidPrice, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmOddLotFlag,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmAcknowledgementFlag, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmConditionsAcceptance,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmDTCDisbursedSecurity, com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmDTCDisbursedSecurityDescription,
						com.tools20022.repository.msg.CorporateActionInstructionExtension3.mmPayingAgent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructionExtension3";
				definition = "Provides additional information regarding corporate action instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionInstructionExtension3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<DTCInstructionStatus1Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CorporateActionInstructionExtension3 setStatus(DTCInstructionStatus1Code status) {
		this.status = status;
		return this;
	}

	public Optional<DTCCorporateActionInstructionType1Code> getInstructionType() {
		return instructionType == null ? Optional.empty() : Optional.of(instructionType);
	}

	public CorporateActionInstructionExtension3 setInstructionType(DTCCorporateActionInstructionType1Code instructionType) {
		this.instructionType = instructionType;
		return this;
	}

	public Optional<DTCServiceType1Code> getServiceTypeIndicator() {
		return serviceTypeIndicator == null ? Optional.empty() : Optional.of(serviceTypeIndicator);
	}

	public CorporateActionInstructionExtension3 setServiceTypeIndicator(DTCServiceType1Code serviceTypeIndicator) {
		this.serviceTypeIndicator = serviceTypeIndicator;
		return this;
	}

	public Optional<Max16Text> getProtectIdentification() {
		return protectIdentification == null ? Optional.empty() : Optional.of(protectIdentification);
	}

	public CorporateActionInstructionExtension3 setProtectIdentification(Max16Text protectIdentification) {
		this.protectIdentification = protectIdentification;
		return this;
	}

	public Optional<ISODate> getProtectDate() {
		return protectDate == null ? Optional.empty() : Optional.of(protectDate);
	}

	public CorporateActionInstructionExtension3 setProtectDate(ISODate protectDate) {
		this.protectDate = protectDate;
		return this;
	}

	public Optional<Number> getAccountTransactionProcessorRelativeBlockNumber() {
		return accountTransactionProcessorRelativeBlockNumber == null ? Optional.empty() : Optional.of(accountTransactionProcessorRelativeBlockNumber);
	}

	public CorporateActionInstructionExtension3 setAccountTransactionProcessorRelativeBlockNumber(Number accountTransactionProcessorRelativeBlockNumber) {
		this.accountTransactionProcessorRelativeBlockNumber = accountTransactionProcessorRelativeBlockNumber;
		return this;
	}

	public Optional<RestrictedFINDecimalNumber> getConditionalQuantity() {
		return conditionalQuantity == null ? Optional.empty() : Optional.of(conditionalQuantity);
	}

	public CorporateActionInstructionExtension3 setConditionalQuantity(RestrictedFINDecimalNumber conditionalQuantity) {
		this.conditionalQuantity = conditionalQuantity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getTenderBidPrice() {
		return tenderBidPrice == null ? Optional.empty() : Optional.of(tenderBidPrice);
	}

	public CorporateActionInstructionExtension3 setTenderBidPrice(RestrictedFINActiveCurrencyAnd13DecimalAmount tenderBidPrice) {
		this.tenderBidPrice = tenderBidPrice;
		return this;
	}

	public Optional<YesNoIndicator> getOddLotFlag() {
		return oddLotFlag == null ? Optional.empty() : Optional.of(oddLotFlag);
	}

	public CorporateActionInstructionExtension3 setOddLotFlag(YesNoIndicator oddLotFlag) {
		this.oddLotFlag = oddLotFlag;
		return this;
	}

	public Optional<YesNoIndicator> getAcknowledgementFlag() {
		return acknowledgementFlag == null ? Optional.empty() : Optional.of(acknowledgementFlag);
	}

	public CorporateActionInstructionExtension3 setAcknowledgementFlag(YesNoIndicator acknowledgementFlag) {
		this.acknowledgementFlag = acknowledgementFlag;
		return this;
	}

	public List<ConditionAcceptance1> getConditionsAcceptance() {
		return conditionsAcceptance == null ? conditionsAcceptance = new ArrayList<>() : conditionsAcceptance;
	}

	public CorporateActionInstructionExtension3 setConditionsAcceptance(List<ConditionAcceptance1> conditionsAcceptance) {
		this.conditionsAcceptance = Objects.requireNonNull(conditionsAcceptance);
		return this;
	}

	public Optional<CUSIPIdentification1> getDTCDisbursedSecurity() {
		return dTCDisbursedSecurity == null ? Optional.empty() : Optional.of(dTCDisbursedSecurity);
	}

	public CorporateActionInstructionExtension3 setDTCDisbursedSecurity(CUSIPIdentification1 dTCDisbursedSecurity) {
		this.dTCDisbursedSecurity = dTCDisbursedSecurity;
		return this;
	}

	public Optional<RestrictedFINMax31Text> getDTCDisbursedSecurityDescription() {
		return dTCDisbursedSecurityDescription == null ? Optional.empty() : Optional.of(dTCDisbursedSecurityDescription);
	}

	public CorporateActionInstructionExtension3 setDTCDisbursedSecurityDescription(RestrictedFINMax31Text dTCDisbursedSecurityDescription) {
		this.dTCDisbursedSecurityDescription = dTCDisbursedSecurityDescription;
		return this;
	}

	public Optional<Max8Text> getPayingAgent() {
		return payingAgent == null ? Optional.empty() : Optional.of(payingAgent);
	}

	public CorporateActionInstructionExtension3 setPayingAgent(Max8Text payingAgent) {
		this.payingAgent = payingAgent;
		return this;
	}
}