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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3NumericText;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmPlaceAndName
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectSequenceNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmOptionNumber
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCoverProtectDate
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmCoverProtectDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationUncoveredQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationUncoveredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationOversubscriptionQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectIdentificationStatus
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectIdentificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectConditionalQuantity
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectConditionalQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmProtectTenderBidPrice
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmProtectTenderBidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1#mmCustomerReferenceIdentification
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.
 * mmCustomerReferenceIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action instructed balance details at option protect level."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2
 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1", propOrder = {"placeAndName", "protectIdentification", "protectSequenceNumber", "optionNumber", "protectDate", "coverProtectDate",
		"protectIdentificationQuantity", "protectIdentificationUncoveredQuantity", "protectIdentificationOversubscriptionQuantity", "protectIdentificationStatus", "protectConditionalQuantity", "protectTenderBidPrice",
		"customerReferenceIdentification"})
public class CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmPlaceAndName
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction reference number assigned by DTC to the uncovered protect instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentification
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Max15Text> mmProtectIdentification = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Max15Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentification";
			definition = "Instruction reference number assigned by DTC to the uncovered protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}

		@Override
		public Max15Text getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Max15Text value) {
			obj.setProtectIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional Reference number used to uniquely identify uncovered protect instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectSequenceNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<Max3NumericText>> mmProtectSequenceNumber = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectSequenceNumber";
			definition = "Additional Reference number used to uniquely identify uncovered protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectSequenceNumber();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<Max3NumericText> value) {
			obj.setProtectSequenceNumber(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option number of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmOptionNumber
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, OptionNumber1Choice> mmOptionNumber = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, OptionNumber1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Option number of the protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmOptionNumber);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OptionNumber1Choice.mmObject();
		}

		@Override
		public OptionNumber1Choice getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, OptionNumber1Choice value) {
			obj.setOptionNumber(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectDate
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, ISODateTime> mmProtectDate = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDate";
			definition = "Date and time of the protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectDate();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, ISODateTime value) {
			obj.setProtectDate(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverPrtctDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the cover protect. Will be the latest cover date if partial cover transaction occurs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmCoverProtectDate
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmCoverProtectDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<ISODateTime>> mmCoverProtectDate = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CoverPrtctDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectDate";
			definition = "Date and time of the cover protect. Will be the latest cover date if partial cover transaction occurs.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmCoverProtectDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getCoverProtectDate();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<ISODateTime> value) {
			obj.setCoverProtectDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the protect instruction. For protects which are partially covered, the quanitity will be reduced by the amount partially covered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectIdentificationQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, FinancialInstrumentQuantity15Choice> mmProtectIdentificationQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, FinancialInstrumentQuantity15Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationQuantity";
			definition = "Quantity of the protect instruction. For protects which are partially covered, the quanitity will be reduced by the amount partially covered.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity15Choice getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectIdentificationQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, FinancialInstrumentQuantity15Choice value) {
			obj.setProtectIdentificationQuantity(value);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdUcvrdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationUncoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the Protect instruction which has not been covered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationUncoveredQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectIdentificationUncoveredQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>> mmProtectIdentificationUncoveredQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdUcvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationUncoveredQuantity";
			definition = "Quantity of the Protect instruction which has not been covered.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationUncoveredQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectIdentificationUncoveredQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setProtectIdentificationUncoveredQuantity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdOvrsbcptQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect oversubscription quantity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationOversubscriptionQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectIdentificationOversubscriptionQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>> mmProtectIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationOversubscriptionQuantity";
			definition = "Protect oversubscription quantity.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationOversubscriptionQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectIdentificationOversubscriptionQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setProtectIdentificationOversubscriptionQuantity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctIdSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the Protect Instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectIdentificationStatus
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectIdentificationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<DTCProtectInstructionStatus1Code>> mmProtectIdentificationStatus = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<DTCProtectInstructionStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctIdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationStatus";
			definition = "Status of the Protect Instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectIdentificationStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCProtectInstructionStatus1Code.mmObject();
		}

		@Override
		public Optional<DTCProtectInstructionStatus1Code> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectIdentificationStatus();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<DTCProtectInstructionStatus1Code> value) {
			obj.setProtectIdentificationStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCondlQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectConditionalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional Quantity for the Protect Instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectConditionalQuantity
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectConditionalQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>> mmProtectConditionalQuantity = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctCondlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectConditionalQuantity";
			definition = "Conditional Quantity for the Protect Instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectConditionalQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectConditionalQuantity();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setProtectConditionalQuantity(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctTndrBidPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTenderBidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tender bid price of the protect instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmProtectTenderBidPrice
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmProtectTenderBidPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<PriceFormat57Choice>> mmProtectTenderBidPrice = new MMMessageAssociationEnd<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<PriceFormat57Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "PrtctTndrBidPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTenderBidPrice";
			definition = "Tender bid price of the protect instruction.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmProtectTenderBidPrice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceFormat57Choice.mmObject();
		}

		@Override
		public Optional<PriceFormat57Choice> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getProtectTenderBidPrice();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<PriceFormat57Choice> value) {
			obj.setProtectTenderBidPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrRefId")
	protected Max15Text customerReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2#mmCustomerReferenceIdentification
	 * CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.
	 * mmCustomerReferenceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<Max15Text>> mmCustomerReferenceIdentification = new MMMessageAttribute<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1, Optional<Max15Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmCustomerReferenceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15Text.mmObject();
		}

		@Override
		public Optional<Max15Text> getValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj) {
			return obj.getCustomerReferenceIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 obj, Optional<Max15Text> value) {
			obj.setCustomerReferenceIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmPlaceAndName,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentification,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectSequenceNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmOptionNumber,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCoverProtectDate,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationUncoveredQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationOversubscriptionQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectIdentificationStatus,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectConditionalQuantity,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmProtectTenderBidPrice,
						com.tools20022.repository.msg.CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1.mmCustomerReferenceIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1";
				definition = "Provides additional information regarding corporate action instructed balance details at option protect level.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Max15Text getProtectIdentification() {
		return protectIdentification;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectIdentification(Max15Text protectIdentification) {
		this.protectIdentification = Objects.requireNonNull(protectIdentification);
		return this;
	}

	public Optional<Max3NumericText> getProtectSequenceNumber() {
		return protectSequenceNumber == null ? Optional.empty() : Optional.of(protectSequenceNumber);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectSequenceNumber(Max3NumericText protectSequenceNumber) {
		this.protectSequenceNumber = protectSequenceNumber;
		return this;
	}

	public OptionNumber1Choice getOptionNumber() {
		return optionNumber;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setOptionNumber(OptionNumber1Choice optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public ISODateTime getProtectDate() {
		return protectDate;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectDate(ISODateTime protectDate) {
		this.protectDate = Objects.requireNonNull(protectDate);
		return this;
	}

	public Optional<ISODateTime> getCoverProtectDate() {
		return coverProtectDate == null ? Optional.empty() : Optional.of(coverProtectDate);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setCoverProtectDate(ISODateTime coverProtectDate) {
		this.coverProtectDate = coverProtectDate;
		return this;
	}

	public FinancialInstrumentQuantity15Choice getProtectIdentificationQuantity() {
		return protectIdentificationQuantity;
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectIdentificationQuantity(FinancialInstrumentQuantity15Choice protectIdentificationQuantity) {
		this.protectIdentificationQuantity = Objects.requireNonNull(protectIdentificationQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectIdentificationUncoveredQuantity() {
		return protectIdentificationUncoveredQuantity == null ? Optional.empty() : Optional.of(protectIdentificationUncoveredQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectIdentificationUncoveredQuantity(FinancialInstrumentQuantity15Choice protectIdentificationUncoveredQuantity) {
		this.protectIdentificationUncoveredQuantity = protectIdentificationUncoveredQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectIdentificationOversubscriptionQuantity() {
		return protectIdentificationOversubscriptionQuantity == null ? Optional.empty() : Optional.of(protectIdentificationOversubscriptionQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice protectIdentificationOversubscriptionQuantity) {
		this.protectIdentificationOversubscriptionQuantity = protectIdentificationOversubscriptionQuantity;
		return this;
	}

	public Optional<DTCProtectInstructionStatus1Code> getProtectIdentificationStatus() {
		return protectIdentificationStatus == null ? Optional.empty() : Optional.of(protectIdentificationStatus);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectIdentificationStatus(DTCProtectInstructionStatus1Code protectIdentificationStatus) {
		this.protectIdentificationStatus = protectIdentificationStatus;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getProtectConditionalQuantity() {
		return protectConditionalQuantity == null ? Optional.empty() : Optional.of(protectConditionalQuantity);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectConditionalQuantity(FinancialInstrumentQuantity15Choice protectConditionalQuantity) {
		this.protectConditionalQuantity = protectConditionalQuantity;
		return this;
	}

	public Optional<PriceFormat57Choice> getProtectTenderBidPrice() {
		return protectTenderBidPrice == null ? Optional.empty() : Optional.of(protectTenderBidPrice);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setProtectTenderBidPrice(PriceFormat57Choice protectTenderBidPrice) {
		this.protectTenderBidPrice = protectTenderBidPrice;
		return this;
	}

	public Optional<Max15Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 setCustomerReferenceIdentification(Max15Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}
}