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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MoveType1Code;
import com.tools20022.repository.codeset.OffsetType1Code;
import com.tools20022.repository.codeset.PriceProtectionScope2Code;
import com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.Discretion;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffset
 * DiscretionInstructions1.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffsetSign
 * DiscretionInstructions1.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmRelatedPriceType
 * DiscretionInstructions1.mmRelatedPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmMoveType
 * DiscretionInstructions1.mmMoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmLimitType
 * DiscretionInstructions1.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmRoundDirection
 * DiscretionInstructions1.mmRoundDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmScope
 * DiscretionInstructions1.mmScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1#mmOffsetType
 * DiscretionInstructions1.mmOffsetType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DiscretionInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DiscretionInstructions1", propOrder = {"offset", "offsetSign", "relatedPriceType", "moveType", "limitType", "roundDirection", "scope", "offsetType"})
public class DiscretionInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Offset", required = true)
	protected ActiveCurrencyAndAmount offset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffset
	 * Discretion.mmOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offset"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 389</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, ActiveCurrencyAndAmount> mmOffset = new MMMessageAttribute<DiscretionInstructions1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Offset";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "389"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offset";
			definition = "Information for the executing party about the price to be obtained for an order. It is expressed as an offset from a reference price such as the market price or last trade price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(DiscretionInstructions1 obj) {
			return obj.getOffset();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, ActiveCurrencyAndAmount value) {
			obj.setOffset(value);
		}
	};
	@XmlElement(name = "OffsetSgn", required = true)
	protected PlusOrMinusIndicator offsetSign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffsetSign
	 * Discretion.mmOffsetSign}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetSgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added or subtracted from the related price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 390</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, PlusOrMinusIndicator> mmOffsetSign = new MMMessageAttribute<DiscretionInstructions1, PlusOrMinusIndicator>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmOffsetSign;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetSgn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "390"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public PlusOrMinusIndicator getValue(DiscretionInstructions1 obj) {
			return obj.getOffsetSign();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, PlusOrMinusIndicator value) {
			obj.setOffsetSign(value);
		}
	};
	@XmlElement(name = "RltdPricTp", required = true)
	protected TypeOfDiscretionPrice1Code relatedPriceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedPriceType
	 * Discretion.mmRelatedPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPricTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the type of price an offset is related to. The offset can either be added or subtracted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 388</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, TypeOfDiscretionPrice1Code> mmRelatedPriceType = new MMMessageAttribute<DiscretionInstructions1, TypeOfDiscretionPrice1Code>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmRelatedPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RltdPricTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "388"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPrice1Code.mmObject();
		}

		@Override
		public TypeOfDiscretionPrice1Code getValue(DiscretionInstructions1 obj) {
			return obj.getRelatedPriceType();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, TypeOfDiscretionPrice1Code value) {
			obj.setRelatedPriceType(value);
		}
	};
	@XmlElement(name = "MvTp", required = true)
	protected MoveType1Code moveType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoveType1Code
	 * MoveType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmMoveType
	 * Discretion.mmMoveType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes whether discretion price is static/fixed or floats."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 841</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, MoveType1Code> mmMoveType = new MMMessageAttribute<DiscretionInstructions1, MoveType1Code>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmMoveType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "MvTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "841"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveType1Code.mmObject();
		}

		@Override
		public MoveType1Code getValue(DiscretionInstructions1 obj) {
			return obj.getMoveType();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, MoveType1Code value) {
			obj.setMoveType(value);
		}
	};
	@XmlElement(name = "LmtTp", required = true)
	protected Max35Text limitType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmLimitType
	 * Discretion.mmLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 843</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, Max35Text> mmLimitType = new MMMessageAttribute<DiscretionInstructions1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmLimitType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "843"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DiscretionInstructions1 obj) {
			return obj.getLimitType();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, Max35Text value) {
			obj.setLimitType(value);
		}
	};
	@XmlElement(name = "RndDrctn", required = true)
	protected Max35Text roundDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmRoundDirection
	 * Discretion.mmRoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndDrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 844</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, Max35Text> mmRoundDirection = new MMMessageAttribute<DiscretionInstructions1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmRoundDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RndDrctn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "844"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DiscretionInstructions1 obj) {
			return obj.getRoundDirection();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, Max35Text value) {
			obj.setRoundDirection(value);
		}
	};
	@XmlElement(name = "Scp", required = true)
	protected PriceProtectionScope2Code scope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmScope
	 * Discretion.mmScope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the discretion (e.g. local, global etc)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 846</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, PriceProtectionScope2Code> mmScope = new MMMessageAttribute<DiscretionInstructions1, PriceProtectionScope2Code>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmScope;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "846"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}

		@Override
		public PriceProtectionScope2Code getValue(DiscretionInstructions1 obj) {
			return obj.getScope();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, PriceProtectionScope2Code value) {
			obj.setScope(value);
		}
	};
	@XmlElement(name = "OffsetTp", required = true)
	protected OffsetType1Code offsetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetType1Code
	 * OffsetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discretion#mmOffsetType
	 * Discretion.mmOffsetType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DiscretionInstructions1
	 * DiscretionInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of Discretion Offset."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 842</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DiscretionInstructions1, OffsetType1Code> mmOffsetType = new MMMessageAttribute<DiscretionInstructions1, OffsetType1Code>() {
		{
			businessElementTrace_lazy = () -> Discretion.mmOffsetType;
			componentContext_lazy = () -> com.tools20022.repository.msg.DiscretionInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "842"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetType1Code.mmObject();
		}

		@Override
		public OffsetType1Code getValue(DiscretionInstructions1 obj) {
			return obj.getOffsetType();
		}

		@Override
		public void setValue(DiscretionInstructions1 obj, OffsetType1Code value) {
			obj.setOffsetType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscretionInstructions1.mmOffset, com.tools20022.repository.msg.DiscretionInstructions1.mmOffsetSign,
						com.tools20022.repository.msg.DiscretionInstructions1.mmRelatedPriceType, com.tools20022.repository.msg.DiscretionInstructions1.mmMoveType, com.tools20022.repository.msg.DiscretionInstructions1.mmLimitType,
						com.tools20022.repository.msg.DiscretionInstructions1.mmRoundDirection, com.tools20022.repository.msg.DiscretionInstructions1.mmScope, com.tools20022.repository.msg.DiscretionInstructions1.mmOffsetType);
				trace_lazy = () -> Discretion.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DiscretionInstructions1";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getOffset() {
		return offset;
	}

	public DiscretionInstructions1 setOffset(ActiveCurrencyAndAmount offset) {
		this.offset = Objects.requireNonNull(offset);
		return this;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return offsetSign;
	}

	public DiscretionInstructions1 setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = Objects.requireNonNull(offsetSign);
		return this;
	}

	public TypeOfDiscretionPrice1Code getRelatedPriceType() {
		return relatedPriceType;
	}

	public DiscretionInstructions1 setRelatedPriceType(TypeOfDiscretionPrice1Code relatedPriceType) {
		this.relatedPriceType = Objects.requireNonNull(relatedPriceType);
		return this;
	}

	public MoveType1Code getMoveType() {
		return moveType;
	}

	public DiscretionInstructions1 setMoveType(MoveType1Code moveType) {
		this.moveType = Objects.requireNonNull(moveType);
		return this;
	}

	public Max35Text getLimitType() {
		return limitType;
	}

	public DiscretionInstructions1 setLimitType(Max35Text limitType) {
		this.limitType = Objects.requireNonNull(limitType);
		return this;
	}

	public Max35Text getRoundDirection() {
		return roundDirection;
	}

	public DiscretionInstructions1 setRoundDirection(Max35Text roundDirection) {
		this.roundDirection = Objects.requireNonNull(roundDirection);
		return this;
	}

	public PriceProtectionScope2Code getScope() {
		return scope;
	}

	public DiscretionInstructions1 setScope(PriceProtectionScope2Code scope) {
		this.scope = Objects.requireNonNull(scope);
		return this;
	}

	public OffsetType1Code getOffsetType() {
		return offsetType;
	}

	public DiscretionInstructions1 setOffsetType(OffsetType1Code offsetType) {
		this.offsetType = Objects.requireNonNull(offsetType);
		return this;
	}
}