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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MoveType1Code;
import com.tools20022.repository.codeset.OffsetType1Code;
import com.tools20022.repository.codeset.PegType1Code;
import com.tools20022.repository.codeset.PriceProtectionScope2Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.SecuritiesPegOrderInstruction;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about instructions specific to pegged orders.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffset
 * PegOrderInstructions1.mmOffset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmRelatedPriceType
 * PegOrderInstructions1.mmRelatedPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmMoveType
 * PegOrderInstructions1.mmMoveType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffsetType
 * PegOrderInstructions1.mmOffsetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmLimitType
 * PegOrderInstructions1.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmRoundDirection
 * PegOrderInstructions1.mmRoundDirection}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmScope
 * PegOrderInstructions1.mmScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmOffsetSign
 * PegOrderInstructions1.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1#mmPegSecurityDetails
 * PegOrderInstructions1.mmPegSecurityDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
 * SecuritiesPegOrderInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PegOrderInstructions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about instructions specific to pegged orders."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PegOrderInstructions1", propOrder = {"offset", "relatedPriceType", "moveType", "offsetType", "limitType", "roundDirection", "scope", "offsetSign", "pegSecurityDetails"})
public class PegOrderInstructions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Offset")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffset
	 * SecuritiesPegOrderInstruction.mmOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 211</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount added to the peg for a pegged order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<ActiveCurrencyAndAmount>> mmOffset = new MMMessageAttribute<PegOrderInstructions1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Offset";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "211"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offset";
			definition = "Amount added to the peg for a pegged order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(PegOrderInstructions1 obj) {
			return obj.getOffset();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setOffset(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPricTp")
	protected PegType1Code relatedPriceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PegType1Code
	 * PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmPriceType
	 * SecuritiesPegOrderInstruction.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1094</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of peg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<PegType1Code>> mmRelatedPriceType = new MMMessageAttribute<PegOrderInstructions1, Optional<PegType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RltdPricTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1094"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPriceType";
			definition = "Defines the type of peg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PegType1Code.mmObject();
		}

		@Override
		public Optional<PegType1Code> getValue(PegOrderInstructions1 obj) {
			return obj.getRelatedPriceType();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<PegType1Code> value) {
			obj.setRelatedPriceType(value.orElse(null));
		}
	};
	@XmlElement(name = "MvTp")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmMoveType
	 * SecuritiesPegOrderInstruction.mmMoveType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 835</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes whether peg is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<MoveType1Code>> mmMoveType = new MMMessageAttribute<PegOrderInstructions1, Optional<MoveType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmMoveType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "MvTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "835"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveType";
			definition = "Describes whether peg is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MoveType1Code.mmObject();
		}

		@Override
		public Optional<MoveType1Code> getValue(PegOrderInstructions1 obj) {
			return obj.getMoveType();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<MoveType1Code> value) {
			obj.setMoveType(value.orElse(null));
		}
	};
	@XmlElement(name = "OffsetTp")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetType
	 * SecuritiesPegOrderInstruction.mmOffsetType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 836</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of Peg Offset."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<OffsetType1Code>> mmOffsetType = new MMMessageAttribute<PegOrderInstructions1, Optional<OffsetType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffsetType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "836"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetType";
			definition = "Type of Peg Offset.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OffsetType1Code.mmObject();
		}

		@Override
		public Optional<OffsetType1Code> getValue(PegOrderInstructions1 obj) {
			return obj.getOffsetType();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<OffsetType1Code> value) {
			obj.setOffsetType(value.orElse(null));
		}
	};
	@XmlElement(name = "LmtTp")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmLimitType
	 * SecuritiesPegOrderInstruction.mmLimitType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 837</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies nature of resulting pegged price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<Max35Text>> mmLimitType = new MMMessageAttribute<PegOrderInstructions1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmLimitType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "837"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Specifies nature of resulting pegged price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PegOrderInstructions1 obj) {
			return obj.getLimitType();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<Max35Text> value) {
			obj.setLimitType(value.orElse(null));
		}
	};
	@XmlElement(name = "RndDrctn")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
	 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 838</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated peg price is not a valid tick price, specifies how to round the price (e.g. be more or less aggressive)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<Max35Text>> mmRoundDirection = new MMMessageAttribute<PegOrderInstructions1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmRoundDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "RndDrctn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "838"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated peg price is not a valid tick price, specifies how to round the price (e.g. be more or less aggressive).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PegOrderInstructions1 obj) {
			return obj.getRoundDirection();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<Max35Text> value) {
			obj.setRoundDirection(value.orElse(null));
		}
	};
	@XmlElement(name = "Scp")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmScope
	 * SecuritiesPegOrderInstruction.mmScope}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 840</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the peg (for example, local, global etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<PriceProtectionScope2Code>> mmScope = new MMMessageAttribute<PegOrderInstructions1, Optional<PriceProtectionScope2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmScope;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "Scp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "840"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the peg (for example, local, global etc).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PriceProtectionScope2Code.mmObject();
		}

		@Override
		public Optional<PriceProtectionScope2Code> getValue(PegOrderInstructions1 obj) {
			return obj.getScope();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<PriceProtectionScope2Code> value) {
			obj.setScope(value.orElse(null));
		}
	};
	@XmlElement(name = "OffsetSgn")
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmOffsetSign
	 * SecuritiesPegOrderInstruction.mmOffsetSign}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffsetSgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added or subtracted from the related price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PegOrderInstructions1, Optional<PlusOrMinusIndicator>> mmOffsetSign = new MMMessageAttribute<PegOrderInstructions1, Optional<PlusOrMinusIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPegOrderInstruction.mmOffsetSign;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "OffsetSgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public Optional<PlusOrMinusIndicator> getValue(PegOrderInstructions1 obj) {
			return obj.getOffsetSign();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<PlusOrMinusIndicator> value) {
			obj.setOffsetSign(value.orElse(null));
		}
	};
	@XmlElement(name = "PegSctyDtls")
	protected SecurityIdentification7 pegSecurityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PegOrderInstructions1
	 * PegOrderInstructions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PegSctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PegSecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the the security off whose prices the order will peg."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PegOrderInstructions1, Optional<SecurityIdentification7>> mmPegSecurityDetails = new MMMessageAssociationEnd<PegOrderInstructions1, Optional<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PegOrderInstructions1.mmObject();
			isDerived = false;
			xmlTag = "PegSctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PegSecurityDetails";
			definition = "Provides details about the the security off whose prices the order will peg.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public Optional<SecurityIdentification7> getValue(PegOrderInstructions1 obj) {
			return obj.getPegSecurityDetails();
		}

		@Override
		public void setValue(PegOrderInstructions1 obj, Optional<SecurityIdentification7> value) {
			obj.setPegSecurityDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PegOrderInstructions1.mmOffset, com.tools20022.repository.msg.PegOrderInstructions1.mmRelatedPriceType,
						com.tools20022.repository.msg.PegOrderInstructions1.mmMoveType, com.tools20022.repository.msg.PegOrderInstructions1.mmOffsetType, com.tools20022.repository.msg.PegOrderInstructions1.mmLimitType,
						com.tools20022.repository.msg.PegOrderInstructions1.mmRoundDirection, com.tools20022.repository.msg.PegOrderInstructions1.mmScope, com.tools20022.repository.msg.PegOrderInstructions1.mmOffsetSign,
						com.tools20022.repository.msg.PegOrderInstructions1.mmPegSecurityDetails);
				trace_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PegOrderInstructions1";
				definition = "Provides details about instructions specific to pegged orders.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getOffset() {
		return offset == null ? Optional.empty() : Optional.of(offset);
	}

	public PegOrderInstructions1 setOffset(ActiveCurrencyAndAmount offset) {
		this.offset = offset;
		return this;
	}

	public Optional<PegType1Code> getRelatedPriceType() {
		return relatedPriceType == null ? Optional.empty() : Optional.of(relatedPriceType);
	}

	public PegOrderInstructions1 setRelatedPriceType(PegType1Code relatedPriceType) {
		this.relatedPriceType = relatedPriceType;
		return this;
	}

	public Optional<MoveType1Code> getMoveType() {
		return moveType == null ? Optional.empty() : Optional.of(moveType);
	}

	public PegOrderInstructions1 setMoveType(MoveType1Code moveType) {
		this.moveType = moveType;
		return this;
	}

	public Optional<OffsetType1Code> getOffsetType() {
		return offsetType == null ? Optional.empty() : Optional.of(offsetType);
	}

	public PegOrderInstructions1 setOffsetType(OffsetType1Code offsetType) {
		this.offsetType = offsetType;
		return this;
	}

	public Optional<Max35Text> getLimitType() {
		return limitType == null ? Optional.empty() : Optional.of(limitType);
	}

	public PegOrderInstructions1 setLimitType(Max35Text limitType) {
		this.limitType = limitType;
		return this;
	}

	public Optional<Max35Text> getRoundDirection() {
		return roundDirection == null ? Optional.empty() : Optional.of(roundDirection);
	}

	public PegOrderInstructions1 setRoundDirection(Max35Text roundDirection) {
		this.roundDirection = roundDirection;
		return this;
	}

	public Optional<PriceProtectionScope2Code> getScope() {
		return scope == null ? Optional.empty() : Optional.of(scope);
	}

	public PegOrderInstructions1 setScope(PriceProtectionScope2Code scope) {
		this.scope = scope;
		return this;
	}

	public Optional<PlusOrMinusIndicator> getOffsetSign() {
		return offsetSign == null ? Optional.empty() : Optional.of(offsetSign);
	}

	public PegOrderInstructions1 setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = offsetSign;
		return this;
	}

	public Optional<SecurityIdentification7> getPegSecurityDetails() {
		return pegSecurityDetails == null ? Optional.empty() : Optional.of(pegSecurityDetails);
	}

	public PegOrderInstructions1 setPegSecurityDetails(SecurityIdentification7 pegSecurityDetails) {
		this.pegSecurityDetails = pegSecurityDetails;
		return this;
	}
}