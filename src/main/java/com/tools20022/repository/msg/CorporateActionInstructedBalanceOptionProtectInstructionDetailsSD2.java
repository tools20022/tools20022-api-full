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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.OptionNumber1Choice;
import com.tools20022.repository.choice.PriceFormat57Choice;
import com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CorporateActionOption;
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
 * Provides additional information regarding corporate action instructed balance
 * details at option protect level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmOptionNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectSafekeepingAccount
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectSequenceNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmCoverProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmCoverProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationUncoveredQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectIdentificationUncoveredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationStatus
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectConditionalQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectTenderBidPrice
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmProtectTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmCustomerReferenceIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmInstructionComments
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
 * mmInstructionComments}</li>
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
 * "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option protect level."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2", propOrder = {"placeAndName", "optionNumber", "protectIdentification", "protectSafekeepingAccount", "protectSequenceNumber", "protectDate",
		"coverProtectDate", "protectIdentificationQuantity", "protectIdentificationUncoveredQuantity", "protectIdentificationOversubscriptionQuantity", "protectIdentificationStatus", "protectConditionalQuantity", "protectTenderBidPrice",
		"customerReferenceIdentification", "instructionComments"})
public class CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "OptnNb", required = true)
	protected OptionNumber1Choice optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.OptionNumber1Choice
	 * OptionNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option number of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionNumber = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Option number of the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
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
	 * "Instruction reference number assigned by DTC to the uncovered protect instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentification
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Instruction reference number assigned by DTC to the uncovered protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
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
	@XmlElement(name = "PrtctSeqNb")
	protected Max3NumericText protectSequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional reference number used to uniquely identify uncovered protect instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectSequenceNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectSequenceNumber";
			definition = "Additional reference number used to uniquely identify uncovered protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "PrtctDt", required = true)
	protected ISODateTime protectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
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
	 * definition} = "Date and time of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectDate
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date and time of the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "CoverPrtctDt")
	protected ISODateTime coverProtectDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverPrtctDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the cover protect. Will be the latest cover date if partial cover transaction occurs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCoverProtectDate
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmCoverProtectDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCoverProtectDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectDate";
			definition = "Date and time of the cover protect. Will be the latest cover date if partial cover transaction occurs.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCoverProtectDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "PrtctIdQty", required = true)
	protected FinancialInstrumentQuantity15Choice protectIdentificationQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the protect instruction. For protects which are partially covered, the quantity will be reduced by the amount partially covered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectIdentificationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationQuantity";
			definition = "Quantity of the protect instruction. For protects which are partially covered, the quantity will be reduced by the amount partially covered.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtctIdUcvrdQty")
	protected FinancialInstrumentQuantity15Choice protectIdentificationUncoveredQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdUcvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationUncoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the protect instruction which has not been covered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationUncoveredQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectIdentificationUncoveredQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationUncoveredQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdUcvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationUncoveredQuantity";
			definition = "Quantity of the protect instruction which has not been covered.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationUncoveredQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtctIdOvrsbcptQty")
	protected FinancialInstrumentQuantity15Choice protectIdentificationOversubscriptionQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect oversubscription quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectIdentificationOversubscriptionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationOversubscriptionQuantity";
			definition = "Protect oversubscription quantity.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationOversubscriptionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtctIdSts")
	protected DTCProtectInstructionStatus1Code protectIdentificationStatus;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationStatus
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectIdentificationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectIdentificationStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationStatus";
			definition = "Status of the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCProtectInstructionStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "PrtctCondlQty")
	protected FinancialInstrumentQuantity15Choice protectConditionalQuantity;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCondlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity for the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectConditionalQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectConditionalQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectConditionalQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectConditionalQuantity";
			definition = "Conditional quantity for the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectConditionalQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "PrtctTndrBidPric")
	protected PriceFormat57Choice protectTenderBidPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PriceFormat57Choice
	 * PriceFormat57Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctTndrBidPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender bid price of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectTenderBidPrice
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmProtectTenderBidPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectTenderBidPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTenderBidPrice";
			definition = "Tender bid price of the protect instruction.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectTenderBidPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCustomerReferenceIdentification
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
	 * mmCustomerReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCustomerReferenceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}
	};
	@XmlElement(name = "InstrCmnts")
	protected Max210Text instructionComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionComments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject();
			isDerived = false;
			xmlTag = "InstrCmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionComments";
			definition = "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmOptionNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectSafekeepingAccount,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectSequenceNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmCoverProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationUncoveredQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationStatus,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectTenderBidPrice,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmCustomerReferenceIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmInstructionComments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2";
				definition = "Provides additional information regarding corporate action instructed balance details at option protect level.";
				previousVersion_lazy = () -> CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public Max15Text getProtectIdentification() {
		return protectIdentification;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = Objects.requireNonNull(protectIdentification);
		return this;
	}

	public Optional<RestrictedFINMax35Text> getProtectSafekeepingAccount() {
		return protectSafekeepingAccount == null ? Optional.empty() : Optional.of(protectSafekeepingAccount);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectSafekeepingAccount(RestrictedFINMax35Text protectSafekeepingAccount) {
		this.protectSafekeepingAccount = protectSafekeepingAccount;
		return this;
	}

	public Optional<Max3NumericText> getProtectSequenceNumber() {
		return protectSequenceNumber == null ? Optional.empty() : Optional.of(protectSequenceNumber);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectSequenceNumber(Max3NumericText protectSequenceNumber) {
		this.protectSequenceNumber = protectSequenceNumber;
		return this;
	}

	public ISODateTime getProtectDate() {
		return protectDate;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectDate(ISODateTime protectDate) {
		this.protectDate = Objects.requireNonNull(protectDate);
		return this;
	}

	public Optional<ISODateTime> getCoverProtectDate() {
		return coverProtectDate == null ? Optional.empty() : Optional.of(coverProtectDate);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setCoverProtectDate(ISODateTime coverProtectDate) {
		this.coverProtectDate = coverProtectDate;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getProtectIdentificationQuantity() {
		return protectIdentificationQuantity;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectIdentificationQuantity(FinancialInstrumentQuantity15Choice protectIdentificationQuantity) {
		this.protectIdentificationQuantity = Objects.requireNonNull(protectIdentificationQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectIdentificationUncoveredQuantity() {
		return protectIdentificationUncoveredQuantity == null ? Optional.empty() : Optional.of(protectIdentificationUncoveredQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectIdentificationUncoveredQuantity(FinancialInstrumentQuantity15Choice protectIdentificationUncoveredQuantity) {
		this.protectIdentificationUncoveredQuantity = protectIdentificationUncoveredQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectIdentificationOversubscriptionQuantity() {
		return protectIdentificationOversubscriptionQuantity == null ? Optional.empty() : Optional.of(protectIdentificationOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice protectIdentificationOversubscriptionQuantity) {
		this.protectIdentificationOversubscriptionQuantity = protectIdentificationOversubscriptionQuantity;
		return this;
	}

	public Optional<DTCProtectInstructionStatus1Code> getProtectIdentificationStatus() {
		return protectIdentificationStatus == null ? Optional.empty() : Optional.of(protectIdentificationStatus);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectIdentificationStatus(DTCProtectInstructionStatus1Code protectIdentificationStatus) {
		this.protectIdentificationStatus = protectIdentificationStatus;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectConditionalQuantity() {
		return protectConditionalQuantity == null ? Optional.empty() : Optional.of(protectConditionalQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectConditionalQuantity(FinancialInstrumentQuantity15Choice protectConditionalQuantity) {
		this.protectConditionalQuantity = protectConditionalQuantity;
		return this;
	}

	public Optional<PriceFormat57Choice> getProtectTenderBidPrice() {
		return protectTenderBidPrice == null ? Optional.empty() : Optional.of(protectTenderBidPrice);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setProtectTenderBidPrice(PriceFormat57Choice protectTenderBidPrice) {
		this.protectTenderBidPrice = protectTenderBidPrice;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<Max210Text> getInstructionComments() {
		return instructionComments == null ? Optional.empty() : Optional.of(instructionComments);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2 setInstructionComments(Max210Text instructionComments) {
		this.instructionComments = instructionComments;
		return this;
	}
}